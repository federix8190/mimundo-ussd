
package py.com.personal.vas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mimundoussd.Personas;


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
 *         &lt;element name="ObtenerDatosResult" type="{http://schemas.datacontract.org/2004/07/MiMundoUssd}Personas" minOccurs="0"/>
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
    "obtenerDatosResult"
})
@XmlRootElement(name = "ObtenerDatosResponse")
public class ObtenerDatosResponse {

    @XmlElementRef(name = "ObtenerDatosResult", namespace = "http://vas.personal.com.py", type = JAXBElement.class, required = false)
    protected JAXBElement<Personas> obtenerDatosResult;

    /**
     * Gets the value of the obtenerDatosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Personas }{@code >}
     *     
     */
    public JAXBElement<Personas> getObtenerDatosResult() {
        return obtenerDatosResult;
    }

    /**
     * Sets the value of the obtenerDatosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Personas }{@code >}
     *     
     */
    public void setObtenerDatosResult(JAXBElement<Personas> value) {
        this.obtenerDatosResult = value;
    }

}
