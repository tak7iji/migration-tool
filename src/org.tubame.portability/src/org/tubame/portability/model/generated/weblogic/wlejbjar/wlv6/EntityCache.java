//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:36 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlejbjar.wlv6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "maxBeansInCache", "idleTimeoutSeconds",
        "readTimeoutSeconds", "concurrencyStrategy" })
@XmlRootElement(name = "entity-cache")
public class EntityCache {

    @XmlElement(name = "max-beans-in-cache")
    protected String maxBeansInCache;
    @XmlElement(name = "idle-timeout-seconds")
    protected String idleTimeoutSeconds;
    @XmlElement(name = "read-timeout-seconds")
    protected String readTimeoutSeconds;
    @XmlElement(name = "concurrency-strategy")
    protected String concurrencyStrategy;

    /**
     * Gets the value of the maxBeansInCache property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMaxBeansInCache() {
        return maxBeansInCache;
    }

    /**
     * Sets the value of the maxBeansInCache property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMaxBeansInCache(String value) {
        this.maxBeansInCache = value;
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

}
