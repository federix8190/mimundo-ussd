
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
 *         &lt;element name="ObtenerPremiosClubPersonalResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "obtenerPremiosClubPersonalResult"
})
@XmlRootElement(name = "ObtenerPremiosClubPersonalResponse")
public class ObtenerPremiosClubPersonalResponse {

    @XmlElementRef(name = "ObtenerPremiosClubPersonalResult", namespace = "http://vas.personal.com.py", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obtenerPremiosClubPersonalResult;

    /**
     * Gets the value of the obtenerPremiosClubPersonalResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObtenerPremiosClubPersonalResult() {
        return obtenerPremiosClubPersonalResult;
    }

    /**
     * Sets the value of the obtenerPremiosClubPersonalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObtenerPremiosClubPersonalResult(JAXBElement<String> value) {
        this.obtenerPremiosClubPersonalResult = value;
    }

}