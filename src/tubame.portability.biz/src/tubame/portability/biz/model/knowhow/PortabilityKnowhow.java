
package tubame.portability.biz.model.knowhow;

import java.util.ArrayList;
import java.util.List;
public class PortabilityKnowhow {

    protected String portabilityKnowhowTitle;
    protected PortabilityKnowhow.EntryViewList entryViewList;
    protected PortabilityKnowhow.ChapterList chapterList;
    protected PortabilityKnowhow.CategoryList categoryList;
    protected PortabilityKnowhow.KnowhowList knowhowList;
    protected PortabilityKnowhow.SearchInfomationList searchInfomationList;

    /**
     * Gets the value of the portabilityKnowhowTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortabilityKnowhowTitle() {
        return portabilityKnowhowTitle;
    }

    /**
     * Sets the value of the portabilityKnowhowTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortabilityKnowhowTitle(String value) {
        this.portabilityKnowhowTitle = value;
    }

    /**
     * Gets the value of the entryViewList property.
     * 
     * @return
     *     possible object is
     *     {@link PortabilityKnowhow.EntryViewList }
     *     
     */
    public PortabilityKnowhow.EntryViewList getEntryViewList() {
        return entryViewList;
    }

    /**
     * Sets the value of the entryViewList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilityKnowhow.EntryViewList }
     *     
     */
    public void setEntryViewList(PortabilityKnowhow.EntryViewList value) {
        this.entryViewList = value;
    }

    /**
     * Gets the value of the chapterList property.
     * 
     * @return
     *     possible object is
     *     {@link PortabilityKnowhow.ChapterList }
     *     
     */
    public PortabilityKnowhow.ChapterList getChapterList() {
        return chapterList;
    }

    /**
     * Sets the value of the chapterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilityKnowhow.ChapterList }
     *     
     */
    public void setChapterList(PortabilityKnowhow.ChapterList value) {
        this.chapterList = value;
    }

    /**
     * Gets the value of the categoryList property.
     * 
     * @return
     *     possible object is
     *     {@link PortabilityKnowhow.CategoryList }
     *     
     */
    public PortabilityKnowhow.CategoryList getCategoryList() {
        return categoryList;
    }

    /**
     * Sets the value of the categoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilityKnowhow.CategoryList }
     *     
     */
    public void setCategoryList(PortabilityKnowhow.CategoryList value) {
        this.categoryList = value;
    }

    /**
     * Gets the value of the knowhowList property.
     * 
     * @return
     *     possible object is
     *     {@link PortabilityKnowhow.KnowhowList }
     *     
     */
    public PortabilityKnowhow.KnowhowList getKnowhowList() {
        return knowhowList;
    }

    /**
     * Sets the value of the knowhowList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilityKnowhow.KnowhowList }
     *     
     */
    public void setKnowhowList(PortabilityKnowhow.KnowhowList value) {
        this.knowhowList = value;
    }

    /**
     * Gets the value of the searchInfomationList property.
     * 
     * @return
     *     possible object is
     *     {@link PortabilityKnowhow.SearchInfomationList }
     *     
     */
    public PortabilityKnowhow.SearchInfomationList getSearchInfomationList() {
        return searchInfomationList;
    }

    /**
     * Sets the value of the searchInfomationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilityKnowhow.SearchInfomationList }
     *     
     */
    public void setSearchInfomationList(PortabilityKnowhow.SearchInfomationList value) {
        this.searchInfomationList = value;
    }


    public static class CategoryList {

        protected List<Category> categories;

        /**
         * Gets the value of the categories property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categories property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategories().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Category }
         * 
         * 
         */
        public List<Category> getCategories() {
            if (categories == null) {
                categories = new ArrayList<Category>();
            }
            return this.categories;
        }
        
        public void setCategory(Category category) {
        	getCategories().add(category);
        }

    }

    public static class ChapterList {

        protected List<Chapter> chapters;

        /**
         * Gets the value of the chapters property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chapters property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChapters().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Chapter }
         * 
         * 
         */
        public List<Chapter> getChapters() {
            if (chapters == null) {
                chapters = new ArrayList<Chapter>();
            }
            return this.chapters;
        }

        public void setChapter(Chapter chapter) {
        	getChapters().add(chapter);
        }
    }


    public static class EntryViewList {

        protected List<EntryCategory> entryCategories;

        /**
         * Gets the value of the entryCategories property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entryCategories property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntryCategories().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntryCategory }
         * 
         * 
         */
        public List<EntryCategory> getEntryCategories() {
            if (entryCategories == null) {
                entryCategories = new ArrayList<EntryCategory>();
            }
            return this.entryCategories;
        }

        public void setEntryCategory(EntryCategory entryCategory) {
        	getEntryCategories().add(entryCategory);
        }
    }

    public static class KnowhowList {

        protected List<KnowhowInfomation> knowhowInfomations;

        /**
         * Gets the value of the knowhowInfomations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the knowhowInfomations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKnowhowInfomations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KnowhowInfomation }
         * 
         * 
         */
        public List<KnowhowInfomation> getKnowhowInfomations() {
            if (knowhowInfomations == null) {
                knowhowInfomations = new ArrayList<KnowhowInfomation>();
            }
            return this.knowhowInfomations;
        }

        public void setKnowhowInfomation(KnowhowInfomation knowhowInfomation) {
        	getKnowhowInfomations().add(knowhowInfomation);
        }
    }

    public static class SearchInfomationList {

        protected List<SearchInfomation> searchInfomations;

        /**
         * Gets the value of the searchInfomations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchInfomations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchInfomations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchInfomation }
         * 
         * 
         */
        public List<SearchInfomation> getSearchInfomations() {
            if (searchInfomations == null) {
                searchInfomations = new ArrayList<SearchInfomation>();
            }
            return this.searchInfomations;
        }

        public void setSearchInfomation(SearchInfomation searchInfomation) {
        	getSearchInfomations().add(searchInfomation);
        }
    }

}
