
package org.docbook.ns.docbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attribute name="targetdoc" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="xrefstyle" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="localinfo" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="targetptr" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "olink")
public class Olink {

    @XmlElementRefs({
        @XmlElementRef(name = "org", namespace = "http://docbook.org/ns/docbook", type = Org.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://docbook.org/ns/docbook", type = Link.class, required = false),
        @XmlElementRef(name = "classname", namespace = "http://docbook.org/ns/docbook", type = Classname.class, required = false),
        @XmlElementRef(name = "systemitem", namespace = "http://docbook.org/ns/docbook", type = Systemitem.class, required = false),
        @XmlElementRef(name = "keycap", namespace = "http://docbook.org/ns/docbook", type = Keycap.class, required = false),
        @XmlElementRef(name = "guiicon", namespace = "http://docbook.org/ns/docbook", type = Guiicon.class, required = false),
        @XmlElementRef(name = "wordasword", namespace = "http://docbook.org/ns/docbook", type = Wordasword.class, required = false),
        @XmlElementRef(name = "citation", namespace = "http://docbook.org/ns/docbook", type = Citation.class, required = false),
        @XmlElementRef(name = "footnoteref", namespace = "http://docbook.org/ns/docbook", type = Footnoteref.class, required = false),
        @XmlElementRef(name = "errorcode", namespace = "http://docbook.org/ns/docbook", type = Errorcode.class, required = false),
        @XmlElementRef(name = "emphasis", namespace = "http://docbook.org/ns/docbook", type = Emphasis.class, required = false),
        @XmlElementRef(name = "productnumber", namespace = "http://docbook.org/ns/docbook", type = Productnumber.class, required = false),
        @XmlElementRef(name = "editor", namespace = "http://docbook.org/ns/docbook", type = Editor.class, required = false),
        @XmlElementRef(name = "computeroutput", namespace = "http://docbook.org/ns/docbook", type = Computeroutput.class, required = false),
        @XmlElementRef(name = "abbrev", namespace = "http://docbook.org/ns/docbook", type = Abbrev.class, required = false),
        @XmlElementRef(name = "firstterm", namespace = "http://docbook.org/ns/docbook", type = Firstterm.class, required = false),
        @XmlElementRef(name = "envar", namespace = "http://docbook.org/ns/docbook", type = Envar.class, required = false),
        @XmlElementRef(name = "nonterminal", namespace = "http://docbook.org/ns/docbook", type = Nonterminal.class, required = false),
        @XmlElementRef(name = "productname", namespace = "http://docbook.org/ns/docbook", type = Productname.class, required = false),
        @XmlElementRef(name = "xref", namespace = "http://docbook.org/ns/docbook", type = Xref.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://docbook.org/ns/docbook", type = Remark.class, required = false),
        @XmlElementRef(name = "quote", namespace = "http://docbook.org/ns/docbook", type = Quote.class, required = false),
        @XmlElementRef(name = "token", namespace = "http://docbook.org/ns/docbook", type = Token.class, required = false),
        @XmlElementRef(name = "citerefentry", namespace = "http://docbook.org/ns/docbook", type = Citerefentry.class, required = false),
        @XmlElementRef(name = "foreignphrase", namespace = "http://docbook.org/ns/docbook", type = Foreignphrase.class, required = false),
        @XmlElementRef(name = "tag", namespace = "http://docbook.org/ns/docbook", type = Tag.class, required = false),
        @XmlElementRef(name = "email", namespace = "http://docbook.org/ns/docbook", type = Email.class, required = false),
        @XmlElementRef(name = "anchor", namespace = "http://docbook.org/ns/docbook", type = Anchor.class, required = false),
        @XmlElementRef(name = "footnote", namespace = "http://docbook.org/ns/docbook", type = Footnote.class, required = false),
        @XmlElementRef(name = "guilabel", namespace = "http://docbook.org/ns/docbook", type = Guilabel.class, required = false),
        @XmlElementRef(name = "subscript", namespace = "http://docbook.org/ns/docbook", type = Subscript.class, required = false),
        @XmlElementRef(name = "menuchoice", namespace = "http://docbook.org/ns/docbook", type = Menuchoice.class, required = false),
        @XmlElementRef(name = "errorname", namespace = "http://docbook.org/ns/docbook", type = Errorname.class, required = false),
        @XmlElementRef(name = "coref", namespace = "http://docbook.org/ns/docbook", type = Coref.class, required = false),
        @XmlElementRef(name = "alt", namespace = "http://docbook.org/ns/docbook", type = Alt.class, required = false),
        @XmlElementRef(name = "indexterm", namespace = "http://docbook.org/ns/docbook", type = Indexterm.class, required = false),
        @XmlElementRef(name = "interfacename", namespace = "http://docbook.org/ns/docbook", type = Interfacename.class, required = false),
        @XmlElementRef(name = "citebiblioid", namespace = "http://docbook.org/ns/docbook", type = Citebiblioid.class, required = false),
        @XmlElementRef(name = "userinput", namespace = "http://docbook.org/ns/docbook", type = Userinput.class, required = false),
        @XmlElementRef(name = "returnvalue", namespace = "http://docbook.org/ns/docbook", type = Returnvalue.class, required = false),
        @XmlElementRef(name = "errortext", namespace = "http://docbook.org/ns/docbook", type = Errortext.class, required = false),
        @XmlElementRef(name = "author", namespace = "http://docbook.org/ns/docbook", type = Author.class, required = false),
        @XmlElementRef(name = "keysym", namespace = "http://docbook.org/ns/docbook", type = Keysym.class, required = false),
        @XmlElementRef(name = "constant", namespace = "http://docbook.org/ns/docbook", type = Constant.class, required = false),
        @XmlElementRef(name = "glossterm", namespace = "http://docbook.org/ns/docbook", type = Glossterm.class, required = false),
        @XmlElementRef(name = "database", namespace = "http://docbook.org/ns/docbook", type = Database.class, required = false),
        @XmlElementRef(name = "errortype", namespace = "http://docbook.org/ns/docbook", type = Errortype.class, required = false),
        @XmlElementRef(name = "application", namespace = "http://docbook.org/ns/docbook", type = Application.class, required = false),
        @XmlElementRef(name = "guimenu", namespace = "http://docbook.org/ns/docbook", type = Guimenu.class, required = false),
        @XmlElementRef(name = "citetitle", namespace = "http://docbook.org/ns/docbook", type = Citetitle.class, required = false),
        @XmlElementRef(name = "ooexception", namespace = "http://docbook.org/ns/docbook", type = Ooexception.class, required = false),
        @XmlElementRef(name = "termdef", namespace = "http://docbook.org/ns/docbook", type = Termdef.class, required = false),
        @XmlElementRef(name = "inlinemediaobject", namespace = "http://docbook.org/ns/docbook", type = Inlinemediaobject.class, required = false),
        @XmlElementRef(name = "modifier", namespace = "http://docbook.org/ns/docbook", type = Modifier.class, required = false),
        @XmlElementRef(name = "option", namespace = "http://docbook.org/ns/docbook", type = Option.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://docbook.org/ns/docbook", type = Acronym.class, required = false),
        @XmlElementRef(name = "shortcut", namespace = "http://docbook.org/ns/docbook", type = Shortcut.class, required = false),
        @XmlElementRef(name = "methodname", namespace = "http://docbook.org/ns/docbook", type = Methodname.class, required = false),
        @XmlElementRef(name = "ooclass", namespace = "http://docbook.org/ns/docbook", type = Ooclass.class, required = false),
        @XmlElementRef(name = "olink", namespace = "http://docbook.org/ns/docbook", type = Olink.class, required = false),
        @XmlElementRef(name = "literal", namespace = "http://docbook.org/ns/docbook", type = Literal.class, required = false),
        @XmlElementRef(name = "property", namespace = "http://docbook.org/ns/docbook", type = Property.class, required = false),
        @XmlElementRef(name = "mousebutton", namespace = "http://docbook.org/ns/docbook", type = Mousebutton.class, required = false),
        @XmlElementRef(name = "keycombo", namespace = "http://docbook.org/ns/docbook", type = Keycombo.class, required = false),
        @XmlElementRef(name = "replaceable", namespace = "http://docbook.org/ns/docbook", type = Replaceable.class, required = false),
        @XmlElementRef(name = "initializer", namespace = "http://docbook.org/ns/docbook", type = Initializer.class, required = false),
        @XmlElementRef(name = "orgname", namespace = "http://docbook.org/ns/docbook", type = Orgname.class, required = false),
        @XmlElementRef(name = "phrase", namespace = "http://docbook.org/ns/docbook", type = Phrase.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://docbook.org/ns/docbook", type = Annotation.class, required = false),
        @XmlElementRef(name = "hardware", namespace = "http://docbook.org/ns/docbook", type = Hardware.class, required = false),
        @XmlElementRef(name = "keycode", namespace = "http://docbook.org/ns/docbook", type = Keycode.class, required = false),
        @XmlElementRef(name = "personname", namespace = "http://docbook.org/ns/docbook", type = Personname.class, required = false),
        @XmlElementRef(name = "uri", namespace = "http://docbook.org/ns/docbook", type = Uri.class, required = false),
        @XmlElementRef(name = "filename", namespace = "http://docbook.org/ns/docbook", type = Filename.class, required = false),
        @XmlElementRef(name = "guimenuitem", namespace = "http://docbook.org/ns/docbook", type = Guimenuitem.class, required = false),
        @XmlElementRef(name = "exceptionname", namespace = "http://docbook.org/ns/docbook", type = Exceptionname.class, required = false),
        @XmlElementRef(name = "trademark", namespace = "http://docbook.org/ns/docbook", type = Trademark.class, required = false),
        @XmlElementRef(name = "superscript", namespace = "http://docbook.org/ns/docbook", type = Superscript.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://docbook.org/ns/docbook", type = Person.class, required = false),
        @XmlElementRef(name = "guibutton", namespace = "http://docbook.org/ns/docbook", type = Guibutton.class, required = false),
        @XmlElementRef(name = "parameter", namespace = "http://docbook.org/ns/docbook", type = Parameter.class, required = false),
        @XmlElementRef(name = "optional", namespace = "http://docbook.org/ns/docbook", type = Optional.class, required = false),
        @XmlElementRef(name = "oointerface", namespace = "http://docbook.org/ns/docbook", type = Oointerface.class, required = false),
        @XmlElementRef(name = "accel", namespace = "http://docbook.org/ns/docbook", type = Accel.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://docbook.org/ns/docbook", type = Date.class, required = false),
        @XmlElementRef(name = "inlineequation", namespace = "http://docbook.org/ns/docbook", type = Inlineequation.class, required = false),
        @XmlElementRef(name = "jobtitle", namespace = "http://docbook.org/ns/docbook", type = Jobtitle.class, required = false),
        @XmlElementRef(name = "symbol", namespace = "http://docbook.org/ns/docbook", type = Symbol.class, required = false),
        @XmlElementRef(name = "markup", namespace = "http://docbook.org/ns/docbook", type = Markup.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://docbook.org/ns/docbook", type = Code.class, required = false),
        @XmlElementRef(name = "varname", namespace = "http://docbook.org/ns/docbook", type = Varname.class, required = false),
        @XmlElementRef(name = "package", namespace = "http://docbook.org/ns/docbook", type = Package.class, required = false),
        @XmlElementRef(name = "biblioref", namespace = "http://docbook.org/ns/docbook", type = Biblioref.class, required = false),
        @XmlElementRef(name = "function", namespace = "http://docbook.org/ns/docbook", type = Function.class, required = false),
        @XmlElementRef(name = "guisubmenu", namespace = "http://docbook.org/ns/docbook", type = Guisubmenu.class, required = false),
        @XmlElementRef(name = "command", namespace = "http://docbook.org/ns/docbook", type = Command.class, required = false),
        @XmlElementRef(name = "type", namespace = "http://docbook.org/ns/docbook", type = Type.class, required = false),
        @XmlElementRef(name = "prompt", namespace = "http://docbook.org/ns/docbook", type = Prompt.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "targetdoc")
    @XmlSchemaType(name = "anySimpleType")
    protected String targetdoc;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "xrefstyle")
    @XmlSchemaType(name = "anySimpleType")
    protected String xrefstyle;
    @XmlAttribute(name = "localinfo")
    @XmlSchemaType(name = "anySimpleType")
    protected String localinfo;
    @XmlAttribute(name = "targetptr")
    @XmlSchemaType(name = "anySimpleType")
    protected String targetptr;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
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
     * {@link Citetitle }
     * {@link Org }
     * {@link Ooexception }
     * {@link Link }
     * {@link Termdef }
     * {@link Inlinemediaobject }
     * {@link Classname }
     * {@link Modifier }
     * {@link Systemitem }
     * {@link Option }
     * {@link Keycap }
     * {@link Guiicon }
     * {@link Wordasword }
     * {@link Shortcut }
     * {@link Acronym }
     * {@link Citation }
     * {@link Ooclass }
     * {@link Methodname }
     * {@link Olink }
     * {@link Literal }
     * {@link Property }
     * {@link Keycombo }
     * {@link Mousebutton }
     * {@link Replaceable }
     * {@link Errorcode }
     * {@link Footnoteref }
     * {@link Emphasis }
     * {@link Productnumber }
     * {@link Initializer }
     * {@link Computeroutput }
     * {@link Editor }
     * {@link Abbrev }
     * {@link Orgname }
     * {@link Envar }
     * {@link Firstterm }
     * {@link Nonterminal }
     * {@link Xref }
     * {@link Productname }
     * {@link Remark }
     * {@link Quote }
     * {@link Token }
     * {@link Citerefentry }
     * {@link Foreignphrase }
     * {@link Tag }
     * {@link Phrase }
     * {@link Email }
     * {@link Annotation }
     * {@link Hardware }
     * {@link Anchor }
     * {@link Keycode }
     * {@link Uri }
     * {@link Personname }
     * {@link Footnote }
     * {@link Filename }
     * {@link Exceptionname }
     * {@link Guimenuitem }
     * {@link Guilabel }
     * {@link Superscript }
     * {@link Trademark }
     * {@link Guibutton }
     * {@link Person }
     * {@link Menuchoice }
     * {@link Subscript }
     * {@link Errorname }
     * {@link Coref }
     * {@link Optional }
     * {@link Parameter }
     * {@link Alt }
     * {@link Oointerface }
     * {@link Accel }
     * {@link Interfacename }
     * {@link Indexterm }
     * {@link Citebiblioid }
     * {@link Userinput }
     * {@link Date }
     * {@link Inlineequation }
     * {@link Returnvalue }
     * {@link Jobtitle }
     * {@link Errortext }
     * {@link String }
     * {@link Symbol }
     * {@link Code }
     * {@link Markup }
     * {@link Author }
     * {@link Keysym }
     * {@link Varname }
     * {@link Constant }
     * {@link Package }
     * {@link Glossterm }
     * {@link Biblioref }
     * {@link Function }
     * {@link Guisubmenu }
     * {@link Command }
     * {@link Database }
     * {@link Type }
     * {@link Prompt }
     * {@link Guimenu }
     * {@link Application }
     * {@link Errortype }
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
     * Gets the value of the targetdoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetdoc() {
        return targetdoc;
    }

    /**
     * Sets the value of the targetdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetdoc(String value) {
        this.targetdoc = value;
    }

    /**
     * Gets the value of the role property.
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
     * Sets the value of the role property.
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
     * Gets the value of the xrefstyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXrefstyle() {
        return xrefstyle;
    }

    /**
     * Sets the value of the xrefstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXrefstyle(String value) {
        this.xrefstyle = value;
    }

    /**
     * Gets the value of the localinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalinfo() {
        return localinfo;
    }

    /**
     * Sets the value of the localinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalinfo(String value) {
        this.localinfo = value;
    }

    /**
     * Gets the value of the targetptr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetptr() {
        return targetptr;
    }

    /**
     * Sets the value of the targetptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetptr(String value) {
        this.targetptr = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
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
     * Sets the value of the id property.
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
     * Gets the value of the commonVersion property.
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
     * Sets the value of the commonVersion property.
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
     * Gets the value of the xmlLang property.
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
     * Sets the value of the xmlLang property.
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
     * Gets the value of the base property.
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
     * Sets the value of the base property.
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
     * Gets the value of the remap property.
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
     * Sets the value of the remap property.
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
     * Gets the value of the xreflabel property.
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
     * Sets the value of the xreflabel property.
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
     * Gets the value of the revisionflag property.
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
     * Sets the value of the revisionflag property.
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
     * Gets the value of the dir property.
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
     * Sets the value of the dir property.
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
     * Gets the value of the arch property.
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
     * Sets the value of the arch property.
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
     * Gets the value of the audience property.
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
     * Sets the value of the audience property.
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
     * Gets the value of the condition property.
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
     * Sets the value of the condition property.
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
     * Gets the value of the conformance property.
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
     * Sets the value of the conformance property.
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
     * Gets the value of the os property.
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
     * Sets the value of the os property.
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
     * Gets the value of the commonRevision property.
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
     * Sets the value of the commonRevision property.
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
     * Gets the value of the security property.
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
     * Sets the value of the security property.
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
     * Gets the value of the userlevel property.
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
     * Sets the value of the userlevel property.
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
     * Gets the value of the vendor property.
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
     * Sets the value of the vendor property.
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
     * Gets the value of the wordsize property.
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
     * Sets the value of the wordsize property.
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
     * Gets the value of the annotations property.
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
     * Sets the value of the annotations property.
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
