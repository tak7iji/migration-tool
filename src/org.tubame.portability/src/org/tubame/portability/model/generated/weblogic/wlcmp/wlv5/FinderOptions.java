//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:27 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlcmp.wlv5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "findForUpdate" })
@XmlRootElement(name = "finder-options")
public class FinderOptions {

    @XmlElement(name = "find-for-update")
    protected String findForUpdate;

    /**
     * Gets the value of the findForUpdate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFindForUpdate() {
        return findForUpdate;
    }

    /**
     * Sets the value of the findForUpdate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFindForUpdate(String value) {
        this.findForUpdate = value;
    }

}
