
package tubame.portability.biz.model.knowhow;

import java.util.ArrayList;
import java.util.List;

public class Chapter {

    protected String chapterNo;
    protected String chapterName;
    protected List<ChildChapter> childChapters;

    /**
     * Gets the value of the chapterNo property.
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
     * Sets the value of the chapterNo property.
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
     * Gets the value of the chapterName property.
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
     * Sets the value of the chapterName property.
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

    public void setChildChpater(ChildChapter childChapter) {
    	getChildChapters().add(childChapter);
    }
}
