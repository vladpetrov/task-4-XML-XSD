
package by.epam.training.task04.entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Measuring.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Measuring">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="m"/>
 *     &lt;enumeration value="ft"/>
 *     &lt;enumeration value="inc"/>
 *     &lt;enumeration value="cm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Measuring", namespace = "http://www.epam.by/Hangar")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-04-25T10:56:26+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum Measuring {

    @XmlEnumValue("m")
    M("m"),
    @XmlEnumValue("ft")
    FT("ft"),
    @XmlEnumValue("inc")
    INC("inc"),
    @XmlEnumValue("cm")
    CM("cm");
    private final String value;

    Measuring(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Measuring fromValue(String v) {
        for (Measuring c: Measuring.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Measuring{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
