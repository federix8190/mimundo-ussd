package py.com.personal.webvas.ussd;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import py.com.personal.webvas.utils.MyEnum.OpType;
import py.com.personal.webvas.controller.MiLinea;
import py.com.personal.webvas.controller.Recarga;
import py.com.personal.webvas.controller.Saldos;
import py.com.personal.webvas.controller.Servicios;
import py.com.personal.webvas.controller.Telefono;
import py.com.personal.webvas.data.ApiAccess;
import py.com.personal.webvas.data.ApiRestAccess;
import py.com.personal.webvas.mimundoussd.MiMundo;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession;
import py.com.personal.webvas.smppcs.ussd.UssdExeption;
import py.personal.webvas.packs.core.utils.EsmeTextConverter;

public class USSDSession extends AbstractUssdSession {

    protected static final Logger loggerUssd = LoggerFactory
            .getLogger(USSDSession.class);

    public USSDSession(String msisdn) {
        super(msisdn);
    }

    private ApiAccess wsMiMundo = null;
    private ApiRestAccess apiRest = null;

    @Override
    protected void runSession() {
        try {
            menuPrincipal();
        } catch (InterruptedException e) {
            AddLog(msisdn, OpType.USSD, "Sesion", e.getMessage(), "runSesion",
                    wsMiMundo.getTimeStamp(), null);
        } catch (UssdExeption e) {
            AddLog(msisdn, OpType.USSD, "Sesion", "Session cortada",
                    e.getMessage(), wsMiMundo.getTimeStamp(), null);
        } catch (Exception e) {
            AddLog(msisdn, OpType.USSD, "Sesion", e.getMessage(), "runSesion",
                    wsMiMundo.getTimeStamp(), null);
        }
        wsMiMundo = null;
    }

    public void menuPrincipal() throws InterruptedException, UssdExeption {
        receive();

        String respuesta = "";
        String nombre = "";

        String msisdnSesion = this.msisdn;

        try {
            wsMiMundo = new ApiAccess();
            apiRest = new ApiRestAccess();
            nombre = wsMiMundo.misDatos(msisdnSesion);
        } catch (Exception e) {
            System.err.println("Error al consultar API : " + e.getMessage());
            this.AddLog(msisdnSesion, OpType.APP_ERROR, e.getMessage(),
                    respuesta, "MenuPrincipal", wsMiMundo.getTimeStamp(), null);

            ResponseMsj(MessageType.CONTINUE, respuesta, false);
            return;
        }

        respuesta = "Mi Mundo Personal\n"
                + MiMundoConfiguration.instance._menuTitleMiMundo + nombre
                + " " + MiMundoConfiguration.instance._menuPrincipal;

        ResponseMsj(MessageType.CONTINUE, respuesta, false);

        // Se loguea el primer mensaje.
        AddLog(msisdnSesion, OpType.INFORMACION, "", respuesta, "", null, null);

        // Se espera la primera respuesta del menu.
        String mensajeIn = receive();

        int opcion = Integer.parseInt(mensajeIn);
        if (opcion > 0 && opcion < 6) { // Se va recorriendo las opciones.
            /*
			 * if (opcion == 2) { // Multiplicate.
			 * 
			 * 
			 * } else
             */
            if (opcion == 1) {
                // MiLinea.
                MiLinea myLinea = new MiLinea(this, msisdnSesion, wsMiMundo, apiRest);
                myLinea.procesar(mensajeIn);
                
            } else if (opcion == 2) {
                // Saldos
                Saldos saldos = new Saldos(this, msisdnSesion, wsMiMundo);
                saldos.procesar(mensajeIn);

            } else if (opcion == 3) {
                // Recarga.
                Recarga recarga = new Recarga(this, msisdnSesion, wsMiMundo);
                recarga.procesar(mensajeIn);

            } else if (opcion == 4) {
                // Servicios.
                Servicios servicios = new Servicios(this, msisdnSesion,
                        wsMiMundo);
                servicios.procesar(mensajeIn);

            } else if (opcion == 5) {
                // Telefono.
                Telefono telefono = new Telefono(this, msisdnSesion, wsMiMundo);
                telefono.procesar(mensajeIn);
            }
        } else {
            AddLog(this.msisdn, OpType.INFORMACION, mensajeIn.toString(),
                    respuesta, "", null, null);

            send(MessageType.LAST,
                    MiMundoConfiguration.instance._msjParamIncorrecto);
        }
    }

    public void AddLog(String srcLine, OpType opType, String mensajeIn,
            String mensajeOut, String metodo, Long responseTime,
            Long responseTimePool) {

        try {
            SimpleDateFormat timestamp = new SimpleDateFormat("HH:mm:ss");
            String fecha = timestamp.format(Calendar.getInstance().getTime());

            StringBuilder sb = new StringBuilder();
            sb.append(fecha)
                    .append(";")
                    .append(opType.name())
                    .append(";")
                    .append(srcLine)
                    .append("->")
                    .append(mensajeIn)
                    .append(";")
                    .append(mensajeOut)
                    .append(";")
                    .append(metodo)
                    .append(";")
                    .append(responseTime == null ? "" : responseTime.toString())
                    .append("; miliSec: ")
                    .append(responseTimePool == null ? "" : responseTimePool
                            .toString()).append(";");

            //loggerUssd.info(sb.toString());
        } catch (Exception e) {
        }
    }

    @Override
    protected void cleanSession() {
    }

    // Clases override para manejar los parametros en la clase hijo.
    public void ResponseMsj(MessageType messageType, String mensajeOut,
            boolean cabecera) throws InterruptedException, UssdExeption {

        /*
		if (cabecera)
			mensajeOut = "Mi Mundo Personal\n" + mensajeOut;
         */
        if (mensajeOut.length() % 2 != 0) {
            mensajeOut = mensajeOut + " ";
        }

        mensajeOut = serializa(mensajeOut);

        //sendMessage(messageType, mensajeOut);
        send(messageType, mensajeOut);
    }

    public String NextMessage() throws UssdExeption, InterruptedException {
        return receive();
    }

    public String serializa(String input) {
        return new EsmeTextConverter().convert(input);
        /*
		String original = "��������������u�������������������";
		String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
		String output = input;
		for (int i = 0; i < original.length(); i++) {
			output = output.replace(original.charAt(i), ascii.charAt(i));
		}
		return output;
         */
    }

    public void send(MessageType type, String message) throws InterruptedException, UssdExeption {
        if (message.length() % 2 != 0) {
            message = message.concat(" ");
        }

        if (MiMundo.getConsoleMode()) {
            if (message.length() <= 162) {
                System.out.println("***************************************************************************************************");
                System.out.println(message);
                System.out.println("***************************************************************************************************"
                        + message.length());
            } else {
                System.err.println("***************************************************************************************************");
                System.err.println(message);
                System.err.println("***************************************************************************************************"
                        + message.length());
            }
        } else {
            String formattedMessage = new EsmeTextConverter().convert(message);
            sendMessage(type, formattedMessage);
        }
    }

    @SuppressWarnings("resource")
    public String receive() throws UssdExeption, InterruptedException {
        if (MiMundo.getConsoleMode()) {
            System.out.print("input:");
            return new java.util.Scanner(System.in).next();
        } else {
            return super.receiveNextMessage().trim();
        }
    }
}
