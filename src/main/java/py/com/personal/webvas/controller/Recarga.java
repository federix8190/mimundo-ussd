package py.com.personal.webvas.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.datacontract.schemas._2004._07.mimundoussd.ServicioAdicional;

import py.com.personal.webvas.data.ApiAccess;
import py.com.personal.webvas.data.ApiRestAccess;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.smppcs.ussd.UssdExeption;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession.MessageType;
import py.com.personal.webvas.ussd.USSDSession;
import py.com.personal.webvas.utils.MyEnum.OpType;

public class Recarga {

    private String msisdn = "";
    private USSDSession miSesion = null;

    private ApiAccess api = null;
    private ApiRestAccess api2 = null;

    public Recarga(USSDSession mySesion, String msisdn, ApiAccess apiWs, ApiRestAccess apiRest) {
        this.miSesion = mySesion;
        this.msisdn = msisdn;
        this.api = apiWs;
        this.api2 = apiRest;
    }

    // Logica de opcion recarga.
    public void procesar(String mensajeIn) throws InterruptedException,
            UssdExeption {

        String respuesta = "";

        String parametro = "";
        String parametro1 = "";

        respuesta = MiMundoConfiguration.instance._menuRecarga;

        // Se consulta a la linea y si esta dentro de ilimitado se agrega la
        // nueva opcion.
        if (api.verificarIlimitado(this.msisdn)) {
            respuesta = respuesta + MiMundoConfiguration.instance._menuIlimitado;
        }
        // ///////////////////////////////////////////////////////////////////////////////

        this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, false);

        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                respuesta, "PrestameSOS", null, null);

        String msjLinea = this.miSesion.receive();

        int opcionRecarga = Integer.parseInt(msjLinea);
        if (opcionRecarga == 1) {
            // Prestame.
            try {
                respuesta = api.obtenerMontosPrestame(msisdn);
            } catch (Exception e) {
                respuesta = MiMundoConfiguration.instance._msjError;
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), respuesta, "obtenerMontosPrestame",
                        api.getTimeStamp(), null);

                this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                return;
            }

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "ObtenerMontosSOS", api.getTimeStamp(), null);

            if (api.ultimoMsj) {
                this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                return;

            } else {
                this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);
            }

            msjLinea = this.miSesion.receive();

            int idRecarga = Integer.parseInt(msjLinea);
            try {
                respuesta = api.confirmarMontoPrestame(idRecarga, msisdn);
            } catch (Exception e) {
                respuesta = MiMundoConfiguration.instance._msjError;
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), respuesta, "confirmarMontoPrestame",
                        api.getTimeStamp(), null);

                this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                return;
            }

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "ConfirmarMontoSOS", null, null);

            if (api.ultimoMsj) {
                this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                return;
            } else {
                this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);
            }

            msjLinea = this.miSesion.receive();

            int confirmacionResp = Integer.parseInt(msjLinea);
            if (confirmacionResp == 1) {
                try {
                    respuesta = api.realizarPrestame(msisdn);
                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                            e.getMessage(), respuesta, "realizarPrestame",
                            api.getTimeStamp(), null);
                    this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                    return;
                }
            } else {
                respuesta = MiMundoConfiguration.instance._msjCancelar;
            }
            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "RealizarPrestameSOS", api.getTimeStamp(), null);

        } else if (opcionRecarga == 6) {
            // Consulta de prestamos pendientes.
            try {
                respuesta = api.obtenerEstadoCuenta(msisdn, "SALDO");
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                        respuesta, "SaldoSOS", api.getTimeStamp(), null);

            } catch (Exception e) {
                respuesta = MiMundoConfiguration.instance._msjError;
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                        e.getMessage(), respuesta, "obtenerEstadoCuenta",
                        api.getTimeStamp(), null);

                this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                return;
            }
        } else if (opcionRecarga == 2) {
            // Pasame.
            respuesta = "Ingresa la linea a quien queres pedir saldo:";

            this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "PedirSaldo", api.getTimeStamp(), null);

            String lineaPedioSaldo = this.miSesion.receive();
            if (lineaPedioSaldo.equals("")) {
                respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            } else {
                try {
                    respuesta = api.pedirSaldo(msisdn, lineaPedioSaldo);
                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            lineaPedioSaldo, respuesta, "pedirSaldo",
                            api.getTimeStamp(), null);

                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                            e.getMessage(), respuesta, "pedirSaldo",
                            api.getTimeStamp(), null);
                }
            }
        } else if (opcionRecarga == 3) {
            // se muestra el menu que tiene que salir antes.
            respuesta = "Pasar saldo\n1. Continuar\n2. Aumentar o disminuir monto de transferencias";

            this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "PasarSaldo", api.getTimeStamp(), null);

            msjLinea = this.miSesion.receive();
            
            if (msjLinea.equals("1")) {

                // Pasar saldo.
                respuesta = "Ingresa la linea a quien queres pasar saldo:";

                this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                        respuesta, "PasarSaldo", api.getTimeStamp(), null);

                String lineaPasarSaldo = this.miSesion.receive();
                if (lineaPasarSaldo.equals("")) {
                    respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            lineaPasarSaldo, respuesta, "PasarSaldo",
                            api.getTimeStamp(), null);
                } else {
                    respuesta = "Ingresa el monto a transferir:";
                    this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            lineaPasarSaldo, respuesta, "PasarSaldo",
                            api.getTimeStamp(), null);

                    String monto = this.miSesion.receive();
                    if (lineaPasarSaldo.equals("")) {
                        respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
                        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                                monto, respuesta, "PasarSaldo",
                                api.getTimeStamp(), null);

                    } else {
                        String pin = "";
                        // se valida el pin.
                        if (api.pedirPin(msisdn)) {
                            pin = getPin();
                        }
                        try {
                            respuesta = api.transferenciaP2P(msisdn,
                                    lineaPasarSaldo, monto, pin);
                            this.miSesion.AddLog(this.msisdn,
                                    OpType.INFORMACION, lineaPasarSaldo,
                                    respuesta, "PedirSaldo",
                                    api.getTimeStamp(), null);
                        } catch (Exception e) {
                            respuesta = MiMundoConfiguration.instance._msjError;
                            this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                                    e.getMessage(), respuesta,
                                    "transferenciaP2P", api.getTimeStamp(), null);
                        }
                    }
                }
            } else {
                // se aumenta o disminuye el maximo de transferencias
                // cambiando el servicio p2p y p2pfull
                //ServicioAdicional servP2P = null;
                py.com.personal.webvas.model.ServicioAdicional servP2P = null;
                try {
                    servP2P = api2.verificaP2P(msisdn);
                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                            e.getMessage(), respuesta, "verificaP2P",
                            api2.getTimeStamp(), null);

                    this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                    return;
                }

                if (servP2P.getCodigoServicio()//.getValue()
                        .equals("")) {
                    // Si no tiene p2p se le rechaza.
                    respuesta = MiMundoConfiguration.instance._msjNoPuede;

                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            msjLinea, respuesta, "VerificaP2P",
                            api.getTimeStamp(), null);

                    this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                    return;

                } else {
                    // se verifica la fecha de activacion.
                    int anio = servP2P.getFechaActivacion().getYear();
                    int mes = servP2P.getFechaActivacion().getMonth();
                    int dia = servP2P.getFechaActivacion().getDay();
                    Calendar calendar = new GregorianCalendar(anio, mes - 1, dia);

                    long milis1 = calendar.getTimeInMillis();
                    long milis2 = GregorianCalendar
                            .getInstance((TimeZone.getTimeZone(MiMundoConfiguration.instance._timezone)))
                            .getTimeInMillis();

                    long diff = milis2 - milis1;
                    // calcular la diferencia en dias
                    long diffDays = diff / (24 * 60 * 60 * 1000);

                    if (diffDays <= 30) {
                        respuesta = MiMundoConfiguration.instance._msjNoPuedeDias;

                        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                                msjLinea, respuesta, "VerificaP2P",
                                api.getTimeStamp(), null);

                        this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                        return;
                    }

                    // Se verifica el menu y se le pide cambiar.
                    String servP2Psugerido = "";
                    String servP2PSugeridoCodigo = "";
                    String topeSugerido = "";
                    if (servP2P.getCodigoServicio()//.getValue()
                            .equals(MiMundoConfiguration.instance._p2pServ)) {

                        servP2Psugerido = MiMundoConfiguration.instance._p2pFullServDes;
                        servP2PSugeridoCodigo = MiMundoConfiguration.instance._p2pFullServ;
                        topeSugerido = MiMundoConfiguration.instance._p2pFullTope;
                    } else {

                        servP2Psugerido = MiMundoConfiguration.instance._p2pServDes;
                        servP2PSugeridoCodigo = MiMundoConfiguration.instance._p2pServ;
                        topeSugerido = MiMundoConfiguration.instance._p2pTope;
                    }

                    // Se muestra el mensaje de que tiene y que puede tener.
                    respuesta = "Tenes activo el servicio "
                            + servP2P.getDescripcionServicio()//.getValue()
                            + ".\n1. Cambiar a servicio " + servP2Psugerido
                            + "(transferencia hasta " + topeSugerido
                            + ")\n2. Cancelar";

                    this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea, 
                            respuesta, "P2P", api.getTimeStamp(), null);

                    msjLinea = this.miSesion.receive();
                    if (msjLinea.equals("1")) {
                        // Se cambiar el servicio pidiendo cedula y fecha
                        // nac.
                        // Se pide los datos para la activacion.
                        boolean verificaLineaInd = false;
                        try {
                            verificaLineaInd = api.verficiaLineaIndividual(msisdn);
                        } catch (Exception e) {
                            this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                                    e.getMessage(), "", "verficiaLineaIndividual",
                                    api.getTimeStamp(), null);
                        }

                        if (verificaLineaInd) {
                            // se pide cedula y fechaNac.
                            respuesta = "Ingresa Nro. de cedula del titular de la linea:";
                            this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

                            this.miSesion.AddLog(this.msisdn,
                                    OpType.INFORMACION, msjLinea, respuesta,
                                    "P2P", api.getTimeStamp(), null);

                            // se recibe la cedula.
                            parametro = this.miSesion.receive();

                            // se pide fecha nac.
                            respuesta = "Ingresa la fecha de nacimiento del titular de la linea(ddmmaaaa):";
                            this.miSesion.ResponseMsj(MessageType.CONTINUE,
                                    respuesta, true);

                            this.miSesion.AddLog(this.msisdn,
                                    OpType.INFORMACION, parametro, respuesta,
                                    "P2P", api.getTimeStamp(), null);

                            parametro1 = this.miSesion.receive();
                            // Se llama a la operacion de activacion.
                            try {
                                respuesta = api.activarP2P(msisdn, servP2P
                                        .getCodigoServicio()//.getValue()
                                        ,servP2PSugeridoCodigo, parametro,
                                        parametro1);

                                this.miSesion.AddLog(this.msisdn,
                                        OpType.INFORMACION, parametro1,
                                        respuesta, "ActivarServicio",
                                        api.getTimeStamp(), null);
                            } catch (Exception e) {
                                respuesta = MiMundoConfiguration.instance._msjError;

                                this.miSesion.AddLog(this.msisdn,
                                        OpType.APP_ERROR, e.getMessage(),
                                        respuesta, "activarP2P",
                                        api.getTimeStamp(), null);
                            }
                            this.miSesion.ResponseMsj(MessageType.LAST,
                                    respuesta, true);

                            return;

                        } else {
                            this.miSesion.AddLog(this.msisdn,
                                    OpType.INFORMACION, msjLinea, respuesta,
                                    "P2P", null, null);

                            respuesta = MiMundoConfiguration.instance._msjNoPuede;
                            this.miSesion.ResponseMsj(MessageType.LAST,
                                    respuesta, true);
                            return;
                        }

                    } else {
                        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                                msjLinea, respuesta, "P2P", null, null);

                        respuesta = MiMundoConfiguration.instance._msjCancelar;
                        this.miSesion.ResponseMsj(MessageType.LAST, respuesta,
                                true);
                        return;
                    }
                }
            }
            
        } else if (opcionRecarga == 4) {
            // Contra Factrura.
            boolean verificaServ = false;
            try {
                verificaServ = api2.verificaServicio(msisdn,
                        MiMundoConfiguration.instance._contraFactServ);
            } catch (Exception e) {
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                        e.getMessage(), "", "verificaServicio", null, null);
            }

            if (verificaServ) {
                // Definimos una lista con una clase id, monto, porcentaje.
                try {
                    respuesta = api.obtenerMontos(msisdn);
                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            msjLinea, respuesta, "ObtenerMontos",
                            api.getTimeStamp(), null);
                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR, e.getMessage(), 
                            respuesta, "obtenerMontos", null, null);

                    this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                    return;
                }

                if (api.ultimoMsj) {
                    this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                    return;
                } else {
                    this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);
                }

                msjLinea = this.miSesion.receive();

                int idRecarga = Integer.parseInt(msjLinea);

                try {
                    respuesta = api.confirmarRecarga(idRecarga);
                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            msjLinea, respuesta, "ObtenerMontos", null, null);
                } catch (Exception e) {
                    respuesta = MiMundoConfiguration.instance._msjError;
                    this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                            e.getMessage(), respuesta, "confirmarRecarga",
                            null, null);

                    this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                    return;
                }

                if (api.ultimoMsj) {
                    this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                    return;
                } else {
                    this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);
                }

                msjLinea = this.miSesion.receive();

                int confirmacionResp = Integer.parseInt(msjLinea);
                if (confirmacionResp == 1) {
                    try {
                        respuesta = api.realizarRecarga(msisdn);
                    } catch (Exception e) {
                        respuesta = MiMundoConfiguration.instance._msjError;
                        this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR, e.getMessage(), 
                                respuesta, "realizarRecarga", null, null);
                    }
                } else {
                    respuesta = MiMundoConfiguration.instance._msjCancelar;
                }
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                        respuesta, "RealizarRecarga", api.getTimeStamp(), null);

            } else {
                // Si no tiene se le activa el servicio.
                respuesta = MiMundoConfiguration.instance._msjSinServContraFac
                        + "\n1. Continuar\n2. Cancelar";

                this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                        respuesta, "ActivarServicio", null, null);

                msjLinea = this.miSesion.receive();
                if (msjLinea.equals("1")) {
                    // Se pide los datos para la activacion.
                    boolean verificaLineaInd = false;
                    try {
                        verificaLineaInd = api.verficiaLineaIndividual(msisdn);
                    } catch (Exception e) {
                        this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                                e.getMessage(), "", "verficiaLineaIndividual",
                                null, null);
                    }

                    if (verificaLineaInd) {
                        // se pide cedula y fechaNac.
                        respuesta = "Ingresa Nro. de cedula del titular de la linea:";
                        this.miSesion.ResponseMsj(MessageType.CONTINUE, respuesta, true);

                        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                                msjLinea, respuesta, "ActivarServicio", null, null);

                        // se recibe la cedula.
                        parametro = this.miSesion.receive();

                        // se pide fecha nac.
                        respuesta = "Ingresa la fecha de nacimiento del titular de la linea(ddmmaaaa):";
                        this.miSesion.ResponseMsj(MessageType.CONTINUE,
                                respuesta, true);

                        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                                parametro, respuesta, "ActivarServicio", null,
                                null);

                        parametro1 = this.miSesion.receive();

                        try {
                            // Se llama a la operacion de activacion.
                            respuesta = api.activaRecargaFactura(msisdn,
                                    parametro, parametro1);

                            this.miSesion.AddLog(this.msisdn,
                                    OpType.INFORMACION, parametro1, respuesta,
                                    "ActivarServicio", null, null);

                        } catch (Exception e) {
                            respuesta = MiMundoConfiguration.instance._msjError;
                            this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR,
                                    e.getMessage(), "", "activaRecargaFactura",
                                    null, null);
                        }
                        this.miSesion.ResponseMsj(MessageType.LAST, respuesta,
                                true);
                        return;

                    } else {
                        // La linea no puede es de una empresa.
                        respuesta = MiMundoConfiguration.instance._msjNoPuede;
                        this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                                msjLinea, respuesta, "ActivarServicio", null, null);
                        this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
                        return;
                    }
                } else {
                    // Eligio cancelar la operacion.
                    respuesta = MiMundoConfiguration.instance._msjCancelar;
                    this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                            msjLinea, respuesta, "ActivarServicio", null, null);

                    this.miSesion
                            .ResponseMsj(MessageType.LAST, respuesta, true);
                    return;
                }
            }
        } else if (opcionRecarga == 5) {
            // Punto recarga.
            try {
                respuesta = api.puntosCercanos(msisdn);
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                        respuesta, "PuntosCercanos", api.getTimeStamp(), null);
            } catch (Exception e) {
                respuesta = MiMundoConfiguration.instance._msjError;
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR, e.getMessage(), 
                        respuesta, "puntosCercanos", api.getTimeStamp(), null);
            }
        } else if (opcionRecarga == 7) {
            // Se realiza la reacreditacion... :P
            try {
                respuesta = api.reacreditarIlimitado(msisdn);
                this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                        respuesta, "ReacreditarIlimitado", api.getTimeStamp(), null);
            } catch (Exception e) {
                respuesta = MiMundoConfiguration.instance._msjError;
                this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR, e.getMessage(), 
                        respuesta, "reacreditarIlimitado", api.getTimeStamp(), null);
            }
        } else {
            respuesta = MiMundoConfiguration.instance._msjParamIncorrecto;
            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, msjLinea,
                    respuesta, "P2P", api.getTimeStamp(), null);
        }
        this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
    }

    // Se le solicita el pin al cliente.
    public String getPin() throws InterruptedException, UssdExeption {

        String pin = "";
        this.miSesion.ResponseMsj(MessageType.CONTINUE, "Ingresa tu Pin:", true);
        String pinCliente = this.miSesion.receive();
        pin = pinCliente;

        return pin;
    }
}
