
package py.com.personal.vas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ObtenerCantidadPrestamosResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "obtenerCantidadPrestamosResult"
})
@XmlRootElement(name = "ObtenerCantidadPrestamosResponse")
public class ObtenerCantidadPrestamosResponse {

    @XmlElement(name = "ObtenerCantidadPrestamosResult")
    protected Integer obtenerCantidadPrestamosResult;

    /**
     * Gets the value of the obtenerCantidadPrestamosResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObtenerCantidadPrestamosResult() {
        return obtenerCantidadPrestamosResult;
    }

    /**
     * Sets the value of the obtenerCantidadPrestamosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObtenerCantidadPrestamosResult(Integer value) {
        this.obtenerCantidadPrestamosResult = value;
    }

}
