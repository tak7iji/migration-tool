//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:28 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlcmp.wlv8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "foreignKeyColumn", "keyColumn" })
@XmlRootElement(name = "column-map")
public class ColumnMap {

    @XmlElement(name = "foreign-key-column", required = true)
    protected String foreignKeyColumn;
    @XmlElement(name = "key-column", required = true)
    protected String keyColumn;

    /**
     * Gets the value of the foreignKeyColumn property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getForeignKeyColumn() {
        return foreignKeyColumn;
    }

    /**
     * Sets the value of the foreignKeyColumn property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setForeignKeyColumn(String value) {
        this.foreignKeyColumn = value;
    }

    /**
     * Gets the value of the keyColumn property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getKeyColumn() {
        return keyColumn;
    }

    /**
     * Sets the value of the keyColumn property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setKeyColumn(String value) {
        this.keyColumn = value;
    }

}
