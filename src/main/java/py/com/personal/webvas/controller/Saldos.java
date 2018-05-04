package py.com.personal.webvas.controller;

import py.com.personal.webvas.data.ApiAccess;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.smppcs.ussd.UssdExeption;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession.MessageType;
import py.com.personal.webvas.ussd.USSDSession;
import py.com.personal.webvas.utils.MyEnum.OpType;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksFormatter;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksHandler;

import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksItem;

public class Saldos {

    private String msisdn = "";
    private USSDSession miSesion = null;

    // Instancia del WebService.
    private ApiAccess api = null;

    public Saldos(USSDSession mySesion, String msisdn, ApiAccess apiWs) {
        this.miSesion = mySesion;
        this.msisdn = msisdn;
        this.api = apiWs;
    }

    public void procesar(String mensajeIn) throws InterruptedException,
            UssdExeption {

        String respuesta = "";

        try {
            
            respuesta = api.miSaldo(msisdn);
            ConsultaSaldo(respuesta);
            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION, mensajeIn,
                    respuesta, "ConsultaSaldo", api.getTimeStamp(), null);
        } catch (Exception e) {
            respuesta = MiMundoConfiguration.instance._msjError;
            this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR, e.getMessage(),
                    respuesta, "miSaldo", api.getTimeStamp(), null);

            this.miSesion.ResponseMsj(MessageType.LAST, respuesta, true);
        }
    }

    private void ConsultaSaldo(String MsjsaldoLinea)
            throws InterruptedException, UssdExeption {

        String linea = msisdn.substring(3);
        Object[] xml = null;

        int codigo = 0;
        try {
            xml = api.consultarSaldo(linea);

            codigo = Integer.valueOf(xml[0].toString());

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                    MsjsaldoLinea, String.valueOf(codigo), "ConsultaSaldo",
                    api.getTimeStamp(), null);

            if (codigo != 0) {
                this.miSesion.ResponseMsj(MessageType.LAST, MsjsaldoLinea, true);
                return;

            } else {
                this.miSesion.ResponseMsj(MessageType.CONTINUE,
                        MsjsaldoLinea.concat("\n0 - Ver Saldo Packs."), true);
            }

            this.miSesion.receive();

            this.miSesion.AddLog(this.msisdn, OpType.INFORMACION,
                    MsjsaldoLinea, "", "ConsultaSaldo", api.getTimeStamp(),
                    null);

            ConsultaPacksItem[] itemsPacks = adaptar(xml[1].toString());
            ConsultaPacksFormatter formateador = new ConsultaPacksFormatter();

            for (int i = 0; i < itemsPacks.length; i++) {
                ConsultaPacksItem item = itemsPacks[i];
                int pagina = i + 1;
                int total = itemsPacks.length;
                String valor = formateador.format(item, pagina, total);
                if (pagina < total) {
                    this.miSesion.ResponseMsj(MessageType.CONTINUE, valor,
                            false);
                    String userInput = this.miSesion.receive();
                    if (userInput.matches("[0]")) {
                        continue;
                    } else {
                        this.miSesion.ResponseMsj(
                                        MessageType.LAST,
                                        MiMundoConfiguration.instance._msjParamIncorrecto,
                                        true);
                    }
                    return;
                } else {
                    this.miSesion.ResponseMsj(MessageType.LAST, valor, true);
                    return;
                }
            }
        } catch (Exception e) {
            this.miSesion.AddLog(this.msisdn, OpType.APP_ERROR, e.getMessage(),
                    "", "ConsultaSaldo", api.getTimeStamp(), null);

            this.miSesion.ResponseMsj(MessageType.LAST,
                    MiMundoConfiguration.instance._msjError, true);
        }
    }

    private ConsultaPacksItem[] adaptar(String xml) throws Exception {
        
        if (xml == null) {
            return new ConsultaPacksItem[0];
        }

        String[] clasificadores = MiMundoConfiguration.instance._noMostrar.split(";");
        ConsultaPacksItem[] items = null;
        
        try {
            ConsultaPacksHandler consultaPacksHandler = new ConsultaPacksHandler(xml, clasificadores);
            items = consultaPacksHandler.getConsultaPacks();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }
}
