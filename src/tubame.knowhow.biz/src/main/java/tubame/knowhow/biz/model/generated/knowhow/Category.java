
package tubame.knowhow.biz.model.generated.knowhow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Category complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="Category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KnowhowRefKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="categoryId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appropriate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
    "categoryName",
    "knowhowRefKeies"
})
public class Category {

    @XmlElement(name = "CategoryName", required = true)
    protected String categoryName;
    @XmlElement(name = "KnowhowRefKey")
    protected List<String> knowhowRefKeies;
    @XmlAttribute(name = "categoryId", required = true)
    protected String categoryId;
    @XmlAttribute(name = "appropriate", required = true)
    protected boolean appropriate;

    /**
     * categoryName�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * categoryName�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the knowhowRefKeies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knowhowRefKeies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnowhowRefKeies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKnowhowRefKeies() {
        if (knowhowRefKeies == null) {
            knowhowRefKeies = new ArrayList<String>();
        }
        return this.knowhowRefKeies;
    }

    /**
     * categoryId�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * categoryId�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

    /**
     * appropriate�v���p�e�B�̒l���擾���܂��B
     * 
     */
    public boolean isAppropriate() {
        return appropriate;
    }

    /**
     * appropriate�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     */
    public void setAppropriate(boolean value) {
        this.appropriate = value;
    }

}
