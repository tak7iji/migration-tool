
package tubame.portability.biz.model.knowhow;

public class Appropriate {

    protected String appropriateContents;
    protected boolean lineNumberAppropriate;

    /**
     * Gets the value of the appropriateContents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppropriateContents() {
        return appropriateContents;
    }

    /**
     * Sets the value of the appropriateContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppropriateContents(String value) {
        this.appropriateContents = value;
    }

    /**
     * Gets the value of the lineNumberAppropriate property.
     * 
     */
    public boolean isLineNumberAppropriate() {
        return lineNumberAppropriate;
    }

    /**
     * Sets the value of the lineNumberAppropriate property.
     * 
     */
    public void setLineNumberAppropriate(boolean value) {
        this.lineNumberAppropriate = value;
    }

}
