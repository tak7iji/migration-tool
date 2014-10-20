
package tubame.knowhow.biz.model.generated.knowhow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortabilityKnowhowTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EntryViewList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EntryCategory" type="{http://generated.model.biz.knowhow.tubame/knowhow}EntryCategory" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ChapterList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Chapter" type="{http://generated.model.biz.knowhow.tubame/knowhow}Chapter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CategoryList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Category" type="{http://generated.model.biz.knowhow.tubame/knowhow}Category" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="KnowhowList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KnowhowInfomation" type="{http://generated.model.biz.knowhow.tubame/knowhow}KnowhowInfomation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DocBookList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DocBook" type="{http://generated.model.biz.knowhow.tubame/knowhow}DocBook" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SearchInfomationList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SearchInfomation" type="{http://generated.model.biz.knowhow.tubame/knowhow}SearchInfomation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "portabilityKnowhowTitle",
    "entryViewList",
    "chapterList",
    "categoryList",
    "knowhowList",
    "docBookList",
    "searchInfomationList"
})
@XmlRootElement(name = "PortabilityKnowhow")
public class PortabilityKnowhow {

    @XmlElement(name = "PortabilityKnowhowTitle", required = true)
    protected String portabilityKnowhowTitle;
    @XmlElement(name = "EntryViewList", required = true)
    protected PortabilityKnowhow.EntryViewList entryViewList;
    @XmlElement(name = "ChapterList", required = true)
    protected PortabilityKnowhow.ChapterList chapterList;
    @XmlElement(name = "CategoryList", required = true)
    protected PortabilityKnowhow.CategoryList categoryList;
    @XmlElement(name = "KnowhowList", required = true)
    protected PortabilityKnowhow.KnowhowList knowhowList;
    @XmlElement(name = "DocBookList", required = true)
    protected PortabilityKnowhow.DocBookList docBookList;
    @XmlElement(name = "SearchInfomationList", required = true)
    protected PortabilityKnowhow.SearchInfomationList searchInfomationList;

    /**
     * portabilityKnowhowTitleプロパティの値を取得します。
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
     * portabilityKnowhowTitleプロパティの値を設定します。
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
     * entryViewListプロパティの値を取得します。
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
     * entryViewListプロパティの値を設定します。
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
     * chapterListプロパティの値を取得します。
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
     * chapterListプロパティの値を設定します。
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
     * categoryListプロパティの値を取得します。
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
     * categoryListプロパティの値を設定します。
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
     * knowhowListプロパティの値を取得します。
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
     * knowhowListプロパティの値を設定します。
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
     * docBookListプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PortabilityKnowhow.DocBookList }
     *     
     */
    public PortabilityKnowhow.DocBookList getDocBookList() {
        return docBookList;
    }

    /**
     * docBookListプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilityKnowhow.DocBookList }
     *     
     */
    public void setDocBookList(PortabilityKnowhow.DocBookList value) {
        this.docBookList = value;
    }

    /**
     * searchInfomationListプロパティの値を取得します。
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
     * searchInfomationListプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilityKnowhow.SearchInfomationList }
     *     
     */
    public void setSearchInfomationList(PortabilityKnowhow.SearchInfomationList value) {
        this.searchInfomationList = value;
    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Category" type="{http://generated.model.biz.knowhow.tubame/knowhow}Category" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "categories"
    })
    public static class CategoryList {

        @XmlElement(name = "Category")
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

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Chapter" type="{http://generated.model.biz.knowhow.tubame/knowhow}Chapter" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chapters"
    })
    public static class ChapterList {

        @XmlElement(name = "Chapter")
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

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DocBook" type="{http://generated.model.biz.knowhow.tubame/knowhow}DocBook" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "docBooks"
    })
    public static class DocBookList {

        @XmlElement(name = "DocBook")
        protected List<DocBook> docBooks;

        /**
         * Gets the value of the docBooks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docBooks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocBooks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocBook }
         * 
         * 
         */
        public List<DocBook> getDocBooks() {
            if (docBooks == null) {
                docBooks = new ArrayList<DocBook>();
            }
            return this.docBooks;
        }

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EntryCategory" type="{http://generated.model.biz.knowhow.tubame/knowhow}EntryCategory" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entryCategories"
    })
    public static class EntryViewList {

        @XmlElement(name = "EntryCategory")
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

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="KnowhowInfomation" type="{http://generated.model.biz.knowhow.tubame/knowhow}KnowhowInfomation" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "knowhowInfomations"
    })
    public static class KnowhowList {

        @XmlElement(name = "KnowhowInfomation")
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

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SearchInfomation" type="{http://generated.model.biz.knowhow.tubame/knowhow}SearchInfomation" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "searchInfomations"
    })
    public static class SearchInfomationList {

        @XmlElement(name = "SearchInfomation")
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

    }

}
