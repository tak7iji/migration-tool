//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:38 AM JST 
//

package tubame.portability.model.generated.jboss.jboss;

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
@XmlType(name = "", propOrder = { "serviceRefName", "serviceImplClass",
        "serviceQname", "configName", "configFile", "handlerChain",
        "portComponentRef", "wsdlOverride" })
@XmlRootElement(name = "service-ref")
public class ServiceRef {

    @XmlElement(name = "service-ref-name", required = true)
    protected String serviceRefName;
    @XmlElement(name = "service-impl-class")
    protected String serviceImplClass;
    @XmlElement(name = "service-qname")
    protected String serviceQname;
    @XmlElement(name = "config-name")
    protected String configName;
    @XmlElement(name = "config-file")
    protected String configFile;
    @XmlElement(name = "handler-chain")
    protected String handlerChain;
    @XmlElement(name = "port-component-ref")
    protected List<PortComponentRef> portComponentRef;
    @XmlElement(name = "wsdl-override")
    protected String wsdlOverride;

    /**
     * Gets the value of the serviceRefName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceRefName() {
        return serviceRefName;
    }

    /**
     * Sets the value of the serviceRefName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setServiceRefName(String value) {
        this.serviceRefName = value;
    }

    /**
     * Gets the value of the serviceImplClass property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceImplClass() {
        return serviceImplClass;
    }

    /**
     * Sets the value of the serviceImplClass property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setServiceImplClass(String value) {
        this.serviceImplClass = value;
    }

    /**
     * Gets the value of the serviceQname property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceQname() {
        return serviceQname;
    }

    /**
     * Sets the value of the serviceQname property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setServiceQname(String value) {
        this.serviceQname = value;
    }

    /**
     * Gets the value of the configName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * Sets the value of the configName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setConfigName(String value) {
        this.configName = value;
    }

    /**
     * Gets the value of the configFile property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getConfigFile() {
        return configFile;
    }

    /**
     * Sets the value of the configFile property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setConfigFile(String value) {
        this.configFile = value;
    }

    /**
     * Gets the value of the handlerChain property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHandlerChain() {
        return handlerChain;
    }

    /**
     * Sets the value of the handlerChain property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHandlerChain(String value) {
        this.handlerChain = value;
    }

    /**
     * Gets the value of the portComponentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the portComponentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPortComponentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortComponentRef }
     * 
     * 
     */
    public List<PortComponentRef> getPortComponentRef() {
        if (portComponentRef == null) {
            portComponentRef = new ArrayList<PortComponentRef>();
        }
        return this.portComponentRef;
    }

    /**
     * Gets the value of the wsdlOverride property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWsdlOverride() {
        return wsdlOverride;
    }

    /**
     * Sets the value of the wsdlOverride property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setWsdlOverride(String value) {
        this.wsdlOverride = value;
    }

}