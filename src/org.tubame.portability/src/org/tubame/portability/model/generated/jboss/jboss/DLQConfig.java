//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:38 AM JST 
//

package org.tubame.portability.model.generated.jboss.jboss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "destinationQueue", "maxTimesRedelivered",
        "timeToLive", "dlqUser", "dlqPassword" })
@XmlRootElement(name = "DLQConfig")
public class DLQConfig {

    @XmlElement(name = "DestinationQueue", required = true)
    protected String destinationQueue;
    @XmlElement(name = "MaxTimesRedelivered", required = true)
    protected String maxTimesRedelivered;
    @XmlElement(name = "TimeToLive", required = true)
    protected String timeToLive;
    @XmlElement(name = "DLQUser")
    protected String dlqUser;
    @XmlElement(name = "DLQPassword")
    protected String dlqPassword;

    /**
     * Gets the value of the destinationQueue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDestinationQueue() {
        return destinationQueue;
    }

    /**
     * Sets the value of the destinationQueue property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDestinationQueue(String value) {
        this.destinationQueue = value;
    }

    /**
     * Gets the value of the maxTimesRedelivered property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMaxTimesRedelivered() {
        return maxTimesRedelivered;
    }

    /**
     * Sets the value of the maxTimesRedelivered property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMaxTimesRedelivered(String value) {
        this.maxTimesRedelivered = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTimeToLive(String value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the dlqUser property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDLQUser() {
        return dlqUser;
    }

    /**
     * Sets the value of the dlqUser property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDLQUser(String value) {
        this.dlqUser = value;
    }

    /**
     * Gets the value of the dlqPassword property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDLQPassword() {
        return dlqPassword;
    }

    /**
     * Sets the value of the dlqPassword property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDLQPassword(String value) {
        this.dlqPassword = value;
    }

}
