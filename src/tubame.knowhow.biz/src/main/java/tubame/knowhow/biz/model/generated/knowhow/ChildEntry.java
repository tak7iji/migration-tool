
package tubame.knowhow.biz.model.generated.knowhow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChildEntry complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="ChildEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntryCategoryRefKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChildEntry" type="{http://generated.model.biz.knowhow.tubame/knowhow}ChildEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildEntry", propOrder = {
    "entryCategoryRefKey",
    "childEntries"
})
public class ChildEntry {

    @XmlElement(name = "EntryCategoryRefKey", required = true)
    protected String entryCategoryRefKey;
    @XmlElement(name = "ChildEntry")
    protected List<ChildEntry> childEntries;

    /**
     * entryCategoryRefKey�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryCategoryRefKey() {
        return entryCategoryRefKey;
    }

    /**
     * entryCategoryRefKey�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryCategoryRefKey(String value) {
        this.entryCategoryRefKey = value;
    }

    /**
     * Gets the value of the childEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildEntry }
     * 
     * 
     */
    public List<ChildEntry> getChildEntries() {
        if (childEntries == null) {
            childEntries = new ArrayList<ChildEntry>();
        }
        return this.childEntries;
    }

}
