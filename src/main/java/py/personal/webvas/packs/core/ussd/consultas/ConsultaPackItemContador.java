package py.personal.webvas.packs.core.ussd.consultas;

import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksItem.Unidad;

public final class ConsultaPackItemContador {

	public ConsultaPackItemContador(Unidad unidad, long usado, long total,
			String reinicio) {
		this.unidad = unidad;
		this.usado = usado;
		this.total = total;
		this.reinicio = reinicio;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public long getUsado() {
		return usado;
	}

	public long getTotal() {
		return total;
	}

	public String getReinicio() {
		return reinicio;
	}
	
	private final Unidad unidad;

	private final long usado;

	private final long total;

	private final String reinicio;
}