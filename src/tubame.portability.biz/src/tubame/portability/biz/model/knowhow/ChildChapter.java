
package tubame.portability.biz.model.knowhow;

import java.util.ArrayList;
import java.util.List;
public class ChildChapter {

    protected String childCapterNo;
    protected String chapterCategoryRefKey;
    protected List<ChildChapter> childChapters;

    /**
     * Gets the value of the childCapterNo property.
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
     * Sets the value of the childCapterNo property.
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
     * Gets the value of the chapterCategoryRefKey property.
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
     * Sets the value of the chapterCategoryRefKey property.
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

    public void setChildChpater(ChildChapter childChapter) {
    	getChildChapters().add(childChapter);
    }
}
