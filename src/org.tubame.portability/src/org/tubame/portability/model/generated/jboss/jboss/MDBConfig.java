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
@XmlType(name = "", propOrder = { "reconnectIntervalSec", "deliveryActive",
        "dlqConfig" })
@XmlRootElement(name = "MDBConfig")
public class MDBConfig {

    @XmlElement(name = "ReconnectIntervalSec", required = true)
    protected String reconnectIntervalSec;
    @XmlElement(name = "DeliveryActive")
    protected String deliveryActive;
    @XmlElement(name = "DLQConfig")
    protected DLQConfig dlqConfig;

    /**
     * Gets the value of the reconnectIntervalSec property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReconnectIntervalSec() {
        return reconnectIntervalSec;
    }

    /**
     * Sets the value of the reconnectIntervalSec property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReconnectIntervalSec(String value) {
        this.reconnectIntervalSec = value;
    }

    /**
     * Gets the value of the deliveryActive property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDeliveryActive() {
        return deliveryActive;
    }

    /**
     * Sets the value of the deliveryActive property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDeliveryActive(String value) {
        this.deliveryActive = value;
    }

    /**
     * Gets the value of the dlqConfig property.
     * 
     * @return possible object is {@link DLQConfig }
     * 
     */
    public DLQConfig getDLQConfig() {
        return dlqConfig;
    }

    /**
     * Sets the value of the dlqConfig property.
     * 
     * @param value
     *            allowed object is {@link DLQConfig }
     * 
     */
    public void setDLQConfig(DLQConfig value) {
        this.dlqConfig = value;
    }

}
