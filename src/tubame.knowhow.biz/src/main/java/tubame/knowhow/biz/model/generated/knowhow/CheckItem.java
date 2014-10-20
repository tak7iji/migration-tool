
package tubame.knowhow.biz.model.generated.knowhow;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="CheckItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckItemNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CheckItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchProcess" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortabilityFactor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortabilityDegree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DegreeDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VisualConfirm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HearingConfirm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="checkItemId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchRefKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchExistance" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckItem", propOrder = {
    "checkItemNo",
    "checkItemName",
    "searchProcess",
    "portabilityFactor",
    "portabilityDegree",
    "degreeDetail",
    "visualConfirm",
    "hearingConfirm"
})
public class CheckItem {

    @XmlElement(name = "CheckItemNo", required = true)
    protected BigInteger checkItemNo;
    @XmlElement(name = "CheckItemName", required = true)
    protected String checkItemName;
    @XmlElement(name = "SearchProcess", required = true)
    protected String searchProcess;
    @XmlElement(name = "PortabilityFactor", required = true)
    protected String portabilityFactor;
    @XmlElement(name = "PortabilityDegree", required = true)
    protected String portabilityDegree;
    @XmlElement(name = "DegreeDetail", required = true)
    protected String degreeDetail;
    @XmlElement(name = "VisualConfirm", required = true)
    protected String visualConfirm;
    @XmlElement(name = "HearingConfirm", required = true)
    protected String hearingConfirm;
    @XmlAttribute(name = "checkItemId")
    protected String checkItemId;
    @XmlAttribute(name = "searchRefKey")
    protected String searchRefKey;
    @XmlAttribute(name = "searchExistance", required = true)
    protected boolean searchExistance;

    /**
     * checkItemNoプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCheckItemNo() {
        return checkItemNo;
    }

    /**
     * checkItemNoプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCheckItemNo(BigInteger value) {
        this.checkItemNo = value;
    }

    /**
     * checkItemNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckItemName() {
        return checkItemName;
    }

    /**
     * checkItemNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckItemName(String value) {
        this.checkItemName = value;
    }

    /**
     * searchProcessプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProcess() {
        return searchProcess;
    }

    /**
     * searchProcessプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProcess(String value) {
        this.searchProcess = value;
    }

    /**
     * portabilityFactorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortabilityFactor() {
        return portabilityFactor;
    }

    /**
     * portabilityFactorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortabilityFactor(String value) {
        this.portabilityFactor = value;
    }

    /**
     * portabilityDegreeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortabilityDegree() {
        return portabilityDegree;
    }

    /**
     * portabilityDegreeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortabilityDegree(String value) {
        this.portabilityDegree = value;
    }

    /**
     * degreeDetailプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeDetail() {
        return degreeDetail;
    }

    /**
     * degreeDetailプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeDetail(String value) {
        this.degreeDetail = value;
    }

    /**
     * visualConfirmプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualConfirm() {
        return visualConfirm;
    }

    /**
     * visualConfirmプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualConfirm(String value) {
        this.visualConfirm = value;
    }

    /**
     * hearingConfirmプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHearingConfirm() {
        return hearingConfirm;
    }

    /**
     * hearingConfirmプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHearingConfirm(String value) {
        this.hearingConfirm = value;
    }

    /**
     * checkItemIdプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckItemId() {
        return checkItemId;
    }

    /**
     * checkItemIdプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckItemId(String value) {
        this.checkItemId = value;
    }

    /**
     * searchRefKeyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchRefKey() {
        return searchRefKey;
    }

    /**
     * searchRefKeyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchRefKey(String value) {
        this.searchRefKey = value;
    }

    /**
     * searchExistanceプロパティの値を取得します。
     * 
     */
    public boolean isSearchExistance() {
        return searchExistance;
    }

    /**
     * searchExistanceプロパティの値を設定します。
     * 
     */
    public void setSearchExistance(boolean value) {
        this.searchExistance = value;
    }

}
