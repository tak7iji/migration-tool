
package tubame.knowhow.biz.model.generated.knowhow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Chapter complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="Chapter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChapterNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChapterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Chapter", propOrder = {
    "chapterNo",
    "chapterName",
    "childChapters"
})
public class Chapter {

    @XmlElement(name = "ChapterNo", required = true)
    protected String chapterNo;
    @XmlElement(name = "ChapterName", required = true)
    protected String chapterName;
    @XmlElement(name = "ChildChapter")
    protected List<ChildChapter> childChapters;

    /**
     * chapterNoプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapterNo() {
        return chapterNo;
    }

    /**
     * chapterNoプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapterNo(String value) {
        this.chapterNo = value;
    }

    /**
     * chapterNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * chapterNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapterName(String value) {
        this.chapterName = value;
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
