package py.personal.webvas.packs.core.ussd.consultas;

import py.personal.webvas.packs.core.utils.XmlParser;

/**
 * Desearializa la consulta de packs xml en objeto. 
 * @author ribeirov
 *
 */
public class ConsultaPacksDeserializador {
	
	private String xml;
	
	public ConsultaPacksDeserializador(String xml) {
		this.xml = xml;
	}
	
	public ConsultaPacksModel.Pack[] deserializar() throws Exception {
		this.xml = this.xml
				.replaceAll("<cantidad unidad=\"\" tipo_limite=\"\" limite=\"\"></cantidad>", "")
				.replaceAll("<vencimiento fecha=\"\" hora=\"\"/>", "")
				.replaceAll("descripcion=\"\"", "");
		ConsultaPacksModel modelo = (ConsultaPacksModel) XmlParser.parse(xml, ConsultaPacksModel.class);
		return modelo.getPacks();
	}
}