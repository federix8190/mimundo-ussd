package py.personal.webvas.packs.core.ussd.consultas;

public final class ConsultaPacksUtils {
	
	public static boolean tieneSaldo(ConsultaPacksItem[] items, String codigoPack) {
		for(ConsultaPacksItem item : items) {
			if(item.getCodigo().equals(codigoPack)) {
				ConsultaPacksItemServicio itemServ = item.getServicios()[0];
				return tieneSaldo(itemServ.getContadorMax());
			}
		}
		return false;
	}
	
	private static boolean tieneSaldo(ConsultaPackItemContador contadorMax) {
		if(contadorMax == null)
			return false;
		
		return contadorMax.getUsado() < contadorMax.getTotal();
	}
}