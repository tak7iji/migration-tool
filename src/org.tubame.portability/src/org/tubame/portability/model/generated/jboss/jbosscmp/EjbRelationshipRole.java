//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:29 AM JST 
//

package org.tubame.portability.model.generated.jboss.jbosscmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ejbRelationshipRoleName", "fkConstraint",
        "keyFields", "readAhead", "batchCascadeDelete" })
@XmlRootElement(name = "ejb-relationship-role")
public class EjbRelationshipRole {

    @XmlElement(name = "ejb-relationship-role-name", required = true)
    protected String ejbRelationshipRoleName;
    @XmlElement(name = "fk-constraint")
    protected String fkConstraint;
    @XmlElement(name = "key-fields")
    protected KeyFields keyFields;
    @XmlElement(name = "read-ahead")
    protected ReadAhead readAhead;
    @XmlElement(name = "batch-cascade-delete")
    protected BatchCascadeDelete batchCascadeDelete;

    /**
     * Gets the value of the ejbRelationshipRoleName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEjbRelationshipRoleName() {
        return ejbRelationshipRoleName;
    }

    /**
     * Sets the value of the ejbRelationshipRoleName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEjbRelationshipRoleName(String value) {
        this.ejbRelationshipRoleName = value;
    }

    /**
     * Gets the value of the fkConstraint property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFkConstraint() {
        return fkConstraint;
    }

    /**
     * Sets the value of the fkConstraint property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFkConstraint(String value) {
        this.fkConstraint = value;
    }

    /**
     * Gets the value of the keyFields property.
     * 
     * @return possible object is {@link KeyFields }
     * 
     */
    public KeyFields getKeyFields() {
        return keyFields;
    }

    /**
     * Sets the value of the keyFields property.
     * 
     * @param value
     *            allowed object is {@link KeyFields }
     * 
     */
    public void setKeyFields(KeyFields value) {
        this.keyFields = value;
    }

    /**
     * Gets the value of the readAhead property.
     * 
     * @return possible object is {@link ReadAhead }
     * 
     */
    public ReadAhead getReadAhead() {
        return readAhead;
    }

    /**
     * Sets the value of the readAhead property.
     * 
     * @param value
     *            allowed object is {@link ReadAhead }
     * 
     */
    public void setReadAhead(ReadAhead value) {
        this.readAhead = value;
    }

    /**
     * Gets the value of the batchCascadeDelete property.
     * 
     * @return possible object is {@link BatchCascadeDelete }
     * 
     */
    public BatchCascadeDelete getBatchCascadeDelete() {
        return batchCascadeDelete;
    }

    /**
     * Sets the value of the batchCascadeDelete property.
     * 
     * @param value
     *            allowed object is {@link BatchCascadeDelete }
     * 
     */
    public void setBatchCascadeDelete(BatchCascadeDelete value) {
        this.batchCascadeDelete = value;
    }

}
