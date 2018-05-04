package py.personal.webvas.packs.core.ussd.consultas;

import java.util.ArrayList;
import java.util.List;

import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksItem.Unidad;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.FechaHora;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.Pack;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.ServicioTasable;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.ServicioTasable.Contador;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.ServicioTasable.Contador.Cantidad;

public class ConsultaPacksHandler {

	public ConsultaPacksHandler(String xml, String[] agrupadoresExcluidos) throws Exception {
		Pack[] packsDeserializados = new ConsultaPacksDeserializador(xml).deserializar();
		Pack[] packsfiltrados = new ConsultaPacksFiltro(packsDeserializados, agrupadoresExcluidos).filtrar();
		Pack[] packsUnificados = new ConsultaPacksUnificador(packsfiltrados).unificar();
		convertir(packsUnificados);
	}
	
	public ConsultaPacksHandler(String xml, String codigoPack, String[] agrupadoresExcluidos) throws Exception {
		Pack[] packsDeserializados = new ConsultaPacksDeserializador(xml).deserializar();
		Pack[] packsfiltrados = new ConsultaPacksFiltro(packsDeserializados, codigoPack, agrupadoresExcluidos).filtrar();
		Pack[] packsUnificados = new ConsultaPacksUnificador(packsfiltrados).unificar();
		convertir(packsUnificados);
	}

	private ConsultaPacksItem[] consultaPacksItems;

	private static final String AGRUP_COB_DIARIO = "COB_DIARIO";
	
	private static final String AGRUP_COB_DIARIO_OK = "COB_DIARIO_OK";

	public ConsultaPacksItem[] getConsultaPacks() {
		return this.consultaPacksItems;
	}

	private ConsultaPacksItem[] convertir(Pack[] packs) {
		List<ConsultaPacksItem> list = new ArrayList<ConsultaPacksItem>();

		for(ConsultaPacksModel.Pack pack : packs) {
			String codigo = pack.getCodigo();
			String descripcion = pack.getDescripcion();
			String clasificador = pack.getClasificador().trim().toUpperCase();
			descripcion = obtenerDescripcion(clasificador, descripcion);
			ServicioTasable[] servicioTasables = pack.getServiciosTasables();
			ServicioAgrupador sa = obtenerPackItem(servicioTasables);

			if(sa == null)
				continue;

			ConsultaPacksItem cpi = new ConsultaPacksItem(codigo, descripcion,
					clasificador, sa.servicios, sa.yapa);
			list.add(cpi);
		}

		consultaPacksItems = list.toArray(new ConsultaPacksItem[list.size()]);
		return consultaPacksItems;
	}
	
	private ServicioAgrupador obtenerPackItem(ConsultaPacksModel.ServicioTasable[] serviciosTasables) {
		List<ConsultaPacksItemServicio> servicios = new ArrayList<ConsultaPacksItemServicio>();
		ConsultaPacksItemServicio servicioYapa = null;

		for(ConsultaPacksModel.ServicioTasable st : serviciosTasables) {
			String agrupador = st.getAgrupador();
			String actualizacion = getFechaHora(st.getElementoActualizacion());
			String vencimiento = getFechaHora(st.getElementoVencimiento());
			Boolean tasable = esTasable(agrupador, serviciosTasables, st.getContadores());
			agrupador = st.getAgrupador().trim().toUpperCase();
			boolean esYapa = (agrupador.equals("YAPA") || agrupador.equals("YAPADAT"));

			ConsultaPackItemContador contador = null;

			if(tasable != null && tasable) {
				ConsultaPacksModel.ServicioTasable.Contador[] contadores = st.getContadores();
				contador = obtenerContador(contadores);
			}

			if(esYapa)
				servicioYapa = new ConsultaPacksItemServicio(agrupador, actualizacion, vencimiento, contador, tasable);
			else
				servicios.add(new ConsultaPacksItemServicio(agrupador, actualizacion, vencimiento, contador, tasable));
		}

		if(servicios.size() == 0)
			return null;
		else
			return new ServicioAgrupador(servicios.toArray(new ConsultaPacksItemServicio[servicios.size()]), servicioYapa);
	}

	private ConsultaPackItemContador obtenerContador(ConsultaPacksModel.ServicioTasable.Contador[] contadores) {
		Contador cMax = null;
		for(Contador c : contadores) {
			if(c.getElementoCantidad().getTipoLimite().equals("MAX")) {
				cMax = c;
				break;
			}
		}
		Cantidad cantidad = cMax.getElementoCantidad();
		String rawUnidad = cantidad.getUnidad();
		Unidad unidad = this.getPackUnidad(rawUnidad);

		long usado = cMax.getCantidad();
		long limite = cantidad.getLimite();
		FechaHora reinicio = cMax.getReinicio();
		String strReinicio = this.getFechaHora(reinicio);
		ConsultaPackItemContador contador = new ConsultaPackItemContador(unidad, usado, limite, strReinicio);
		return contador;
	}

	/**
	 * 
	 * @param clasificador
	 * @param descripcion
	 * @return
	 */
	private String obtenerDescripcion(String clasificador, String descripcion) {
		if(descripcion == null || descripcion.equals(""))
			return clasificador;
		else
			return descripcion;
	}
	
	private Boolean esTasable(String agrupador, ServicioTasable[] serviciosTasables, Contador[] contadores) {
		if(agrupador.equals(AGRUP_COB_DIARIO) || agrupador.equals(AGRUP_COB_DIARIO_OK)) {
			for(ServicioTasable st : serviciosTasables) {
				if(st.getAgrupador().equals(AGRUP_COB_DIARIO_OK))
					return true;
			}
			return null;
		}
		else
			return contadores.length == 1;
	}

	private String getFechaHora(FechaHora fechaHora) {
		if(fechaHora == null)
			return null;
		return fechaHora.getFecha() + " " + fechaHora.getHora();
	}
	
	private Unidad getPackUnidad(String unidad) {
		unidad = unidad.trim().toUpperCase();
		
		if(unidad.equals("SEGUNDOS"))
			return Unidad.SEGUNDOS;
		if(unidad.equals("MINUTOS"))
			return Unidad.MINUTOS;
		if(unidad.equals("EVENTOS"))
			return Unidad.EVENTOS;
		if(unidad.equals("BYTES"))
			return Unidad.BYTES;
		
		return Unidad.DESCONOCIDO;
	}
	
	class ServicioAgrupador {
		
		ServicioAgrupador(ConsultaPacksItemServicio[] servicios, ConsultaPacksItemServicio yapa) {
			this.servicios = servicios;
			this.yapa = yapa;
		}

		private final ConsultaPacksItemServicio[] servicios;

		private final ConsultaPacksItemServicio yapa;
	}
}