package py.personal.webvas.packs.core.ussd.consultas;

public final class ConsultaPacksItemServicio {

	ConsultaPacksItemServicio(String agrupador, String actualizacion, String vencimiento,
			ConsultaPackItemContador contadorMax, Boolean contable) {
		this.agrupador = agrupador;
		this.actualizacion  = actualizacion;
		this.vencimiento = vencimiento;
		this.contadorMax = contadorMax;
		this.contable = contable;
	}

	private final ConsultaPackItemContador contadorMax;

	private final Boolean contable;
	
	/**
	 * corresponde a los agrupadores ILI_LLA, ILI_SMS o ILI_DAT
	 */
	private final String agrupador;
	
	private final String actualizacion;
	
	private final String vencimiento;

	public Boolean isContable() {
		return contable;
	}

	public String getAgrupador() {
		return agrupador;
	}

	public ConsultaPackItemContador getContadorMax() {
		return this.contadorMax;
	}

	public String getActualizacion() {
		return actualizacion;
	}

	public String getVencimiento() {
		return vencimiento;
	}
}