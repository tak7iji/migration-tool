
package tubame.portability.biz.model.knowhow;

import java.util.ArrayList;
import java.util.List;

public class EntryCategory {

    protected String entryCategoryRefKey;
    protected List<ChildEntry> childEntries;

    /**
     * Gets the value of the entryCategoryRefKey property.
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
     * Sets the value of the entryCategoryRefKey property.
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
