
package by.epam.training.task04.entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Plane complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Plane">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://www.epam.by/Hangar}Origin"/>
 *         &lt;element name="chars" type="{http://www.epam.by/Hangar}Chars"/>
 *         &lt;element name="parameters" type="{http://www.epam.by/Hangar}Parameters"/>
 *         &lt;element name="price" type="{http://www.epam.by/Hangar}Price"/>
 *       &lt;/sequence>
 *       &lt;attribute name="model" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plane", namespace = "http://www.epam.by/Hangar", propOrder = {
    "origin",
    "chars",
    "parameters",
    "price"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Plane {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String origin;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Chars chars;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Parameters parameters;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Price price;
    @XmlAttribute(name = "model", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String model;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the chars property.
     * 
     * @return
     *     possible object is
     *     {@link Chars }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Chars getChars() {
        return chars;
    }

    /**
     * Sets the value of the chars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chars }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setChars(Chars value) {
        this.chars = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setModel(String value) {
        this.model = value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plane{");
        sb.append("origin='").append(origin).append('\'');
        sb.append(", chars=").append(chars);
        sb.append(", parameters=").append(parameters);
        sb.append(", price=").append(price);
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
