
package tubame.knowhow.biz.model.generated.knowhow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LineNumberInfomation complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="LineNumberInfomation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LineNumberContents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Investigation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineNumberInfomation", propOrder = {
    "lineNumber",
    "lineNumberContents",
    "investigation"
})
public class LineNumberInfomation {

    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "LineNumberContents", required = true)
    protected String lineNumberContents;
    @XmlElement(name = "Investigation", required = true)
    protected String investigation;

    /**
     * lineNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * lineNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * lineNumberContentsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumberContents() {
        return lineNumberContents;
    }

    /**
     * lineNumberContentsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumberContents(String value) {
        this.lineNumberContents = value;
    }

    /**
     * investigationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestigation() {
        return investigation;
    }

    /**
     * investigationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestigation(String value) {
        this.investigation = value;
    }

}
