
package org.datacontract.schemas._2004._07.mimundoussd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Saldos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Saldos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaActualizacionSaldo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaActualizacionSaldoDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaActualizacionSaldoMaxicarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaActualizacionSaldoMaxicargaExtra" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaActualizacionSaldoMensajes" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaActualizacionSaldoMinutos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoSaldoDatosNormal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoSaldoDatosPromocional" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoSaldoMaxicarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoSaldoMaxicargaExtra" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoSaldoMensajesNormal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoSaldoMensajesPromocional" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoSaldoMinutosPromocional" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoSaldoNormal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LimiteConsumo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaldoAcumulado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoDatos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoDatosAcumulado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoDatosPromocional" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoExtraMaxicarga" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoMaxicarga" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoMensajesAcumulado" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaldoMensajesPlan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaldoMensajesPromocionales" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SaldoMinutosAcumulado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoMinutosPlan" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoMinutosPromocionales" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoPlan" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SaldoVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalSaldoDatos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalSaldoMensajes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalSaldoMinutosDisponible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalSaldoMoneda" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Saldos", propOrder = {
    "fechaActualizacionSaldo",
    "fechaActualizacionSaldoDatos",
    "fechaActualizacionSaldoMaxicarga",
    "fechaActualizacionSaldoMaxicargaExtra",
    "fechaActualizacionSaldoMensajes",
    "fechaActualizacionSaldoMinutos",
    "fechaVencimientoSaldoDatosNormal",
    "fechaVencimientoSaldoDatosPromocional",
    "fechaVencimientoSaldoMaxicarga",
    "fechaVencimientoSaldoMaxicargaExtra",
    "fechaVencimientoSaldoMensajesNormal",
    "fechaVencimientoSaldoMensajesPromocional",
    "fechaVencimientoSaldoMinutosPromocional",
    "fechaVencimientoSaldoNormal",
    "limiteConsumo",
    "numeroLinea",
    "saldoAcumulado",
    "saldoDatos",
    "saldoDatosAcumulado",
    "saldoDatosPromocional",
    "saldoExtraMaxicarga",
    "saldoMaxicarga",
    "saldoMensajesAcumulado",
    "saldoMensajesPlan",
    "saldoMensajesPromocionales",
    "saldoMinutosAcumulado",
    "saldoMinutosPlan",
    "saldoMinutosPromocionales",
    "saldoPlan",
    "saldoVencimiento",
    "totalSaldoDatos",
    "totalSaldoMensajes",
    "totalSaldoMinutosDisponible",
    "totalSaldoMoneda"
})
public class Saldos {

    @XmlElement(name = "FechaActualizacionSaldo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacionSaldo;
    @XmlElement(name = "FechaActualizacionSaldoDatos")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacionSaldoDatos;
    @XmlElement(name = "FechaActualizacionSaldoMaxicarga")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacionSaldoMaxicarga;
    @XmlElement(name = "FechaActualizacionSaldoMaxicargaExtra")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacionSaldoMaxicargaExtra;
    @XmlElement(name = "FechaActualizacionSaldoMensajes")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacionSaldoMensajes;
    @XmlElement(name = "FechaActualizacionSaldoMinutos")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacionSaldoMinutos;
    @XmlElement(name = "FechaVencimientoSaldoDatosNormal")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoSaldoDatosNormal;
    @XmlElement(name = "FechaVencimientoSaldoDatosPromocional")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoSaldoDatosPromocional;
    @XmlElement(name = "FechaVencimientoSaldoMaxicarga")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoSaldoMaxicarga;
    @XmlElement(name = "FechaVencimientoSaldoMaxicargaExtra")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoSaldoMaxicargaExtra;
    @XmlElement(name = "FechaVencimientoSaldoMensajesNormal")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoSaldoMensajesNormal;
    @XmlElement(name = "FechaVencimientoSaldoMensajesPromocional")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoSaldoMensajesPromocional;
    @XmlElement(name = "FechaVencimientoSaldoMinutosPromocional")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoSaldoMinutosPromocional;
    @XmlElement(name = "FechaVencimientoSaldoNormal")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoSaldoNormal;
    @XmlElement(name = "LimiteConsumo")
    protected Double limiteConsumo;
    @XmlElementRef(name = "NumeroLinea", namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroLinea;
    @XmlElement(name = "SaldoAcumulado")
    protected Double saldoAcumulado;
    @XmlElement(name = "SaldoDatos")
    protected Double saldoDatos;
    @XmlElement(name = "SaldoDatosAcumulado")
    protected Double saldoDatosAcumulado;
    @XmlElement(name = "SaldoDatosPromocional")
    protected Double saldoDatosPromocional;
    @XmlElement(name = "SaldoExtraMaxicarga")
    protected Double saldoExtraMaxicarga;
    @XmlElement(name = "SaldoMaxicarga")
    protected Double saldoMaxicarga;
    @XmlElement(name = "SaldoMensajesAcumulado")
    protected Long saldoMensajesAcumulado;
    @XmlElement(name = "SaldoMensajesPlan")
    protected Long saldoMensajesPlan;
    @XmlElement(name = "SaldoMensajesPromocionales")
    protected Long saldoMensajesPromocionales;
    @XmlElement(name = "SaldoMinutosAcumulado")
    protected Double saldoMinutosAcumulado;
    @XmlElement(name = "SaldoMinutosPlan")
    protected Double saldoMinutosPlan;
    @XmlElement(name = "SaldoMinutosPromocionales")
    protected Double saldoMinutosPromocionales;
    @XmlElement(name = "SaldoPlan")
    protected Double saldoPlan;
    @XmlElement(name = "SaldoVencimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saldoVencimiento;
    @XmlElement(name = "TotalSaldoDatos")
    protected Double totalSaldoDatos;
    @XmlElement(name = "TotalSaldoMensajes")
    protected Double totalSaldoMensajes;
    @XmlElement(name = "TotalSaldoMinutosDisponible")
    protected Double totalSaldoMinutosDisponible;
    @XmlElement(name = "TotalSaldoMoneda")
    protected Double totalSaldoMoneda;

    /**
     * Gets the value of the fechaActualizacionSaldo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacionSaldo() {
        return fechaActualizacionSaldo;
    }

    /**
     * Sets the value of the fechaActualizacionSaldo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacionSaldo(XMLGregorianCalendar value) {
        this.fechaActualizacionSaldo = value;
    }

    /**
     * Gets the value of the fechaActualizacionSaldoDatos property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacionSaldoDatos() {
        return fechaActualizacionSaldoDatos;
    }

    /**
     * Sets the value of the fechaActualizacionSaldoDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacionSaldoDatos(XMLGregorianCalendar value) {
        this.fechaActualizacionSaldoDatos = value;
    }

    /**
     * Gets the value of the fechaActualizacionSaldoMaxicarga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacionSaldoMaxicarga() {
        return fechaActualizacionSaldoMaxicarga;
    }

    /**
     * Sets the value of the fechaActualizacionSaldoMaxicarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacionSaldoMaxicarga(XMLGregorianCalendar value) {
        this.fechaActualizacionSaldoMaxicarga = value;
    }

    /**
     * Gets the value of the fechaActualizacionSaldoMaxicargaExtra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacionSaldoMaxicargaExtra() {
        return fechaActualizacionSaldoMaxicargaExtra;
    }

    /**
     * Sets the value of the fechaActualizacionSaldoMaxicargaExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacionSaldoMaxicargaExtra(XMLGregorianCalendar value) {
        this.fechaActualizacionSaldoMaxicargaExtra = value;
    }

    /**
     * Gets the value of the fechaActualizacionSaldoMensajes property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacionSaldoMensajes() {
        return fechaActualizacionSaldoMensajes;
    }

    /**
     * Sets the value of the fechaActualizacionSaldoMensajes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacionSaldoMensajes(XMLGregorianCalendar value) {
        this.fechaActualizacionSaldoMensajes = value;
    }

    /**
     * Gets the value of the fechaActualizacionSaldoMinutos property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacionSaldoMinutos() {
        return fechaActualizacionSaldoMinutos;
    }

    /**
     * Sets the value of the fechaActualizacionSaldoMinutos property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacionSaldoMinutos(XMLGregorianCalendar value) {
        this.fechaActualizacionSaldoMinutos = value;
    }

    /**
     * Gets the value of the fechaVencimientoSaldoDatosNormal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoSaldoDatosNormal() {
        return fechaVencimientoSaldoDatosNormal;
    }

    /**
     * Sets the value of the fechaVencimientoSaldoDatosNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoSaldoDatosNormal(XMLGregorianCalendar value) {
        this.fechaVencimientoSaldoDatosNormal = value;
    }

    /**
     * Gets the value of the fechaVencimientoSaldoDatosPromocional property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoSaldoDatosPromocional() {
        return fechaVencimientoSaldoDatosPromocional;
    }

    /**
     * Sets the value of the fechaVencimientoSaldoDatosPromocional property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoSaldoDatosPromocional(XMLGregorianCalendar value) {
        this.fechaVencimientoSaldoDatosPromocional = value;
    }

    /**
     * Gets the value of the fechaVencimientoSaldoMaxicarga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoSaldoMaxicarga() {
        return fechaVencimientoSaldoMaxicarga;
    }

    /**
     * Sets the value of the fechaVencimientoSaldoMaxicarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoSaldoMaxicarga(XMLGregorianCalendar value) {
        this.fechaVencimientoSaldoMaxicarga = value;
    }

    /**
     * Gets the value of the fechaVencimientoSaldoMaxicargaExtra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoSaldoMaxicargaExtra() {
        return fechaVencimientoSaldoMaxicargaExtra;
    }

    /**
     * Sets the value of the fechaVencimientoSaldoMaxicargaExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoSaldoMaxicargaExtra(XMLGregorianCalendar value) {
        this.fechaVencimientoSaldoMaxicargaExtra = value;
    }

    /**
     * Gets the value of the fechaVencimientoSaldoMensajesNormal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoSaldoMensajesNormal() {
        return fechaVencimientoSaldoMensajesNormal;
    }

    /**
     * Sets the value of the fechaVencimientoSaldoMensajesNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoSaldoMensajesNormal(XMLGregorianCalendar value) {
        this.fechaVencimientoSaldoMensajesNormal = value;
    }

    /**
     * Gets the value of the fechaVencimientoSaldoMensajesPromocional property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoSaldoMensajesPromocional() {
        return fechaVencimientoSaldoMensajesPromocional;
    }

    /**
     * Sets the value of the fechaVencimientoSaldoMensajesPromocional property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoSaldoMensajesPromocional(XMLGregorianCalendar value) {
        this.fechaVencimientoSaldoMensajesPromocional = value;
    }

    /**
     * Gets the value of the fechaVencimientoSaldoMinutosPromocional property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoSaldoMinutosPromocional() {
        return fechaVencimientoSaldoMinutosPromocional;
    }

    /**
     * Sets the value of the fechaVencimientoSaldoMinutosPromocional property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoSaldoMinutosPromocional(XMLGregorianCalendar value) {
        this.fechaVencimientoSaldoMinutosPromocional = value;
    }

    /**
     * Gets the value of the fechaVencimientoSaldoNormal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoSaldoNormal() {
        return fechaVencimientoSaldoNormal;
    }

    /**
     * Sets the value of the fechaVencimientoSaldoNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoSaldoNormal(XMLGregorianCalendar value) {
        this.fechaVencimientoSaldoNormal = value;
    }

    /**
     * Gets the value of the limiteConsumo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLimiteConsumo() {
        return limiteConsumo;
    }

    /**
     * Sets the value of the limiteConsumo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLimiteConsumo(Double value) {
        this.limiteConsumo = value;
    }

    /**
     * Gets the value of the numeroLinea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * Sets the value of the numeroLinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroLinea(JAXBElement<String> value) {
        this.numeroLinea = value;
    }

    /**
     * Gets the value of the saldoAcumulado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    /**
     * Sets the value of the saldoAcumulado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoAcumulado(Double value) {
        this.saldoAcumulado = value;
    }

    /**
     * Gets the value of the saldoDatos property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoDatos() {
        return saldoDatos;
    }

    /**
     * Sets the value of the saldoDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoDatos(Double value) {
        this.saldoDatos = value;
    }

    /**
     * Gets the value of the saldoDatosAcumulado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoDatosAcumulado() {
        return saldoDatosAcumulado;
    }

    /**
     * Sets the value of the saldoDatosAcumulado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoDatosAcumulado(Double value) {
        this.saldoDatosAcumulado = value;
    }

    /**
     * Gets the value of the saldoDatosPromocional property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoDatosPromocional() {
        return saldoDatosPromocional;
    }

    /**
     * Sets the value of the saldoDatosPromocional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoDatosPromocional(Double value) {
        this.saldoDatosPromocional = value;
    }

    /**
     * Gets the value of the saldoExtraMaxicarga property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoExtraMaxicarga() {
        return saldoExtraMaxicarga;
    }

    /**
     * Sets the value of the saldoExtraMaxicarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoExtraMaxicarga(Double value) {
        this.saldoExtraMaxicarga = value;
    }

    /**
     * Gets the value of the saldoMaxicarga property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoMaxicarga() {
        return saldoMaxicarga;
    }

    /**
     * Sets the value of the saldoMaxicarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoMaxicarga(Double value) {
        this.saldoMaxicarga = value;
    }

    /**
     * Gets the value of the saldoMensajesAcumulado property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaldoMensajesAcumulado() {
        return saldoMensajesAcumulado;
    }

    /**
     * Sets the value of the saldoMensajesAcumulado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaldoMensajesAcumulado(Long value) {
        this.saldoMensajesAcumulado = value;
    }

    /**
     * Gets the value of the saldoMensajesPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaldoMensajesPlan() {
        return saldoMensajesPlan;
    }

    /**
     * Sets the value of the saldoMensajesPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaldoMensajesPlan(Long value) {
        this.saldoMensajesPlan = value;
    }

    /**
     * Gets the value of the saldoMensajesPromocionales property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaldoMensajesPromocionales() {
        return saldoMensajesPromocionales;
    }

    /**
     * Sets the value of the saldoMensajesPromocionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaldoMensajesPromocionales(Long value) {
        this.saldoMensajesPromocionales = value;
    }

    /**
     * Gets the value of the saldoMinutosAcumulado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoMinutosAcumulado() {
        return saldoMinutosAcumulado;
    }

    /**
     * Sets the value of the saldoMinutosAcumulado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoMinutosAcumulado(Double value) {
        this.saldoMinutosAcumulado = value;
    }

    /**
     * Gets the value of the saldoMinutosPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoMinutosPlan() {
        return saldoMinutosPlan;
    }

    /**
     * Sets the value of the saldoMinutosPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoMinutosPlan(Double value) {
        this.saldoMinutosPlan = value;
    }

    /**
     * Gets the value of the saldoMinutosPromocionales property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoMinutosPromocionales() {
        return saldoMinutosPromocionales;
    }

    /**
     * Sets the value of the saldoMinutosPromocionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoMinutosPromocionales(Double value) {
        this.saldoMinutosPromocionales = value;
    }

    /**
     * Gets the value of the saldoPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoPlan() {
        return saldoPlan;
    }

    /**
     * Sets the value of the saldoPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoPlan(Double value) {
        this.saldoPlan = value;
    }

    /**
     * Gets the value of the saldoVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaldoVencimiento() {
        return saldoVencimiento;
    }

    /**
     * Sets the value of the saldoVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaldoVencimiento(XMLGregorianCalendar value) {
        this.saldoVencimiento = value;
    }

    /**
     * Gets the value of the totalSaldoDatos property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSaldoDatos() {
        return totalSaldoDatos;
    }

    /**
     * Sets the value of the totalSaldoDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSaldoDatos(Double value) {
        this.totalSaldoDatos = value;
    }

    /**
     * Gets the value of the totalSaldoMensajes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSaldoMensajes() {
        return totalSaldoMensajes;
    }

    /**
     * Sets the value of the totalSaldoMensajes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSaldoMensajes(Double value) {
        this.totalSaldoMensajes = value;
    }

    /**
     * Gets the value of the totalSaldoMinutosDisponible property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSaldoMinutosDisponible() {
        return totalSaldoMinutosDisponible;
    }

    /**
     * Sets the value of the totalSaldoMinutosDisponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSaldoMinutosDisponible(Double value) {
        this.totalSaldoMinutosDisponible = value;
    }

    /**
     * Gets the value of the totalSaldoMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSaldoMoneda() {
        return totalSaldoMoneda;
    }

    /**
     * Sets the value of the totalSaldoMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSaldoMoneda(Double value) {
        this.totalSaldoMoneda = value;
    }

}
