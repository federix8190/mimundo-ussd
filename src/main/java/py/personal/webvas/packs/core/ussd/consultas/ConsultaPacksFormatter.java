package py.personal.webvas.packs.core.ussd.consultas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksItem.Unidad;

public class ConsultaPacksFormatter {

	private static final String DISP_FLAG = "\nDisponibles: ";
	
	private static final String VIGENCIA_LABEL = "\nVigente hasta %s";

	private static final String PROX_REINICIO_FLAG = "\nSe renueva el %s";

	/**
	 * 0 = indice de pagina actual
	 * 1 = total de paginas
	 * 2 = descripcion pack
	 * 3 = Disponibles: (solo para servicio tasable)
	 * 4 = vigencia
	 * 5 = 0- Ver mas consultas (solo para paginas inferiores al ultimo)
	 * 
	 *  (1/1) Pack 10HS LLAMADAS GRATIS
	 *	Disponibles: MINUTOS y 5min de yapa. 
	 *	Vigente hasta 15-04-2013 19:29:59
	 *
	 * @return
	 */
	public String format(ConsultaPacksItem item, int paginaActual, int totalPaginas) {
		String mask = "(%s/%s) Pack %s%s.%s%s%s";

		ConsultaPacksItemServicio[] servicios = item.getServicios();
		ConsultaPacksItemServicio servicioYapa = item.getServicioYapa();

		String pc1PagActual = String.valueOf(paginaActual);
		String pc2TotalPaginas = String.valueOf(totalPaginas);
		String pc3PackDesc = item.getDescripcion();
		String pc4Disp = DISP_FLAG; //ese depende de tasable/agrupador.		
		String pc5ProxReinicio = formatearReinicio(item);
		String pc6Vigencia = formatearVigencia(item);
		String pc7Paginacion = paginaActual < totalPaginas ? "\n0- Ver mas consultas" : "";

		Boolean tasable = false;
		boolean tieneTope = false;

		/**
		 * formatear descripcion de servicios sin yapa.
		 */
		List<String> saldos = new ArrayList<String>();
		
		for(int i = 0; i < servicios.length; i++) {
			ConsultaPacksItemServicio servicio = servicios[i];
			String agrupador = servicio.getAgrupador();
			tasable = servicio.isContable();
			String saldo = obtenerSaldo(agrupador, servicio);

			if(!saldo.equals(""))
				saldos.add(saldo);

			if(esAgrupadorSinTope(agrupador) == false)
				tieneTope = true;
		}
		
		pc4Disp += formatearSaldos(saldos);

		if(servicioYapa != null) {
			String agrupador = servicioYapa.getAgrupador();
			String saldo = obtenerSaldo(agrupador, servicioYapa);
			pc4Disp += " y " + saldo + " de yapa";

			tasable = servicioYapa.isContable();
			
			if(esAgrupadorSinTope(agrupador) == false)
				tieneTope = true;
		}
		
		/**
		 * condicion para sacar la palabra "Disponibles"
		 */
		if(tasable == null || (tasable == false && tieneTope))
			pc4Disp = pc4Disp.replaceAll(DISP_FLAG, "");

		if(tasable == null)
			pc3PackDesc += ".\nCuando navegues, llames, mensajees o cargues saldo podras utilizar este beneficio";

		return String.format(mask, 
				pc1PagActual, 
				pc2TotalPaginas, 
				pc3PackDesc, 
				pc4Disp,
				pc5ProxReinicio,
				pc6Vigencia,
				pc7Paginacion);
	}
	
	private String formatearSaldos(List<String> saldos) {
		Iterator<String> it = saldos.iterator();
		String saldosFormateados = "";
		while(it.hasNext()) {
			String saldo = it.next();			
			if(it.hasNext())
				saldosFormateados += saldo + " y ";
			else
				saldosFormateados += saldo;
		}
		return saldosFormateados;
	}
	
	private String obtenerSaldo(String agrupador, ConsultaPacksItemServicio servicio) {
		boolean contable = servicio.isContable() != null && servicio.isContable();

		if(contable == false) {
			if(esAgrupadorSinTope(agrupador)) {
				if(agrupador.equals("ILI_LLA"))
					return "MINUTOS";
				else if(agrupador.equals("ILI_SMS"))
					return "MENSAJES";
				else if(agrupador.equals("ILI_DAT"))
					return "MEGAS";
				else
					return "";
			}
			else
				return "";
		}
		else {
			ConsultaPackItemContador contador = servicio.getContadorMax();
			String saldo = "";
			
			Unidad unidad = contador.getUnidad();
			long usado = contador.getUsado();
			long total = contador.getTotal();

			switch(unidad) {
			case BYTES:
				saldo = obtenerSaldoDatos(total, usado);
				break;
			case EVENTOS:
				long resultado = obtenerSaldo(total, usado);
				if(agrupador.equals("PACKLLA"))
					saldo = resultado + "llamadas";
				else
					saldo = resultado + "sms";
				break;
			case SEGUNDOS:
				saldo = obtenerSaldoSegundos(total, usado);
				break;
			case MINUTOS:
				saldo = obtenerSaldoMinutos(total, usado);
				break;
			case DESCONOCIDO:
				saldo = "";
				break;
			default:
				saldo = "";
			}
			return saldo;
		}
	}

	private final long MB_FACTOR = 1048576;
	
	private final long KB_FACTOR = 1024;

	private String obtenerSaldoDatos(long total, long usado) {
		DecimalFormat dataFormat = (DecimalFormat) NumberFormat.getInstance();
		dataFormat.applyPattern("###,###.#");

		BigDecimal saldo = new BigDecimal(total - usado);
		
		BigDecimal megaBytesUnit = new BigDecimal(MB_FACTOR);

		BigDecimal megaBytesSaldo = saldo.divide(megaBytesUnit);
		
		BigDecimal megaBytesSaldoRedondeado = megaBytesSaldo.setScale(1, RoundingMode.UP);
		
		String resultRedondeado = null;
		
		/**
		 * definir si se expresa el valor en MB o KB
		 */
		if(saldo.longValue() >= 1024000) {

			if(megaBytesSaldoRedondeado.doubleValue() >= 0)
				resultRedondeado = dataFormat.format(megaBytesSaldoRedondeado.doubleValue());
			else
				resultRedondeado = "0";

			resultRedondeado = resultRedondeado + "MB";	
		} else {
			
			BigDecimal kbUnit = new BigDecimal(KB_FACTOR);

			BigDecimal kbSaldo = saldo.divide(kbUnit);
			
			BigDecimal kbSaldoRedondeado = kbSaldo.setScale(1, RoundingMode.UP);

			if(kbSaldoRedondeado.doubleValue() >= 0)
				resultRedondeado = dataFormat.format(kbSaldoRedondeado.doubleValue());
			else
				resultRedondeado = "0";

			resultRedondeado = resultRedondeado + "KB";
		}

		return resultRedondeado;
	}

	/**
	 * calcula saldo con parametros recibidos en segundos.
	 * @param total
	 * @param usado
	 * @return
	 */
	private String obtenerSaldoSegundos(long total, long usado) {
		long saldo = total - usado;
		long min = saldo / 60;
		
		if(min < 0)
			min = 0;
		
		long sec = saldo % 60;
		
		if(sec < 0)
			sec = 0;
			
		if(min >= 1)
			return "" + min + "min";
		else 
			return "" + sec + "seg";
	}
	
	/**
	 * calcula saldo con parametros recibidos en minutos
	 * @param total
	 * @param usado
	 * @return
	 */
	private String obtenerSaldoMinutos(long total, long usado) {
		long saldo = total - usado;
		
		if(saldo < 0)
			saldo = 0;
		
		return "" + saldo + "min";
	}
	
	private long obtenerSaldo(long total, long usado) {
		long resultado = total - usado;
		if(resultado < 0)
			resultado = 0;
		return resultado;
	}
	
	private boolean esAgrupadorSinTope(String agrupador) {
		return agrupador.equals("ILI_LLA") || agrupador.equals("ILI_SMS") || agrupador.equals("ILI_DAT");
	}
	
	private String formatearReinicio(ConsultaPacksItem item) {
		ConsultaPacksItemServicio servicio = null;
		
		String reinicio = null;
		
		if(item.getServicios().length > 0)
			servicio = item.getServicios()[0];
		else
			servicio = item.getServicioYapa();
		
		if(servicio.isContable() != null && servicio.isContable())
			reinicio = obtenerFechaReinicio(servicio.getContadorMax());

		if(reinicio != null)
			return String.format(PROX_REINICIO_FLAG, reinicio);
		else
			return "";
	}

	private String obtenerFechaReinicio(ConsultaPackItemContador contador) {
		if(contador.getReinicio() != null)
			return contador.getReinicio();
		return null;
	}

	private String formatearVigencia(ConsultaPacksItem item) {
		ConsultaPacksItemServicio[] servicios = item.getServicios();
		ConsultaPacksItemServicio servicioYapa = item.getServicioYapa();

		String vigencia = null;

		if(servicios.length > 0)
			vigencia = servicios[0].getVencimiento();
		else
			vigencia = servicioYapa.getVencimiento();

		if(vigencia == null)
			return "";
		else
			return String.format(VIGENCIA_LABEL, vigencia);
	}
}