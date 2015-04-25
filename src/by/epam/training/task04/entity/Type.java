
package by.epam.training.task04.entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fighter"/>
 *     &lt;enumeration value="bomber"/>
 *     &lt;enumeration value="UAV"/>
 *     &lt;enumeration value="transporter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Type", namespace = "http://www.epam.by/Hangar")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum Type {

    @XmlEnumValue("fighter")
    FIGHTER("fighter"),
    @XmlEnumValue("bomber")
    BOMBER("bomber"),
    UAV("UAV"),
    @XmlEnumValue("transporter")
    TRANSPORTER("transporter");
    private final String value;

    Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type fromValue(String v) {
        for (Type c: Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Type{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
