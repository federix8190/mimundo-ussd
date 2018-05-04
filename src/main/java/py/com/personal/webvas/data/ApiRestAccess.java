package py.com.personal.webvas.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpRequest;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

import static py.com.personal.webvas.utils.Constantes.BASE_PATH_MI_MUNDO_API;
import static py.com.personal.webvas.utils.Constantes.PORT_MI_MUNDO_API;
import static py.com.personal.webvas.utils.Constantes.URL_MI_MUNDO_API;

public class ApiRestAccess {

    public List<String> getFacturas(String codigoGrupo) { //throws IOException {
        
        InputStream is = null;
                
        try {
            
            HttpClient client = HttpClientBuilder.create().build();
            HttpHost host = new HttpHost(URL_MI_MUNDO_API, PORT_MI_MUNDO_API);
            
            String urlServicio = BASE_PATH_MI_MUNDO_API + "grupos-facturacion/" 
                    + codigoGrupo + "/facturas?registros=-1";
            HttpEntityEnclosingRequest request;
            request = new BasicHttpEntityEnclosingRequest("GET", urlServicio);            
            request.setHeader("Authorization", 
                    "gOLBob2YnGjzhav9GgWP4HKlUS+rFr+cE1+BjVWUwkR7hs4tHTrWfyLpa/nBllvrJGWUgd6DUs0=");
            HttpResponse res = client.execute(host, request);
            HttpEntity entityResponse = res.getEntity();
            is = entityResponse.getContent();
            StringWriter writer = new StringWriter();
            IOUtils.copy(is, writer);
            String str = writer.toString();
            
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(str);
            JSONArray lista = (JSONArray) obj.get("lista");
            List<String> respuesta = new ArrayList<>();
            for (int i = 0; i < lista.size(); i++) {
                JSONObject item = (JSONObject) lista.get(i);
                System.err.println(i + " - " + item);
            }
            return respuesta;
            
            /*String[] response = str.split(",");
            String sessionId = "";
            for (String param : response) {
                System.err.println("");
            }*/
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
            return null;
        } finally {
            try {
                if (is != null) is.close(); 
            } catch (Exception e) {
                System.out.println("Error al cerrar InputStream : " + e.getMessage());
            }
        }
        
    }
    
}
