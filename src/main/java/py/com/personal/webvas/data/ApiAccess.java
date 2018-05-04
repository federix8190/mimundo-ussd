package py.com.personal.webvas.data;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.datacontract.schemas._2004._07.mimundoussd.Facturas;
import org.datacontract.schemas._2004._07.mimundoussd.Personas;
import org.datacontract.schemas._2004._07.mimundoussd.ServicioAdicional;
import org.datacontract.schemas._2004._07.mimundoussd.Usuarios;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

import py.com.personal.vas.Service1;
import py.com.personal.webvas.mimundoussd.MiMundoConfiguration;
import py.com.personal.webvas.utils.RecargaClass;

public class ApiAccess {

    // Variable de tiempo.
    private Long _tiemStamp = 0L;

    // Se obtiene el valor.
    public Long getTimeStamp() {
        return _tiemStamp;
    }

    // AsigarTiempo.
    private void setTimeStamp(Long valor) {
        _tiemStamp = valor;
    }

    public boolean verificarIlimitado(String Msisdn) {
        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        long startTime = System.currentTimeMillis();

        String resul = ws.getBasicHttpBindingIService1().consultarIlimitado(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resul.equals("0") ? false : true;
    }

    public String reacreditarIlimitado(String Msisdn) {
        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        long startTime = System.currentTimeMillis();

        String resul = ws.getBasicHttpBindingIService1().reacreditarIlimitado(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resul;
    }

    // verifica que servicio p2p tiene activo.
    public ServicioAdicional verificaP2P(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        long startTime = System.currentTimeMillis();

        ServicioAdicional resul = ws.getBasicHttpBindingIService1()
                .verificarServicioNombre(MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn,
                        MiMundoConfiguration.instance._p2pServ);

        if (resul.getCodigoServicio().getValue().equals("")) {
            resul = ws.getBasicHttpBindingIService1().verificarServicioNombre(
                    MiMundoConfiguration.instance._userWs,
                    MiMundoConfiguration.instance._passWs,
                    MiMundoConfiguration.instance._appWs, Msisdn,
                    MiMundoConfiguration.instance._p2pFullServ);
        }
        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resul;
    }

    public boolean verficiaLineaIndividual(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        long startTime = System.currentTimeMillis();

        boolean resul = ws.getBasicHttpBindingIService1()
                .verificaLineaIndividual(MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
        return resul;
    }

    public String activaRecargaFactura(String Msisdn, String Cedula,
            String FechaNac) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        long startTime = System.currentTimeMillis();
        String resul = ws.getBasicHttpBindingIService1()
                .activarRecargaContraFactura(
                        MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn, Cedula,
                        FechaNac);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resul;
    }

    public String transferenciaP2P(String Msisdn, String Destino, String Monto,
            String Pin) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String transferir = "";
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        transferir = ws.getBasicHttpBindingIService1().transferenciaP2P(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, Destino, Monto,
                Pin);
        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return transferir;
    }

    public String activarP2P(String Msisdn, String P2PActual, String P2PNuevo,
            String Cedula, String FechaNac) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String activar = "";
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        activar = ws.getBasicHttpBindingIService1().activarP2P(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, Cedula, FechaNac,
                P2PActual, P2PNuevo);
        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return activar;
    }

    // valida el estado del saldo para transferencia.
    public boolean pedirPin(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        boolean pidePin = false;
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        pidePin = ws.getBasicHttpBindingIService1().verificaPin(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);
        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return pidePin;
    }

    // Verifica los datos del cliente.
    public String misDatos(String Msisdn) {
        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String nombre = ""; // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        Personas person = ws.getBasicHttpBindingIService1().obtenerDatos(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        if (!person.getNombrePersona().getValue().equals("")) {
            nombre = person.getNombrePersona().getValue() + " "
                    + person.getApellidoPersona().getValue();
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
        return nombre;

    }

    // Verifica los datos del saldo.
    public String miSaldo(String Msisdn) {
        String saldoStr = "";

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        saldoStr = ws.getBasicHttpBindingIService1().consultaSaldoKml(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);
        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return saldoStr;
    }

    // Lista las ultimas 3 facturas de un cliente.
    public ArrayOfstring ultimas3Facturas(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        ArrayOfstring facturas = null;
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        facturas = ws.getBasicHttpBindingIService1().obtenerUltimas3Facturas(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);
        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return facturas;
    }

    // Verifica los datos de la factura.
    public String misFacturas(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String facturaStr = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        Facturas facturaLinea = ws.getBasicHttpBindingIService1()
                .obtenerUltimaFactura(MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn);

        if (facturaLinea.getNumeroFactura() != 0) {

            Date fecha = facturaLinea.getFechaVencimiento()
                    .toGregorianCalendar().getTime();

            String nuevaFecha = "";

            SimpleDateFormat formatterFecha = new SimpleDateFormat(
                    "MM/dd/yyyy hh:mm a");
            try {
                nuevaFecha = formatterFecha.format(fecha);
            } catch (Exception e) {
            }

            NumberFormat formatter = NumberFormat
                    .getIntegerInstance(new Locale("es", "PY"));

            facturaStr = "Factura\nMonto: "
                    + formatter.format(facturaLinea.getMontoTotal())
                    + "Gs.\nVencimiento: " + nuevaFecha + "\nEstado: "
                    + facturaLinea.getEstado().getValue();
        } else {
            facturaStr = MiMundoConfiguration.instance._msjSinFactura;
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return facturaStr;
    }

    // Asocia al club personal.
    public String asociarClub(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String resul = ws.getBasicHttpBindingIService1().asociarClubPersonal(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resul;
    }

    // Obtiene los puntos del club personal.
    public String obtenerPuntos(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String resul = ws.getBasicHttpBindingIService1()
                .obtenerPuntosClubPersonal(
                        MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resul;
    }

    // Obtiene los puntos del club personal.
    public String obtenerEstadoUsuario(String Msisdn) {
        String resul = "";

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        Usuarios usuario = ws.getBasicHttpBindingIService1().obtenerEstado(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        if (!usuario.getEstado().getValue().equals("")) {
            resul = "Clave Personal\nEl estado de su usuario es: "
                    + usuario.getEstado().getValue().toUpperCase();

            if (usuario.getEstado().getValue().toUpperCase().equals("INACTIVO")
                    || usuario.getEstado().getValue().toUpperCase()
                            .equals("NO EXISTE")) {
                resul = resul
                        + ". Para activar tu cuenta ingresa a www.personal.com.py/ Mi Mundo Personal.";
            }
        } else {
            resul = MiMundoConfiguration.instance._msjError;
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resul;
    }

    // Modifica la clave en el ws de autenticacion.
    public String cambiarClave(String Msisdn, String Nuevaclave) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        boolean resul = ws.getBasicHttpBindingIService1().resetearClave(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, Nuevaclave);

        if (resul) {
            resp = "Clave Personal\nEl cambio de clave exitosa.";
        } else {
            resp = MiMundoConfiguration.instance._msjError;
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resp;
    }

    // Desbloquear Clave
    public String desbloquearClave(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        boolean resul = ws.getBasicHttpBindingIService1().desbloquearClave(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        if (resul) {
            resp = "Clave Personal\n"
                    + MiMundoConfiguration.instance._msjDesbloqueo;
        } else {
            resp = MiMundoConfiguration.instance._msjError;
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resp;
    }

    // Canjear club personal.
    public String canjearClub(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();
        String resp = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String resul = ws.getBasicHttpBindingIService1()
                .obtenerPremiosClubPersonal(
                        MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn);

        if (resul.equals("OK")) {
            resp = "Club Personal\n" + MiMundoConfiguration.instance._msjCanje;
        } else {
            resp = resul;
        }
        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resp;
    }

    // Realiza la suspencion de la linea por robo o extravio.
    public String suspensionLinea(String Msisdn, String LineaSuspendida,
            String Accion, String Cedula, String FechaNac) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();
        String resp = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String resul = ws.getBasicHttpBindingIService1().suspenderLineas(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, LineaSuspendida,
                Accion, Cedula, FechaNac);

        String msjTemp = "";

        if (Accion.equals("R")) {
            msjTemp = "Restitucion\n";
        } else if (Accion.equals("S")) {
            msjTemp = "Suspension\n";
        } else {
            msjTemp = "Robo o Extravio\n";
        }

        resp = (msjTemp + resul);
        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resp;
    }

    // Envia la configuracion a los terminales.
    public String enviarConfiguracion(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        boolean resul = ws.getBasicHttpBindingIService1().enviarConfiguracion(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        if (resul) {
            resp = "Configuracion\n"
                    + MiMundoConfiguration.instance._msjConfigOK;
        } else {
            resp = MiMundoConfiguration.instance._msjError;
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resp;
    }

    // Genera el ticket para dar de alta nuevas lineas.
    public String nuevasLineas(String Msisdn, String CantidadLineas,
            String NumeroContacto, boolean Activacion) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String descripcion = "";
        if (Activacion) {
            descripcion = "Linea solicitada desde autogestion ussd.";
        } else {
            descripcion = "Cambio de terminal solicitada desde autogestion ussd.";
        }

        boolean resul = ws.getBasicHttpBindingIService1().activarNuevasLineas(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, CantidadLineas,
                NumeroContacto, descripcion, Activacion);

        if (resul) {
            resp = "Telefonos\n" + MiMundoConfiguration.instance._msjTicketOK;
        } else {
            resp = MiMundoConfiguration.instance._msjError;
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resp;
    }

    // Prestar Saldo.
    public String prestarSaldo(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();
        resp = ws.getBasicHttpBindingIService1().prestarSaldo(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
        return "Prestame\n" + resp;
    }

    // Pedir Saldo.
    public String pedirSaldo(String Msisdn, String LineaDestino) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        resp = ws.getBasicHttpBindingIService1().pedirSaldo(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, LineaDestino);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return "Pasame\n" + resp;
    }

    // Obtiene los puntos de recarga mas cercanos.
    public String puntosCercanos(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        ws.getBasicHttpBindingIService1().obtenerPuntosCercanos(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return "Puntos Cercanos\n"
                + MiMundoConfiguration.instance._msjPuntosRecarga;
    }

    // Se guardaran los montos y porcentajes de la linea.
    private List<RecargaClass> montos = new ArrayList<RecargaClass>();

    public boolean ultimoMsj = false;

    // Obtiene los montos para recargar saldo.
    public String obtenerMontos(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        ArrayOfstring resul = ws.getBasicHttpBindingIService1()
                .obtenerMontosRecFact(MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn);

        NumberFormat formatter = NumberFormat.getIntegerInstance(new Locale(
                "es", "PY"));

        if (resul.getString().size() > 0) {
            if (resul.getString().get(0).equals("-1")) {
                this.ultimoMsj = true;
                return resul.getString().get(1);
            } else {
                // Se va a carga y armar el mensaje.
                RecargaClass regTemp = null;
                String[] partes = null;
                int id = 1;
                // Se recorre cada parte de la factura.
                for (String myString : resul.getString()) {
                    partes = myString.split(";");
                    regTemp = new RecargaClass();
                    regTemp.setId(id);
                    regTemp.setPorcentaje(partes[0]);
                    regTemp.setMonto(partes[1]);
                    montos.add(regTemp);

                    resp = resp
                            + id
                            + ". "
                            + formatter.format(Integer.parseInt(partes[1]))
                                    .toString()
                            + "Gs. \n";

                    id++;
                }
            }

        } else {
            resp = MiMundoConfiguration.instance._msjParamIncorrecto;
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return "RecargaFt\n" + (resp.endsWith("\n") ? resp.substring(0, resp.length() - 2) : resp);
    }

    // Confirmacion de la recarga.
    private RecargaClass recargaElegida = null;

    public String confirmarRecarga(Integer idRecarga) {
        String resp = "";
        try {
            recargaElegida = montos.get(idRecarga - 1);
            if (recargaElegida == null) {
                resp = MiMundoConfiguration.instance._msjParamIncorrecto;
                this.ultimoMsj = true;
            } else {
                NumberFormat formatter = NumberFormat.getIntegerInstance(new Locale("es", "PY"));

                resp = String.format(
                        MiMundoConfiguration.instance._msjrecargaConfirmacion,
                        formatter.format(Integer.parseInt(recargaElegida.getMonto())));
                
                resp = resp + "\n1.Aceptar.\n2.Cancelar.";
            }
        } catch (Exception e) {
            this.ultimoMsj = true;
            resp = MiMundoConfiguration.instance._msjParamIncorrecto;
        }
        return resp;
    }

    public String realizarRecarga(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        resp = ws.getBasicHttpBindingIService1().acreditarMontosRecFact(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn,
                recargaElegida.getPorcentaje(), recargaElegida.getMonto());

        resp = resp.replaceAll("444", "111");

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return "Recarga contra Factura\n" + resp;
    }

    public Object[] consultarSaldo(String msisdn09x) throws SQLException {
        Object[] respuesta = null;
        Connection connection = null;
        CallableStatement statement = null;

        try {
            connection = DataProvider.getKmlConnection();
            String sql = "{? = call DBADMIN.BS_CONSULTA_PACK.CONSULTAR(?,?)}";
            statement = connection.prepareCall(sql);
            statement.registerOutParameter(1, Types.INTEGER);
            statement.registerOutParameter(2, Types.CLOB);
            statement.setString(3, msisdn09x);
            statement.execute();

            int codigo = statement.getInt(1);
            String xmlRespuesta = statement.getString(2);
            respuesta = new Object[]{codigo, xmlRespuesta};

            return respuesta;

        } catch (SQLException e) {
            throw e;
        } finally {
            try {
                statement.close();
            } catch (Exception e) {
            }
            try {
                connection.close();
            } catch (Exception e) {
            }
        }
    }

    // Envia un sms con los back tone que tiene una linea.
    public boolean misBackTones(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        ws.getBasicHttpBindingIService1().misBackTones(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return true;
    }

    // Envia un sms para comprar nuevos back tones.
    public boolean comprarBackTones(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        ws.getBasicHttpBindingIService1().nuevoRbt(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return true;
    }

    // Desactiva el ring back tone.
    public String bajaBackTones(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();
        resp = ws.getBasicHttpBindingIService1().cancelarBackTone(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resp;
    }

    // Envia un sms.
    public void smsMusicaVideo(String Msisdn, String Mensaje, boolean video) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String remitente = "";
        if (video) {
            remitente = MiMundoConfiguration.instance._smsVideo;
        } else {
            remitente = MiMundoConfiguration.instance._smsMusica;
        }

        ws.getBasicHttpBindingIService1().enviarSms(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, Mensaje,
                remitente);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
    }

    // Obtiene los destinos gratuitos.
    public ArrayOfstring misDestinos(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        long startTime = System.currentTimeMillis();

        ArrayOfstring misDestinos = ws.getBasicHttpBindingIService1()
                .obtenerDestinosGratuitos(
                        MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return misDestinos;
    }

    // Agrega un destino Fyf.
    public void agregarFyf(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        ws.getBasicHttpBindingIService1().nuevoFyF(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
    }

    // Eliminar un fyf
    public void eliminarFyf(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        ws.getBasicHttpBindingIService1().desactivarFyf(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
    }

    // Da de alta o de baja la factura electronica.
    public String fatel(String Msisdn, String Email, String Operacion,
            String Fisica) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String resp = ws.getBasicHttpBindingIService1().facturaElectronica(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, Email, Operacion,
                Fisica);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
        return resp;
    }

    // Se cambia la direcion de mail para todo el grupo de facturacion.
    public String cambiarMail(String Msisdn, String Email) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String resp = ws.getBasicHttpBindingIService1().cambiarMail(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, Email);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
        return resp;
    }

    // Obtiene los puntos que van vencer y envia un sms.
    public String obtenerPuntosPorVencer(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String resp = ws.getBasicHttpBindingIService1().clubPuntoPorVender(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn);

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
        return resp;
    }

    public boolean verificaServicio(String Msisdn, String Servicio) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        boolean resul = false;
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        resul = ws.getBasicHttpBindingIService1().verificarServicio(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn,
                Servicio.toUpperCase());

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resul;
    }

    // Nuevos metodos de recarga SOS.
    public String obtenerMontosPrestame(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        String resp = "Responde con la opcion:\n";

        ArrayOfstring resul = ws.getBasicHttpBindingIService1()
                .obtenerMontosPrestame(MiMundoConfiguration.instance._userWs,
                        MiMundoConfiguration.instance._passWs,
                        MiMundoConfiguration.instance._appWs, Msisdn, "USSD");

        if (resul.getString().size() > 0) {
            if (resul.getString().get(0).equals("-1")) {
                this.ultimoMsj = true;
                return resul.getString().get(1);
            } else {
                // Se va a carga y armar el mensaje.
                RecargaClass regTemp = null;
                String[] partes = null;
                int id = 1;
                // Se recorre cada parte.
                for (String myString : resul.getString()) {
                    partes = myString.split(";");
                    regTemp = new RecargaClass();
                    regTemp.setId(id);
                    regTemp.setMonto(partes[1]);
                    regTemp.setPorcentaje(partes[2]);
                    montos.add(regTemp);

                    resp = resp + id + ". " + partes[0] + ".\n";

                    id++;
                }
            }
        } else {
            resp = MiMundoConfiguration.instance._msjParamIncorrecto;
        }

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);
        return resp;
    }

    public String confirmarMontoPrestame(Integer idRecarga, String Msisdn) {
        String resp = "";
        try {
            recargaElegida = montos.get(idRecarga - 1);
            
            if (recargaElegida == null) {
                
                resp = MiMundoConfiguration.instance._msjParamIncorrecto;
                this.ultimoMsj = true;
                
            } else {

                NumberFormat formatter = NumberFormat
                        .getIntegerInstance(new Locale("es", "PY"));

                String monto = recargaElegida.getMonto();
                int cantidadPrestamos = obtenerCantidadPrestamos(Msisdn);

                if (monto.equals("2000") && cantidadPrestamos == 0) {
                    
                    resp = String.format(MiMundoConfiguration.instance._msjConfirmarPrestame,
                                formatter.format(Integer.parseInt(recargaElegida.getMonto())),
                                "recarga/factura", 
                                formatter.format(Integer.parseInt(recargaElegida.getPorcentaje())), "");

                } else if (monto.equals("2000") && cantidadPrestamos >= 1) {
                    
                    resp = String.format(MiMundoConfiguration.instance._msjConfirmarPrestame,
                                formatter.format(Integer.parseInt(recargaElegida.getMonto())),
                                "recarga", 
                                formatter.format(Integer.parseInt(recargaElegida.getPorcentaje())),
                                "o si prestas mas de una vez");
                } else {
                    resp = String.format(MiMundoConfiguration.instance._msjConfirmarPrestameSinCosto,
                                    formatter.format(Integer.parseInt(recargaElegida.getMonto())));
                }
                resp = resp + "\n1. Aceptar.\n2. Cancelar.";
            }
        } catch (Exception e) {
            this.ultimoMsj = true;
            resp = MiMundoConfiguration.instance._msjParamIncorrecto;
        }
        return resp;
    }

    public String realizarPrestame(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        resp = ws.getBasicHttpBindingIService1().acreditarPrestame(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn,
                recargaElegida.getMonto(), "USSD");

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return "Prestame \n" + resp;
    }

    public String obtenerEstadoCuenta(String Msisdn, String Accion) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        String resp = "";
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        resp = ws.getBasicHttpBindingIService1().obtenerEstadoCuentaPrestame(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, Accion, "USSD");

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return "Prestame \n" + resp;
    }

    private int obtenerCantidadPrestamos(String Msisdn) {

        Service1 ws = WsSingleton.getInstance().getServiceInstance();

        int resp = 0;
        // Varibales para ver diferencia de tiempo.
        long startTime = System.currentTimeMillis();

        resp = ws.getBasicHttpBindingIService1().obtenerCantidadPrestamos(
                MiMundoConfiguration.instance._userWs,
                MiMundoConfiguration.instance._passWs,
                MiMundoConfiguration.instance._appWs, Msisdn, "USSD");

        // Se asgina el valor de tiempo.
        setTimeStamp(System.currentTimeMillis() - startTime);

        return resp;
    }
}
