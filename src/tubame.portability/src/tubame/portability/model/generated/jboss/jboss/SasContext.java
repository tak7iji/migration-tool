//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:38 AM JST 
//

package tubame.portability.model.generated.jboss.jboss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "callerPropagation" })
@XmlRootElement(name = "sas-context")
public class SasContext {

    @XmlElement(name = "caller-propagation", required = true)
    protected String callerPropagation;

    /**
     * Gets the value of the callerPropagation property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCallerPropagation() {
        return callerPropagation;
    }

    /**
     * Sets the value of the callerPropagation property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCallerPropagation(String value) {
        this.callerPropagation = value;
    }

}
