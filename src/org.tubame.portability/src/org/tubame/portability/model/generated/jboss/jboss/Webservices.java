//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:38 AM JST 
//

package org.tubame.portability.model.generated.jboss.jboss;

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
@XmlType(name = "", propOrder = { "contextRoot", "webserviceDescription" })
@XmlRootElement(name = "webservices")
public class Webservices {

    @XmlElement(name = "context-root")
    protected String contextRoot;
    @XmlElement(name = "webservice-description")
    protected List<WebserviceDescription> webserviceDescription;

    /**
     * Gets the value of the contextRoot property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getContextRoot() {
        return contextRoot;
    }

    /**
     * Sets the value of the contextRoot property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setContextRoot(String value) {
        this.contextRoot = value;
    }

    /**
     * Gets the value of the webserviceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the webserviceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWebserviceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebserviceDescription }
     * 
     * 
     */
    public List<WebserviceDescription> getWebserviceDescription() {
        if (webserviceDescription == null) {
            webserviceDescription = new ArrayList<WebserviceDescription>();
        }
        return this.webserviceDescription;
    }

}
