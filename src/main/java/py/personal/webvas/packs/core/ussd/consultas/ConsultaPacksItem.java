package py.personal.webvas.packs.core.ussd.consultas;

public class ConsultaPacksItem {
	
	public ConsultaPacksItem(String codigo, String descripcion,
			String clasificador, ConsultaPacksItemServicio[] servicios, ConsultaPacksItemServicio servicioYapa) {
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.clasificador = clasificador;
		this.servicios = servicios;
		this.servicioYapa = servicioYapa;
	}

	private final String codigo;

	private final String descripcion;

	private final String clasificador;

	private final ConsultaPacksItemServicio[] servicios;
	
	private final ConsultaPacksItemServicio servicioYapa;
	
	public String getDescripcion() {
		return descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getClasificador() {
		return clasificador;
	}

	public ConsultaPacksItemServicio[] getServicios() {
		return servicios;
	}

	public ConsultaPacksItemServicio getServicioYapa() {
		return servicioYapa;
	}
	
	public enum Unidad {
		SEGUNDOS,
		MINUTOS,
		EVENTOS,
		BYTES,
		DESCONOCIDO
	}
}