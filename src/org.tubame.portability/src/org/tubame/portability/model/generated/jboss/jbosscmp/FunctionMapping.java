//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:29 AM JST 
//

package org.tubame.portability.model.generated.jboss.jbosscmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "functionName", "functionSql" })
@XmlRootElement(name = "function-mapping")
public class FunctionMapping {

    @XmlElement(name = "function-name", required = true)
    protected String functionName;
    @XmlElement(name = "function-sql", required = true)
    protected String functionSql;

    /**
     * Gets the value of the functionName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * Sets the value of the functionName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFunctionName(String value) {
        this.functionName = value;
    }

    /**
     * Gets the value of the functionSql property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFunctionSql() {
        return functionSql;
    }

    /**
     * Sets the value of the functionSql property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFunctionSql(String value) {
        this.functionSql = value;
    }

}
