
package com.clarizen.api.queries;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Order">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ascending"/>
 *     &lt;enumeration value="Descending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Order")
@XmlEnum
public enum Order {

    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),
    @XmlEnumValue("Descending")
    DESCENDING("Descending");
    private final String value;

    Order(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Order fromValue(String v) {
        for (Order c: Order.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
