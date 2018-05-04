package py.personal.webvas.packs.core.ussd.consultas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.FechaHora;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.Pack;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.ServicioTasable;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.ServicioTasable.Contador;

/**
 * unifica servicios tasables con agrupadores duplicados.
 * @author ribeirov
 *
 */
public class ConsultaPacksUnificador {
	
	private Pack[] packs;

	private static final String TIPO_LIM_MIN = "MIN";

	private static final String TIPO_LIM_MAX = "MAX";

	public ConsultaPacksUnificador(Pack[] packs) {
		this.packs = packs;
	}

	public Pack[] unificar() {
		List<Pack> listaPack = new ArrayList<Pack>();
		for(final Pack pack : this.packs) {
			final ServicioTasable[] serviciosTasablesUnif = unificar(pack.getServiciosTasables());
			listaPack.add(new Pack() {

				public ServicioTasable[] getServiciosTasables() {
					return serviciosTasablesUnif;
				}
				
				public String getDescripcion() {
					return pack.getDescripcion();
				}

				public String getCodigo() {
					return pack.getCodigo();
				}

				public String getClasificador() {
					return pack.getClasificador();
				}
			});
		}
		return listaPack.toArray(new Pack[listaPack.size()]);
	}

	private ServicioTasable[] unificar(ServicioTasable[] serviciosTasablesXpack) {
		
		List<ServicioTasable> listaServiciosTasables = new ArrayList<ServicioTasable>();
	
		/**
		 * itera sobre servicios tasables que no son COB_DIARIO, se remueven los contadores MIN dejando un solo contador MAX.
		 */
		for(final ServicioTasable st : serviciosTasablesXpack) {
			String agrupador = st.getAgrupador();
			
			if(agrupador.equals("COB_DIARIO")) {
				boolean validoCobDiario = tieneCobDiarioRenovacion(st.getContadores());
				if(validoCobDiario) {
					ServicioTasable stFiltrado = removerContadoresMinimo(st);
					listaServiciosTasables.add(stFiltrado);
				} else
					listaServiciosTasables.add(new ServicioTasable() {
						
						/**
						 * en caso de servicio tasable COB_DIARIO inactivo, no se muestra vigencia.
						 */
						public FechaHora getElementoVencimiento() {
							return null;
						}
						
						public FechaHora getElementoActualizacion() {
							return st.getElementoActualizacion();
						}
						
						public Contador[] getContadores() {
							return st.getContadores();
						}
						
						public String getAgrupador() {
							return st.getAgrupador();
						}
					});
			}
			else {
				ServicioTasable stFiltrado = removerContadoresMinimo(st);
				listaServiciosTasables.add(stFiltrado);
			}
		}
		return listaServiciosTasables.toArray(new ServicioTasable[listaServiciosTasables.size()]);
	}
	
	/**
	 * remueve los contadores MIN de la lista.
	 * @param serviciosTasable servicio tasable con los contadores MIN a ser removidos.
	 * @return arreglo de contadores con un solo item de tipo limite MAX.
	 */
	private ServicioTasable removerContadoresMinimo(final ServicioTasable serviciosTasable) {
		final Contador[] contadorMax = removerContadoresMinimo(serviciosTasable.getContadores());

		return new ServicioTasable() {

			public FechaHora getElementoVencimiento() {
				return serviciosTasable.getElementoVencimiento();
			}
			
			public FechaHora getElementoActualizacion() {
				return serviciosTasable.getElementoActualizacion();
			}
			
			public Contador[] getContadores() {
				return contadorMax;
			}
			
			public String getAgrupador() {
				return serviciosTasable.getAgrupador().equals("COB_DIARIO") ? "COB_DIARIO_OK" : serviciosTasable.getAgrupador();
			}
		};
	}

	/**
	 * remueve los contadores MIN de la lista.
	 * @param contadores lista de contadores a ser removidos.
	 * @return lista de contadores con un solo item de tipo MAX.
	 */
	private Contador[] removerContadoresMinimo(Contador[] contadores) {
		List<Contador> listaContadores = new ArrayList<Contador>();
		for(Contador c : contadores) {
			if(c.getElementoCantidad().getTipoLimite().equals(TIPO_LIM_MAX)) {
				listaContadores.add(c);
				break;
			}
		}
		return listaContadores.toArray(new Contador[listaContadores.size()]);
	}
	
	private boolean tieneCobDiarioRenovacion(Contador[] contadores) {
		boolean tieneContadorMin = false;
		boolean contadorMinOK = false;

		/**
		 * caso servicio tasable COB_DIARIO no tenga contadores, se asume como NO renovada.
		 */
		if(contadores.length == 0)
			return false;

		/**
		 * identificar si hay suscripciones no renovadas a partir de los contadores MIN
		 */
		for(Contador cMin : contadores) {
			String tipoLimite = cMin.getElementoCantidad().getTipoLimite();
			if(TIPO_LIM_MIN.equals(tipoLimite)) {
				tieneContadorMin = true;
				if(tieneCobDiarioRenovacion(cMin, true))
					contadorMinOK = true;
			}
		}
		
		if(tieneContadorMin && !contadorMinOK)
			return false;

		/**
		 * si llega a este bloque, significa que no tiene contador MIN o el contador MIN indica debito aplicado, 
		 * entonces se valida la fecha de reinicio
		 * y luego se compara el valor con el limite.
		 */
		for(Contador cMax : contadores) {
			String tipoLimite = cMax.getElementoCantidad().getTipoLimite();
			if(TIPO_LIM_MAX.equals(tipoLimite)) {
				boolean cobDiarioFecReinicioValido = tieneCobDiarioFecReinicioValido(cMax);
				
				/**
				 * en caso de expiracion de la fecha de reinicio por saldo insuficiente, marcar como invalido.
				 */
				if(!cobDiarioFecReinicioValido)
					return false;
				
				/**
				 * en caso de suscripcion vigente sin contador MIN, analizar el contador MAX. 
				 */
				if(!tieneContadorMin) {
					if(!tieneCobDiarioRenovacion(cMax, false))
						return false;
				}
			}
		}
		return true;
	}
	
	private boolean tieneCobDiarioRenovacion(Contador c, boolean tipoMin) {
		long valor = c.getCantidad();
		if(tipoMin) {
			long limite = c.getElementoCantidad().getLimite();
			return valor >= limite;
		} else
			return valor > 0;
	}
	
	private boolean tieneCobDiarioFecReinicioValido(Contador contadorMax) {
		Date ahora = Calendar.getInstance().getTime();
		Date fechaReinicio = convertir(contadorMax.getReinicio());
		
		if(fechaReinicio == null)
			return true;
		boolean vencido = fechaReinicio.before(ahora);
		if(vencido) {
			return false;
		} else
			return true;
	}
	
	private Date convertir(FechaHora fechaHora) {
		String strFechaHora = getFechaHora(fechaHora);
		if(strFechaHora == null)
			return null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date objFechaHora = null;
		try {
			objFechaHora = sdf.parse(strFechaHora);
		} catch (ParseException e) {
		}
		return objFechaHora;
	}
	
	private String getFechaHora(FechaHora fechaHora) {
		if(fechaHora == null)
			return null;
		return fechaHora.getFecha() + " " + fechaHora.getHora();
	}
}