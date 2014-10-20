
package org.docbook.ns.docbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;sequence>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://docbook.org/ns/docbook}title"/>
 *             &lt;element ref="{http://docbook.org/ns/docbook}titleabbrev"/>
 *             &lt;element ref="{http://docbook.org/ns/docbook}subtitle"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://docbook.org/ns/docbook}info" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://docbook.org/ns/docbook}itemizedlist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}orderedlist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}procedure"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}simplelist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}variablelist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}segmentedlist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}glosslist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliolist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}calloutlist"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}qandaset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}example"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}figure"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}table"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}equation"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}informalexample"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}informalfigure"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}informaltable"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}informalequation"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}sidebar"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}blockquote"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}address"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}epigraph"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}mediaobject"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}screenshot"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}task"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}productionset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}constraintdef"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}msgset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}screen"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}literallayout"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}programlistingco"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}screenco"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}programlisting"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}synopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bridgehead"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}remark"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}revhistory"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}indexterm"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}funcsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}classsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}methodsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}constructorsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}destructorsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}fieldsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}cmdsynopsis"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}caution"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}important"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}note"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}tip"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}warning"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}anchor"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}para"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}formalpara"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}simpara"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}annotation"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.linking.attributes"/>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "titlesAndTitleabbrevsAndSubtitles",
    "info",
    "itemizedlistsAndOrderedlistsAndProcedures"
})
@XmlRootElement(name = "colophon")
public class Colophon {

    @XmlElements({
        @XmlElement(name = "title", type = Title.class),
        @XmlElement(name = "titleabbrev", type = Titleabbrev.class),
        @XmlElement(name = "subtitle", type = Subtitle.class)
    })
    protected List<Object> titlesAndTitleabbrevsAndSubtitles;
    protected Info info;
    @XmlElements({
        @XmlElement(name = "itemizedlist", type = Itemizedlist.class),
        @XmlElement(name = "orderedlist", type = Orderedlist.class),
        @XmlElement(name = "procedure", type = Procedure.class),
        @XmlElement(name = "simplelist", type = Simplelist.class),
        @XmlElement(name = "variablelist", type = Variablelist.class),
        @XmlElement(name = "segmentedlist", type = Segmentedlist.class),
        @XmlElement(name = "glosslist", type = Glosslist.class),
        @XmlElement(name = "bibliolist", type = Bibliolist.class),
        @XmlElement(name = "calloutlist", type = Calloutlist.class),
        @XmlElement(name = "qandaset", type = Qandaset.class),
        @XmlElement(name = "example", type = Example.class),
        @XmlElement(name = "figure", type = Figure.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "equation", type = Equation.class),
        @XmlElement(name = "informalexample", type = Informalexample.class),
        @XmlElement(name = "informalfigure", type = Informalfigure.class),
        @XmlElement(name = "informaltable", type = Informaltable.class),
        @XmlElement(name = "informalequation", type = Informalequation.class),
        @XmlElement(name = "sidebar", type = Sidebar.class),
        @XmlElement(name = "blockquote", type = Blockquote.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "epigraph", type = Epigraph.class),
        @XmlElement(name = "mediaobject", type = Mediaobject.class),
        @XmlElement(name = "screenshot", type = Screenshot.class),
        @XmlElement(name = "task", type = Task.class),
        @XmlElement(name = "productionset", type = Productionset.class),
        @XmlElement(name = "constraintdef", type = Constraintdef.class),
        @XmlElement(name = "msgset", type = Msgset.class),
        @XmlElement(name = "screen", type = Screen.class),
        @XmlElement(name = "literallayout", type = Literallayout.class),
        @XmlElement(name = "programlistingco", type = Programlistingco.class),
        @XmlElement(name = "screenco", type = Screenco.class),
        @XmlElement(name = "programlisting", type = Programlisting.class),
        @XmlElement(name = "synopsis", type = Synopsis.class),
        @XmlElement(name = "bridgehead", type = Bridgehead.class),
        @XmlElement(name = "remark", type = Remark.class),
        @XmlElement(name = "revhistory", type = Revhistory.class),
        @XmlElement(name = "indexterm", type = Indexterm.class),
        @XmlElement(name = "funcsynopsis", type = Funcsynopsis.class),
        @XmlElement(name = "classsynopsis", type = Classsynopsis.class),
        @XmlElement(name = "methodsynopsis", type = Methodsynopsis.class),
        @XmlElement(name = "constructorsynopsis", type = Constructorsynopsis.class),
        @XmlElement(name = "destructorsynopsis", type = Destructorsynopsis.class),
        @XmlElement(name = "fieldsynopsis", type = Fieldsynopsis.class),
        @XmlElement(name = "cmdsynopsis", type = Cmdsynopsis.class),
        @XmlElement(name = "caution", type = Caution.class),
        @XmlElement(name = "important", type = Important.class),
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "tip", type = Tip.class),
        @XmlElement(name = "warning", type = Warning.class),
        @XmlElement(name = "anchor", type = Anchor.class),
        @XmlElement(name = "para", type = Para.class),
        @XmlElement(name = "formalpara", type = Formalpara.class),
        @XmlElement(name = "simpara", type = Simpara.class),
        @XmlElement(name = "annotation", type = Annotation.class)
    })
    protected List<Object> itemizedlistsAndOrderedlistsAndProcedures;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "label")
    @XmlSchemaType(name = "anySimpleType")
    protected String label;
    @XmlAttribute(name = "status")
    @XmlSchemaType(name = "anySimpleType")
    protected String status;
    @XmlAttribute(name = "linkend")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkend;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version")
    @XmlSchemaType(name = "anySimpleType")
    protected String commonVersion;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String xmlLang;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String base;
    @XmlAttribute(name = "remap")
    @XmlSchemaType(name = "anySimpleType")
    protected String remap;
    @XmlAttribute(name = "xreflabel")
    @XmlSchemaType(name = "anySimpleType")
    protected String xreflabel;
    @XmlAttribute(name = "revisionflag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String revisionflag;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "arch")
    @XmlSchemaType(name = "anySimpleType")
    protected String arch;
    @XmlAttribute(name = "audience")
    @XmlSchemaType(name = "anySimpleType")
    protected String audience;
    @XmlAttribute(name = "condition")
    @XmlSchemaType(name = "anySimpleType")
    protected String condition;
    @XmlAttribute(name = "conformance")
    @XmlSchemaType(name = "anySimpleType")
    protected String conformance;
    @XmlAttribute(name = "os")
    @XmlSchemaType(name = "anySimpleType")
    protected String os;
    @XmlAttribute(name = "revision")
    @XmlSchemaType(name = "anySimpleType")
    protected String commonRevision;
    @XmlAttribute(name = "security")
    @XmlSchemaType(name = "anySimpleType")
    protected String security;
    @XmlAttribute(name = "userlevel")
    @XmlSchemaType(name = "anySimpleType")
    protected String userlevel;
    @XmlAttribute(name = "vendor")
    @XmlSchemaType(name = "anySimpleType")
    protected String vendor;
    @XmlAttribute(name = "wordsize")
    @XmlSchemaType(name = "anySimpleType")
    protected String wordsize;
    @XmlAttribute(name = "annotations")
    @XmlSchemaType(name = "anySimpleType")
    protected String annotations;

    /**
     * Gets the value of the titlesAndTitleabbrevsAndSubtitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titlesAndTitleabbrevsAndSubtitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitlesAndTitleabbrevsAndSubtitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * {@link Titleabbrev }
     * {@link Subtitle }
     * 
     * 
     */
    public List<Object> getTitlesAndTitleabbrevsAndSubtitles() {
        if (titlesAndTitleabbrevsAndSubtitles == null) {
            titlesAndTitleabbrevsAndSubtitles = new ArrayList<Object>();
        }
        return this.titlesAndTitleabbrevsAndSubtitles;
    }

    /**
     * infoプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * infoプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the itemizedlistsAndOrderedlistsAndProcedures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedlistsAndOrderedlistsAndProcedures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedlistsAndOrderedlistsAndProcedures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itemizedlist }
     * {@link Orderedlist }
     * {@link Procedure }
     * {@link Simplelist }
     * {@link Variablelist }
     * {@link Segmentedlist }
     * {@link Glosslist }
     * {@link Bibliolist }
     * {@link Calloutlist }
     * {@link Qandaset }
     * {@link Example }
     * {@link Figure }
     * {@link Table }
     * {@link Equation }
     * {@link Informalexample }
     * {@link Informalfigure }
     * {@link Informaltable }
     * {@link Informalequation }
     * {@link Sidebar }
     * {@link Blockquote }
     * {@link Address }
     * {@link Epigraph }
     * {@link Mediaobject }
     * {@link Screenshot }
     * {@link Task }
     * {@link Productionset }
     * {@link Constraintdef }
     * {@link Msgset }
     * {@link Screen }
     * {@link Literallayout }
     * {@link Programlistingco }
     * {@link Screenco }
     * {@link Programlisting }
     * {@link Synopsis }
     * {@link Bridgehead }
     * {@link Remark }
     * {@link Revhistory }
     * {@link Indexterm }
     * {@link Funcsynopsis }
     * {@link Classsynopsis }
     * {@link Methodsynopsis }
     * {@link Constructorsynopsis }
     * {@link Destructorsynopsis }
     * {@link Fieldsynopsis }
     * {@link Cmdsynopsis }
     * {@link Caution }
     * {@link Important }
     * {@link Note }
     * {@link Tip }
     * {@link Warning }
     * {@link Anchor }
     * {@link Para }
     * {@link Formalpara }
     * {@link Simpara }
     * {@link Annotation }
     * 
     * 
     */
    public List<Object> getItemizedlistsAndOrderedlistsAndProcedures() {
        if (itemizedlistsAndOrderedlistsAndProcedures == null) {
            itemizedlistsAndOrderedlistsAndProcedures = new ArrayList<Object>();
        }
        return this.itemizedlistsAndOrderedlistsAndProcedures;
    }

    /**
     * roleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * roleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * labelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * labelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * statusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * statusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * linkendプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLinkend() {
        return linkend;
    }

    /**
     * linkendプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkend(Object value) {
        this.linkend = value;
    }

    /**
     * idプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * idプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * commonVersionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonVersion() {
        return commonVersion;
    }

    /**
     * commonVersionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonVersion(String value) {
        this.commonVersion = value;
    }

    /**
     * xmlLangプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * xmlLangプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * baseプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * baseプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * remapプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemap() {
        return remap;
    }

    /**
     * remapプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemap(String value) {
        this.remap = value;
    }

    /**
     * xreflabelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXreflabel() {
        return xreflabel;
    }

    /**
     * xreflabelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXreflabel(String value) {
        this.xreflabel = value;
    }

    /**
     * revisionflagプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionflag() {
        return revisionflag;
    }

    /**
     * revisionflagプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionflag(String value) {
        this.revisionflag = value;
    }

    /**
     * dirプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * dirプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * archプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArch() {
        return arch;
    }

    /**
     * archプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArch(String value) {
        this.arch = value;
    }

    /**
     * audienceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * audienceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

    /**
     * conditionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * conditionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * conformanceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformance() {
        return conformance;
    }

    /**
     * conformanceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformance(String value) {
        this.conformance = value;
    }

    /**
     * osプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * osプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * commonRevisionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonRevision() {
        return commonRevision;
    }

    /**
     * commonRevisionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonRevision(String value) {
        this.commonRevision = value;
    }

    /**
     * securityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * securityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * userlevelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserlevel() {
        return userlevel;
    }

    /**
     * userlevelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserlevel(String value) {
        this.userlevel = value;
    }

    /**
     * vendorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * vendorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * wordsizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordsize() {
        return wordsize;
    }

    /**
     * wordsizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordsize(String value) {
        this.wordsize = value;
    }

    /**
     * annotationsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotations() {
        return annotations;
    }

    /**
     * annotationsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotations(String value) {
        this.annotations = value;
    }

}
