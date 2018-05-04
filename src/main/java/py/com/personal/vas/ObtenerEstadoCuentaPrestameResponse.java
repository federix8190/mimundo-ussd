
package py.com.personal.vas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObtenerEstadoCuentaPrestameResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obtenerEstadoCuentaPrestameResult"
})
@XmlRootElement(name = "ObtenerEstadoCuentaPrestameResponse")
public class ObtenerEstadoCuentaPrestameResponse {

    @XmlElementRef(name = "ObtenerEstadoCuentaPrestameResult", namespace = "http://vas.personal.com.py", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obtenerEstadoCuentaPrestameResult;

    /**
     * Gets the value of the obtenerEstadoCuentaPrestameResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObtenerEstadoCuentaPrestameResult() {
        return obtenerEstadoCuentaPrestameResult;
    }

    /**
     * Sets the value of the obtenerEstadoCuentaPrestameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObtenerEstadoCuentaPrestameResult(JAXBElement<String> value) {
        this.obtenerEstadoCuentaPrestameResult = value;
    }

}
