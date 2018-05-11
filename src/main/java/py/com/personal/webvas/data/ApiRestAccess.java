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
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicNameValuePair;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.utils.Constantes;

import static py.com.personal.webvas.utils.Constantes.BASE_PATH_MI_MUNDO_API;
import static py.com.personal.webvas.utils.Constantes.BASE_PATH_OAUTH_API;
import static py.com.personal.webvas.utils.Constantes.CLIENT_ID_SERVICE1;
import static py.com.personal.webvas.utils.Constantes.PASSWORD_SERVICE1;
import static py.com.personal.webvas.utils.Constantes.PORT_MI_MUNDO_API;
import static py.com.personal.webvas.utils.Constantes.URL_MI_MUNDO_API;
import static py.com.personal.webvas.utils.StringUtils.formatFecha;
import static py.com.personal.webvas.utils.StringUtils.formatLineaMiMundoApi;
import static py.com.personal.webvas.utils.StringUtils.formatMonto;

public class ApiRestAccess {
    
    // Variable de tiempo.
    private Long _tiemStamp = 0L;

    // Se obtiene el valor.
    public Long getTimeStamp() {
        return _tiemStamp;
    }

    // AsigarTiempo.
    private void setTimeStamp(Long valor) {
        _tiemStamp = valor;
    }
    
    public String misDatos(String Msisdn) {
        
        // Obtener codigo de cliente de la linea
        Msisdn = formatLineaMiMundoApi(Msisdn);
        long startTime = System.currentTimeMillis();
        String token = getToken();
        String url = "lineas/" + Msisdn;
        JSONObject datosLinea = getDatos(url, token);
        Long codigoCliente = getLong(datosLinea, "codigoCliente");
        
        // Obtener datos del cliente
        url = "clientes/" + codigoCliente;
        JSONObject datosCliente = getDatos(url, token);
        String nombre = getString(datosCliente, "nombre");
        String apellido = getString(datosCliente, "apellido");
        setTimeStamp(System.currentTimeMillis() - startTime);
        
        if (!nombre.equals("")) {
            nombre = nombre + " " + apellido;
        }
        return nombre;
    }
    
    public String facturasPendientes(String Msisdn) {
        
        Msisdn = formatLineaMiMundoApi(Msisdn);
        long startTime = System.currentTimeMillis();
        String token = getToken();
        String url = "lineas/" + Msisdn;
        JSONObject datosLinea = getDatos(url, token);
        String codigoGrupo = getString(datosLinea, "grupoFacturacion");
        url = "grupos-facturacion/" + codigoGrupo + "/facturas?registros=-1&estado=VIGENTE";
        JSONObject facturas = getDatos(url, token);
        setTimeStamp(System.currentTimeMillis() - startTime);
        
        JSONArray facturasVigentes = getLista(facturas);
        if (facturasVigentes.isEmpty()) {
            return MiMundoConfiguration.instance._msjSinFactura;
        } else {
            JSONObject datosFactura = getItemLista(facturas, 0);
            String facturaStr = getDatosFactura(datosFactura);
            return facturaStr;
        }
    }
    
    public String misFacturas(String Msisdn) {
        
        Msisdn = formatLineaMiMundoApi(Msisdn);
        long startTime = System.currentTimeMillis();
        String token = getToken();
        String url = "lineas/" + Msisdn;
        JSONObject datosLinea = getDatos(url, token);
        String codigoGrupo = getString(datosLinea, "grupoFacturacion");
        url = "grupos-facturacion/" + codigoGrupo + "/facturas";
        JSONObject facturas = getDatos(url, token);
        JSONObject datosFactura = getItemLista(facturas, 0);
        String facturaStr = getDatosFactura(datosFactura); 
        setTimeStamp(System.currentTimeMillis() - startTime);
        return facturaStr;
    }
    
    public List<String> ultimas3Facturas(String Msisdn) {
        
        Msisdn = formatLineaMiMundoApi(Msisdn);
        List<String> resp = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        String token = getToken();
        String url = "lineas/" + Msisdn;
        JSONObject datosLinea = getDatos(url, token);
        String codigoGrupo = getString(datosLinea, "grupoFacturacion");
        url = "grupos-facturacion/" + codigoGrupo + "/facturas";
        JSONObject facturas = getDatos(url, token);
        setTimeStamp(System.currentTimeMillis() - startTime);
        JSONArray listaFacturas = getLista(facturas);
        for (int i = 0; i < 3; i++) {
            JSONObject item = (JSONObject) listaFacturas.get(i);
            resp.add(getDatosFactura(item));
        }
        return resp;
    }
    
    public String obtenerPuntos(String Msisdn) {
        
        Msisdn = formatLineaMiMundoApi(Msisdn);
        long startTime = System.currentTimeMillis();
        String token = getToken();
        String url = "clubpersonal/total-puntos?linea=" + Msisdn;
        JSONObject datos = getDatos(url, token);
        setTimeStamp(System.currentTimeMillis() - startTime);
        Long puntos = getLong(datos, "total");
        String res = "Tenes: " + puntos + " puntos para canjear.";
        return res;
        
    }
    
    public String asociarClub(String Msisdn) {
        Msisdn = formatLineaMiMundoApi(Msisdn);
        long startTime = System.currentTimeMillis();
        String token = getToken();
        String url = "clubpersonal/usuarios?linea=" + Msisdn;
        JSONObject datos = post(url, token, "");
        System.err.println("\n\nDatos : " + datos + "\n\n");
        setTimeStamp(System.currentTimeMillis() - startTime);
        Long puntos = getLong(datos, "total");
        //String res = "Tenes: " + puntos + " puntos para canjear.";
        return datos.toString();
    }
    
    private String getDatosFactura(JSONObject item) {
        
        Double monto = (Double) item.get("montoTotal");
        Long fecha = (Long) item.get("fechaVencimiento");
        Date fechaVencimiento = new Date(fecha);
        String estado = (String) item.get("estado");

        StringBuilder datos = new StringBuilder();
        datos.append("Monto: ");
        datos.append(formatMonto(monto));
        datos.append("\n");
        datos.append("Vencimiento: ");
        datos.append(formatFecha(fechaVencimiento));
        datos.append("\n");
        datos.append("Estado: ");
        datos.append(estado);
        
        return datos.toString();
    }
    
    private JSONArray getLista(JSONObject data) {
        
        if (data.containsKey("lista")) {
            JSONArray lista = (JSONArray) data.get("lista");
            if (lista != null) {
                return lista;
            }
        }
        return new JSONArray();
    }
    
    private JSONObject getItemLista(JSONObject data, int index) {
        
        JSONArray lista = getLista(data);
        if (lista.size() > 0) {
            JSONObject item = (JSONObject) lista.get(index);
            return item;
        }
        return new JSONObject();
    }
    
    private String getString(JSONObject data, String atributo) {
        
        if (data != null && data.containsKey(atributo)) {
            return (String) data.get(atributo);
        }
        return "";
    }
    
    private Long getLong(JSONObject data, String atributo) {
        
        if (data != null && data.containsKey(atributo)) {
            return (Long) data.get(atributo);
        }
        return 0L;
    }

    private JSONObject getDatos(String url, String token) {
        
        InputStream is = null;
                
        try {
            
            HttpClient client = HttpClientBuilder.create().build();
            HttpHost host = new HttpHost(URL_MI_MUNDO_API, PORT_MI_MUNDO_API);
            String urlServicio = BASE_PATH_MI_MUNDO_API + url;
            
            HttpEntityEnclosingRequest request;
            request = new BasicHttpEntityEnclosingRequest("GET", urlServicio);
            request.setHeader("Authorization", token);
            request.setHeader("client_id", CLIENT_ID_SERVICE1);
            
            HttpResponse res = client.execute(host, request);
            HttpEntity entityResponse = res.getEntity();
            is = entityResponse.getContent();
            StringWriter writer = new StringWriter();
            IOUtils.copy(is, writer);
            String str = writer.toString();
            
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(str);
            
            return obj;
            
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
    
    private JSONObject post(String url, String token, String json) {
        
        InputStream is = null;
                
        try {
            
            HttpClient client = HttpClientBuilder.create().build();
            HttpHost host = new HttpHost(URL_MI_MUNDO_API, PORT_MI_MUNDO_API);
            String urlServicio = BASE_PATH_MI_MUNDO_API + url;
            
            StringEntity requestEntity = new StringEntity(json);
            HttpEntityEnclosingRequest request;
            request = new BasicHttpEntityEnclosingRequest("POST", urlServicio);
            request.setHeader("Authorization", token);
            request.setHeader("client_id", CLIENT_ID_SERVICE1);
            request.setEntity(requestEntity);
            
            HttpResponse res = client.execute(host, request);
            HttpEntity entityResponse = res.getEntity();
            is = entityResponse.getContent();
            StringWriter writer = new StringWriter();
            IOUtils.copy(is, writer);
            String str = writer.toString();
            
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(str);
            
            return obj;
            
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
    
    private String getToken() {
        
        InputStream is = null;
                
        try {
            
            HttpClient client = HttpClientBuilder.create().build();
            HttpHost host = new HttpHost(URL_MI_MUNDO_API, PORT_MI_MUNDO_API);
            String urlServicio = BASE_PATH_OAUTH_API + "auth/token";
            
            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("grant_type", "service1"));
            params.add(new BasicNameValuePair("client_id", CLIENT_ID_SERVICE1));
            params.add(new BasicNameValuePair("password", PASSWORD_SERVICE1));
            
            HttpEntityEnclosingRequest request;
            request = new BasicHttpEntityEnclosingRequest("POST", urlServicio);
            request.setEntity(new UrlEncodedFormEntity(params));
            
            HttpResponse res = client.execute(host, request);
            HttpEntity entityResponse = res.getEntity();
            is = entityResponse.getContent();
            StringWriter writer = new StringWriter();
            IOUtils.copy(is, writer);
            String str = writer.toString();
            
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(str);
            
            if (obj.containsKey("access_token")) {
                String token = (String) obj.get("access_token");
                return token;
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al obtener el token : " + e.getMessage());
        } finally {
            try {
                if (is != null) is.close(); 
            } catch (Exception e) {
                System.out.println("Error al cerrar InputStream : " + e.getMessage());
            }
        }
        
        return "";
    }
    
}
