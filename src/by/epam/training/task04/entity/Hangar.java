
package by.epam.training.task04.entity;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
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
 *         &lt;element name="plane" type="{http://www.epam.by/Hangar}Plane" maxOccurs="unbounded"/>
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
    "plane"
})
@XmlRootElement(name = "hangar", namespace = "http://www.epam.by/Hangar")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Hangar {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Plane> plane;

    /**
     * Gets the value of the plane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Plane }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Plane> getPlane() {
        if (plane == null) {
            plane = new ArrayList<Plane>();
        }
        return this.plane;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hangar{");
        sb.append("plane=").append(plane);
        sb.append('}');
        return sb.toString();
    }
}
