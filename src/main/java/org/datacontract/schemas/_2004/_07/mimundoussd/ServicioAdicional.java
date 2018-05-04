
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
 * <p>Java class for ServicioAdicional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicioAdicional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaActivacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicioAdicional", namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", propOrder = {
    "codigoServicio",
    "descripcionServicio",
    "fechaActivacion"
})
public class ServicioAdicional {

    @XmlElementRef(name = "CodigoServicio", namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoServicio;
    @XmlElementRef(name = "DescripcionServicio", namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionServicio;
    @XmlElement(name = "FechaActivacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActivacion;

    /**
     * Gets the value of the codigoServicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Sets the value of the codigoServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoServicio(JAXBElement<String> value) {
        this.codigoServicio = value;
    }

    /**
     * Gets the value of the descripcionServicio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionServicio() {
        return descripcionServicio;
    }

    /**
     * Sets the value of the descripcionServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionServicio(JAXBElement<String> value) {
        this.descripcionServicio = value;
    }

    /**
     * Gets the value of the fechaActivacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActivacion() {
        return fechaActivacion;
    }

    /**
     * Sets the value of the fechaActivacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActivacion(XMLGregorianCalendar value) {
        this.fechaActivacion = value;
    }

}
