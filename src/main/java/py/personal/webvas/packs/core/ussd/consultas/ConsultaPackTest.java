package py.personal.webvas.packs.core.ussd.consultas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TimeZone;

public class ConsultaPackTest {

	public static void main(String[] args) throws Exception {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Asuncion"));
		ConsultaPackTest app = new ConsultaPackTest();
    	//app.init();
		app.testReactivacion();
	}

	/*
	private void init() throws Exception {
    	String xmlPacks = obtenerXml("consulta-packs.xml");
        System.out.println(xmlPacks);

        String[] agrupadores = new String[] {"INVISIBLE", "RCORPCUG", "RCORP", "FNF", "FNFPF"};
        ConsultaPacksHandler handler = new ConsultaPacksHandler(xmlPacks, agrupadores);
        ConsultaPacksItem[] items = handler.getConsultaPacks();
        for(int i = 1; i <= items.length; i++) {
        	ConsultaPacksFormatter formatter = new ConsultaPacksFormatter();
        	ConsultaPacksItem item = items[i - 1];
        	String formatterd = formatter.format(item, i, items.length);
        	System.out.println(formatterd);
        }
    }*/
	
	private void testReactivacion() throws Exception {
    	String xml = obtenerXml("consulta-packs.xml");

    	String codigoPackReact = "50MB_XDIA";
        String[] agrupadores = new String[] {"INVISIBLE", "RCORPCUG", "RCORP", "FNF", "FNFPF"};
        long bytesUmbral = 1048576; //1mb
        //long bytesUmbral = 10;
        
        ConsultaPacksEvalReact consultaPacksEvalReact = new ConsultaPacksEvalReact(xml, codigoPackReact, agrupadores, bytesUmbral);
        boolean resultado = consultaPacksEvalReact.reactivar();
        if(resultado == true)
        	System.out.println("reactivar pack");
        else
        	System.out.println("No se pudo reactivar tu Suscripcion. Aun tenes megas para navegar.");
    }

	private String obtenerXml(String archivo) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File(archivo)));
        StringBuilder sb = new StringBuilder();
        String line = "";
        while((line = reader.readLine()) != null) {
        	sb.append(line);
        }
        reader.close();
        String xml = sb.toString();
        return xml;
	}
}