
package com.clarizen.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateAndRetrieveMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateAndRetrieveMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clarizen.com/api}CreateMessage">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://clarizen.com/api}stringList" minOccurs="0"/>
 *         &lt;element name="Permissions" type="{http://clarizen.com/api}PermissionOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAndRetrieveMessage", propOrder = {
    "fields",
    "permissions"
})
public class CreateAndRetrieveMessage
    extends CreateMessage
{

    @XmlElement(name = "Fields", nillable = true)
    protected StringList fields;
    @XmlElement(name = "Permissions")
    protected PermissionOptions permissions;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link StringList }
     *     
     */
    public StringList getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringList }
     *     
     */
    public void setFields(StringList value) {
        this.fields = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionOptions }
     *     
     */
    public PermissionOptions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionOptions }
     *     
     */
    public void setPermissions(PermissionOptions value) {
        this.permissions = value;
    }

}