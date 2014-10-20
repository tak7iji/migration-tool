
package tubame.knowhow.biz.model.generated.knowhow;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>KnowhowInfomation complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="KnowhowInfomation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KnowhowNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="KnowhowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckItem" type="{http://generated.model.biz.knowhow.tubame/knowhow}CheckItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="knowhowId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="knowhowDetailRefKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowhowInfomation", propOrder = {
    "knowhowNo",
    "knowhowName",
    "checkItems"
})
public class KnowhowInfomation {

    @XmlElement(name = "KnowhowNo", required = true)
    protected BigInteger knowhowNo;
    @XmlElement(name = "KnowhowName", required = true)
    protected String knowhowName;
    @XmlElement(name = "CheckItem")
    protected List<CheckItem> checkItems;
    @XmlAttribute(name = "knowhowId", required = true)
    protected String knowhowId;
    @XmlAttribute(name = "knowhowDetailRefKey")
    protected String knowhowDetailRefKey;

    /**
     * knowhowNo�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKnowhowNo() {
        return knowhowNo;
    }

    /**
     * knowhowNo�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKnowhowNo(BigInteger value) {
        this.knowhowNo = value;
    }

    /**
     * knowhowName�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnowhowName() {
        return knowhowName;
    }

    /**
     * knowhowName�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnowhowName(String value) {
        this.knowhowName = value;
    }

    /**
     * Gets the value of the checkItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckItem }
     * 
     * 
     */
    public List<CheckItem> getCheckItems() {
        if (checkItems == null) {
            checkItems = new ArrayList<CheckItem>();
        }
        return this.checkItems;
    }

    /**
     * knowhowId�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnowhowId() {
        return knowhowId;
    }

    /**
     * knowhowId�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnowhowId(String value) {
        this.knowhowId = value;
    }

    /**
     * knowhowDetailRefKey�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnowhowDetailRefKey() {
        return knowhowDetailRefKey;
    }

    /**
     * knowhowDetailRefKey�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnowhowDetailRefKey(String value) {
        this.knowhowDetailRefKey = value;
    }

}
