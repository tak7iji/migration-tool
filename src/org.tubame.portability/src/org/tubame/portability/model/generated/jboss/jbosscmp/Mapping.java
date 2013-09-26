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
@XmlType(name = "", propOrder = { "javaType", "jdbcType", "sqlType",
        "paramSetter", "resultReader" })
@XmlRootElement(name = "mapping")
public class Mapping {

    @XmlElement(name = "java-type", required = true)
    protected String javaType;
    @XmlElement(name = "jdbc-type", required = true)
    protected JdbcType jdbcType;
    @XmlElement(name = "sql-type", required = true)
    protected SqlType sqlType;
    @XmlElement(name = "param-setter")
    protected String paramSetter;
    @XmlElement(name = "result-reader")
    protected String resultReader;

    /**
     * Gets the value of the javaType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getJavaType() {
        return javaType;
    }

    /**
     * Sets the value of the javaType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setJavaType(String value) {
        this.javaType = value;
    }

    /**
     * Gets the value of the jdbcType property.
     * 
     * @return possible object is {@link JdbcType }
     * 
     */
    public JdbcType getJdbcType() {
        return jdbcType;
    }

    /**
     * Sets the value of the jdbcType property.
     * 
     * @param value
     *            allowed object is {@link JdbcType }
     * 
     */
    public void setJdbcType(JdbcType value) {
        this.jdbcType = value;
    }

    /**
     * Gets the value of the sqlType property.
     * 
     * @return possible object is {@link SqlType }
     * 
     */
    public SqlType getSqlType() {
        return sqlType;
    }

    /**
     * Sets the value of the sqlType property.
     * 
     * @param value
     *            allowed object is {@link SqlType }
     * 
     */
    public void setSqlType(SqlType value) {
        this.sqlType = value;
    }

    /**
     * Gets the value of the paramSetter property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getParamSetter() {
        return paramSetter;
    }

    /**
     * Sets the value of the paramSetter property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setParamSetter(String value) {
        this.paramSetter = value;
    }

    /**
     * Gets the value of the resultReader property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getResultReader() {
        return resultReader;
    }

    /**
     * Sets the value of the resultReader property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setResultReader(String value) {
        this.resultReader = value;
    }

}
