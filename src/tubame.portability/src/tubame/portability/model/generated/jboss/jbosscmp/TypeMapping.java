//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:29 AM JST 
//

package tubame.portability.model.generated.jboss.jbosscmp;

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
@XmlType(name = "", propOrder = { "name", "rowLockingTemplate",
        "pkConstraintTemplate", "fkConstraintTemplate",
        "autoIncrementTemplate", "addColumnTemplate", "alterColumnTemplate",
        "dropColumnTemplate", "aliasHeaderPrefix", "aliasHeaderSuffix",
        "aliasMaxLength", "subquerySupported", "trueMapping", "falseMapping",
        "maxKeysInDelete", "functionMapping", "mapping" })
@XmlRootElement(name = "type-mapping")
public class TypeMapping {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "row-locking-template", required = true)
    protected String rowLockingTemplate;
    @XmlElement(name = "pk-constraint-template", required = true)
    protected String pkConstraintTemplate;
    @XmlElement(name = "fk-constraint-template", required = true)
    protected String fkConstraintTemplate;
    @XmlElement(name = "auto-increment-template")
    protected String autoIncrementTemplate;
    @XmlElement(name = "add-column-template")
    protected String addColumnTemplate;
    @XmlElement(name = "alter-column-template")
    protected String alterColumnTemplate;
    @XmlElement(name = "drop-column-template")
    protected String dropColumnTemplate;
    @XmlElement(name = "alias-header-prefix", required = true)
    protected String aliasHeaderPrefix;
    @XmlElement(name = "alias-header-suffix", required = true)
    protected String aliasHeaderSuffix;
    @XmlElement(name = "alias-max-length", required = true)
    protected String aliasMaxLength;
    @XmlElement(name = "subquery-supported", required = true)
    protected String subquerySupported;
    @XmlElement(name = "true-mapping", required = true)
    protected String trueMapping;
    @XmlElement(name = "false-mapping", required = true)
    protected String falseMapping;
    @XmlElement(name = "max-keys-in-delete")
    protected String maxKeysInDelete;
    @XmlElement(name = "function-mapping")
    protected List<FunctionMapping> functionMapping;
    @XmlElement(required = true)
    protected List<Mapping> mapping;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rowLockingTemplate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRowLockingTemplate() {
        return rowLockingTemplate;
    }

    /**
     * Sets the value of the rowLockingTemplate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRowLockingTemplate(String value) {
        this.rowLockingTemplate = value;
    }

    /**
     * Gets the value of the pkConstraintTemplate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPkConstraintTemplate() {
        return pkConstraintTemplate;
    }

    /**
     * Sets the value of the pkConstraintTemplate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPkConstraintTemplate(String value) {
        this.pkConstraintTemplate = value;
    }

    /**
     * Gets the value of the fkConstraintTemplate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFkConstraintTemplate() {
        return fkConstraintTemplate;
    }

    /**
     * Sets the value of the fkConstraintTemplate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFkConstraintTemplate(String value) {
        this.fkConstraintTemplate = value;
    }

    /**
     * Gets the value of the autoIncrementTemplate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAutoIncrementTemplate() {
        return autoIncrementTemplate;
    }

    /**
     * Sets the value of the autoIncrementTemplate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAutoIncrementTemplate(String value) {
        this.autoIncrementTemplate = value;
    }

    /**
     * Gets the value of the addColumnTemplate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAddColumnTemplate() {
        return addColumnTemplate;
    }

    /**
     * Sets the value of the addColumnTemplate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAddColumnTemplate(String value) {
        this.addColumnTemplate = value;
    }

    /**
     * Gets the value of the alterColumnTemplate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAlterColumnTemplate() {
        return alterColumnTemplate;
    }

    /**
     * Sets the value of the alterColumnTemplate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAlterColumnTemplate(String value) {
        this.alterColumnTemplate = value;
    }

    /**
     * Gets the value of the dropColumnTemplate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDropColumnTemplate() {
        return dropColumnTemplate;
    }

    /**
     * Sets the value of the dropColumnTemplate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDropColumnTemplate(String value) {
        this.dropColumnTemplate = value;
    }

    /**
     * Gets the value of the aliasHeaderPrefix property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAliasHeaderPrefix() {
        return aliasHeaderPrefix;
    }

    /**
     * Sets the value of the aliasHeaderPrefix property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAliasHeaderPrefix(String value) {
        this.aliasHeaderPrefix = value;
    }

    /**
     * Gets the value of the aliasHeaderSuffix property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAliasHeaderSuffix() {
        return aliasHeaderSuffix;
    }

    /**
     * Sets the value of the aliasHeaderSuffix property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAliasHeaderSuffix(String value) {
        this.aliasHeaderSuffix = value;
    }

    /**
     * Gets the value of the aliasMaxLength property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAliasMaxLength() {
        return aliasMaxLength;
    }

    /**
     * Sets the value of the aliasMaxLength property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAliasMaxLength(String value) {
        this.aliasMaxLength = value;
    }

    /**
     * Gets the value of the subquerySupported property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSubquerySupported() {
        return subquerySupported;
    }

    /**
     * Sets the value of the subquerySupported property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSubquerySupported(String value) {
        this.subquerySupported = value;
    }

    /**
     * Gets the value of the trueMapping property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTrueMapping() {
        return trueMapping;
    }

    /**
     * Sets the value of the trueMapping property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTrueMapping(String value) {
        this.trueMapping = value;
    }

    /**
     * Gets the value of the falseMapping property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFalseMapping() {
        return falseMapping;
    }

    /**
     * Sets the value of the falseMapping property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFalseMapping(String value) {
        this.falseMapping = value;
    }

    /**
     * Gets the value of the maxKeysInDelete property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMaxKeysInDelete() {
        return maxKeysInDelete;
    }

    /**
     * Sets the value of the maxKeysInDelete property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMaxKeysInDelete(String value) {
        this.maxKeysInDelete = value;
    }

    /**
     * Gets the value of the functionMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the functionMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFunctionMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionMapping }
     * 
     * 
     */
    public List<FunctionMapping> getFunctionMapping() {
        if (functionMapping == null) {
            functionMapping = new ArrayList<FunctionMapping>();
        }
        return this.functionMapping;
    }

    /**
     * Gets the value of the mapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the mapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Mapping }
     * 
     * 
     */
    public List<Mapping> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<Mapping>();
        }
        return this.mapping;
    }

}
