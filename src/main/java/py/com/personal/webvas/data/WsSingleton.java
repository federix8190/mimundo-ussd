package py.com.personal.webvas.data;

import java.net.URL;

import javax.xml.namespace.QName;

import py.com.personal.vas.Service1;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;

public class WsSingleton {

	private static WsSingleton instance = null;

	public Service1 getServiceInstance() {
		return serviceInstanceWs;
	}

	private Service1 serviceInstanceWs;

	protected WsSingleton() {
		if (getServiceInstance() == null) {
			URL url = null;
			try {
				url = new URL(MiMundoConfiguration.instance._urlWs);
			} catch (Exception e) {
			}
			serviceInstanceWs = new Service1(url, new QName(
					"http://vas.personal.com.py", "Service1"));
		}
	}

	public static WsSingleton getInstance() {
		if (instance == null) {
			instance = new WsSingleton();
		}
		return instance;
	}

}
