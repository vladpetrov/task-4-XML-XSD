
package by.epam.training.task04.entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chars complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chars">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.epam.by/Hangar}Type"/>
 *         &lt;element name="seats">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="radar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ammunition" type="{http://www.epam.by/Hangar}Ammunition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chars", namespace = "http://www.epam.by/Hangar", propOrder = {
    "type",
    "seats",
    "radar",
    "ammunition"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Chars {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Type type;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int seats;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean radar;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Ammunition ammunition;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSeats(int value) {
        this.seats = value;
    }

    /**
     * Gets the value of the radar property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isRadar() {
        return radar;
    }

    /**
     * Sets the value of the radar property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRadar(boolean value) {
        this.radar = value;
    }

    /**
     * Gets the value of the ammunition property.
     * 
     * @return
     *     possible object is
     *     {@link Ammunition }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Ammunition getAmmunition() {
        return ammunition;
    }

    /**
     * Sets the value of the ammunition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ammunition }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAmmunition(Ammunition value) {
        this.ammunition = value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Chars{");
        sb.append("type=").append(type);
        sb.append(", seats=").append(seats);
        sb.append(", radar=").append(radar);
        sb.append(", ammunition=").append(ammunition);
        sb.append('}');
        return sb.toString();
    }
}
