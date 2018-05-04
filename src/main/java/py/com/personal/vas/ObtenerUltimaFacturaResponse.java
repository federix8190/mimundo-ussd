
package py.com.personal.vas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mimundoussd.Facturas;


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
 *         &lt;element name="ObtenerUltimaFacturaResult" type="{http://schemas.datacontract.org/2004/07/MiMundoUssd}Facturas" minOccurs="0"/>
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
    "obtenerUltimaFacturaResult"
})
@XmlRootElement(name = "ObtenerUltimaFacturaResponse")
public class ObtenerUltimaFacturaResponse {

    @XmlElementRef(name = "ObtenerUltimaFacturaResult", namespace = "http://vas.personal.com.py", type = JAXBElement.class, required = false)
    protected JAXBElement<Facturas> obtenerUltimaFacturaResult;

    /**
     * Gets the value of the obtenerUltimaFacturaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Facturas }{@code >}
     *     
     */
    public JAXBElement<Facturas> getObtenerUltimaFacturaResult() {
        return obtenerUltimaFacturaResult;
    }

    /**
     * Sets the value of the obtenerUltimaFacturaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Facturas }{@code >}
     *     
     */
    public void setObtenerUltimaFacturaResult(JAXBElement<Facturas> value) {
        this.obtenerUltimaFacturaResult = value;
    }

}
