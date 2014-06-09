
package tubame.portability.biz.model.knowhow;

import java.util.ArrayList;
import java.util.List;

public class Category {

    protected String categoryName;
    protected List<String> knowhowRefKeies;
    protected String categoryId;
    protected boolean appropriate;

    /**
     * Gets the value of the categoryName property.
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
     * Sets the value of the categoryName property.
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
    
    public void setKnowhowRefKey(String refKey) {
    	getKnowhowRefKeies().add(refKey);
    }

    /**
     * Gets the value of the categoryId property.
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
     * Sets the value of the categoryId property.
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
     * Gets the value of the appropriate property.
     * 
     */
    public boolean isAppropriate() {
        return appropriate;
    }

    /**
     * Sets the value of the appropriate property.
     * 
     */
    public void setAppropriate(boolean value) {
        this.appropriate = value;
    }
}
