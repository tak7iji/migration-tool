//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:27 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlcmp.wlv5;

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
@XmlType(name = "", propOrder = { "methodName", "methodParams", "finderQuery",
        "finderExpression", "finderOptions" })
@XmlRootElement(name = "finder")
public class Finder {

    @XmlElement(name = "method-name", required = true)
    protected String methodName;
    @XmlElement(name = "method-params")
    protected MethodParams methodParams;
    @XmlElement(name = "finder-query", required = true)
    protected String finderQuery;
    @XmlElement(name = "finder-expression")
    protected List<FinderExpression> finderExpression;
    @XmlElement(name = "finder-options")
    protected FinderOptions finderOptions;

    /**
     * Gets the value of the methodName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the methodParams property.
     * 
     * @return possible object is {@link MethodParams }
     * 
     */
    public MethodParams getMethodParams() {
        return methodParams;
    }

    /**
     * Sets the value of the methodParams property.
     * 
     * @param value
     *            allowed object is {@link MethodParams }
     * 
     */
    public void setMethodParams(MethodParams value) {
        this.methodParams = value;
    }

    /**
     * Gets the value of the finderQuery property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFinderQuery() {
        return finderQuery;
    }

    /**
     * Sets the value of the finderQuery property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFinderQuery(String value) {
        this.finderQuery = value;
    }

    /**
     * Gets the value of the finderExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the finderExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFinderExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinderExpression }
     * 
     * 
     */
    public List<FinderExpression> getFinderExpression() {
        if (finderExpression == null) {
            finderExpression = new ArrayList<FinderExpression>();
        }
        return this.finderExpression;
    }

    /**
     * Gets the value of the finderOptions property.
     * 
     * @return possible object is {@link FinderOptions }
     * 
     */
    public FinderOptions getFinderOptions() {
        return finderOptions;
    }

    /**
     * Sets the value of the finderOptions property.
     * 
     * @param value
     *            allowed object is {@link FinderOptions }
     * 
     */
    public void setFinderOptions(FinderOptions value) {
        this.finderOptions = value;
    }

}
