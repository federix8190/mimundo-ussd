
package py.com.personal.vas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mimundoussd.ServicioAdicional;


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
 *         &lt;element name="VerificarServicioNombreResult" type="{http://schemas.datacontract.org/2004/07/MiMundoUssd.Entidades}ServicioAdicional" minOccurs="0"/>
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
    "verificarServicioNombreResult"
})
@XmlRootElement(name = "VerificarServicioNombreResponse")
public class VerificarServicioNombreResponse {

    @XmlElementRef(name = "VerificarServicioNombreResult", namespace = "http://vas.personal.com.py", type = JAXBElement.class, required = false)
    protected JAXBElement<ServicioAdicional> verificarServicioNombreResult;

    /**
     * Gets the value of the verificarServicioNombreResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServicioAdicional }{@code >}
     *     
     */
    public JAXBElement<ServicioAdicional> getVerificarServicioNombreResult() {
        return verificarServicioNombreResult;
    }

    /**
     * Sets the value of the verificarServicioNombreResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServicioAdicional }{@code >}
     *     
     */
    public void setVerificarServicioNombreResult(JAXBElement<ServicioAdicional> value) {
        this.verificarServicioNombreResult = value;
    }

}
