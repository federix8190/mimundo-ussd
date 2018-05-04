
package org.datacontract.schemas._2004._07.mimundoussd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPlanes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPlanes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Planes" type="{http://schemas.datacontract.org/2004/07/MiMundoUssd}Planes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPlanes", propOrder = {
    "planes"
})
public class ArrayOfPlanes {

    @XmlElement(name = "Planes", nillable = true)
    protected List<Planes> planes;

    /**
     * Gets the value of the planes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Planes }
     * 
     * 
     */
    public List<Planes> getPlanes() {
        if (planes == null) {
            planes = new ArrayList<Planes>();
        }
        return this.planes;
    }

}
