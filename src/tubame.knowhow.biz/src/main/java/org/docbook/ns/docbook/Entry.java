
package org.docbook.ns.docbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://docbook.org/ns/docbook}inlinemediaobject"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}remark"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}superscript"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}subscript"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}xref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}link"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}olink"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}anchor"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}biblioref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}alt"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}annotation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}indexterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}abbrev"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}acronym"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}date"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}emphasis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}footnote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}footnoteref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}foreignphrase"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}phrase"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}quote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}wordasword"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}firstterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}glossterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}coref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}trademark"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productnumber"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}database"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}application"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}hardware"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citerefentry"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citetitle"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citebiblioid"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}author"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}person"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}personname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}org"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}orgname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}editor"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}jobtitle"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}replaceable"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}package"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}parameter"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}termdef"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}nonterminal"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}systemitem"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}option"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}optional"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}property"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}inlineequation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}tag"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}markup"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}token"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}symbol"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}literal"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}code"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}constant"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}email"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}uri"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guiicon"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guibutton"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guimenuitem"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guimenu"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guisubmenu"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}guilabel"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}menuchoice"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}mousebutton"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keycombo"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keycap"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keycode"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keysym"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}shortcut"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}accel"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}prompt"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}envar"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}filename"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}command"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}computeroutput"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}userinput"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}function"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}varname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}returnvalue"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}type"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}classname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}exceptionname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}interfacename"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}methodname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}modifier"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}initializer"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}ooclass"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}ooexception"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}oointerface"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}errorcode"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}errortext"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}errorname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}errortype"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}itemizedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}orderedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}procedure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}simplelist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}variablelist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}segmentedlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}glosslist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bibliolist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}calloutlist"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}qandaset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}example"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}figure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}table"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}equation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalexample"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalfigure"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informaltable"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}informalequation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}sidebar"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}blockquote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}address"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}epigraph"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}mediaobject"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screenshot"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}task"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productionset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}constraintdef"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}msgset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screen"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}literallayout"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}programlistingco"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}screenco"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}programlisting"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}synopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bridgehead"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}revhistory"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}funcsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}classsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}methodsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}constructorsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}destructorsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}fieldsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}cmdsynopsis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}caution"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}important"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}note"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}tip"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}warning"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}para"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}formalpara"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}simpara"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.linking.attributes"/>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="valign">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="bottom"/>
 *             &lt;enumeration value="middle"/>
 *             &lt;enumeration value="top"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="char" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="colsep">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="charoff" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="morerows" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="colname" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="namest" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="spanname" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="nameend" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="rowsep">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rotate">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="align">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="char"/>
 *             &lt;enumeration value="justify"/>
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "entry")
public class Entry {

    @XmlElementRefs({
        @XmlElementRef(name = "command", namespace = "http://docbook.org/ns/docbook", type = Command.class, required = false),
        @XmlElementRef(name = "token", namespace = "http://docbook.org/ns/docbook", type = Token.class, required = false),
        @XmlElementRef(name = "epigraph", namespace = "http://docbook.org/ns/docbook", type = Epigraph.class, required = false),
        @XmlElementRef(name = "footnoteref", namespace = "http://docbook.org/ns/docbook", type = Footnoteref.class, required = false),
        @XmlElementRef(name = "firstterm", namespace = "http://docbook.org/ns/docbook", type = Firstterm.class, required = false),
        @XmlElementRef(name = "productionset", namespace = "http://docbook.org/ns/docbook", type = Productionset.class, required = false),
        @XmlElementRef(name = "editor", namespace = "http://docbook.org/ns/docbook", type = Editor.class, required = false),
        @XmlElementRef(name = "xref", namespace = "http://docbook.org/ns/docbook", type = Xref.class, required = false),
        @XmlElementRef(name = "calloutlist", namespace = "http://docbook.org/ns/docbook", type = Calloutlist.class, required = false),
        @XmlElementRef(name = "note", namespace = "http://docbook.org/ns/docbook", type = Note.class, required = false),
        @XmlElementRef(name = "returnvalue", namespace = "http://docbook.org/ns/docbook", type = Returnvalue.class, required = false),
        @XmlElementRef(name = "userinput", namespace = "http://docbook.org/ns/docbook", type = Userinput.class, required = false),
        @XmlElementRef(name = "informalexample", namespace = "http://docbook.org/ns/docbook", type = Informalexample.class, required = false),
        @XmlElementRef(name = "revhistory", namespace = "http://docbook.org/ns/docbook", type = Revhistory.class, required = false),
        @XmlElementRef(name = "inlinemediaobject", namespace = "http://docbook.org/ns/docbook", type = Inlinemediaobject.class, required = false),
        @XmlElementRef(name = "methodsynopsis", namespace = "http://docbook.org/ns/docbook", type = Methodsynopsis.class, required = false),
        @XmlElementRef(name = "package", namespace = "http://docbook.org/ns/docbook", type = Package.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://docbook.org/ns/docbook", type = Acronym.class, required = false),
        @XmlElementRef(name = "fieldsynopsis", namespace = "http://docbook.org/ns/docbook", type = Fieldsynopsis.class, required = false),
        @XmlElementRef(name = "screenco", namespace = "http://docbook.org/ns/docbook", type = Screenco.class, required = false),
        @XmlElementRef(name = "type", namespace = "http://docbook.org/ns/docbook", type = Type.class, required = false),
        @XmlElementRef(name = "option", namespace = "http://docbook.org/ns/docbook", type = Option.class, required = false),
        @XmlElementRef(name = "keycombo", namespace = "http://docbook.org/ns/docbook", type = Keycombo.class, required = false),
        @XmlElementRef(name = "guiicon", namespace = "http://docbook.org/ns/docbook", type = Guiicon.class, required = false),
        @XmlElementRef(name = "envar", namespace = "http://docbook.org/ns/docbook", type = Envar.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://docbook.org/ns/docbook", type = Remark.class, required = false),
        @XmlElementRef(name = "symbol", namespace = "http://docbook.org/ns/docbook", type = Symbol.class, required = false),
        @XmlElementRef(name = "keysym", namespace = "http://docbook.org/ns/docbook", type = Keysym.class, required = false),
        @XmlElementRef(name = "guilabel", namespace = "http://docbook.org/ns/docbook", type = Guilabel.class, required = false),
        @XmlElementRef(name = "funcsynopsis", namespace = "http://docbook.org/ns/docbook", type = Funcsynopsis.class, required = false),
        @XmlElementRef(name = "simpara", namespace = "http://docbook.org/ns/docbook", type = Simpara.class, required = false),
        @XmlElementRef(name = "modifier", namespace = "http://docbook.org/ns/docbook", type = Modifier.class, required = false),
        @XmlElementRef(name = "biblioref", namespace = "http://docbook.org/ns/docbook", type = Biblioref.class, required = false),
        @XmlElementRef(name = "mousebutton", namespace = "http://docbook.org/ns/docbook", type = Mousebutton.class, required = false),
        @XmlElementRef(name = "footnote", namespace = "http://docbook.org/ns/docbook", type = Footnote.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://docbook.org/ns/docbook", type = Address.class, required = false),
        @XmlElementRef(name = "interfacename", namespace = "http://docbook.org/ns/docbook", type = Interfacename.class, required = false),
        @XmlElementRef(name = "phrase", namespace = "http://docbook.org/ns/docbook", type = Phrase.class, required = false),
        @XmlElementRef(name = "programlistingco", namespace = "http://docbook.org/ns/docbook", type = Programlistingco.class, required = false),
        @XmlElementRef(name = "abbrev", namespace = "http://docbook.org/ns/docbook", type = Abbrev.class, required = false),
        @XmlElementRef(name = "errortype", namespace = "http://docbook.org/ns/docbook", type = Errortype.class, required = false),
        @XmlElementRef(name = "ooexception", namespace = "http://docbook.org/ns/docbook", type = Ooexception.class, required = false),
        @XmlElementRef(name = "jobtitle", namespace = "http://docbook.org/ns/docbook", type = Jobtitle.class, required = false),
        @XmlElementRef(name = "synopsis", namespace = "http://docbook.org/ns/docbook", type = Synopsis.class, required = false),
        @XmlElementRef(name = "cmdsynopsis", namespace = "http://docbook.org/ns/docbook", type = Cmdsynopsis.class, required = false),
        @XmlElementRef(name = "org", namespace = "http://docbook.org/ns/docbook", type = Org.class, required = false),
        @XmlElementRef(name = "tag", namespace = "http://docbook.org/ns/docbook", type = Tag.class, required = false),
        @XmlElementRef(name = "guimenuitem", namespace = "http://docbook.org/ns/docbook", type = Guimenuitem.class, required = false),
        @XmlElementRef(name = "constructorsynopsis", namespace = "http://docbook.org/ns/docbook", type = Constructorsynopsis.class, required = false),
        @XmlElementRef(name = "classname", namespace = "http://docbook.org/ns/docbook", type = Classname.class, required = false),
        @XmlElementRef(name = "methodname", namespace = "http://docbook.org/ns/docbook", type = Methodname.class, required = false),
        @XmlElementRef(name = "errortext", namespace = "http://docbook.org/ns/docbook", type = Errortext.class, required = false),
        @XmlElementRef(name = "menuchoice", namespace = "http://docbook.org/ns/docbook", type = Menuchoice.class, required = false),
        @XmlElementRef(name = "screenshot", namespace = "http://docbook.org/ns/docbook", type = Screenshot.class, required = false),
        @XmlElementRef(name = "sidebar", namespace = "http://docbook.org/ns/docbook", type = Sidebar.class, required = false),
        @XmlElementRef(name = "alt", namespace = "http://docbook.org/ns/docbook", type = Alt.class, required = false),
        @XmlElementRef(name = "personname", namespace = "http://docbook.org/ns/docbook", type = Personname.class, required = false),
        @XmlElementRef(name = "anchor", namespace = "http://docbook.org/ns/docbook", type = Anchor.class, required = false),
        @XmlElementRef(name = "olink", namespace = "http://docbook.org/ns/docbook", type = Olink.class, required = false),
        @XmlElementRef(name = "email", namespace = "http://docbook.org/ns/docbook", type = Email.class, required = false),
        @XmlElementRef(name = "screen", namespace = "http://docbook.org/ns/docbook", type = Screen.class, required = false),
        @XmlElementRef(name = "trademark", namespace = "http://docbook.org/ns/docbook", type = Trademark.class, required = false),
        @XmlElementRef(name = "database", namespace = "http://docbook.org/ns/docbook", type = Database.class, required = false),
        @XmlElementRef(name = "qandaset", namespace = "http://docbook.org/ns/docbook", type = Qandaset.class, required = false),
        @XmlElementRef(name = "bridgehead", namespace = "http://docbook.org/ns/docbook", type = Bridgehead.class, required = false),
        @XmlElementRef(name = "variablelist", namespace = "http://docbook.org/ns/docbook", type = Variablelist.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://docbook.org/ns/docbook", type = Date.class, required = false),
        @XmlElementRef(name = "accel", namespace = "http://docbook.org/ns/docbook", type = Accel.class, required = false),
        @XmlElementRef(name = "subscript", namespace = "http://docbook.org/ns/docbook", type = Subscript.class, required = false),
        @XmlElementRef(name = "example", namespace = "http://docbook.org/ns/docbook", type = Example.class, required = false),
        @XmlElementRef(name = "markup", namespace = "http://docbook.org/ns/docbook", type = Markup.class, required = false),
        @XmlElementRef(name = "productname", namespace = "http://docbook.org/ns/docbook", type = Productname.class, required = false),
        @XmlElementRef(name = "equation", namespace = "http://docbook.org/ns/docbook", type = Equation.class, required = false),
        @XmlElementRef(name = "msgset", namespace = "http://docbook.org/ns/docbook", type = Msgset.class, required = false),
        @XmlElementRef(name = "literal", namespace = "http://docbook.org/ns/docbook", type = Literal.class, required = false),
        @XmlElementRef(name = "emphasis", namespace = "http://docbook.org/ns/docbook", type = Emphasis.class, required = false),
        @XmlElementRef(name = "ooclass", namespace = "http://docbook.org/ns/docbook", type = Ooclass.class, required = false),
        @XmlElementRef(name = "errorcode", namespace = "http://docbook.org/ns/docbook", type = Errorcode.class, required = false),
        @XmlElementRef(name = "wordasword", namespace = "http://docbook.org/ns/docbook", type = Wordasword.class, required = false),
        @XmlElementRef(name = "systemitem", namespace = "http://docbook.org/ns/docbook", type = Systemitem.class, required = false),
        @XmlElementRef(name = "oointerface", namespace = "http://docbook.org/ns/docbook", type = Oointerface.class, required = false),
        @XmlElementRef(name = "author", namespace = "http://docbook.org/ns/docbook", type = Author.class, required = false),
        @XmlElementRef(name = "citerefentry", namespace = "http://docbook.org/ns/docbook", type = Citerefentry.class, required = false),
        @XmlElementRef(name = "filename", namespace = "http://docbook.org/ns/docbook", type = Filename.class, required = false),
        @XmlElementRef(name = "exceptionname", namespace = "http://docbook.org/ns/docbook", type = Exceptionname.class, required = false),
        @XmlElementRef(name = "varname", namespace = "http://docbook.org/ns/docbook", type = Varname.class, required = false),
        @XmlElementRef(name = "procedure", namespace = "http://docbook.org/ns/docbook", type = Procedure.class, required = false),
        @XmlElementRef(name = "keycap", namespace = "http://docbook.org/ns/docbook", type = Keycap.class, required = false),
        @XmlElementRef(name = "informalfigure", namespace = "http://docbook.org/ns/docbook", type = Informalfigure.class, required = false),
        @XmlElementRef(name = "nonterminal", namespace = "http://docbook.org/ns/docbook", type = Nonterminal.class, required = false),
        @XmlElementRef(name = "guibutton", namespace = "http://docbook.org/ns/docbook", type = Guibutton.class, required = false),
        @XmlElementRef(name = "warning", namespace = "http://docbook.org/ns/docbook", type = Warning.class, required = false),
        @XmlElementRef(name = "citetitle", namespace = "http://docbook.org/ns/docbook", type = Citetitle.class, required = false),
        @XmlElementRef(name = "citebiblioid", namespace = "http://docbook.org/ns/docbook", type = Citebiblioid.class, required = false),
        @XmlElementRef(name = "itemizedlist", namespace = "http://docbook.org/ns/docbook", type = Itemizedlist.class, required = false),
        @XmlElementRef(name = "initializer", namespace = "http://docbook.org/ns/docbook", type = Initializer.class, required = false),
        @XmlElementRef(name = "informaltable", namespace = "http://docbook.org/ns/docbook", type = Informaltable.class, required = false),
        @XmlElementRef(name = "glosslist", namespace = "http://docbook.org/ns/docbook", type = Glosslist.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://docbook.org/ns/docbook", type = Person.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://docbook.org/ns/docbook", type = Blockquote.class, required = false),
        @XmlElementRef(name = "task", namespace = "http://docbook.org/ns/docbook", type = Task.class, required = false),
        @XmlElementRef(name = "replaceable", namespace = "http://docbook.org/ns/docbook", type = Replaceable.class, required = false),
        @XmlElementRef(name = "informalequation", namespace = "http://docbook.org/ns/docbook", type = Informalequation.class, required = false),
        @XmlElementRef(name = "productnumber", namespace = "http://docbook.org/ns/docbook", type = Productnumber.class, required = false),
        @XmlElementRef(name = "orgname", namespace = "http://docbook.org/ns/docbook", type = Orgname.class, required = false),
        @XmlElementRef(name = "property", namespace = "http://docbook.org/ns/docbook", type = Property.class, required = false),
        @XmlElementRef(name = "computeroutput", namespace = "http://docbook.org/ns/docbook", type = Computeroutput.class, required = false),
        @XmlElementRef(name = "indexterm", namespace = "http://docbook.org/ns/docbook", type = Indexterm.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://docbook.org/ns/docbook", type = Table.class, required = false),
        @XmlElementRef(name = "application", namespace = "http://docbook.org/ns/docbook", type = Application.class, required = false),
        @XmlElementRef(name = "guisubmenu", namespace = "http://docbook.org/ns/docbook", type = Guisubmenu.class, required = false),
        @XmlElementRef(name = "keycode", namespace = "http://docbook.org/ns/docbook", type = Keycode.class, required = false),
        @XmlElementRef(name = "caution", namespace = "http://docbook.org/ns/docbook", type = Caution.class, required = false),
        @XmlElementRef(name = "inlineequation", namespace = "http://docbook.org/ns/docbook", type = Inlineequation.class, required = false),
        @XmlElementRef(name = "parameter", namespace = "http://docbook.org/ns/docbook", type = Parameter.class, required = false),
        @XmlElementRef(name = "bibliolist", namespace = "http://docbook.org/ns/docbook", type = Bibliolist.class, required = false),
        @XmlElementRef(name = "citation", namespace = "http://docbook.org/ns/docbook", type = Citation.class, required = false),
        @XmlElementRef(name = "tip", namespace = "http://docbook.org/ns/docbook", type = Tip.class, required = false),
        @XmlElementRef(name = "formalpara", namespace = "http://docbook.org/ns/docbook", type = Formalpara.class, required = false),
        @XmlElementRef(name = "simplelist", namespace = "http://docbook.org/ns/docbook", type = Simplelist.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://docbook.org/ns/docbook", type = Link.class, required = false),
        @XmlElementRef(name = "quote", namespace = "http://docbook.org/ns/docbook", type = Quote.class, required = false),
        @XmlElementRef(name = "constant", namespace = "http://docbook.org/ns/docbook", type = Constant.class, required = false),
        @XmlElementRef(name = "hardware", namespace = "http://docbook.org/ns/docbook", type = Hardware.class, required = false),
        @XmlElementRef(name = "important", namespace = "http://docbook.org/ns/docbook", type = Important.class, required = false),
        @XmlElementRef(name = "glossterm", namespace = "http://docbook.org/ns/docbook", type = Glossterm.class, required = false),
        @XmlElementRef(name = "classsynopsis", namespace = "http://docbook.org/ns/docbook", type = Classsynopsis.class, required = false),
        @XmlElementRef(name = "coref", namespace = "http://docbook.org/ns/docbook", type = Coref.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://docbook.org/ns/docbook", type = Code.class, required = false),
        @XmlElementRef(name = "orderedlist", namespace = "http://docbook.org/ns/docbook", type = Orderedlist.class, required = false),
        @XmlElementRef(name = "mediaobject", namespace = "http://docbook.org/ns/docbook", type = Mediaobject.class, required = false),
        @XmlElementRef(name = "shortcut", namespace = "http://docbook.org/ns/docbook", type = Shortcut.class, required = false),
        @XmlElementRef(name = "figure", namespace = "http://docbook.org/ns/docbook", type = Figure.class, required = false),
        @XmlElementRef(name = "literallayout", namespace = "http://docbook.org/ns/docbook", type = Literallayout.class, required = false),
        @XmlElementRef(name = "superscript", namespace = "http://docbook.org/ns/docbook", type = Superscript.class, required = false),
        @XmlElementRef(name = "function", namespace = "http://docbook.org/ns/docbook", type = Function.class, required = false),
        @XmlElementRef(name = "termdef", namespace = "http://docbook.org/ns/docbook", type = Termdef.class, required = false),
        @XmlElementRef(name = "foreignphrase", namespace = "http://docbook.org/ns/docbook", type = Foreignphrase.class, required = false),
        @XmlElementRef(name = "uri", namespace = "http://docbook.org/ns/docbook", type = Uri.class, required = false),
        @XmlElementRef(name = "para", namespace = "http://docbook.org/ns/docbook", type = Para.class, required = false),
        @XmlElementRef(name = "guimenu", namespace = "http://docbook.org/ns/docbook", type = Guimenu.class, required = false),
        @XmlElementRef(name = "segmentedlist", namespace = "http://docbook.org/ns/docbook", type = Segmentedlist.class, required = false),
        @XmlElementRef(name = "optional", namespace = "http://docbook.org/ns/docbook", type = Optional.class, required = false),
        @XmlElementRef(name = "programlisting", namespace = "http://docbook.org/ns/docbook", type = Programlisting.class, required = false),
        @XmlElementRef(name = "constraintdef", namespace = "http://docbook.org/ns/docbook", type = Constraintdef.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://docbook.org/ns/docbook", type = Annotation.class, required = false),
        @XmlElementRef(name = "destructorsynopsis", namespace = "http://docbook.org/ns/docbook", type = Destructorsynopsis.class, required = false),
        @XmlElementRef(name = "prompt", namespace = "http://docbook.org/ns/docbook", type = Prompt.class, required = false),
        @XmlElementRef(name = "errorname", namespace = "http://docbook.org/ns/docbook", type = Errorname.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "valign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valign;
    @XmlAttribute(name = "char")
    @XmlSchemaType(name = "anySimpleType")
    protected String _char;
    @XmlAttribute(name = "colsep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colsep;
    @XmlAttribute(name = "charoff")
    @XmlSchemaType(name = "anySimpleType")
    protected String charoff;
    @XmlAttribute(name = "morerows")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String morerows;
    @XmlAttribute(name = "colname")
    @XmlSchemaType(name = "anySimpleType")
    protected String colname;
    @XmlAttribute(name = "namest")
    @XmlSchemaType(name = "anySimpleType")
    protected String namest;
    @XmlAttribute(name = "spanname")
    @XmlSchemaType(name = "anySimpleType")
    protected String spanname;
    @XmlAttribute(name = "nameend")
    @XmlSchemaType(name = "anySimpleType")
    protected String nameend;
    @XmlAttribute(name = "rowsep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rowsep;
    @XmlAttribute(name = "rotate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rotate;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
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
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Command }
     * {@link Token }
     * {@link Epigraph }
     * {@link Footnoteref }
     * {@link Firstterm }
     * {@link Productionset }
     * {@link Editor }
     * {@link Xref }
     * {@link Calloutlist }
     * {@link Note }
     * {@link Returnvalue }
     * {@link Userinput }
     * {@link Informalexample }
     * {@link Revhistory }
     * {@link Inlinemediaobject }
     * {@link Methodsynopsis }
     * {@link Package }
     * {@link Acronym }
     * {@link Fieldsynopsis }
     * {@link Screenco }
     * {@link Type }
     * {@link Option }
     * {@link Keycombo }
     * {@link Guiicon }
     * {@link Envar }
     * {@link Remark }
     * {@link Symbol }
     * {@link Keysym }
     * {@link Guilabel }
     * {@link Funcsynopsis }
     * {@link Simpara }
     * {@link Modifier }
     * {@link Biblioref }
     * {@link Mousebutton }
     * {@link Footnote }
     * {@link Address }
     * {@link Interfacename }
     * {@link Phrase }
     * {@link Programlistingco }
     * {@link Abbrev }
     * {@link Errortype }
     * {@link Ooexception }
     * {@link Jobtitle }
     * {@link Synopsis }
     * {@link Cmdsynopsis }
     * {@link Org }
     * {@link Tag }
     * {@link Guimenuitem }
     * {@link Constructorsynopsis }
     * {@link Classname }
     * {@link Methodname }
     * {@link Errortext }
     * {@link Menuchoice }
     * {@link Screenshot }
     * {@link Sidebar }
     * {@link Alt }
     * {@link Personname }
     * {@link Anchor }
     * {@link Olink }
     * {@link Email }
     * {@link Screen }
     * {@link Trademark }
     * {@link Database }
     * {@link Qandaset }
     * {@link Bridgehead }
     * {@link Variablelist }
     * {@link Date }
     * {@link String }
     * {@link Accel }
     * {@link Subscript }
     * {@link Example }
     * {@link Markup }
     * {@link Productname }
     * {@link Equation }
     * {@link Msgset }
     * {@link Literal }
     * {@link Emphasis }
     * {@link Ooclass }
     * {@link Errorcode }
     * {@link Wordasword }
     * {@link Systemitem }
     * {@link Oointerface }
     * {@link Author }
     * {@link Citerefentry }
     * {@link Filename }
     * {@link Exceptionname }
     * {@link Varname }
     * {@link Procedure }
     * {@link Keycap }
     * {@link Informalfigure }
     * {@link Nonterminal }
     * {@link Guibutton }
     * {@link Warning }
     * {@link Citetitle }
     * {@link Citebiblioid }
     * {@link Itemizedlist }
     * {@link Initializer }
     * {@link Informaltable }
     * {@link Glosslist }
     * {@link Person }
     * {@link Blockquote }
     * {@link Task }
     * {@link Replaceable }
     * {@link Informalequation }
     * {@link Productnumber }
     * {@link Orgname }
     * {@link Property }
     * {@link Computeroutput }
     * {@link Indexterm }
     * {@link Table }
     * {@link Application }
     * {@link Guisubmenu }
     * {@link Keycode }
     * {@link Caution }
     * {@link Inlineequation }
     * {@link Parameter }
     * {@link Bibliolist }
     * {@link Citation }
     * {@link Tip }
     * {@link Formalpara }
     * {@link Simplelist }
     * {@link Link }
     * {@link Quote }
     * {@link Constant }
     * {@link Hardware }
     * {@link Important }
     * {@link Glossterm }
     * {@link Classsynopsis }
     * {@link Coref }
     * {@link Code }
     * {@link Orderedlist }
     * {@link Mediaobject }
     * {@link Shortcut }
     * {@link Figure }
     * {@link Literallayout }
     * {@link Superscript }
     * {@link Function }
     * {@link Termdef }
     * {@link Foreignphrase }
     * {@link Uri }
     * {@link Para }
     * {@link Guimenu }
     * {@link Segmentedlist }
     * {@link Optional }
     * {@link Programlisting }
     * {@link Constraintdef }
     * {@link Annotation }
     * {@link Destructorsynopsis }
     * {@link Prompt }
     * {@link Errorname }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * valignプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValign() {
        return valign;
    }

    /**
     * valignプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValign(String value) {
        this.valign = value;
    }

    /**
     * charプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * charプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * colsepプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColsep() {
        return colsep;
    }

    /**
     * colsepプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColsep(String value) {
        this.colsep = value;
    }

    /**
     * charoffプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharoff() {
        return charoff;
    }

    /**
     * charoffプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharoff(String value) {
        this.charoff = value;
    }

    /**
     * morerowsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorerows() {
        return morerows;
    }

    /**
     * morerowsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorerows(String value) {
        this.morerows = value;
    }

    /**
     * colnameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColname() {
        return colname;
    }

    /**
     * colnameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColname(String value) {
        this.colname = value;
    }

    /**
     * namestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamest() {
        return namest;
    }

    /**
     * namestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamest(String value) {
        this.namest = value;
    }

    /**
     * spannameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanname() {
        return spanname;
    }

    /**
     * spannameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanname(String value) {
        this.spanname = value;
    }

    /**
     * nameendプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameend() {
        return nameend;
    }

    /**
     * nameendプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameend(String value) {
        this.nameend = value;
    }

    /**
     * rowsepプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowsep() {
        return rowsep;
    }

    /**
     * rowsepプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowsep(String value) {
        this.rowsep = value;
    }

    /**
     * rotateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotate() {
        return rotate;
    }

    /**
     * rotateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotate(String value) {
        this.rotate = value;
    }

    /**
     * alignプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * alignプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
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
