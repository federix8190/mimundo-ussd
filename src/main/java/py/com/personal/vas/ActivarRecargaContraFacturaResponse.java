
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
 *         &lt;element name="ActivarRecargaContraFacturaResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "activarRecargaContraFacturaResult"
})
@XmlRootElement(name = "ActivarRecargaContraFacturaResponse")
public class ActivarRecargaContraFacturaResponse {

    @XmlElementRef(name = "ActivarRecargaContraFacturaResult", namespace = "http://vas.personal.com.py", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activarRecargaContraFacturaResult;

    /**
     * Gets the value of the activarRecargaContraFacturaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivarRecargaContraFacturaResult() {
        return activarRecargaContraFacturaResult;
    }

    /**
     * Sets the value of the activarRecargaContraFacturaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivarRecargaContraFacturaResult(JAXBElement<String> value) {
        this.activarRecargaContraFacturaResult = value;
    }

}
