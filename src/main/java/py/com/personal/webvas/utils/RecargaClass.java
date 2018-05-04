package py.com.personal.webvas.utils;

public class RecargaClass {
	private int id;
	private String Monto;
	private String Porcentaje;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setMonto(String monto) {
		Monto = monto;
	}

	public String getMonto() {
		return Monto;
	}

	public void setPorcentaje(String porcentaje) {
		Porcentaje = porcentaje;
	}

	public String getPorcentaje() {
		return Porcentaje;
	}

}
