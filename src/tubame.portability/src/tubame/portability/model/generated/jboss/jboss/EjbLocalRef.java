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
@XmlType(name = "", propOrder = { "ejbRefName", "localJndiName" })
@XmlRootElement(name = "ejb-local-ref")
public class EjbLocalRef {

    @XmlElement(name = "ejb-ref-name", required = true)
    protected String ejbRefName;
    @XmlElement(name = "local-jndi-name", required = true)
    protected String localJndiName;

    /**
     * Gets the value of the ejbRefName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEjbRefName() {
        return ejbRefName;
    }

    /**
     * Sets the value of the ejbRefName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEjbRefName(String value) {
        this.ejbRefName = value;
    }

    /**
     * Gets the value of the localJndiName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLocalJndiName() {
        return localJndiName;
    }

    /**
     * Sets the value of the localJndiName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLocalJndiName(String value) {
        this.localJndiName = value;
    }

}