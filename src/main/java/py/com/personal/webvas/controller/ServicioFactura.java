package py.com.personal.webvas.controller;

import py.com.personal.webvas.data.ApiAccess;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.smppcs.ussd.UssdExeption;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession.MessageType;
import py.com.personal.webvas.ussd.USSDSession;
import py.com.personal.webvas.utils.MyEnum.OpType;

public class ServicioFactura {
	
	private USSDSession miSesion = null;
	
	private String respuesta = "";

	private String msisdn;
	
	private ApiAccess api = null;

	ServicioFactura(USSDSession miSesion, ApiAccess api, String msisdn) {
		this.miSesion = miSesion;
		this.api = api;
		this.msisdn = msisdn;
	}

	void mostrarMenuFacturas(String opcion) throws InterruptedException, UssdExeption  {
		// Factura Electronica.
		respuesta = MiMundoConfiguration.instance._menuFatel;
		// Se verifica que tiene servicio y se cambia el menu.
		String adicionalMenu = "";
		String adicionalOpcion = "";
		boolean activo = false;

		boolean verificaServ = false;
		try {
			verificaServ = api.verificaServicio(this.msisdn,
					MiMundoConfiguration.instance._facturaServ);
		} catch (Exception e) {
			respuesta = MiMundoConfiguration.instance._msjError;
			this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
					e.getMessage(), "", "verificaServicio", null, null);

			this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
			return;
		}

		if (verificaServ) {
			adicionalMenu = "(Activo)";
			adicionalOpcion = "Desactivar";
			activo = true;

		} else {
			adicionalMenu = "(Inactivo)";
			adicionalOpcion = "Activar";
		}
		respuesta = String
				.format(respuesta, adicionalMenu, adicionalOpcion);

		this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

		this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, opcion,
				respuesta, "FacturaElectronica", null, null);

		String fatelOpcion = this.miSesion.receive();
		
		ejecutar(fatelOpcion, activo);
	}

	void ejecutar(String Opcion, boolean activo) throws InterruptedException, UssdExeption {
		if (Opcion.equals("1") && !activo)
			activar(Opcion);
		else if(Opcion.equals("1") && activo)
			desactivar(Opcion);
		else if (Opcion.equals("2"))
			cambiarEmail(Opcion);
		else {
			respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
			this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, Opcion,
					respuesta, "FacturaElectronica", null, null);
		}
		this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
	}

	private void activar(String Opcion) throws InterruptedException, UssdExeption {
		// Se solicita el mail.
		respuesta = MiMundoConfiguration.instance._msjIngreseMail;
		this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

		this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, Opcion,
				respuesta, "FacturaElectronicaMail", null, null);

		String mail = this.miSesion.receive();
		// Se le pide factura fisica y se llama al proceso.
		respuesta = MiMundoConfiguration.instance._msjFacturaFisica
				+ "\n1. Si.\n2. No.";

		this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

		this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mail,
				respuesta, "FacturaElectronicaMail", null, null);

		String opcionFisica = this.miSesion.receive();
		String enviarFactFisica = "N";
		if (opcionFisica.equals("1")) {
			enviarFactFisica = "S";
		}
		try {
			respuesta = api.fatel(this.msisdn, mail, "A", enviarFactFisica);
			this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
					opcionFisica, respuesta, "FacturaElectronica",
					api.getTimeStamp(), null);
		} catch (Exception e) {
			respuesta = MiMundoConfiguration.instance._msjError;
			this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
					e.getMessage(), respuesta, "fatel", api.getTimeStamp(),
					null);
		}
	}
	
	private void cambiarEmail(String Opcion) throws InterruptedException, UssdExeption {
		// Cambiar mail
		respuesta = MiMundoConfiguration.instance._msjIngreseMail;
		this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

		this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, Opcion,
				respuesta, "CambiarMail", null, null);

		String mail = this.miSesion.receive();
		// Se cambia el mail.
		try {
			respuesta = api.cambiarMail(this.msisdn, mail);
			this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mail,
					respuesta, "CambiarMail", api.getTimeStamp(), null);
		} catch (Exception e) {
			respuesta = MiMundoConfiguration.instance._msjError;
			this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
					e.getMessage(), respuesta, "cambiarMail",
					api.getTimeStamp(), null);
		}
	}

	private void desactivar(String Opcion) throws InterruptedException, UssdExeption {
		// Desactivar fatel
		respuesta = MiMundoConfiguration.instance._msjBajaConfirmacion
				+ "\n1. Confirmar.\n2. Cancelar.";

		this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);
		this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, Opcion,
				respuesta, "DesactivarFatel", api.getTimeStamp(), null);

		String opcionBaja = this.miSesion.receive();
		if (opcionBaja.equals("1")) {
			try {
				respuesta = api.fatel(this.msisdn, "", "D", "");
			} catch (Exception e) {
				respuesta = MiMundoConfiguration.instance._msjError;
				this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
						e.getMessage(), respuesta, "fatel",
						api.getTimeStamp(), null);
			}
		} else {
			respuesta = MiMundoConfiguration.instance._msjCancelar;
		}
		this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, opcionBaja,
				respuesta, "Desactivar", api.getTimeStamp(), null);
	}
}