
package tubame.knowhow.biz.model.generated.knowhow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Appropriate complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
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
     * appropriateContents�v���p�e�B�̒l���擾���܂��B
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
     * appropriateContents�v���p�e�B�̒l��ݒ肵�܂��B
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
     * lineNumberAppropriate�v���p�e�B�̒l���擾���܂��B
     * 
     */
    public boolean isLineNumberAppropriate() {
        return lineNumberAppropriate;
    }

    /**
     * lineNumberAppropriate�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     */
    public void setLineNumberAppropriate(boolean value) {
        this.lineNumberAppropriate = value;
    }

}
