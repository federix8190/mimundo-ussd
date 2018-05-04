package py.com.personal.webvas.controller;

import py.com.personal.webvas.data.ApiAccess;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession.MessageType;
import py.com.personal.webvas.smppcs.ussd.UssdExeption;
import py.com.personal.webvas.ussd.USSDSession;
import py.com.personal.webvas.utils.MyEnum.OpType;

public class Telefono {

    private String msisdn = "";
    private USSDSession mySesion = null;

    private ApiAccess api = null;

    public Telefono(USSDSession mySesion, String msisdn, ApiAccess apiWs) {
        this.mySesion = mySesion;
        this.msisdn = msisdn;
        this.api = apiWs;
    }

    // Logica de opcion Telefono.
    public void procesar(String mensajeIn) throws InterruptedException, UssdExeption {
        String respuesta = "";

        respuesta = MiMundoConfiguration.instance._menuTelefono;
        this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

        this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                respuesta, "Telefono", null, null);

        String msjLinea = this.mySesion.receive();
        int opcionTelefono = Integer.parseInt(msjLinea);
        if (opcionTelefono == 1) {
            // Enviar configuracion.
            try {
                respuesta = api.enviarConfiguracion(msisdn);
                this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                        respuesta, "enviarConfiguracion", null, null);
            } catch (Exception e) {
                respuesta = MiMundoConfiguration.instance._msjError;
                this.mySesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), respuesta, "enviarConfiguracion", null,
                        null);
            }
        } else if (opcionTelefono == 2) {
            // Comprar (Cambio de terminal).
            respuesta = "Ingrese numero de contacto:";
            this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "Comprar", null, null);

            msjLinea = this.mySesion.receive();
            if (msjLinea.equals("")) {
                respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            } else {
                String cantLineasStr = "0";

                try {
                    respuesta = api.nuevasLineas(msisdn, cantLineasStr, msjLinea, false);
                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.mySesion.AddLog(this.msisdn, OpType.INFORMACION,
                            e.getMessage(), respuesta, "nuevasLineas",
                            api.getTimeStamp(), null);
                }
            }
            this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "Comprar", api.getTimeStamp(), null);

        } else if (opcionTelefono == 3) {
            // Nuevas lineas.
            respuesta = "Ingrese cantidad de lineas:";
            this.mySesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "NuevasLineas", api.getTimeStamp(), null);

            msjLinea = this.mySesion.receive();
            Integer cantLineas = Integer.parseInt(msjLinea);
            if (cantLineas == 0) {
                respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            } else {
                respuesta = "Ingrese numero de contacto:";
                this.mySesion
                        .ResponseMsj(MessageType.CONTINUE, respuesta, true);

                this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                        respuesta, "NuevasLineas", api.getTimeStamp(), null);

                msjLinea = this.mySesion.receive();
                if (msjLinea.equals("")) {
                    respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
                } else {
                    String cantLineasStr = cantLineas.toString();
                    try {
                        respuesta = api.nuevasLineas(msisdn, cantLineasStr,
                                msjLinea, true);

                        this.mySesion.AddLog(this.msisdn, OpType.INFORMACION,
                                msjLinea, respuesta, "NuevasLineas",
                                api.getTimeStamp(), null);
                    } catch (Exception e) {
                        respuesta = MiMundoConfiguration.instance._msjError;

                        this.mySesion.AddLog(this.msisdn, OpType.APP_ERROR,
                                e.getMessage(), respuesta, "nuevasLineas",
                                api.getTimeStamp(), null);
                    }
                }
            }
        } else {
            respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            this.mySesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "NuevasLineas", null, null);
        }

        this.mySesion.ResponseMsj(MessageType.LAST, respuesta, true);
    }
}
