package py.com.personal.webvas.controller;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

import py.com.personal.webvas.data.ApiAccess;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession.MessageType;
import py.com.personal.webvas.smppcs.ussd.UssdExeption;
import py.com.personal.webvas.ussd.USSDSession;
import py.com.personal.webvas.utils.MyEnum.OpType;

public class Servicios {

    private String msisdn = "";
    private USSDSession miSesion = null;
    private String respuesta = "";

    // Instancia del WebService.
    private ApiAccess api = null;

    public Servicios(USSDSession mySesion, String msisdn, ApiAccess apiWs) {
        this.miSesion = mySesion;
        this.msisdn = msisdn;
        this.api = apiWs;
    }

    public void procesar(String mensajeIn) throws InterruptedException, UssdExeption {

        respuesta = MiMundoConfiguration.instance._menuServicios;
        this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                respuesta, "Servicio", null, null);

        String opcionServ = this.miSesion.receive();

        if (opcionServ.equals("1")) {
            backTone(opcionServ);
        } else if (opcionServ.equals("2") || (opcionServ.equals("3"))) {
            // Musica y video.
            musicaVideo(opcionServ);
        } else if (opcionServ.equals("4")) {
            // Destinos gratuitos.
            respuesta = MiMundoConfiguration.instance._menuDestinos;
            this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                    respuesta, "DestinosGratuitos", null, null);

            String destinoOpcion = this.miSesion.receive();
            misDestino(destinoOpcion);
        } else if (opcionServ.equals("5")) {
            new ServicioFactura(this.miSesion, api, this.msisdn).mostrarMenuFacturas(opcionServ);
        } else {
            respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
        }
    }

    private void misDestino(String mensajeIn) throws InterruptedException, UssdExeption {

        if (mensajeIn.equals("1")) {
            // Mis destinos.
            ArrayOfstring misDestino = null;
            try {
                misDestino = api.misDestinos(this.msisdn);
            } catch (Exception e) {
                respuesta = MiMundoConfiguration.instance._msjError;
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), respuesta, "misDestinos", null, null);

                this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                return;
            }

            for (int i = 0; i < misDestino.getString().size(); i++) {

                respuesta = misDestino.getString().get(i);

                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                        mensajeIn, respuesta, "MisDestinos",
                        api.getTimeStamp(), null);

                if (misDestino.getString().size() != 1
                        && i < (misDestino.getString().size() - 1)) {

                    respuesta = respuesta + "\n0- Ver mas.";
                    this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta,
                            true);
                } else {
                    this.miSesion
                            .ResponseMsj(MessageType.LAST, respuesta, true);

                    return;
                }

                String respuesta = this.miSesion.receive();
                if (!respuesta.equals("")) {
                    continue;
                }
            }
        } else if (mensajeIn.equals("2")) {
            // Agregar destino.
            try {
                api.agregarFyf(this.msisdn);
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                        mensajeIn, respuesta, "AgregarDestino",
                        api.getTimeStamp(), null);
            } catch (Exception e) {
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), "", "agregarFyf", api.getTimeStamp(),
                        null);
            }
            respuesta = MiMundoConfiguration.instance._msjMisDestinos;

        } else if (mensajeIn.equals("3")) {
            // Eliminar destino.
            try {
                api.eliminarFyf(this.msisdn);
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                        mensajeIn, respuesta, "EliminarDestino",
                        api.getTimeStamp(), null);

            } catch (Exception e) {
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), "", "eliminarFyf", api.getTimeStamp(),
                        null);
            }
            respuesta = MiMundoConfiguration.instance._msjMisDestinos;

        } else {
            respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                    respuesta, "MisDestinos", null, null);
        }
        this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
    }

    // Procesa la logica de la opcion Backtone.
    private void backTone(String mensajeIn) throws InterruptedException,
            UssdExeption {

        respuesta = MiMundoConfiguration.instance._menuRbt;
        this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                respuesta, "BackTone", null, null);

        // 1- Mis Rbt, 2- Comprar, 3-Desactivar Rbt.
        String opcion = this.miSesion.receive();
        if (opcion.equals("1")) {

            try {
                this.api.misBackTones(this.msisdn);
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, opcion,
                        respuesta, "MisBackTones", api.getTimeStamp(), null);
            } catch (Exception e) {
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), "", "misBackTones", api.getTimeStamp(),
                        null);
            }
            respuesta = MiMundoConfiguration.instance._msjMisRbt;

        } else if (opcion.equals("2")) {
            try {
                this.api.comprarBackTones(this.msisdn);
                this.miSesion
                        .AddLog(this.msisdn, OpType.INFORMACION, opcion,
                                respuesta, "ComprarBackTones",
                                api.getTimeStamp(), null);
            } catch (Exception e) {
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), "", "comprarBackTones",
                        api.getTimeStamp(), null);
            }
            respuesta = MiMundoConfiguration.instance._msjMisRbtComprar;

        } else if (opcion.equals("3")) {

            try {
                respuesta = api.bajaBackTones(this.msisdn);
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, opcion,
                        respuesta, "SalirBackTones", api.getTimeStamp(), null);
            } catch (Exception e) {
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), "", "bajaBackTones",
                        api.getTimeStamp(), null);
            }
        } else {
            respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
        }

        this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
    }

    private void musicaVideo(String mensajeIn) throws InterruptedException,
            UssdExeption {
        if (mensajeIn.equals("2")) {
            // Musica.
            try {
                api.smsMusicaVideo(this.msisdn, MiMundoConfiguration.instance._msjUrlMusica, false);
            } catch (Exception e) {
            }
            respuesta = MiMundoConfiguration.instance._msjMusicaVideo + " Musica";

        } else if (mensajeIn.equals("3")) {
            // Video.
            try {
                api.smsMusicaVideo(this.msisdn, MiMundoConfiguration.instance._msjUrlVideo, true);
            } catch (Exception e) {
            }
            respuesta = MiMundoConfiguration.instance._msjMusicaVideo + " Video";

        } else {
            respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
        }

        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                respuesta, "Musica/Video", api.getTimeStamp(), null);

        this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
    }
}
