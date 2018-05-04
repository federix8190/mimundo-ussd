
package py.com.personal.vas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.mimundoussd.ArrayOfPlanes;
import org.datacontract.schemas._2004._07.mimundoussd.Facturas;
import org.datacontract.schemas._2004._07.mimundoussd.Personas;
import org.datacontract.schemas._2004._07.mimundoussd.Saldos;
import org.datacontract.schemas._2004._07.mimundoussd.ServicioAdicional;
import org.datacontract.schemas._2004._07.mimundoussd.Usuarios;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the py.com.personal.vas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://vas.personal.com.py", "GetDataResult");
    private final static QName _CambiarMailResponseCambiarMailResult_QNAME = new QName("http://vas.personal.com.py", "CambiarMailResult");
    private final static QName _ActivarNuevasLineasDescripcion_QNAME = new QName("http://vas.personal.com.py", "Descripcion");
    private final static QName _ActivarNuevasLineasCantidadLineas_QNAME = new QName("http://vas.personal.com.py", "CantidadLineas");
    private final static QName _ActivarNuevasLineasAplicacion_QNAME = new QName("http://vas.personal.com.py", "Aplicacion");
    private final static QName _ActivarNuevasLineasPass_QNAME = new QName("http://vas.personal.com.py", "Pass");
    private final static QName _ActivarNuevasLineasLineaOrigen_QNAME = new QName("http://vas.personal.com.py", "LineaOrigen");
    private final static QName _ActivarNuevasLineasNumeroContacto_QNAME = new QName("http://vas.personal.com.py", "NumeroContacto");
    private final static QName _ActivarNuevasLineasUsuario_QNAME = new QName("http://vas.personal.com.py", "Usuario");
    private final static QName _ObtenerUltimaFacturaResponseObtenerUltimaFacturaResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerUltimaFacturaResult");
    private final static QName _CambiarMailNuevoMail_QNAME = new QName("http://vas.personal.com.py", "NuevoMail");
    private final static QName _ConsultarIlimitadoResponseConsultarIlimitadoResult_QNAME = new QName("http://vas.personal.com.py", "ConsultarIlimitadoResult");
    private final static QName _ActivarP2PResponseActivarP2PResult_QNAME = new QName("http://vas.personal.com.py", "ActivarP2PResult");
    private final static QName _FacturaElectronicaOperacion_QNAME = new QName("http://vas.personal.com.py", "Operacion");
    private final static QName _FacturaElectronicaFacturaFisica_QNAME = new QName("http://vas.personal.com.py", "FacturaFisica");
    private final static QName _FacturaElectronicaEmail_QNAME = new QName("http://vas.personal.com.py", "Email");
    private final static QName _TransferenciaP2PMonto_QNAME = new QName("http://vas.personal.com.py", "Monto");
    private final static QName _TransferenciaP2PPin_QNAME = new QName("http://vas.personal.com.py", "Pin");
    private final static QName _TransferenciaP2PLineaDestino_QNAME = new QName("http://vas.personal.com.py", "LineaDestino");
    private final static QName _SuspenderLineasLineaSuspendida_QNAME = new QName("http://vas.personal.com.py", "LineaSuspendida");
    private final static QName _SuspenderLineasParametro_QNAME = new QName("http://vas.personal.com.py", "Parametro");
    private final static QName _SuspenderLineasParametro1_QNAME = new QName("http://vas.personal.com.py", "Parametro1");
    private final static QName _SuspenderLineasAccion_QNAME = new QName("http://vas.personal.com.py", "Accion");
    private final static QName _ActivarP2PP2PActual_QNAME = new QName("http://vas.personal.com.py", "P2PActual");
    private final static QName _ActivarP2PCedula_QNAME = new QName("http://vas.personal.com.py", "Cedula");
    private final static QName _ActivarP2PP2PFinal_QNAME = new QName("http://vas.personal.com.py", "P2PFinal");
    private final static QName _ActivarP2PFechaNac_QNAME = new QName("http://vas.personal.com.py", "FechaNac");
    private final static QName _AsociarClubPersonalResponseAsociarClubPersonalResult_QNAME = new QName("http://vas.personal.com.py", "AsociarClubPersonalResult");
    private final static QName _SuspenderLineasResponseSuspenderLineasResult_QNAME = new QName("http://vas.personal.com.py", "SuspenderLineasResult");
    private final static QName _AcreditarMontosRecFactPorcentaje_QNAME = new QName("http://vas.personal.com.py", "Porcentaje");
    private final static QName _ObtenerDestinosGratuitosResponseObtenerDestinosGratuitosResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerDestinosGratuitosResult");
    private final static QName _EnviarSmsOrigen_QNAME = new QName("http://vas.personal.com.py", "Origen");
    private final static QName _EnviarSmsMensaje_QNAME = new QName("http://vas.personal.com.py", "Mensaje");
    private final static QName _AcreditarPrestameResponseAcreditarPrestameResult_QNAME = new QName("http://vas.personal.com.py", "AcreditarPrestameResult");
    private final static QName _CancelarBackToneResponseCancelarBackToneResult_QNAME = new QName("http://vas.personal.com.py", "CancelarBackToneResult");
    private final static QName _ObtenerEstadoResponseObtenerEstadoResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerEstadoResult");
    private final static QName _ObtenerPuntosCercanosResponseObtenerPuntosCercanosResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerPuntosCercanosResult");
    private final static QName _VerificarServicioServicio_QNAME = new QName("http://vas.personal.com.py", "Servicio");
    private final static QName _AcreditarPrestameCanal_QNAME = new QName("http://vas.personal.com.py", "Canal");
    private final static QName _ObtenerPuntosClubPersonalResponseObtenerPuntosClubPersonalResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerPuntosClubPersonalResult");
    private final static QName _ActivarRecargaContraFacturaResponseActivarRecargaContraFacturaResult_QNAME = new QName("http://vas.personal.com.py", "ActivarRecargaContraFacturaResult");
    private final static QName _ObtenerPremiosClubPersonalResponseObtenerPremiosClubPersonalResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerPremiosClubPersonalResult");
    private final static QName _ObtenerSaldoResponseObtenerSaldoResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerSaldoResult");
    private final static QName _TransferenciaP2PResponseTransferenciaP2PResult_QNAME = new QName("http://vas.personal.com.py", "TransferenciaP2PResult");
    private final static QName _ObtenerUltimas3FacturasResponseObtenerUltimas3FacturasResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerUltimas3FacturasResult");
    private final static QName _PedirSaldoResponsePedirSaldoResult_QNAME = new QName("http://vas.personal.com.py", "PedirSaldoResult");
    private final static QName _ResetearClaveNuevaClave_QNAME = new QName("http://vas.personal.com.py", "NuevaClave");
    private final static QName _ObtenerMontosPrestameResponseObtenerMontosPrestameResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerMontosPrestameResult");
    private final static QName _VerificarServicioNombreResponseVerificarServicioNombreResult_QNAME = new QName("http://vas.personal.com.py", "VerificarServicioNombreResult");
    private final static QName _ObtenerMontosRecFactResponseObtenerMontosRecFactResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerMontosRecFactResult");
    private final static QName _ObtenerDatosResponseObtenerDatosResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerDatosResult");
    private final static QName _ObtenerPlanesResponseObtenerPlanesResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerPlanesResult");
    private final static QName _FacturaElectronicaResponseFacturaElectronicaResult_QNAME = new QName("http://vas.personal.com.py", "FacturaElectronicaResult");
    private final static QName _PrestarSaldoResponsePrestarSaldoResult_QNAME = new QName("http://vas.personal.com.py", "PrestarSaldoResult");
    private final static QName _ReacreditarIlimitadoResponseReacreditarIlimitadoResult_QNAME = new QName("http://vas.personal.com.py", "ReacreditarIlimitadoResult");
    private final static QName _AcreditarMontosRecFactResponseAcreditarMontosRecFactResult_QNAME = new QName("http://vas.personal.com.py", "AcreditarMontosRecFactResult");
    private final static QName _ConsultaSaldoKmlResponseConsultaSaldoKmlResult_QNAME = new QName("http://vas.personal.com.py", "ConsultaSaldoKmlResult");
    private final static QName _ClubPuntoPorVenderResponseClubPuntoPorVenderResult_QNAME = new QName("http://vas.personal.com.py", "ClubPuntoPorVenderResult");
    private final static QName _ObtenerEstadoCuentaPrestameResponseObtenerEstadoCuentaPrestameResult_QNAME = new QName("http://vas.personal.com.py", "ObtenerEstadoCuentaPrestameResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: py.com.personal.vas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsociarClubPersonalResponse }
     * 
     */
    public AsociarClubPersonalResponse createAsociarClubPersonalResponse() {
        return new AsociarClubPersonalResponse();
    }

    /**
     * Create an instance of {@link SuspenderLineasResponse }
     * 
     */
    public SuspenderLineasResponse createSuspenderLineasResponse() {
        return new SuspenderLineasResponse();
    }

    /**
     * Create an instance of {@link EnviarConfiguracionResponse }
     * 
     */
    public EnviarConfiguracionResponse createEnviarConfiguracionResponse() {
        return new EnviarConfiguracionResponse();
    }

    /**
     * Create an instance of {@link ObtenerUltimaFacturaResponse }
     * 
     */
    public ObtenerUltimaFacturaResponse createObtenerUltimaFacturaResponse() {
        return new ObtenerUltimaFacturaResponse();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link ObtenerDestinosGratuitosResponse }
     * 
     */
    public ObtenerDestinosGratuitosResponse createObtenerDestinosGratuitosResponse() {
        return new ObtenerDestinosGratuitosResponse();
    }

    /**
     * Create an instance of {@link VerificarServicioNombre }
     * 
     */
    public VerificarServicioNombre createVerificarServicioNombre() {
        return new VerificarServicioNombre();
    }

    /**
     * Create an instance of {@link ObtenerPremiosClubPersonal }
     * 
     */
    public ObtenerPremiosClubPersonal createObtenerPremiosClubPersonal() {
        return new ObtenerPremiosClubPersonal();
    }

    /**
     * Create an instance of {@link DesbloquearClaveResponse }
     * 
     */
    public DesbloquearClaveResponse createDesbloquearClaveResponse() {
        return new DesbloquearClaveResponse();
    }

    /**
     * Create an instance of {@link ObtenerEstadoCuentaPrestame }
     * 
     */
    public ObtenerEstadoCuentaPrestame createObtenerEstadoCuentaPrestame() {
        return new ObtenerEstadoCuentaPrestame();
    }

    /**
     * Create an instance of {@link ObtenerPlanes }
     * 
     */
    public ObtenerPlanes createObtenerPlanes() {
        return new ObtenerPlanes();
    }

    /**
     * Create an instance of {@link DesactivarFyf }
     * 
     */
    public DesactivarFyf createDesactivarFyf() {
        return new DesactivarFyf();
    }

    /**
     * Create an instance of {@link PrestarSaldoResponse }
     * 
     */
    public PrestarSaldoResponse createPrestarSaldoResponse() {
        return new PrestarSaldoResponse();
    }

    /**
     * Create an instance of {@link ObtenerEstadoResponse }
     * 
     */
    public ObtenerEstadoResponse createObtenerEstadoResponse() {
        return new ObtenerEstadoResponse();
    }

    /**
     * Create an instance of {@link AsociarClubPersonal }
     * 
     */
    public AsociarClubPersonal createAsociarClubPersonal() {
        return new AsociarClubPersonal();
    }

    /**
     * Create an instance of {@link ObtenerDestinosGratuitos }
     * 
     */
    public ObtenerDestinosGratuitos createObtenerDestinosGratuitos() {
        return new ObtenerDestinosGratuitos();
    }

    /**
     * Create an instance of {@link ObtenerSaldo }
     * 
     */
    public ObtenerSaldo createObtenerSaldo() {
        return new ObtenerSaldo();
    }

    /**
     * Create an instance of {@link ObtenerMontosPrestameResponse }
     * 
     */
    public ObtenerMontosPrestameResponse createObtenerMontosPrestameResponse() {
        return new ObtenerMontosPrestameResponse();
    }

    /**
     * Create an instance of {@link ObtenerMontosRecFact }
     * 
     */
    public ObtenerMontosRecFact createObtenerMontosRecFact() {
        return new ObtenerMontosRecFact();
    }

    /**
     * Create an instance of {@link ActivarNuevasLineasResponse }
     * 
     */
    public ActivarNuevasLineasResponse createActivarNuevasLineasResponse() {
        return new ActivarNuevasLineasResponse();
    }

    /**
     * Create an instance of {@link ActivarNuevasLineas }
     * 
     */
    public ActivarNuevasLineas createActivarNuevasLineas() {
        return new ActivarNuevasLineas();
    }

    /**
     * Create an instance of {@link ObtenerDatos }
     * 
     */
    public ObtenerDatos createObtenerDatos() {
        return new ObtenerDatos();
    }

    /**
     * Create an instance of {@link VerificaLineaIndividual }
     * 
     */
    public VerificaLineaIndividual createVerificaLineaIndividual() {
        return new VerificaLineaIndividual();
    }

    /**
     * Create an instance of {@link ClubPuntoPorVenderResponse }
     * 
     */
    public ClubPuntoPorVenderResponse createClubPuntoPorVenderResponse() {
        return new ClubPuntoPorVenderResponse();
    }

    /**
     * Create an instance of {@link ObtenerUltimaFactura }
     * 
     */
    public ObtenerUltimaFactura createObtenerUltimaFactura() {
        return new ObtenerUltimaFactura();
    }

    /**
     * Create an instance of {@link NuevoFyF }
     * 
     */
    public NuevoFyF createNuevoFyF() {
        return new NuevoFyF();
    }

    /**
     * Create an instance of {@link EnviarSmsResponse }
     * 
     */
    public EnviarSmsResponse createEnviarSmsResponse() {
        return new EnviarSmsResponse();
    }

    /**
     * Create an instance of {@link DesbloquearClave }
     * 
     */
    public DesbloquearClave createDesbloquearClave() {
        return new DesbloquearClave();
    }

    /**
     * Create an instance of {@link ResetearClaveResponse }
     * 
     */
    public ResetearClaveResponse createResetearClaveResponse() {
        return new ResetearClaveResponse();
    }

    /**
     * Create an instance of {@link VerificaPinResponse }
     * 
     */
    public VerificaPinResponse createVerificaPinResponse() {
        return new VerificaPinResponse();
    }

    /**
     * Create an instance of {@link NuevoRbtResponse }
     * 
     */
    public NuevoRbtResponse createNuevoRbtResponse() {
        return new NuevoRbtResponse();
    }

    /**
     * Create an instance of {@link ActivarRecargaContraFacturaResponse }
     * 
     */
    public ActivarRecargaContraFacturaResponse createActivarRecargaContraFacturaResponse() {
        return new ActivarRecargaContraFacturaResponse();
    }

    /**
     * Create an instance of {@link ObtenerUltimas3Facturas }
     * 
     */
    public ObtenerUltimas3Facturas createObtenerUltimas3Facturas() {
        return new ObtenerUltimas3Facturas();
    }

    /**
     * Create an instance of {@link TransferenciaP2P }
     * 
     */
    public TransferenciaP2P createTransferenciaP2P() {
        return new TransferenciaP2P();
    }

    /**
     * Create an instance of {@link ClubPuntoPorVender }
     * 
     */
    public ClubPuntoPorVender createClubPuntoPorVender() {
        return new ClubPuntoPorVender();
    }

    /**
     * Create an instance of {@link VerificaPin }
     * 
     */
    public VerificaPin createVerificaPin() {
        return new VerificaPin();
    }

    /**
     * Create an instance of {@link VerificarServicioResponse }
     * 
     */
    public VerificarServicioResponse createVerificarServicioResponse() {
        return new VerificarServicioResponse();
    }

    /**
     * Create an instance of {@link ConsultarIlimitadoResponse }
     * 
     */
    public ConsultarIlimitadoResponse createConsultarIlimitadoResponse() {
        return new ConsultarIlimitadoResponse();
    }

    /**
     * Create an instance of {@link PedirSaldo }
     * 
     */
    public PedirSaldo createPedirSaldo() {
        return new PedirSaldo();
    }

    /**
     * Create an instance of {@link AcreditarMontosRecFactResponse }
     * 
     */
    public AcreditarMontosRecFactResponse createAcreditarMontosRecFactResponse() {
        return new AcreditarMontosRecFactResponse();
    }

    /**
     * Create an instance of {@link AcreditarMontosRecFact }
     * 
     */
    public AcreditarMontosRecFact createAcreditarMontosRecFact() {
        return new AcreditarMontosRecFact();
    }

    /**
     * Create an instance of {@link ObtenerPuntosCercanos }
     * 
     */
    public ObtenerPuntosCercanos createObtenerPuntosCercanos() {
        return new ObtenerPuntosCercanos();
    }

    /**
     * Create an instance of {@link ObtenerPlanesResponse }
     * 
     */
    public ObtenerPlanesResponse createObtenerPlanesResponse() {
        return new ObtenerPlanesResponse();
    }

    /**
     * Create an instance of {@link MisBackTones }
     * 
     */
    public MisBackTones createMisBackTones() {
        return new MisBackTones();
    }

    /**
     * Create an instance of {@link ObtenerEstadoCuentaPrestameResponse }
     * 
     */
    public ObtenerEstadoCuentaPrestameResponse createObtenerEstadoCuentaPrestameResponse() {
        return new ObtenerEstadoCuentaPrestameResponse();
    }

    /**
     * Create an instance of {@link ObtenerPuntosClubPersonalResponse }
     * 
     */
    public ObtenerPuntosClubPersonalResponse createObtenerPuntosClubPersonalResponse() {
        return new ObtenerPuntosClubPersonalResponse();
    }

    /**
     * Create an instance of {@link ObtenerPuntosCercanosResponse }
     * 
     */
    public ObtenerPuntosCercanosResponse createObtenerPuntosCercanosResponse() {
        return new ObtenerPuntosCercanosResponse();
    }

    /**
     * Create an instance of {@link ConsultaSaldoKmlResponse }
     * 
     */
    public ConsultaSaldoKmlResponse createConsultaSaldoKmlResponse() {
        return new ConsultaSaldoKmlResponse();
    }

    /**
     * Create an instance of {@link ReacreditarIlimitado }
     * 
     */
    public ReacreditarIlimitado createReacreditarIlimitado() {
        return new ReacreditarIlimitado();
    }

    /**
     * Create an instance of {@link NuevoRbt }
     * 
     */
    public NuevoRbt createNuevoRbt() {
        return new NuevoRbt();
    }

    /**
     * Create an instance of {@link ResetearClave }
     * 
     */
    public ResetearClave createResetearClave() {
        return new ResetearClave();
    }

    /**
     * Create an instance of {@link VerificaLineaIndividualResponse }
     * 
     */
    public VerificaLineaIndividualResponse createVerificaLineaIndividualResponse() {
        return new VerificaLineaIndividualResponse();
    }

    /**
     * Create an instance of {@link ReacreditarIlimitadoResponse }
     * 
     */
    public ReacreditarIlimitadoResponse createReacreditarIlimitadoResponse() {
        return new ReacreditarIlimitadoResponse();
    }

    /**
     * Create an instance of {@link PrestarSaldo }
     * 
     */
    public PrestarSaldo createPrestarSaldo() {
        return new PrestarSaldo();
    }

    /**
     * Create an instance of {@link ObtenerMontosPrestame }
     * 
     */
    public ObtenerMontosPrestame createObtenerMontosPrestame() {
        return new ObtenerMontosPrestame();
    }

    /**
     * Create an instance of {@link EnviarConfiguracion }
     * 
     */
    public EnviarConfiguracion createEnviarConfiguracion() {
        return new EnviarConfiguracion();
    }

    /**
     * Create an instance of {@link ActivarP2PResponse }
     * 
     */
    public ActivarP2PResponse createActivarP2PResponse() {
        return new ActivarP2PResponse();
    }

    /**
     * Create an instance of {@link TransferenciaP2PResponse }
     * 
     */
    public TransferenciaP2PResponse createTransferenciaP2PResponse() {
        return new TransferenciaP2PResponse();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link CambiarMail }
     * 
     */
    public CambiarMail createCambiarMail() {
        return new CambiarMail();
    }

    /**
     * Create an instance of {@link ObtenerPuntosClubPersonal }
     * 
     */
    public ObtenerPuntosClubPersonal createObtenerPuntosClubPersonal() {
        return new ObtenerPuntosClubPersonal();
    }

    /**
     * Create an instance of {@link ObtenerSaldoResponse }
     * 
     */
    public ObtenerSaldoResponse createObtenerSaldoResponse() {
        return new ObtenerSaldoResponse();
    }

    /**
     * Create an instance of {@link ActivarP2P }
     * 
     */
    public ActivarP2P createActivarP2P() {
        return new ActivarP2P();
    }

    /**
     * Create an instance of {@link MisBackTonesResponse }
     * 
     */
    public MisBackTonesResponse createMisBackTonesResponse() {
        return new MisBackTonesResponse();
    }

    /**
     * Create an instance of {@link ConsultaSaldoKml }
     * 
     */
    public ConsultaSaldoKml createConsultaSaldoKml() {
        return new ConsultaSaldoKml();
    }

    /**
     * Create an instance of {@link FacturaElectronica }
     * 
     */
    public FacturaElectronica createFacturaElectronica() {
        return new FacturaElectronica();
    }

    /**
     * Create an instance of {@link SuspenderLineas }
     * 
     */
    public SuspenderLineas createSuspenderLineas() {
        return new SuspenderLineas();
    }

    /**
     * Create an instance of {@link DesactivarFyfResponse }
     * 
     */
    public DesactivarFyfResponse createDesactivarFyfResponse() {
        return new DesactivarFyfResponse();
    }

    /**
     * Create an instance of {@link VerificarServicioNombreResponse }
     * 
     */
    public VerificarServicioNombreResponse createVerificarServicioNombreResponse() {
        return new VerificarServicioNombreResponse();
    }

    /**
     * Create an instance of {@link ObtenerPremiosClubPersonalResponse }
     * 
     */
    public ObtenerPremiosClubPersonalResponse createObtenerPremiosClubPersonalResponse() {
        return new ObtenerPremiosClubPersonalResponse();
    }

    /**
     * Create an instance of {@link ObtenerDatosResponse }
     * 
     */
    public ObtenerDatosResponse createObtenerDatosResponse() {
        return new ObtenerDatosResponse();
    }

    /**
     * Create an instance of {@link CambiarMailResponse }
     * 
     */
    public CambiarMailResponse createCambiarMailResponse() {
        return new CambiarMailResponse();
    }

    /**
     * Create an instance of {@link CancelarBackTone }
     * 
     */
    public CancelarBackTone createCancelarBackTone() {
        return new CancelarBackTone();
    }

    /**
     * Create an instance of {@link CancelarBackToneResponse }
     * 
     */
    public CancelarBackToneResponse createCancelarBackToneResponse() {
        return new CancelarBackToneResponse();
    }

    /**
     * Create an instance of {@link AcreditarPrestameResponse }
     * 
     */
    public AcreditarPrestameResponse createAcreditarPrestameResponse() {
        return new AcreditarPrestameResponse();
    }

    /**
     * Create an instance of {@link AcreditarPrestame }
     * 
     */
    public AcreditarPrestame createAcreditarPrestame() {
        return new AcreditarPrestame();
    }

    /**
     * Create an instance of {@link ObtenerUltimas3FacturasResponse }
     * 
     */
    public ObtenerUltimas3FacturasResponse createObtenerUltimas3FacturasResponse() {
        return new ObtenerUltimas3FacturasResponse();
    }

    /**
     * Create an instance of {@link ConsultarIlimitado }
     * 
     */
    public ConsultarIlimitado createConsultarIlimitado() {
        return new ConsultarIlimitado();
    }

    /**
     * Create an instance of {@link VerificarServicio }
     * 
     */
    public VerificarServicio createVerificarServicio() {
        return new VerificarServicio();
    }

    /**
     * Create an instance of {@link FacturaElectronicaResponse }
     * 
     */
    public FacturaElectronicaResponse createFacturaElectronicaResponse() {
        return new FacturaElectronicaResponse();
    }

    /**
     * Create an instance of {@link NuevoFyFResponse }
     * 
     */
    public NuevoFyFResponse createNuevoFyFResponse() {
        return new NuevoFyFResponse();
    }

    /**
     * Create an instance of {@link ObtenerEstado }
     * 
     */
    public ObtenerEstado createObtenerEstado() {
        return new ObtenerEstado();
    }

    /**
     * Create an instance of {@link EnviarSms }
     * 
     */
    public EnviarSms createEnviarSms() {
        return new EnviarSms();
    }

    /**
     * Create an instance of {@link ObtenerMontosRecFactResponse }
     * 
     */
    public ObtenerMontosRecFactResponse createObtenerMontosRecFactResponse() {
        return new ObtenerMontosRecFactResponse();
    }

    /**
     * Create an instance of {@link ObtenerCantidadPrestamos }
     * 
     */
    public ObtenerCantidadPrestamos createObtenerCantidadPrestamos() {
        return new ObtenerCantidadPrestamos();
    }

    /**
     * Create an instance of {@link ObtenerCantidadPrestamosResponse }
     * 
     */
    public ObtenerCantidadPrestamosResponse createObtenerCantidadPrestamosResponse() {
        return new ObtenerCantidadPrestamosResponse();
    }

    /**
     * Create an instance of {@link PedirSaldoResponse }
     * 
     */
    public PedirSaldoResponse createPedirSaldoResponse() {
        return new PedirSaldoResponse();
    }

    /**
     * Create an instance of {@link ActivarRecargaContraFactura }
     * 
     */
    public ActivarRecargaContraFactura createActivarRecargaContraFactura() {
        return new ActivarRecargaContraFactura();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<String> createGetDataResponseGetDataResult(String value) {
        return new JAXBElement<String>(_GetDataResponseGetDataResult_QNAME, String.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "CambiarMailResult", scope = CambiarMailResponse.class)
    public JAXBElement<String> createCambiarMailResponseCambiarMailResult(String value) {
        return new JAXBElement<String>(_CambiarMailResponseCambiarMailResult_QNAME, String.class, CambiarMailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Descripcion", scope = ActivarNuevasLineas.class)
    public JAXBElement<String> createActivarNuevasLineasDescripcion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasDescripcion_QNAME, String.class, ActivarNuevasLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "CantidadLineas", scope = ActivarNuevasLineas.class)
    public JAXBElement<String> createActivarNuevasLineasCantidadLineas(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasCantidadLineas_QNAME, String.class, ActivarNuevasLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ActivarNuevasLineas.class)
    public JAXBElement<String> createActivarNuevasLineasAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ActivarNuevasLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ActivarNuevasLineas.class)
    public JAXBElement<String> createActivarNuevasLineasPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ActivarNuevasLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ActivarNuevasLineas.class)
    public JAXBElement<String> createActivarNuevasLineasLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ActivarNuevasLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "NumeroContacto", scope = ActivarNuevasLineas.class)
    public JAXBElement<String> createActivarNuevasLineasNumeroContacto(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasNumeroContacto_QNAME, String.class, ActivarNuevasLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ActivarNuevasLineas.class)
    public JAXBElement<String> createActivarNuevasLineasUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ActivarNuevasLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facturas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerUltimaFacturaResult", scope = ObtenerUltimaFacturaResponse.class)
    public JAXBElement<Facturas> createObtenerUltimaFacturaResponseObtenerUltimaFacturaResult(Facturas value) {
        return new JAXBElement<Facturas>(_ObtenerUltimaFacturaResponseObtenerUltimaFacturaResult_QNAME, Facturas.class, ObtenerUltimaFacturaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ConsultarIlimitado.class)
    public JAXBElement<String> createConsultarIlimitadoAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ConsultarIlimitado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ConsultarIlimitado.class)
    public JAXBElement<String> createConsultarIlimitadoPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ConsultarIlimitado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ConsultarIlimitado.class)
    public JAXBElement<String> createConsultarIlimitadoLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ConsultarIlimitado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ConsultarIlimitado.class)
    public JAXBElement<String> createConsultarIlimitadoUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ConsultarIlimitado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ReacreditarIlimitado.class)
    public JAXBElement<String> createReacreditarIlimitadoAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ReacreditarIlimitado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ReacreditarIlimitado.class)
    public JAXBElement<String> createReacreditarIlimitadoPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ReacreditarIlimitado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ReacreditarIlimitado.class)
    public JAXBElement<String> createReacreditarIlimitadoLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ReacreditarIlimitado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ReacreditarIlimitado.class)
    public JAXBElement<String> createReacreditarIlimitadoUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ReacreditarIlimitado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "NuevoMail", scope = CambiarMail.class)
    public JAXBElement<String> createCambiarMailNuevoMail(String value) {
        return new JAXBElement<String>(_CambiarMailNuevoMail_QNAME, String.class, CambiarMail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = CambiarMail.class)
    public JAXBElement<String> createCambiarMailAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, CambiarMail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = CambiarMail.class)
    public JAXBElement<String> createCambiarMailPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, CambiarMail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = CambiarMail.class)
    public JAXBElement<String> createCambiarMailLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, CambiarMail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = CambiarMail.class)
    public JAXBElement<String> createCambiarMailUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, CambiarMail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerMontosRecFact.class)
    public JAXBElement<String> createObtenerMontosRecFactAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerMontosRecFact.class)
    public JAXBElement<String> createObtenerMontosRecFactPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerMontosRecFact.class)
    public JAXBElement<String> createObtenerMontosRecFactLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerMontosRecFact.class)
    public JAXBElement<String> createObtenerMontosRecFactUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerUltimas3Facturas.class)
    public JAXBElement<String> createObtenerUltimas3FacturasAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerUltimas3Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerUltimas3Facturas.class)
    public JAXBElement<String> createObtenerUltimas3FacturasPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerUltimas3Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerUltimas3Facturas.class)
    public JAXBElement<String> createObtenerUltimas3FacturasLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerUltimas3Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerUltimas3Facturas.class)
    public JAXBElement<String> createObtenerUltimas3FacturasUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerUltimas3Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerDestinosGratuitos.class)
    public JAXBElement<String> createObtenerDestinosGratuitosAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerDestinosGratuitos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerDestinosGratuitos.class)
    public JAXBElement<String> createObtenerDestinosGratuitosPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerDestinosGratuitos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerDestinosGratuitos.class)
    public JAXBElement<String> createObtenerDestinosGratuitosLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerDestinosGratuitos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerDestinosGratuitos.class)
    public JAXBElement<String> createObtenerDestinosGratuitosUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerDestinosGratuitos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ConsultarIlimitadoResult", scope = ConsultarIlimitadoResponse.class)
    public JAXBElement<String> createConsultarIlimitadoResponseConsultarIlimitadoResult(String value) {
        return new JAXBElement<String>(_ConsultarIlimitadoResponseConsultarIlimitadoResult_QNAME, String.class, ConsultarIlimitadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = PrestarSaldo.class)
    public JAXBElement<String> createPrestarSaldoAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, PrestarSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = PrestarSaldo.class)
    public JAXBElement<String> createPrestarSaldoPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, PrestarSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = PrestarSaldo.class)
    public JAXBElement<String> createPrestarSaldoLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, PrestarSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = PrestarSaldo.class)
    public JAXBElement<String> createPrestarSaldoUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, PrestarSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerDatos.class)
    public JAXBElement<String> createObtenerDatosAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerDatos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerDatos.class)
    public JAXBElement<String> createObtenerDatosPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerDatos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerDatos.class)
    public JAXBElement<String> createObtenerDatosLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerDatos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerDatos.class)
    public JAXBElement<String> createObtenerDatosUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerDatos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ActivarP2PResult", scope = ActivarP2PResponse.class)
    public JAXBElement<String> createActivarP2PResponseActivarP2PResult(String value) {
        return new JAXBElement<String>(_ActivarP2PResponseActivarP2PResult_QNAME, String.class, ActivarP2PResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Operacion", scope = FacturaElectronica.class)
    public JAXBElement<String> createFacturaElectronicaOperacion(String value) {
        return new JAXBElement<String>(_FacturaElectronicaOperacion_QNAME, String.class, FacturaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = FacturaElectronica.class)
    public JAXBElement<String> createFacturaElectronicaAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, FacturaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = FacturaElectronica.class)
    public JAXBElement<String> createFacturaElectronicaPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, FacturaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = FacturaElectronica.class)
    public JAXBElement<String> createFacturaElectronicaLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, FacturaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "FacturaFisica", scope = FacturaElectronica.class)
    public JAXBElement<String> createFacturaElectronicaFacturaFisica(String value) {
        return new JAXBElement<String>(_FacturaElectronicaFacturaFisica_QNAME, String.class, FacturaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Email", scope = FacturaElectronica.class)
    public JAXBElement<String> createFacturaElectronicaEmail(String value) {
        return new JAXBElement<String>(_FacturaElectronicaEmail_QNAME, String.class, FacturaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = FacturaElectronica.class)
    public JAXBElement<String> createFacturaElectronicaUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, FacturaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = TransferenciaP2P.class)
    public JAXBElement<String> createTransferenciaP2PAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, TransferenciaP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = TransferenciaP2P.class)
    public JAXBElement<String> createTransferenciaP2PPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, TransferenciaP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Monto", scope = TransferenciaP2P.class)
    public JAXBElement<String> createTransferenciaP2PMonto(String value) {
        return new JAXBElement<String>(_TransferenciaP2PMonto_QNAME, String.class, TransferenciaP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = TransferenciaP2P.class)
    public JAXBElement<String> createTransferenciaP2PLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, TransferenciaP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pin", scope = TransferenciaP2P.class)
    public JAXBElement<String> createTransferenciaP2PPin(String value) {
        return new JAXBElement<String>(_TransferenciaP2PPin_QNAME, String.class, TransferenciaP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaDestino", scope = TransferenciaP2P.class)
    public JAXBElement<String> createTransferenciaP2PLineaDestino(String value) {
        return new JAXBElement<String>(_TransferenciaP2PLineaDestino_QNAME, String.class, TransferenciaP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = TransferenciaP2P.class)
    public JAXBElement<String> createTransferenciaP2PUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, TransferenciaP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaSuspendida", scope = SuspenderLineas.class)
    public JAXBElement<String> createSuspenderLineasLineaSuspendida(String value) {
        return new JAXBElement<String>(_SuspenderLineasLineaSuspendida_QNAME, String.class, SuspenderLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = SuspenderLineas.class)
    public JAXBElement<String> createSuspenderLineasAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, SuspenderLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = SuspenderLineas.class)
    public JAXBElement<String> createSuspenderLineasPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, SuspenderLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Parametro", scope = SuspenderLineas.class)
    public JAXBElement<String> createSuspenderLineasParametro(String value) {
        return new JAXBElement<String>(_SuspenderLineasParametro_QNAME, String.class, SuspenderLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = SuspenderLineas.class)
    public JAXBElement<String> createSuspenderLineasLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, SuspenderLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Parametro1", scope = SuspenderLineas.class)
    public JAXBElement<String> createSuspenderLineasParametro1(String value) {
        return new JAXBElement<String>(_SuspenderLineasParametro1_QNAME, String.class, SuspenderLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Accion", scope = SuspenderLineas.class)
    public JAXBElement<String> createSuspenderLineasAccion(String value) {
        return new JAXBElement<String>(_SuspenderLineasAccion_QNAME, String.class, SuspenderLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = SuspenderLineas.class)
    public JAXBElement<String> createSuspenderLineasUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, SuspenderLineas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerPlanes.class)
    public JAXBElement<String> createObtenerPlanesAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerPlanes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerPlanes.class)
    public JAXBElement<String> createObtenerPlanesPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerPlanes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerPlanes.class)
    public JAXBElement<String> createObtenerPlanesLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerPlanes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerPlanes.class)
    public JAXBElement<String> createObtenerPlanesUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerPlanes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = EnviarConfiguracion.class)
    public JAXBElement<String> createEnviarConfiguracionAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, EnviarConfiguracion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = EnviarConfiguracion.class)
    public JAXBElement<String> createEnviarConfiguracionPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, EnviarConfiguracion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = EnviarConfiguracion.class)
    public JAXBElement<String> createEnviarConfiguracionLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, EnviarConfiguracion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = EnviarConfiguracion.class)
    public JAXBElement<String> createEnviarConfiguracionUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, EnviarConfiguracion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "P2PActual", scope = ActivarP2P.class)
    public JAXBElement<String> createActivarP2PP2PActual(String value) {
        return new JAXBElement<String>(_ActivarP2PP2PActual_QNAME, String.class, ActivarP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ActivarP2P.class)
    public JAXBElement<String> createActivarP2PAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ActivarP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ActivarP2P.class)
    public JAXBElement<String> createActivarP2PPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ActivarP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Cedula", scope = ActivarP2P.class)
    public JAXBElement<String> createActivarP2PCedula(String value) {
        return new JAXBElement<String>(_ActivarP2PCedula_QNAME, String.class, ActivarP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ActivarP2P.class)
    public JAXBElement<String> createActivarP2PLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ActivarP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "P2PFinal", scope = ActivarP2P.class)
    public JAXBElement<String> createActivarP2PP2PFinal(String value) {
        return new JAXBElement<String>(_ActivarP2PP2PFinal_QNAME, String.class, ActivarP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "FechaNac", scope = ActivarP2P.class)
    public JAXBElement<String> createActivarP2PFechaNac(String value) {
        return new JAXBElement<String>(_ActivarP2PFechaNac_QNAME, String.class, ActivarP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ActivarP2P.class)
    public JAXBElement<String> createActivarP2PUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ActivarP2P.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "AsociarClubPersonalResult", scope = AsociarClubPersonalResponse.class)
    public JAXBElement<String> createAsociarClubPersonalResponseAsociarClubPersonalResult(String value) {
        return new JAXBElement<String>(_AsociarClubPersonalResponseAsociarClubPersonalResult_QNAME, String.class, AsociarClubPersonalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "SuspenderLineasResult", scope = SuspenderLineasResponse.class)
    public JAXBElement<String> createSuspenderLineasResponseSuspenderLineasResult(String value) {
        return new JAXBElement<String>(_SuspenderLineasResponseSuspenderLineasResult_QNAME, String.class, SuspenderLineasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = AcreditarMontosRecFact.class)
    public JAXBElement<String> createAcreditarMontosRecFactAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, AcreditarMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = AcreditarMontosRecFact.class)
    public JAXBElement<String> createAcreditarMontosRecFactPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, AcreditarMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Monto", scope = AcreditarMontosRecFact.class)
    public JAXBElement<String> createAcreditarMontosRecFactMonto(String value) {
        return new JAXBElement<String>(_TransferenciaP2PMonto_QNAME, String.class, AcreditarMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = AcreditarMontosRecFact.class)
    public JAXBElement<String> createAcreditarMontosRecFactLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, AcreditarMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Porcentaje", scope = AcreditarMontosRecFact.class)
    public JAXBElement<String> createAcreditarMontosRecFactPorcentaje(String value) {
        return new JAXBElement<String>(_AcreditarMontosRecFactPorcentaje_QNAME, String.class, AcreditarMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = AcreditarMontosRecFact.class)
    public JAXBElement<String> createAcreditarMontosRecFactUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, AcreditarMontosRecFact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = MisBackTones.class)
    public JAXBElement<String> createMisBackTonesAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, MisBackTones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = MisBackTones.class)
    public JAXBElement<String> createMisBackTonesPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, MisBackTones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = MisBackTones.class)
    public JAXBElement<String> createMisBackTonesLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, MisBackTones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = MisBackTones.class)
    public JAXBElement<String> createMisBackTonesUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, MisBackTones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = DesbloquearClave.class)
    public JAXBElement<String> createDesbloquearClaveAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, DesbloquearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = DesbloquearClave.class)
    public JAXBElement<String> createDesbloquearClavePass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, DesbloquearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = DesbloquearClave.class)
    public JAXBElement<String> createDesbloquearClaveLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, DesbloquearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = DesbloquearClave.class)
    public JAXBElement<String> createDesbloquearClaveUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, DesbloquearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerDestinosGratuitosResult", scope = ObtenerDestinosGratuitosResponse.class)
    public JAXBElement<ArrayOfstring> createObtenerDestinosGratuitosResponseObtenerDestinosGratuitosResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ObtenerDestinosGratuitosResponseObtenerDestinosGratuitosResult_QNAME, ArrayOfstring.class, ObtenerDestinosGratuitosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Origen", scope = EnviarSms.class)
    public JAXBElement<String> createEnviarSmsOrigen(String value) {
        return new JAXBElement<String>(_EnviarSmsOrigen_QNAME, String.class, EnviarSms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = EnviarSms.class)
    public JAXBElement<String> createEnviarSmsAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, EnviarSms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = EnviarSms.class)
    public JAXBElement<String> createEnviarSmsPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, EnviarSms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaDestino", scope = EnviarSms.class)
    public JAXBElement<String> createEnviarSmsLineaDestino(String value) {
        return new JAXBElement<String>(_TransferenciaP2PLineaDestino_QNAME, String.class, EnviarSms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Mensaje", scope = EnviarSms.class)
    public JAXBElement<String> createEnviarSmsMensaje(String value) {
        return new JAXBElement<String>(_EnviarSmsMensaje_QNAME, String.class, EnviarSms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = EnviarSms.class)
    public JAXBElement<String> createEnviarSmsUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, EnviarSms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerPuntosCercanos.class)
    public JAXBElement<String> createObtenerPuntosCercanosAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerPuntosCercanos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerPuntosCercanos.class)
    public JAXBElement<String> createObtenerPuntosCercanosPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerPuntosCercanos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerPuntosCercanos.class)
    public JAXBElement<String> createObtenerPuntosCercanosLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerPuntosCercanos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerPuntosCercanos.class)
    public JAXBElement<String> createObtenerPuntosCercanosUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerPuntosCercanos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = DesactivarFyf.class)
    public JAXBElement<String> createDesactivarFyfAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, DesactivarFyf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = DesactivarFyf.class)
    public JAXBElement<String> createDesactivarFyfPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, DesactivarFyf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = DesactivarFyf.class)
    public JAXBElement<String> createDesactivarFyfLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, DesactivarFyf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = DesactivarFyf.class)
    public JAXBElement<String> createDesactivarFyfUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, DesactivarFyf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "AcreditarPrestameResult", scope = AcreditarPrestameResponse.class)
    public JAXBElement<String> createAcreditarPrestameResponseAcreditarPrestameResult(String value) {
        return new JAXBElement<String>(_AcreditarPrestameResponseAcreditarPrestameResult_QNAME, String.class, AcreditarPrestameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "CancelarBackToneResult", scope = CancelarBackToneResponse.class)
    public JAXBElement<String> createCancelarBackToneResponseCancelarBackToneResult(String value) {
        return new JAXBElement<String>(_CancelarBackToneResponseCancelarBackToneResult_QNAME, String.class, CancelarBackToneResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerEstadoResult", scope = ObtenerEstadoResponse.class)
    public JAXBElement<Usuarios> createObtenerEstadoResponseObtenerEstadoResult(Usuarios value) {
        return new JAXBElement<Usuarios>(_ObtenerEstadoResponseObtenerEstadoResult_QNAME, Usuarios.class, ObtenerEstadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerPuntosCercanosResult", scope = ObtenerPuntosCercanosResponse.class)
    public JAXBElement<String> createObtenerPuntosCercanosResponseObtenerPuntosCercanosResult(String value) {
        return new JAXBElement<String>(_ObtenerPuntosCercanosResponseObtenerPuntosCercanosResult_QNAME, String.class, ObtenerPuntosCercanosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = PedirSaldo.class)
    public JAXBElement<String> createPedirSaldoAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, PedirSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = PedirSaldo.class)
    public JAXBElement<String> createPedirSaldoPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, PedirSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = PedirSaldo.class)
    public JAXBElement<String> createPedirSaldoLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, PedirSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaDestino", scope = PedirSaldo.class)
    public JAXBElement<String> createPedirSaldoLineaDestino(String value) {
        return new JAXBElement<String>(_TransferenciaP2PLineaDestino_QNAME, String.class, PedirSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = PedirSaldo.class)
    public JAXBElement<String> createPedirSaldoUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, PedirSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = VerificarServicio.class)
    public JAXBElement<String> createVerificarServicioAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, VerificarServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = VerificarServicio.class)
    public JAXBElement<String> createVerificarServicioPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, VerificarServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = VerificarServicio.class)
    public JAXBElement<String> createVerificarServicioLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, VerificarServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Servicio", scope = VerificarServicio.class)
    public JAXBElement<String> createVerificarServicioServicio(String value) {
        return new JAXBElement<String>(_VerificarServicioServicio_QNAME, String.class, VerificarServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = VerificarServicio.class)
    public JAXBElement<String> createVerificarServicioUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, VerificarServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerSaldo.class)
    public JAXBElement<String> createObtenerSaldoAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerSaldo.class)
    public JAXBElement<String> createObtenerSaldoPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerSaldo.class)
    public JAXBElement<String> createObtenerSaldoLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerSaldo.class)
    public JAXBElement<String> createObtenerSaldoUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerSaldo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Canal", scope = AcreditarPrestame.class)
    public JAXBElement<String> createAcreditarPrestameCanal(String value) {
        return new JAXBElement<String>(_AcreditarPrestameCanal_QNAME, String.class, AcreditarPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = AcreditarPrestame.class)
    public JAXBElement<String> createAcreditarPrestameAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, AcreditarPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = AcreditarPrestame.class)
    public JAXBElement<String> createAcreditarPrestamePass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, AcreditarPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Monto", scope = AcreditarPrestame.class)
    public JAXBElement<String> createAcreditarPrestameMonto(String value) {
        return new JAXBElement<String>(_TransferenciaP2PMonto_QNAME, String.class, AcreditarPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = AcreditarPrestame.class)
    public JAXBElement<String> createAcreditarPrestameLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, AcreditarPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = AcreditarPrestame.class)
    public JAXBElement<String> createAcreditarPrestameUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, AcreditarPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = AsociarClubPersonal.class)
    public JAXBElement<String> createAsociarClubPersonalAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, AsociarClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = AsociarClubPersonal.class)
    public JAXBElement<String> createAsociarClubPersonalPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, AsociarClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = AsociarClubPersonal.class)
    public JAXBElement<String> createAsociarClubPersonalLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, AsociarClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = AsociarClubPersonal.class)
    public JAXBElement<String> createAsociarClubPersonalUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, AsociarClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerPremiosClubPersonal.class)
    public JAXBElement<String> createObtenerPremiosClubPersonalAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerPremiosClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerPremiosClubPersonal.class)
    public JAXBElement<String> createObtenerPremiosClubPersonalPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerPremiosClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerPremiosClubPersonal.class)
    public JAXBElement<String> createObtenerPremiosClubPersonalLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerPremiosClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerPremiosClubPersonal.class)
    public JAXBElement<String> createObtenerPremiosClubPersonalUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerPremiosClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerEstado.class)
    public JAXBElement<String> createObtenerEstadoAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerEstado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerEstado.class)
    public JAXBElement<String> createObtenerEstadoPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerEstado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerEstado.class)
    public JAXBElement<String> createObtenerEstadoLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerEstado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerEstado.class)
    public JAXBElement<String> createObtenerEstadoUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerEstado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerPuntosClubPersonalResult", scope = ObtenerPuntosClubPersonalResponse.class)
    public JAXBElement<String> createObtenerPuntosClubPersonalResponseObtenerPuntosClubPersonalResult(String value) {
        return new JAXBElement<String>(_ObtenerPuntosClubPersonalResponseObtenerPuntosClubPersonalResult_QNAME, String.class, ObtenerPuntosClubPersonalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ActivarRecargaContraFacturaResult", scope = ActivarRecargaContraFacturaResponse.class)
    public JAXBElement<String> createActivarRecargaContraFacturaResponseActivarRecargaContraFacturaResult(String value) {
        return new JAXBElement<String>(_ActivarRecargaContraFacturaResponseActivarRecargaContraFacturaResult_QNAME, String.class, ActivarRecargaContraFacturaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerPremiosClubPersonalResult", scope = ObtenerPremiosClubPersonalResponse.class)
    public JAXBElement<String> createObtenerPremiosClubPersonalResponseObtenerPremiosClubPersonalResult(String value) {
        return new JAXBElement<String>(_ObtenerPremiosClubPersonalResponseObtenerPremiosClubPersonalResult_QNAME, String.class, ObtenerPremiosClubPersonalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saldos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerSaldoResult", scope = ObtenerSaldoResponse.class)
    public JAXBElement<Saldos> createObtenerSaldoResponseObtenerSaldoResult(Saldos value) {
        return new JAXBElement<Saldos>(_ObtenerSaldoResponseObtenerSaldoResult_QNAME, Saldos.class, ObtenerSaldoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "TransferenciaP2PResult", scope = TransferenciaP2PResponse.class)
    public JAXBElement<String> createTransferenciaP2PResponseTransferenciaP2PResult(String value) {
        return new JAXBElement<String>(_TransferenciaP2PResponseTransferenciaP2PResult_QNAME, String.class, TransferenciaP2PResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = VerificarServicioNombre.class)
    public JAXBElement<String> createVerificarServicioNombreAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, VerificarServicioNombre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = VerificarServicioNombre.class)
    public JAXBElement<String> createVerificarServicioNombrePass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, VerificarServicioNombre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = VerificarServicioNombre.class)
    public JAXBElement<String> createVerificarServicioNombreLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, VerificarServicioNombre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Servicio", scope = VerificarServicioNombre.class)
    public JAXBElement<String> createVerificarServicioNombreServicio(String value) {
        return new JAXBElement<String>(_VerificarServicioServicio_QNAME, String.class, VerificarServicioNombre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = VerificarServicioNombre.class)
    public JAXBElement<String> createVerificarServicioNombreUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, VerificarServicioNombre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Canal", scope = ObtenerCantidadPrestamos.class)
    public JAXBElement<String> createObtenerCantidadPrestamosCanal(String value) {
        return new JAXBElement<String>(_AcreditarPrestameCanal_QNAME, String.class, ObtenerCantidadPrestamos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerCantidadPrestamos.class)
    public JAXBElement<String> createObtenerCantidadPrestamosAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerCantidadPrestamos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerCantidadPrestamos.class)
    public JAXBElement<String> createObtenerCantidadPrestamosPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerCantidadPrestamos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerCantidadPrestamos.class)
    public JAXBElement<String> createObtenerCantidadPrestamosLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerCantidadPrestamos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerCantidadPrestamos.class)
    public JAXBElement<String> createObtenerCantidadPrestamosUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerCantidadPrestamos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = VerificaLineaIndividual.class)
    public JAXBElement<String> createVerificaLineaIndividualAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, VerificaLineaIndividual.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = VerificaLineaIndividual.class)
    public JAXBElement<String> createVerificaLineaIndividualPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, VerificaLineaIndividual.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = VerificaLineaIndividual.class)
    public JAXBElement<String> createVerificaLineaIndividualLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, VerificaLineaIndividual.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = VerificaLineaIndividual.class)
    public JAXBElement<String> createVerificaLineaIndividualUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, VerificaLineaIndividual.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerUltimas3FacturasResult", scope = ObtenerUltimas3FacturasResponse.class)
    public JAXBElement<ArrayOfstring> createObtenerUltimas3FacturasResponseObtenerUltimas3FacturasResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ObtenerUltimas3FacturasResponseObtenerUltimas3FacturasResult_QNAME, ArrayOfstring.class, ObtenerUltimas3FacturasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = NuevoFyF.class)
    public JAXBElement<String> createNuevoFyFAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, NuevoFyF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = NuevoFyF.class)
    public JAXBElement<String> createNuevoFyFPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, NuevoFyF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = NuevoFyF.class)
    public JAXBElement<String> createNuevoFyFLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, NuevoFyF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = NuevoFyF.class)
    public JAXBElement<String> createNuevoFyFUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, NuevoFyF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ConsultaSaldoKml.class)
    public JAXBElement<String> createConsultaSaldoKmlAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ConsultaSaldoKml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ConsultaSaldoKml.class)
    public JAXBElement<String> createConsultaSaldoKmlPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ConsultaSaldoKml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ConsultaSaldoKml.class)
    public JAXBElement<String> createConsultaSaldoKmlLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ConsultaSaldoKml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ConsultaSaldoKml.class)
    public JAXBElement<String> createConsultaSaldoKmlUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ConsultaSaldoKml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerPuntosClubPersonal.class)
    public JAXBElement<String> createObtenerPuntosClubPersonalAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerPuntosClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerPuntosClubPersonal.class)
    public JAXBElement<String> createObtenerPuntosClubPersonalPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerPuntosClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerPuntosClubPersonal.class)
    public JAXBElement<String> createObtenerPuntosClubPersonalLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerPuntosClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerPuntosClubPersonal.class)
    public JAXBElement<String> createObtenerPuntosClubPersonalUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerPuntosClubPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ClubPuntoPorVender.class)
    public JAXBElement<String> createClubPuntoPorVenderAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ClubPuntoPorVender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ClubPuntoPorVender.class)
    public JAXBElement<String> createClubPuntoPorVenderPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ClubPuntoPorVender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ClubPuntoPorVender.class)
    public JAXBElement<String> createClubPuntoPorVenderLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ClubPuntoPorVender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ClubPuntoPorVender.class)
    public JAXBElement<String> createClubPuntoPorVenderUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ClubPuntoPorVender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ActivarRecargaContraFactura.class)
    public JAXBElement<String> createActivarRecargaContraFacturaAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ActivarRecargaContraFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ActivarRecargaContraFactura.class)
    public JAXBElement<String> createActivarRecargaContraFacturaPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ActivarRecargaContraFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Cedula", scope = ActivarRecargaContraFactura.class)
    public JAXBElement<String> createActivarRecargaContraFacturaCedula(String value) {
        return new JAXBElement<String>(_ActivarP2PCedula_QNAME, String.class, ActivarRecargaContraFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ActivarRecargaContraFactura.class)
    public JAXBElement<String> createActivarRecargaContraFacturaLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ActivarRecargaContraFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "FechaNac", scope = ActivarRecargaContraFactura.class)
    public JAXBElement<String> createActivarRecargaContraFacturaFechaNac(String value) {
        return new JAXBElement<String>(_ActivarP2PFechaNac_QNAME, String.class, ActivarRecargaContraFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ActivarRecargaContraFactura.class)
    public JAXBElement<String> createActivarRecargaContraFacturaUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ActivarRecargaContraFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Canal", scope = ObtenerEstadoCuentaPrestame.class)
    public JAXBElement<String> createObtenerEstadoCuentaPrestameCanal(String value) {
        return new JAXBElement<String>(_AcreditarPrestameCanal_QNAME, String.class, ObtenerEstadoCuentaPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerEstadoCuentaPrestame.class)
    public JAXBElement<String> createObtenerEstadoCuentaPrestameAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerEstadoCuentaPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerEstadoCuentaPrestame.class)
    public JAXBElement<String> createObtenerEstadoCuentaPrestamePass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerEstadoCuentaPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerEstadoCuentaPrestame.class)
    public JAXBElement<String> createObtenerEstadoCuentaPrestameLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerEstadoCuentaPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Accion", scope = ObtenerEstadoCuentaPrestame.class)
    public JAXBElement<String> createObtenerEstadoCuentaPrestameAccion(String value) {
        return new JAXBElement<String>(_SuspenderLineasAccion_QNAME, String.class, ObtenerEstadoCuentaPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerEstadoCuentaPrestame.class)
    public JAXBElement<String> createObtenerEstadoCuentaPrestameUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerEstadoCuentaPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "PedirSaldoResult", scope = PedirSaldoResponse.class)
    public JAXBElement<String> createPedirSaldoResponsePedirSaldoResult(String value) {
        return new JAXBElement<String>(_PedirSaldoResponsePedirSaldoResult_QNAME, String.class, PedirSaldoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ResetearClave.class)
    public JAXBElement<String> createResetearClaveAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ResetearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ResetearClave.class)
    public JAXBElement<String> createResetearClavePass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ResetearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ResetearClave.class)
    public JAXBElement<String> createResetearClaveLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ResetearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "NuevaClave", scope = ResetearClave.class)
    public JAXBElement<String> createResetearClaveNuevaClave(String value) {
        return new JAXBElement<String>(_ResetearClaveNuevaClave_QNAME, String.class, ResetearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ResetearClave.class)
    public JAXBElement<String> createResetearClaveUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ResetearClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Canal", scope = ObtenerMontosPrestame.class)
    public JAXBElement<String> createObtenerMontosPrestameCanal(String value) {
        return new JAXBElement<String>(_AcreditarPrestameCanal_QNAME, String.class, ObtenerMontosPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerMontosPrestame.class)
    public JAXBElement<String> createObtenerMontosPrestameAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerMontosPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerMontosPrestame.class)
    public JAXBElement<String> createObtenerMontosPrestamePass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerMontosPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerMontosPrestame.class)
    public JAXBElement<String> createObtenerMontosPrestameLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerMontosPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerMontosPrestame.class)
    public JAXBElement<String> createObtenerMontosPrestameUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerMontosPrestame.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerMontosPrestameResult", scope = ObtenerMontosPrestameResponse.class)
    public JAXBElement<ArrayOfstring> createObtenerMontosPrestameResponseObtenerMontosPrestameResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ObtenerMontosPrestameResponseObtenerMontosPrestameResult_QNAME, ArrayOfstring.class, ObtenerMontosPrestameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = CancelarBackTone.class)
    public JAXBElement<String> createCancelarBackToneAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, CancelarBackTone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = CancelarBackTone.class)
    public JAXBElement<String> createCancelarBackTonePass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, CancelarBackTone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = CancelarBackTone.class)
    public JAXBElement<String> createCancelarBackToneLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, CancelarBackTone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = CancelarBackTone.class)
    public JAXBElement<String> createCancelarBackToneUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, CancelarBackTone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioAdicional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "VerificarServicioNombreResult", scope = VerificarServicioNombreResponse.class)
    public JAXBElement<ServicioAdicional> createVerificarServicioNombreResponseVerificarServicioNombreResult(ServicioAdicional value) {
        return new JAXBElement<ServicioAdicional>(_VerificarServicioNombreResponseVerificarServicioNombreResult_QNAME, ServicioAdicional.class, VerificarServicioNombreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerMontosRecFactResult", scope = ObtenerMontosRecFactResponse.class)
    public JAXBElement<ArrayOfstring> createObtenerMontosRecFactResponseObtenerMontosRecFactResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ObtenerMontosRecFactResponseObtenerMontosRecFactResult_QNAME, ArrayOfstring.class, ObtenerMontosRecFactResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerDatosResult", scope = ObtenerDatosResponse.class)
    public JAXBElement<Personas> createObtenerDatosResponseObtenerDatosResult(Personas value) {
        return new JAXBElement<Personas>(_ObtenerDatosResponseObtenerDatosResult_QNAME, Personas.class, ObtenerDatosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlanes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerPlanesResult", scope = ObtenerPlanesResponse.class)
    public JAXBElement<ArrayOfPlanes> createObtenerPlanesResponseObtenerPlanesResult(ArrayOfPlanes value) {
        return new JAXBElement<ArrayOfPlanes>(_ObtenerPlanesResponseObtenerPlanesResult_QNAME, ArrayOfPlanes.class, ObtenerPlanesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "FacturaElectronicaResult", scope = FacturaElectronicaResponse.class)
    public JAXBElement<String> createFacturaElectronicaResponseFacturaElectronicaResult(String value) {
        return new JAXBElement<String>(_FacturaElectronicaResponseFacturaElectronicaResult_QNAME, String.class, FacturaElectronicaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "PrestarSaldoResult", scope = PrestarSaldoResponse.class)
    public JAXBElement<String> createPrestarSaldoResponsePrestarSaldoResult(String value) {
        return new JAXBElement<String>(_PrestarSaldoResponsePrestarSaldoResult_QNAME, String.class, PrestarSaldoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ReacreditarIlimitadoResult", scope = ReacreditarIlimitadoResponse.class)
    public JAXBElement<String> createReacreditarIlimitadoResponseReacreditarIlimitadoResult(String value) {
        return new JAXBElement<String>(_ReacreditarIlimitadoResponseReacreditarIlimitadoResult_QNAME, String.class, ReacreditarIlimitadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "AcreditarMontosRecFactResult", scope = AcreditarMontosRecFactResponse.class)
    public JAXBElement<String> createAcreditarMontosRecFactResponseAcreditarMontosRecFactResult(String value) {
        return new JAXBElement<String>(_AcreditarMontosRecFactResponseAcreditarMontosRecFactResult_QNAME, String.class, AcreditarMontosRecFactResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ConsultaSaldoKmlResult", scope = ConsultaSaldoKmlResponse.class)
    public JAXBElement<String> createConsultaSaldoKmlResponseConsultaSaldoKmlResult(String value) {
        return new JAXBElement<String>(_ConsultaSaldoKmlResponseConsultaSaldoKmlResult_QNAME, String.class, ConsultaSaldoKmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = VerificaPin.class)
    public JAXBElement<String> createVerificaPinAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, VerificaPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = VerificaPin.class)
    public JAXBElement<String> createVerificaPinPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, VerificaPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = VerificaPin.class)
    public JAXBElement<String> createVerificaPinLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, VerificaPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = VerificaPin.class)
    public JAXBElement<String> createVerificaPinUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, VerificaPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ClubPuntoPorVenderResult", scope = ClubPuntoPorVenderResponse.class)
    public JAXBElement<String> createClubPuntoPorVenderResponseClubPuntoPorVenderResult(String value) {
        return new JAXBElement<String>(_ClubPuntoPorVenderResponseClubPuntoPorVenderResult_QNAME, String.class, ClubPuntoPorVenderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = NuevoRbt.class)
    public JAXBElement<String> createNuevoRbtAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, NuevoRbt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = NuevoRbt.class)
    public JAXBElement<String> createNuevoRbtPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, NuevoRbt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = NuevoRbt.class)
    public JAXBElement<String> createNuevoRbtLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, NuevoRbt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = NuevoRbt.class)
    public JAXBElement<String> createNuevoRbtUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, NuevoRbt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Aplicacion", scope = ObtenerUltimaFactura.class)
    public JAXBElement<String> createObtenerUltimaFacturaAplicacion(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasAplicacion_QNAME, String.class, ObtenerUltimaFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Pass", scope = ObtenerUltimaFactura.class)
    public JAXBElement<String> createObtenerUltimaFacturaPass(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasPass_QNAME, String.class, ObtenerUltimaFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "LineaOrigen", scope = ObtenerUltimaFactura.class)
    public JAXBElement<String> createObtenerUltimaFacturaLineaOrigen(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasLineaOrigen_QNAME, String.class, ObtenerUltimaFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "Usuario", scope = ObtenerUltimaFactura.class)
    public JAXBElement<String> createObtenerUltimaFacturaUsuario(String value) {
        return new JAXBElement<String>(_ActivarNuevasLineasUsuario_QNAME, String.class, ObtenerUltimaFactura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vas.personal.com.py", name = "ObtenerEstadoCuentaPrestameResult", scope = ObtenerEstadoCuentaPrestameResponse.class)
    public JAXBElement<String> createObtenerEstadoCuentaPrestameResponseObtenerEstadoCuentaPrestameResult(String value) {
        return new JAXBElement<String>(_ObtenerEstadoCuentaPrestameResponseObtenerEstadoCuentaPrestameResult_QNAME, String.class, ObtenerEstadoCuentaPrestameResponse.class, value);
    }

}
