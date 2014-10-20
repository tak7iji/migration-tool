
package tubame.knowhow.biz.model.generated.knowhow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Appropriate complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="Appropriate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppropriateContents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lineNumberAppropriate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appropriate", propOrder = {
    "appropriateContents"
})
public class Appropriate {

    @XmlElement(name = "AppropriateContents", required = true)
    protected String appropriateContents;
    @XmlAttribute(name = "lineNumberAppropriate", required = true)
    protected boolean lineNumberAppropriate;

    /**
     * appropriateContentsプロパティの値を取得します。
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
     * appropriateContentsプロパティの値を設定します。
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
     * lineNumberAppropriateプロパティの値を取得します。
     * 
     */
    public boolean isLineNumberAppropriate() {
        return lineNumberAppropriate;
    }

    /**
     * lineNumberAppropriateプロパティの値を設定します。
     * 
     */
    public void setLineNumberAppropriate(boolean value) {
        this.lineNumberAppropriate = value;
    }

}
