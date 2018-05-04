package py.personal.webvas.packs.core.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.x2jb.bind.XML2Java;

public class XmlParser {
	
	private static DocumentBuilderFactory documentBuilderFactory = null;
    private static DocumentBuilder documentBuilder = null;
    private static final String XML_HEAD_END_MARKUP = "?>";
    private static final String XML_HEAD_ENCODING = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>";
    
    public static synchronized void setup() throws ParserConfigurationException {
        documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilder = documentBuilderFactory.newDocumentBuilder();
    }

	@SuppressWarnings("rawtypes")
	public static synchronized Object parse(String xml, Class classToParse) throws Exception {
        xml = codificarXml(xml);
        InputStream in = new ByteArrayInputStream(xml.getBytes("ISO-8859-1"));
        Object result = parse(in, classToParse);
        return result;
    }

    private static String codificarXml(String xml) {
        int xmlHeadLen = xml.indexOf(XML_HEAD_END_MARKUP);

        if (xmlHeadLen != -1)
            xml = xml.substring(xmlHeadLen + XML_HEAD_END_MARKUP.length());

        xml = XML_HEAD_ENCODING + xml;
        return xml;
    }

    @SuppressWarnings("rawtypes")
	public static synchronized Object parse(File file, Class classToParse) throws Exception {
        InputStream in = null;
        Object result = null;
        try {
            in = new FileInputStream(file);
            result = parse(in, classToParse);
        } catch (Exception e) {
            throw e;
        } finally {
        	if(in != null) in.close();
        }
        return result;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static synchronized Object parse(InputStream in, Class classToParse) throws Exception {
        if(documentBuilderFactory == null)
            setup();
        Document dom = documentBuilder.parse(in);
        Object obj = XML2Java.bind(dom, classToParse);
        return obj;
    }
    
    public static void main(String[] args) {
    	String xml = "<pages><page><view>Responde con la opcion y elegi tu Mini Pack:</view></page>";
    	String nuevoXml = codificarXml(xml);
    	System.out.println(nuevoXml);
    }
}