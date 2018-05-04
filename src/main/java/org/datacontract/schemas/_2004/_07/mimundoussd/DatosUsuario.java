
package org.datacontract.schemas._2004._07.mimundoussd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bloqueadoField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intentosField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineaField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mailField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosUsuario", namespace = "http://schemas.datacontract.org/2004/07/MiMundoUssd.WsAuth", propOrder = {
    "apellidoField",
    "bloqueadoField",
    "intentosField",
    "lineaField",
    "mailField",
    "nombreField",
    "usuarioField"
})
@XmlSeeAlso({
    Usuarios.class
})
public class DatosUsuario {

    @XmlElement(required = true, nillable = true)
    protected String apellidoField;
    @XmlElement(required = true, nillable = true)
    protected String bloqueadoField;
    @XmlElement(required = true, nillable = true)
    protected String intentosField;
    @XmlElement(required = true, nillable = true)
    protected String lineaField;
    @XmlElement(required = true, nillable = true)
    protected String mailField;
    @XmlElement(required = true, nillable = true)
    protected String nombreField;
    @XmlElement(required = true, nillable = true)
    protected String usuarioField;

    /**
     * Gets the value of the apellidoField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoField() {
        return apellidoField;
    }

    /**
     * Sets the value of the apellidoField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoField(String value) {
        this.apellidoField = value;
    }

    /**
     * Gets the value of the bloqueadoField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloqueadoField() {
        return bloqueadoField;
    }

    /**
     * Sets the value of the bloqueadoField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloqueadoField(String value) {
        this.bloqueadoField = value;
    }

    /**
     * Gets the value of the intentosField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntentosField() {
        return intentosField;
    }

    /**
     * Sets the value of the intentosField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntentosField(String value) {
        this.intentosField = value;
    }

    /**
     * Gets the value of the lineaField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineaField() {
        return lineaField;
    }

    /**
     * Sets the value of the lineaField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineaField(String value) {
        this.lineaField = value;
    }

    /**
     * Gets the value of the mailField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailField() {
        return mailField;
    }

    /**
     * Sets the value of the mailField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailField(String value) {
        this.mailField = value;
    }

    /**
     * Gets the value of the nombreField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreField() {
        return nombreField;
    }

    /**
     * Sets the value of the nombreField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreField(String value) {
        this.nombreField = value;
    }

    /**
     * Gets the value of the usuarioField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioField() {
        return usuarioField;
    }

    /**
     * Sets the value of the usuarioField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioField(String value) {
        this.usuarioField = value;
    }

}
