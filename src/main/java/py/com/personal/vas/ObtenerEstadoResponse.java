
package py.com.personal.vas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mimundoussd.Usuarios;


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
 *         &lt;element name="ObtenerEstadoResult" type="{http://schemas.datacontract.org/2004/07/MiMundoUssd}Usuarios" minOccurs="0"/>
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
    "obtenerEstadoResult"
})
@XmlRootElement(name = "ObtenerEstadoResponse")
public class ObtenerEstadoResponse {

    @XmlElementRef(name = "ObtenerEstadoResult", namespace = "http://vas.personal.com.py", type = JAXBElement.class, required = false)
    protected JAXBElement<Usuarios> obtenerEstadoResult;

    /**
     * Gets the value of the obtenerEstadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Usuarios }{@code >}
     *     
     */
    public JAXBElement<Usuarios> getObtenerEstadoResult() {
        return obtenerEstadoResult;
    }

    /**
     * Sets the value of the obtenerEstadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Usuarios }{@code >}
     *     
     */
    public void setObtenerEstadoResult(JAXBElement<Usuarios> value) {
        this.obtenerEstadoResult = value;
    }

}
