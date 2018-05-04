
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
 *         &lt;element name="ActivarNuevasLineasResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "activarNuevasLineasResult"
})
@XmlRootElement(name = "ActivarNuevasLineasResponse")
public class ActivarNuevasLineasResponse {

    @XmlElement(name = "ActivarNuevasLineasResult")
    protected Boolean activarNuevasLineasResult;

    /**
     * Gets the value of the activarNuevasLineasResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivarNuevasLineasResult() {
        return activarNuevasLineasResult;
    }

    /**
     * Sets the value of the activarNuevasLineasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivarNuevasLineasResult(Boolean value) {
        this.activarNuevasLineasResult = value;
    }

}
