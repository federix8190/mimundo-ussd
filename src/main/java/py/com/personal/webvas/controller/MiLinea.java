package py.com.personal.webvas.controller;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

import py.com.personal.webvas.data.ApiAccess;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession.MessageType;
import py.com.personal.webvas.smppcs.ussd.UssdExeption;
import py.com.personal.webvas.ussd.USSDSession;
import py.com.personal.webvas.utils.MyEnum.OpType;

public class MiLinea {

    private ApiAccess api = null;
    private String msisdn = "";
    private USSDSession miSesion = null;

    public MiLinea(USSDSession mySesion, String msisdn, ApiAccess apiWs) {
        this.miSesion = mySesion;
        this.msisdn = msisdn;
        this.api = apiWs;
    }

    // Logica de opcion Mi Linea.
    public void procesar(String mensajeIn) throws InterruptedException,
            UssdExeption {

        String respuesta = "";

        respuesta = MiMundoConfiguration.instance._menuMiLinea;
        this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

        // Se loguea la respuesta.
        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                respuesta, "MiLinea", null, null);

        // se espera el mensaje de opcion.
        String msjMiLinea = this.miSesion.receive();

        int opcionMiLinea = Integer.parseInt(msjMiLinea);
        if (opcionMiLinea == 1) {
            // Facturas
            try {
                respuesta = api.misFacturas(msisdn);
                enviarRespuestaFinal(OpType.INFORMACION, msjMiLinea, respuesta,
                        "MisFacturas", api.getTimeStamp(), null);

            } catch (Exception e) {
                enviarRespuestaFinal(OpType.APP_ERROR, e.getMessage(),
                        MiMundoConfiguration.instance._msjError, "MisFacturas",
                        api.getTimeStamp(), null);
            }
            return;

        } else if (opcionMiLinea == 2) {
            // Ultimas 3 Facturas.
            ArrayOfstring resp = null;

            try {
                resp = api.ultimas3Facturas(msisdn);
            } catch (Exception e) {
                enviarRespuestaFinal(OpType.APP_ERROR, e.getMessage(),
                        MiMundoConfiguration.instance._msjError,
                        "Ultimas3Facturas", api.getTimeStamp(), null);

                return;
            }

            if (resp.getString().size() != 0) {
                for (int i = 0; i < resp.getString().size(); i++) {

                    respuesta = resp.getString().get(i);

                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            msjMiLinea, respuesta, "Mis3facturas",
                            api.getTimeStamp(), null);

                    if (resp.getString().size() != 1
                            && i < (resp.getString().size() - 1)) {

                        respuesta = respuesta + "\n0- Ver mas.";

                        this.miSesion.ResponseMsj(MessageType.CONTINUE,
                                respuesta, true);
                    } else {
                        this.miSesion.ResponseMsj(MessageType.LAST, respuesta,
                                true);
                        return;
                    }

                    // Se espera la respuesta para continuar el paginado.
                    msjMiLinea = this.miSesion.receive();
                    if (!msjMiLinea.equals("")) {
                        continue;
                    }
                }
            } else {
                respuesta = MiMundoConfiguration.instance._msjError;
                enviarRespuestaFinal(OpType.INFORMACION, msjMiLinea, respuesta,
                        "Mis3Facturas", api.getTimeStamp(), null);

                return;
            }
        } else if (opcionMiLinea == 3) {
            // Club
            respuesta = MiMundoConfiguration.instance._menuClub;
            this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjMiLinea,
                    respuesta, "Club", null, null);

            msjMiLinea = this.miSesion.receive();

            int opcionClub = Integer.parseInt(msjMiLinea);

            if (opcionClub == 1) {

                try {
                    respuesta = api.asociarClub(msisdn);
                    enviarRespuestaFinal(OpType.INFORMACION, msjMiLinea,
                            respuesta, "AsociarClub", api.getTimeStamp(), null);
                } catch (Exception e) {
                    enviarRespuestaFinal(OpType.APP_ERROR, e.getMessage(),
                            MiMundoConfiguration.instance._msjError,
                            "AsociarClub", api.getTimeStamp(), null);
                }
                return;

            } else if (opcionClub == 2) {
                respuesta = MiMundoConfiguration.instance._menuClubPuntos;
                this.miSesion
                        .ResponseMsj(MessageType.CONTINUE, respuesta, true);

                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                        msjMiLinea, respuesta, "ObtenerPuntos",
                        api.getTimeStamp(), null);

                String opcionOtenerPuntos = this.miSesion.receive();

                if (opcionOtenerPuntos.equals("1")) {
                    try {
                        respuesta = api.obtenerPuntos(msisdn);
                    } catch (Exception e) {
                        respuesta = MiMundoConfiguration.instance._msjError;
                    }
                } else if (opcionOtenerPuntos.equals("2")) {
                    try {
                        respuesta = api.obtenerPuntosPorVencer(this.msisdn);
                    } catch (Exception e) {
                        respuesta = MiMundoConfiguration.instance._msjError;
                    }
                } else {
                    respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
                }

                enviarRespuestaFinal(OpType.INFORMACION, opcionOtenerPuntos,
                        respuesta, "ObtenerPuntos", api.getTimeStamp(), null);

                return;

            } else if (opcionClub == 3) {
                try {
                    respuesta = api.canjearClub(msisdn).substring(0, 150);
                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            msjMiLinea, respuesta, "CanjearClub",
                            api.getTimeStamp(), null);

                    enviarRespuestaFinal(OpType.INFORMACION, "", respuesta,
                            "CanjearClub", api.getTimeStamp(), null);

                    return;

                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                            e.getMessage(), respuesta, "CanjearClub",
                            api.getTimeStamp(), null);
                }
            } else {
                respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
                enviarRespuestaFinal(OpType.INFORMACION, msjMiLinea, respuesta,
                        "Club", api.getTimeStamp(), null);

                return;
            }
        } else {
            // Clave Personal.
            respuesta = MiMundoConfiguration.instance._menuClave;
            this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjMiLinea,
                    respuesta, "ClavePersonal", null, null);

            msjMiLinea = this.miSesion.receive();

            int opcionClave = Integer.parseInt(msjMiLinea);
            if (opcionClave == 1) {
                try {
                    respuesta = api.obtenerEstadoUsuario(msisdn);
                    enviarRespuestaFinal(OpType.INFORMACION, msjMiLinea,
                            respuesta, "ObtenerEstadoUsuario",
                            api.getTimeStamp(), null);

                } catch (Exception e) {
                    enviarRespuestaFinal(OpType.APP_ERROR, e.getMessage(),
                            MiMundoConfiguration.instance._msjError,
                            "obtenerEstadoUsuario", api.getTimeStamp(), null);
                }
                return;

            } else if (opcionClave == 2) {
                respuesta = "Ingrese nueva clave:";

                this.miSesion
                        .ResponseMsj(MessageType.CONTINUE, respuesta, true);

                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                        msjMiLinea, respuesta, "ClavePersonal",
                        api.getTimeStamp(), null);

                String nuevaClave = this.miSesion.receive();

                if (nuevaClave.equals("")) {
                    respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
                } else {
                    try {
                        respuesta = api.cambiarClave(msisdn, nuevaClave);
                    } catch (Exception e) {
                        respuesta = MiMundoConfiguration.instance._msjError;
                    }
                }
                enviarRespuestaFinal(OpType.INFORMACION, nuevaClave, respuesta,
                        "NuevaClave", api.getTimeStamp(), null);

                return;
            } else if (opcionClave == 3) {
                try {
                    respuesta = api.desbloquearClave(msisdn);
                    enviarRespuestaFinal(OpType.INFORMACION, msjMiLinea,
                            respuesta, "DesbloquearClave", api.getTimeStamp(),
                            null);

                } catch (Exception e) {
                    enviarRespuestaFinal(OpType.INFORMACION, e.getMessage(),
                            MiMundoConfiguration.instance._msjError,
                            "desbloquearClave", api.getTimeStamp(), null);
                }
                return;
            } else {
                try {
                    respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
                    enviarRespuestaFinal(OpType.INFORMACION, msjMiLinea,
                            respuesta, "ClavePersonal", null, null);
                } catch (Exception e) {
                    enviarRespuestaFinal(OpType.INFORMACION, e.getMessage(),
                            MiMundoConfiguration.instance._msjError,
                            "DesbloquearClave", api.getTimeStamp(), null);
                }
                return;
            }
        }
    }

    private void enviarRespuestaFinal(OpType opType, Object mensajeIn,
            String respuesta, String metodo, Long responseTime,
            Long responseTimePool) throws InterruptedException, UssdExeption {

        this.miSesion.AddLog(this.msisdn, opType, mensajeIn.toString(),
                respuesta, metodo, responseTime, responseTimePool);

        this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
    }
}
