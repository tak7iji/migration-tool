//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:37 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlejbjar.wlv8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "entityCacheName", "readTimeoutSeconds",
        "concurrencyStrategy", "cacheBetweenTransactions", "estimatedBeanSize",
        "idleTimeoutSeconds" })
@XmlRootElement(name = "entity-cache-ref")
public class EntityCacheRef {

    @XmlElement(name = "entity-cache-name", required = true)
    protected String entityCacheName;
    @XmlElement(name = "read-timeout-seconds")
    protected String readTimeoutSeconds;
    @XmlElement(name = "concurrency-strategy", required = true)
    protected String concurrencyStrategy;
    @XmlElement(name = "cache-between-transactions")
    protected String cacheBetweenTransactions;
    @XmlElement(name = "estimated-bean-size")
    protected String estimatedBeanSize;
    @XmlElement(name = "idle-timeout-seconds")
    protected String idleTimeoutSeconds;

    /**
     * Gets the value of the entityCacheName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEntityCacheName() {
        return entityCacheName;
    }

    /**
     * Sets the value of the entityCacheName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEntityCacheName(String value) {
        this.entityCacheName = value;
    }

    /**
     * Gets the value of the readTimeoutSeconds property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReadTimeoutSeconds() {
        return readTimeoutSeconds;
    }

    /**
     * Sets the value of the readTimeoutSeconds property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReadTimeoutSeconds(String value) {
        this.readTimeoutSeconds = value;
    }

    /**
     * Gets the value of the concurrencyStrategy property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getConcurrencyStrategy() {
        return concurrencyStrategy;
    }

    /**
     * Sets the value of the concurrencyStrategy property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setConcurrencyStrategy(String value) {
        this.concurrencyStrategy = value;
    }

    /**
     * Gets the value of the cacheBetweenTransactions property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCacheBetweenTransactions() {
        return cacheBetweenTransactions;
    }

    /**
     * Sets the value of the cacheBetweenTransactions property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCacheBetweenTransactions(String value) {
        this.cacheBetweenTransactions = value;
    }

    /**
     * Gets the value of the estimatedBeanSize property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEstimatedBeanSize() {
        return estimatedBeanSize;
    }

    /**
     * Sets the value of the estimatedBeanSize property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEstimatedBeanSize(String value) {
        this.estimatedBeanSize = value;
    }

    /**
     * Gets the value of the idleTimeoutSeconds property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIdleTimeoutSeconds() {
        return idleTimeoutSeconds;
    }

    /**
     * Sets the value of the idleTimeoutSeconds property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIdleTimeoutSeconds(String value) {
        this.idleTimeoutSeconds = value;
    }

}
