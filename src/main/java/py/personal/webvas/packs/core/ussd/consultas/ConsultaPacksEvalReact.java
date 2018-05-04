package py.personal.webvas.packs.core.ussd.consultas;

/**
 * evaluador de reactivacion de packs, solo permitir reactivacion cuando el saldo sea inferior al valor del umbral.
 *
 */
public class ConsultaPacksEvalReact {
	
	public ConsultaPacksEvalReact(String xml, String codigoPack, String[] agrupadoresExclusion, long umbral) {
		this.xml = xml;
		this.codigoPack = codigoPack;
		this.agrupadoresExclusion = agrupadoresExclusion;
		this.umbral = umbral;
	}

	private String xml;
	
	private String codigoPack;
	
	private String[] agrupadoresExclusion;
	
	private long umbral;

	/**
	 * verifica si se debe reactivar el pack.
	 * @return true o false
	 * @throws Exception
	 */
	public boolean reactivar() throws Exception {
		ConsultaPacksHandler handler;
		handler = new ConsultaPacksHandler(this.xml, this.codigoPack, this.agrupadoresExclusion);
        ConsultaPacksItem[] items = handler.getConsultaPacks();
        
        if(items.length == 0)
        	return true;
        
        ConsultaPacksItem pack = items[0];
        ConsultaPacksItemServicio[] servicioTasables = pack.getServicios();
        
        ConsultaPackItemContador contador = obtenerContador(servicioTasables);
        if(contador == null)
        	return true;

        return !tieneSaldoDisponible(contador.getTotal(), contador.getUsado());
	}

	/**
	 * obtiene contador de los servicios tasables COB_DIARIO_OK
	 * @param serviciosTasables
	 * @return
	 */
	private ConsultaPackItemContador obtenerContador(ConsultaPacksItemServicio[] serviciosTasables) {
		for(ConsultaPacksItemServicio st : serviciosTasables) {
			if(st.getAgrupador().equals("COB_DIARIO_OK"))
				return st.getContadorMax();
		}
		return null;
	}

	/**
	 * verifica si tiene saldo disponible.
	 * @param contador 
	 * @return
	 */
	private boolean tieneSaldoDisponible(long total, long usado) {
		return (total - usado) >= this.umbral;
	}
}