
package tubame.knowhow.biz.model.generated.knowhow;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckItem complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
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
     * checkItemNo�v���p�e�B�̒l���擾���܂��B
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
     * checkItemNo�v���p�e�B�̒l��ݒ肵�܂��B
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
     * checkItemName�v���p�e�B�̒l���擾���܂��B
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
     * checkItemName�v���p�e�B�̒l��ݒ肵�܂��B
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
     * searchProcess�v���p�e�B�̒l���擾���܂��B
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
     * searchProcess�v���p�e�B�̒l��ݒ肵�܂��B
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
     * portabilityFactor�v���p�e�B�̒l���擾���܂��B
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
     * portabilityFactor�v���p�e�B�̒l��ݒ肵�܂��B
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
     * portabilityDegree�v���p�e�B�̒l���擾���܂��B
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
     * portabilityDegree�v���p�e�B�̒l��ݒ肵�܂��B
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
     * degreeDetail�v���p�e�B�̒l���擾���܂��B
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
     * degreeDetail�v���p�e�B�̒l��ݒ肵�܂��B
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
     * visualConfirm�v���p�e�B�̒l���擾���܂��B
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
     * visualConfirm�v���p�e�B�̒l��ݒ肵�܂��B
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
     * hearingConfirm�v���p�e�B�̒l���擾���܂��B
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
     * hearingConfirm�v���p�e�B�̒l��ݒ肵�܂��B
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
     * checkItemId�v���p�e�B�̒l���擾���܂��B
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
     * checkItemId�v���p�e�B�̒l��ݒ肵�܂��B
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
     * searchRefKey�v���p�e�B�̒l���擾���܂��B
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
     * searchRefKey�v���p�e�B�̒l��ݒ肵�܂��B
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
     * searchExistance�v���p�e�B�̒l���擾���܂��B
     * 
     */
    public boolean isSearchExistance() {
        return searchExistance;
    }

    /**
     * searchExistance�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     */
    public void setSearchExistance(boolean value) {
        this.searchExistance = value;
    }

}
