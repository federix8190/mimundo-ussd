
package org.datacontract.schemas._2004._07.mimundoussd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.mimundoussd package. 
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

    private final static QName _Planes_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Planes");
    private final static QName _Personas_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Personas");
    private final static QName _Saldos_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Saldos");
    private final static QName _Usuarios_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Usuarios");
    private final static QName _ServicioAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", "ServicioAdicional");
    private final static QName _DatosUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd.WsAuth", "DatosUsuario");
    private final static QName _Facturas_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Facturas");
    private final static QName _ArrayOfPlanes_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "ArrayOfPlanes");
    private final static QName _PersonasDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Documento");
    private final static QName _PersonasFechaNac_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "FechaNac");
    private final static QName _PersonasDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Direccion");
    private final static QName _PersonasApellidoPersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "ApellidoPersona");
    private final static QName _PersonasNombrePersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "NombrePersona");
    private final static QName _PersonasCodigoPersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "CodigoPersona");
    private final static QName _PersonasSexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Sexo");
    private final static QName _UsuariosEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Estado");
    private final static QName _SaldosNumeroLinea_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "NumeroLinea");
    private final static QName _FacturasPeriodo_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Periodo");
    private final static QName _FacturasBarrio_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Barrio");
    private final static QName _FacturasGrupoFacturacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "GrupoFacturacion");
    private final static QName _FacturasCodigoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "CodigoDocumento");
    private final static QName _FacturasDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Departamento");
    private final static QName _FacturasTimbrado_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Timbrado");
    private final static QName _FacturasCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Ciudad");
    private final static QName _FacturasCodigoGrupoFact_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "CodigoGrupoFact");
    private final static QName _FacturasFechaImva_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "FechaImva");
    private final static QName _FacturasNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Nombre");
    private final static QName _FacturasApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd", "Apellido");
    private final static QName _ServicioAdicionalDescripcionServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", "DescripcionServicio");
    private final static QName _ServicioAdicionalCodigoServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", "CodigoServicio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.mimundoussd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Facturas }
     * 
     */
    public Facturas createFacturas() {
        return new Facturas();
    }

    /**
     * Create an instance of {@link Usuarios }
     * 
     */
    public Usuarios createUsuarios() {
        return new Usuarios();
    }

    /**
     * Create an instance of {@link ArrayOfPlanes }
     * 
     */
    public ArrayOfPlanes createArrayOfPlanes() {
        return new ArrayOfPlanes();
    }

    /**
     * Create an instance of {@link Saldos }
     * 
     */
    public Saldos createSaldos() {
        return new Saldos();
    }

    /**
     * Create an instance of {@link ServicioAdicional }
     * 
     */
    public ServicioAdicional createServicioAdicional() {
        return new ServicioAdicional();
    }

    /**
     * Create an instance of {@link Personas }
     * 
     */
    public Personas createPersonas() {
        return new Personas();
    }

    /**
     * Create an instance of {@link Planes }
     * 
     */
    public Planes createPlanes() {
        return new Planes();
    }

    /**
     * Create an instance of {@link DatosUsuario }
     * 
     */
    public DatosUsuario createDatosUsuario() {
        return new DatosUsuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Planes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Planes")
    public JAXBElement<Planes> createPlanes(Planes value) {
        return new JAXBElement<Planes>(_Planes_QNAME, Planes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Personas")
    public JAXBElement<Personas> createPersonas(Personas value) {
        return new JAXBElement<Personas>(_Personas_QNAME, Personas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saldos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Saldos")
    public JAXBElement<Saldos> createSaldos(Saldos value) {
        return new JAXBElement<Saldos>(_Saldos_QNAME, Saldos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Usuarios")
    public JAXBElement<Usuarios> createUsuarios(Usuarios value) {
        return new JAXBElement<Usuarios>(_Usuarios_QNAME, Usuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioAdicional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", name = "ServicioAdicional")
    public JAXBElement<ServicioAdicional> createServicioAdicional(ServicioAdicional value) {
        return new JAXBElement<ServicioAdicional>(_ServicioAdicional_QNAME, ServicioAdicional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd.WsAuth", name = "DatosUsuario")
    public JAXBElement<DatosUsuario> createDatosUsuario(DatosUsuario value) {
        return new JAXBElement<DatosUsuario>(_DatosUsuario_QNAME, DatosUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facturas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Facturas")
    public JAXBElement<Facturas> createFacturas(Facturas value) {
        return new JAXBElement<Facturas>(_Facturas_QNAME, Facturas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlanes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "ArrayOfPlanes")
    public JAXBElement<ArrayOfPlanes> createArrayOfPlanes(ArrayOfPlanes value) {
        return new JAXBElement<ArrayOfPlanes>(_ArrayOfPlanes_QNAME, ArrayOfPlanes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Documento", scope = Personas.class)
    public JAXBElement<String> createPersonasDocumento(String value) {
        return new JAXBElement<String>(_PersonasDocumento_QNAME, String.class, Personas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "FechaNac", scope = Personas.class)
    public JAXBElement<String> createPersonasFechaNac(String value) {
        return new JAXBElement<String>(_PersonasFechaNac_QNAME, String.class, Personas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Direccion", scope = Personas.class)
    public JAXBElement<String> createPersonasDireccion(String value) {
        return new JAXBElement<String>(_PersonasDireccion_QNAME, String.class, Personas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "ApellidoPersona", scope = Personas.class)
    public JAXBElement<String> createPersonasApellidoPersona(String value) {
        return new JAXBElement<String>(_PersonasApellidoPersona_QNAME, String.class, Personas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "NombrePersona", scope = Personas.class)
    public JAXBElement<String> createPersonasNombrePersona(String value) {
        return new JAXBElement<String>(_PersonasNombrePersona_QNAME, String.class, Personas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "CodigoPersona", scope = Personas.class)
    public JAXBElement<String> createPersonasCodigoPersona(String value) {
        return new JAXBElement<String>(_PersonasCodigoPersona_QNAME, String.class, Personas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Sexo", scope = Personas.class)
    public JAXBElement<String> createPersonasSexo(String value) {
        return new JAXBElement<String>(_PersonasSexo_QNAME, String.class, Personas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Estado", scope = Usuarios.class)
    public JAXBElement<String> createUsuariosEstado(String value) {
        return new JAXBElement<String>(_UsuariosEstado_QNAME, String.class, Usuarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "NumeroLinea", scope = Saldos.class)
    public JAXBElement<String> createSaldosNumeroLinea(String value) {
        return new JAXBElement<String>(_SaldosNumeroLinea_QNAME, String.class, Saldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Periodo", scope = Facturas.class)
    public JAXBElement<String> createFacturasPeriodo(String value) {
        return new JAXBElement<String>(_FacturasPeriodo_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Barrio", scope = Facturas.class)
    public JAXBElement<String> createFacturasBarrio(String value) {
        return new JAXBElement<String>(_FacturasBarrio_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Direccion", scope = Facturas.class)
    public JAXBElement<String> createFacturasDireccion(String value) {
        return new JAXBElement<String>(_PersonasDireccion_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "GrupoFacturacion", scope = Facturas.class)
    public JAXBElement<String> createFacturasGrupoFacturacion(String value) {
        return new JAXBElement<String>(_FacturasGrupoFacturacion_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "CodigoDocumento", scope = Facturas.class)
    public JAXBElement<String> createFacturasCodigoDocumento(String value) {
        return new JAXBElement<String>(_FacturasCodigoDocumento_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Departamento", scope = Facturas.class)
    public JAXBElement<String> createFacturasDepartamento(String value) {
        return new JAXBElement<String>(_FacturasDepartamento_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Timbrado", scope = Facturas.class)
    public JAXBElement<String> createFacturasTimbrado(String value) {
        return new JAXBElement<String>(_FacturasTimbrado_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Ciudad", scope = Facturas.class)
    public JAXBElement<String> createFacturasCiudad(String value) {
        return new JAXBElement<String>(_FacturasCiudad_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "CodigoGrupoFact", scope = Facturas.class)
    public JAXBElement<String> createFacturasCodigoGrupoFact(String value) {
        return new JAXBElement<String>(_FacturasCodigoGrupoFact_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Estado", scope = Facturas.class)
    public JAXBElement<String> createFacturasEstado(String value) {
        return new JAXBElement<String>(_UsuariosEstado_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "FechaImva", scope = Facturas.class)
    public JAXBElement<String> createFacturasFechaImva(String value) {
        return new JAXBElement<String>(_FacturasFechaImva_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Nombre", scope = Facturas.class)
    public JAXBElement<String> createFacturasNombre(String value) {
        return new JAXBElement<String>(_FacturasNombre_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", name = "Apellido", scope = Facturas.class)
    public JAXBElement<String> createFacturasApellido(String value) {
        return new JAXBElement<String>(_FacturasApellido_QNAME, String.class, Facturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", name = "DescripcionServicio", scope = ServicioAdicional.class)
    public JAXBElement<String> createServicioAdicionalDescripcionServicio(String value) {
        return new JAXBElement<String>(_ServicioAdicionalDescripcionServicio_QNAME, String.class, ServicioAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", name = "CodigoServicio", scope = ServicioAdicional.class)
    public JAXBElement<String> createServicioAdicionalCodigoServicio(String value) {
        return new JAXBElement<String>(_ServicioAdicionalCodigoServicio_QNAME, String.class, ServicioAdicional.class, value);
    }

}
