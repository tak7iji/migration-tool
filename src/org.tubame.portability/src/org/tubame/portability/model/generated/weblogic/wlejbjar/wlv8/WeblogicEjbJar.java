//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:37 AM JST 
//

package org.tubame.portability.model.generated.weblogic.wlejbjar.wlv8;

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
@XmlType(name = "", propOrder = { "description", "weblogicEnterpriseBean",
        "securityRoleAssignment", "runAsRoleAssignment", "securityPermission",
        "transactionIsolation", "idempotentMethods", "enableBeanClassRedeploy",
        "disableWarning" })
@XmlRootElement(name = "weblogic-ejb-jar")
public class WeblogicEjbJar {

    protected String description;
    @XmlElement(name = "weblogic-enterprise-bean")
    protected List<WeblogicEnterpriseBean> weblogicEnterpriseBean;
    @XmlElement(name = "security-role-assignment")
    protected List<SecurityRoleAssignment> securityRoleAssignment;
    @XmlElement(name = "run-as-role-assignment")
    protected List<RunAsRoleAssignment> runAsRoleAssignment;
    @XmlElement(name = "security-permission")
    protected SecurityPermission securityPermission;
    @XmlElement(name = "transaction-isolation")
    protected List<TransactionIsolation> transactionIsolation;
    @XmlElement(name = "idempotent-methods")
    protected IdempotentMethods idempotentMethods;
    @XmlElement(name = "enable-bean-class-redeploy")
    protected String enableBeanClassRedeploy;
    @XmlElement(name = "disable-warning")
    protected List<DisableWarning> disableWarning;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the weblogicEnterpriseBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the weblogicEnterpriseBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWeblogicEnterpriseBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeblogicEnterpriseBean }
     * 
     * 
     */
    public List<WeblogicEnterpriseBean> getWeblogicEnterpriseBean() {
        if (weblogicEnterpriseBean == null) {
            weblogicEnterpriseBean = new ArrayList<WeblogicEnterpriseBean>();
        }
        return this.weblogicEnterpriseBean;
    }

    /**
     * Gets the value of the securityRoleAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the securityRoleAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSecurityRoleAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityRoleAssignment }
     * 
     * 
     */
    public List<SecurityRoleAssignment> getSecurityRoleAssignment() {
        if (securityRoleAssignment == null) {
            securityRoleAssignment = new ArrayList<SecurityRoleAssignment>();
        }
        return this.securityRoleAssignment;
    }

    /**
     * Gets the value of the runAsRoleAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the runAsRoleAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRunAsRoleAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunAsRoleAssignment }
     * 
     * 
     */
    public List<RunAsRoleAssignment> getRunAsRoleAssignment() {
        if (runAsRoleAssignment == null) {
            runAsRoleAssignment = new ArrayList<RunAsRoleAssignment>();
        }
        return this.runAsRoleAssignment;
    }

    /**
     * Gets the value of the securityPermission property.
     * 
     * @return possible object is {@link SecurityPermission }
     * 
     */
    public SecurityPermission getSecurityPermission() {
        return securityPermission;
    }

    /**
     * Sets the value of the securityPermission property.
     * 
     * @param value
     *            allowed object is {@link SecurityPermission }
     * 
     */
    public void setSecurityPermission(SecurityPermission value) {
        this.securityPermission = value;
    }

    /**
     * Gets the value of the transactionIsolation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the transactionIsolation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTransactionIsolation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionIsolation }
     * 
     * 
     */
    public List<TransactionIsolation> getTransactionIsolation() {
        if (transactionIsolation == null) {
            transactionIsolation = new ArrayList<TransactionIsolation>();
        }
        return this.transactionIsolation;
    }

    /**
     * Gets the value of the idempotentMethods property.
     * 
     * @return possible object is {@link IdempotentMethods }
     * 
     */
    public IdempotentMethods getIdempotentMethods() {
        return idempotentMethods;
    }

    /**
     * Sets the value of the idempotentMethods property.
     * 
     * @param value
     *            allowed object is {@link IdempotentMethods }
     * 
     */
    public void setIdempotentMethods(IdempotentMethods value) {
        this.idempotentMethods = value;
    }

    /**
     * Gets the value of the enableBeanClassRedeploy property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEnableBeanClassRedeploy() {
        return enableBeanClassRedeploy;
    }

    /**
     * Sets the value of the enableBeanClassRedeploy property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEnableBeanClassRedeploy(String value) {
        this.enableBeanClassRedeploy = value;
    }

    /**
     * Gets the value of the disableWarning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the disableWarning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDisableWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisableWarning }
     * 
     * 
     */
    public List<DisableWarning> getDisableWarning() {
        if (disableWarning == null) {
            disableWarning = new ArrayList<DisableWarning>();
        }
        return this.disableWarning;
    }

}
