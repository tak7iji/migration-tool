
package tubame.knowhow.biz.model.generated.knowhow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChildChapter complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="ChildChapter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChildCapterNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChapterCategoryRefKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChildChapter" type="{http://generated.model.biz.knowhow.tubame/knowhow}ChildChapter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildChapter", propOrder = {
    "childCapterNo",
    "chapterCategoryRefKey",
    "childChapters"
})
public class ChildChapter {

    @XmlElement(name = "ChildCapterNo", required = true)
    protected String childCapterNo;
    @XmlElement(name = "ChapterCategoryRefKey", required = true)
    protected String chapterCategoryRefKey;
    @XmlElement(name = "ChildChapter")
    protected List<ChildChapter> childChapters;

    /**
     * childCapterNo�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildCapterNo() {
        return childCapterNo;
    }

    /**
     * childCapterNo�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildCapterNo(String value) {
        this.childCapterNo = value;
    }

    /**
     * chapterCategoryRefKey�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapterCategoryRefKey() {
        return chapterCategoryRefKey;
    }

    /**
     * chapterCategoryRefKey�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapterCategoryRefKey(String value) {
        this.chapterCategoryRefKey = value;
    }

    /**
     * Gets the value of the childChapters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childChapters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildChapters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildChapter }
     * 
     * 
     */
    public List<ChildChapter> getChildChapters() {
        if (childChapters == null) {
            childChapters = new ArrayList<ChildChapter>();
        }
        return this.childChapters;
    }

}
