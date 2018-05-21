package py.com.personal.webvas.controller;

import py.com.personal.webvas.data.ApiAccess;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession.MessageType;
import py.com.personal.webvas.smppcs.ussd.UssdExeption;
import py.com.personal.webvas.ussd.USSDSession;
import py.com.personal.webvas.utils.MyEnum.OpType;

public class Suspension {

    private String msisdn = "";
    private USSDSession mySesion = null;

    private ApiAccess api = null;

    public Suspension(USSDSession mySesion, String msisdn, ApiAccess apiWs) {
        this.mySesion = mySesion;
        this.msisdn = msisdn;
        this.api = apiWs;
    }

    // Logica de opcion suspension.
    public void procesar(String mensajeIn) throws InterruptedException,
            UssdExeption {
        String respuesta = "";

        respuesta = MiMundoConfiguration.instance._menuSuspension;
        this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

        this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                respuesta, "Suspension", null, null);

        String msjLinea = this.mySesion.receive();
        String parametro = "";
        String parametro1 = "";

        int opcionsuspension = Integer.parseInt(msjLinea);
        if (opcionsuspension == 1) {
            // robo o extravio.
            respuesta = "Ingresa la linea a suspender:";
            this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "Siniestro", null, null);

            String lineaSuspender = this.mySesion.receive();
            if (lineaSuspender.equals("")) {
                respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            } else {
                // Se llama a la api para la suspencio de la linea.
                try {
                    respuesta = api.suspensionLinea(msisdn, lineaSuspender,
                            "E", parametro, parametro1);
                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.mySesion.AddLog(this.msisdn, OpType.INFORMACION,
                            e.getMessage(), respuesta, "suspensionLinea", null,
                            null);
                    this.mySesion
                            .ResponseMsj(MessageType.LAST, respuesta, true);

                    return;
                }
            }
            this.mySesion.AddLog(this.msisdn, OpType.INFORMACION,
                    lineaSuspender, respuesta, "Siniestro", api.getTimeStamp(),
                    null);

        } else if (opcionsuspension == 2) {
            // Voluntaria.
            respuesta = "Ingresa la linea a suspender:";
            this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "suspension", null, null);

            String lineaSuspender = this.mySesion.receive();
            if (lineaSuspender.equals("")) {
                respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            } else {
                // Se verifica que sea linea individual.
                boolean verificaLinea = false;
                try {
                    verificaLinea = api.verficiaLineaIndividual(lineaSuspender);
                } catch (Exception e) {
                    this.mySesion.AddLog(this.msisdn, OpType.APP_ERROR,
                            e.getMessage(), respuesta,
                            "verficiaLineaIndividual", null, null);
                }

                if (verificaLinea) {
                    // se pide cedula y fechaNac.
                    respuesta = "Ingresa Nro. de cedula del titular de la linea a suspender:";
                    this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta,
                            true);

                    // se recibe la cedula.
                    parametro = this.mySesion.receive();

                    // se pide fecha nac.
                    respuesta = "Ingresa la fecha de nacimiento del titular de la linea a suspender(ddmmaaaa):";
                    this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta,
                            true);

                    parametro1 = this.mySesion.receive();
                } else {
                    // se pide cedula y fechaNac.
                    respuesta = "Ingresa tu usuario de Autogestion:";
                    this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta,
                            true);

                    // se recibe la cedula.
                    parametro = this.mySesion.receive();

                    // se pide fecha nac.
                    respuesta = "Ingresa tu clave de Autogestion:";
                    this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta,
                            true);

                    parametro1 = this.mySesion.receive();
                }
                // Se llama a la api para la suspencio de la linea.
                try {
                    respuesta = api.suspensionLinea(msisdn, lineaSuspender,
                            "S", parametro, parametro1);
                    this.mySesion.AddLog(this.msisdn, OpType.INFORMACION,
                            lineaSuspender, respuesta, "suspension",
                            api.getTimeStamp(), null);
                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.mySesion.AddLog(this.msisdn, OpType.APP_ERROR,
                            e.getMessage(), respuesta, "suspensionLinea",
                            api.getTimeStamp(), null);
                }
            }
        } else if (opcionsuspension == 3) {
            // Extravio, Robo.
            respuesta = "Ingresa la linea a restituir:";
            this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "restitucion", null, null);

            String lineaRestituir = this.mySesion.receive();

            if (lineaRestituir.equals("")) {
                respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            } else {
                // Se llama a la api para la suspencio de la linea.
                try {
                    respuesta = api.suspensionLinea(msisdn, lineaRestituir,
                            "R", parametro, parametro1);
                    this.mySesion.AddLog(this.msisdn, OpType.INFORMACION,
                            lineaRestituir, respuesta, "restitucion",
                            api.getTimeStamp(), null);

                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.mySesion.AddLog(this.msisdn, OpType.APP_ERROR,
                            e.getMessage(), respuesta, "suspensionLinea",
                            api.getTimeStamp(), null);
                }
            }
        } else {
            respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
        }

        this.mySesion.ResponseMsj(MessageType.LAST, respuesta, false);
    }
}
