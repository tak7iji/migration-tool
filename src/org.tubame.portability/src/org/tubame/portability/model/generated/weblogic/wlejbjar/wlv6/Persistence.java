//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:36 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlejbjar.wlv6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "isModifiedMethodName",
        "delayUpdatesUntilEndOfTx", "findersLoadBean", "persistenceType",
        "dbIsShared", "persistenceUse" })
@XmlRootElement(name = "persistence")
public class Persistence {

    @XmlElement(name = "is-modified-method-name")
    protected String isModifiedMethodName;
    @XmlElement(name = "delay-updates-until-end-of-tx")
    protected String delayUpdatesUntilEndOfTx;
    @XmlElement(name = "finders-load-bean")
    protected String findersLoadBean;
    @XmlElement(name = "persistence-type")
    protected List<PersistenceType> persistenceType;
    @XmlElement(name = "db-is-shared")
    protected String dbIsShared;
    @XmlElement(name = "persistence-use")
    protected PersistenceUse persistenceUse;

    /**
     * Gets the value of the isModifiedMethodName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIsModifiedMethodName() {
        return isModifiedMethodName;
    }

    /**
     * Sets the value of the isModifiedMethodName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIsModifiedMethodName(String value) {
        this.isModifiedMethodName = value;
    }

    /**
     * Gets the value of the delayUpdatesUntilEndOfTx property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDelayUpdatesUntilEndOfTx() {
        return delayUpdatesUntilEndOfTx;
    }

    /**
     * Sets the value of the delayUpdatesUntilEndOfTx property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDelayUpdatesUntilEndOfTx(String value) {
        this.delayUpdatesUntilEndOfTx = value;
    }

    /**
     * Gets the value of the findersLoadBean property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFindersLoadBean() {
        return findersLoadBean;
    }

    /**
     * Sets the value of the findersLoadBean property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFindersLoadBean(String value) {
        this.findersLoadBean = value;
    }

    /**
     * Gets the value of the persistenceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the persistenceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPersistenceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersistenceType }
     * 
     * 
     */
    public List<PersistenceType> getPersistenceType() {
        if (persistenceType == null) {
            persistenceType = new ArrayList<PersistenceType>();
        }
        return this.persistenceType;
    }

    /**
     * Gets the value of the dbIsShared property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDbIsShared() {
        return dbIsShared;
    }

    /**
     * Sets the value of the dbIsShared property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDbIsShared(String value) {
        this.dbIsShared = value;
    }

    /**
     * Gets the value of the persistenceUse property.
     * 
     * @return possible object is {@link PersistenceUse }
     * 
     */
    public PersistenceUse getPersistenceUse() {
        return persistenceUse;
    }

    /**
     * Sets the value of the persistenceUse property.
     * 
     * @param value
     *            allowed object is {@link PersistenceUse }
     * 
     */
    public void setPersistenceUse(PersistenceUse value) {
        this.persistenceUse = value;
    }

}
