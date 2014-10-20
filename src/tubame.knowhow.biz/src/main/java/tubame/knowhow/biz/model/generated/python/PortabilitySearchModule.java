
package tubame.knowhow.biz.model.generated.python;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchModuleList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SearchModule" type="{}SearchModule" maxOccurs="unbounded" minOccurs="0"/>
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
    "searchModuleList"
})
@XmlRootElement(name = "PortabilitySearchModule")
public class PortabilitySearchModule {

    @XmlElement(name = "SearchModuleList")
    protected PortabilitySearchModule.SearchModuleList searchModuleList;

    /**
     * searchModuleList�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link PortabilitySearchModule.SearchModuleList }
     *     
     */
    public PortabilitySearchModule.SearchModuleList getSearchModuleList() {
        return searchModuleList;
    }

    /**
     * searchModuleList�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilitySearchModule.SearchModuleList }
     *     
     */
    public void setSearchModuleList(PortabilitySearchModule.SearchModuleList value) {
        this.searchModuleList = value;
    }


    /**
     * <p>anonymous complex type��Java�N���X�B
     * 
     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SearchModule" type="{}SearchModule" maxOccurs="unbounded" minOccurs="0"/>
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
        "searchModule"
    })
    public static class SearchModuleList {

        @XmlElement(name = "SearchModule")
        protected List<SearchModule> searchModule;

        /**
         * Gets the value of the searchModule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchModule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchModule }
         * 
         * 
         */
        public List<SearchModule> getSearchModule() {
            if (searchModule == null) {
                searchModule = new ArrayList<SearchModule>();
            }
            return this.searchModule;
        }

    }

}
