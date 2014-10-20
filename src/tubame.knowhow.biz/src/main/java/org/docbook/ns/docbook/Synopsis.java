
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
 * <p>anonymous complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://docbook.org/ns/docbook}info"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}textobject"/>
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
 *         &lt;element ref="{http://docbook.org/ns/docbook}lineannotation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}co"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.linking.attributes"/>
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="continuation">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="continues"/>
 *             &lt;enumeration value="restarts"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="linenumbering">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="numbered"/>
 *             &lt;enumeration value="unnumbered"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="startinglinenumber" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}space"/>
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "synopsis")
public class Synopsis {

    @XmlElementRefs({
        @XmlElementRef(name = "command", namespace = "http://docbook.org/ns/docbook", type = Command.class, required = false),
        @XmlElementRef(name = "token", namespace = "http://docbook.org/ns/docbook", type = Token.class, required = false),
        @XmlElementRef(name = "info", namespace = "http://docbook.org/ns/docbook", type = Info.class, required = false),
        @XmlElementRef(name = "footnoteref", namespace = "http://docbook.org/ns/docbook", type = Footnoteref.class, required = false),
        @XmlElementRef(name = "firstterm", namespace = "http://docbook.org/ns/docbook", type = Firstterm.class, required = false),
        @XmlElementRef(name = "editor", namespace = "http://docbook.org/ns/docbook", type = Editor.class, required = false),
        @XmlElementRef(name = "xref", namespace = "http://docbook.org/ns/docbook", type = Xref.class, required = false),
        @XmlElementRef(name = "returnvalue", namespace = "http://docbook.org/ns/docbook", type = Returnvalue.class, required = false),
        @XmlElementRef(name = "co", namespace = "http://docbook.org/ns/docbook", type = Co.class, required = false),
        @XmlElementRef(name = "userinput", namespace = "http://docbook.org/ns/docbook", type = Userinput.class, required = false),
        @XmlElementRef(name = "textobject", namespace = "http://docbook.org/ns/docbook", type = Textobject.class, required = false),
        @XmlElementRef(name = "inlinemediaobject", namespace = "http://docbook.org/ns/docbook", type = Inlinemediaobject.class, required = false),
        @XmlElementRef(name = "package", namespace = "http://docbook.org/ns/docbook", type = Package.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://docbook.org/ns/docbook", type = Acronym.class, required = false),
        @XmlElementRef(name = "type", namespace = "http://docbook.org/ns/docbook", type = Type.class, required = false),
        @XmlElementRef(name = "option", namespace = "http://docbook.org/ns/docbook", type = Option.class, required = false),
        @XmlElementRef(name = "keycombo", namespace = "http://docbook.org/ns/docbook", type = Keycombo.class, required = false),
        @XmlElementRef(name = "guiicon", namespace = "http://docbook.org/ns/docbook", type = Guiicon.class, required = false),
        @XmlElementRef(name = "envar", namespace = "http://docbook.org/ns/docbook", type = Envar.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://docbook.org/ns/docbook", type = Remark.class, required = false),
        @XmlElementRef(name = "symbol", namespace = "http://docbook.org/ns/docbook", type = Symbol.class, required = false),
        @XmlElementRef(name = "keysym", namespace = "http://docbook.org/ns/docbook", type = Keysym.class, required = false),
        @XmlElementRef(name = "guilabel", namespace = "http://docbook.org/ns/docbook", type = Guilabel.class, required = false),
        @XmlElementRef(name = "modifier", namespace = "http://docbook.org/ns/docbook", type = Modifier.class, required = false),
        @XmlElementRef(name = "biblioref", namespace = "http://docbook.org/ns/docbook", type = Biblioref.class, required = false),
        @XmlElementRef(name = "mousebutton", namespace = "http://docbook.org/ns/docbook", type = Mousebutton.class, required = false),
        @XmlElementRef(name = "footnote", namespace = "http://docbook.org/ns/docbook", type = Footnote.class, required = false),
        @XmlElementRef(name = "interfacename", namespace = "http://docbook.org/ns/docbook", type = Interfacename.class, required = false),
        @XmlElementRef(name = "phrase", namespace = "http://docbook.org/ns/docbook", type = Phrase.class, required = false),
        @XmlElementRef(name = "abbrev", namespace = "http://docbook.org/ns/docbook", type = Abbrev.class, required = false),
        @XmlElementRef(name = "errortype", namespace = "http://docbook.org/ns/docbook", type = Errortype.class, required = false),
        @XmlElementRef(name = "ooexception", namespace = "http://docbook.org/ns/docbook", type = Ooexception.class, required = false),
        @XmlElementRef(name = "jobtitle", namespace = "http://docbook.org/ns/docbook", type = Jobtitle.class, required = false),
        @XmlElementRef(name = "org", namespace = "http://docbook.org/ns/docbook", type = Org.class, required = false),
        @XmlElementRef(name = "tag", namespace = "http://docbook.org/ns/docbook", type = Tag.class, required = false),
        @XmlElementRef(name = "guimenuitem", namespace = "http://docbook.org/ns/docbook", type = Guimenuitem.class, required = false),
        @XmlElementRef(name = "lineannotation", namespace = "http://docbook.org/ns/docbook", type = Lineannotation.class, required = false),
        @XmlElementRef(name = "classname", namespace = "http://docbook.org/ns/docbook", type = Classname.class, required = false),
        @XmlElementRef(name = "methodname", namespace = "http://docbook.org/ns/docbook", type = Methodname.class, required = false),
        @XmlElementRef(name = "errortext", namespace = "http://docbook.org/ns/docbook", type = Errortext.class, required = false),
        @XmlElementRef(name = "menuchoice", namespace = "http://docbook.org/ns/docbook", type = Menuchoice.class, required = false),
        @XmlElementRef(name = "alt", namespace = "http://docbook.org/ns/docbook", type = Alt.class, required = false),
        @XmlElementRef(name = "personname", namespace = "http://docbook.org/ns/docbook", type = Personname.class, required = false),
        @XmlElementRef(name = "anchor", namespace = "http://docbook.org/ns/docbook", type = Anchor.class, required = false),
        @XmlElementRef(name = "olink", namespace = "http://docbook.org/ns/docbook", type = Olink.class, required = false),
        @XmlElementRef(name = "email", namespace = "http://docbook.org/ns/docbook", type = Email.class, required = false),
        @XmlElementRef(name = "trademark", namespace = "http://docbook.org/ns/docbook", type = Trademark.class, required = false),
        @XmlElementRef(name = "database", namespace = "http://docbook.org/ns/docbook", type = Database.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://docbook.org/ns/docbook", type = Date.class, required = false),
        @XmlElementRef(name = "accel", namespace = "http://docbook.org/ns/docbook", type = Accel.class, required = false),
        @XmlElementRef(name = "subscript", namespace = "http://docbook.org/ns/docbook", type = Subscript.class, required = false),
        @XmlElementRef(name = "markup", namespace = "http://docbook.org/ns/docbook", type = Markup.class, required = false),
        @XmlElementRef(name = "productname", namespace = "http://docbook.org/ns/docbook", type = Productname.class, required = false),
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
        @XmlElementRef(name = "keycap", namespace = "http://docbook.org/ns/docbook", type = Keycap.class, required = false),
        @XmlElementRef(name = "nonterminal", namespace = "http://docbook.org/ns/docbook", type = Nonterminal.class, required = false),
        @XmlElementRef(name = "guibutton", namespace = "http://docbook.org/ns/docbook", type = Guibutton.class, required = false),
        @XmlElementRef(name = "citetitle", namespace = "http://docbook.org/ns/docbook", type = Citetitle.class, required = false),
        @XmlElementRef(name = "citebiblioid", namespace = "http://docbook.org/ns/docbook", type = Citebiblioid.class, required = false),
        @XmlElementRef(name = "initializer", namespace = "http://docbook.org/ns/docbook", type = Initializer.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://docbook.org/ns/docbook", type = Person.class, required = false),
        @XmlElementRef(name = "replaceable", namespace = "http://docbook.org/ns/docbook", type = Replaceable.class, required = false),
        @XmlElementRef(name = "productnumber", namespace = "http://docbook.org/ns/docbook", type = Productnumber.class, required = false),
        @XmlElementRef(name = "orgname", namespace = "http://docbook.org/ns/docbook", type = Orgname.class, required = false),
        @XmlElementRef(name = "property", namespace = "http://docbook.org/ns/docbook", type = Property.class, required = false),
        @XmlElementRef(name = "computeroutput", namespace = "http://docbook.org/ns/docbook", type = Computeroutput.class, required = false),
        @XmlElementRef(name = "indexterm", namespace = "http://docbook.org/ns/docbook", type = Indexterm.class, required = false),
        @XmlElementRef(name = "application", namespace = "http://docbook.org/ns/docbook", type = Application.class, required = false),
        @XmlElementRef(name = "guisubmenu", namespace = "http://docbook.org/ns/docbook", type = Guisubmenu.class, required = false),
        @XmlElementRef(name = "keycode", namespace = "http://docbook.org/ns/docbook", type = Keycode.class, required = false),
        @XmlElementRef(name = "inlineequation", namespace = "http://docbook.org/ns/docbook", type = Inlineequation.class, required = false),
        @XmlElementRef(name = "parameter", namespace = "http://docbook.org/ns/docbook", type = Parameter.class, required = false),
        @XmlElementRef(name = "citation", namespace = "http://docbook.org/ns/docbook", type = Citation.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://docbook.org/ns/docbook", type = Link.class, required = false),
        @XmlElementRef(name = "quote", namespace = "http://docbook.org/ns/docbook", type = Quote.class, required = false),
        @XmlElementRef(name = "constant", namespace = "http://docbook.org/ns/docbook", type = Constant.class, required = false),
        @XmlElementRef(name = "hardware", namespace = "http://docbook.org/ns/docbook", type = Hardware.class, required = false),
        @XmlElementRef(name = "glossterm", namespace = "http://docbook.org/ns/docbook", type = Glossterm.class, required = false),
        @XmlElementRef(name = "coref", namespace = "http://docbook.org/ns/docbook", type = Coref.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://docbook.org/ns/docbook", type = Code.class, required = false),
        @XmlElementRef(name = "shortcut", namespace = "http://docbook.org/ns/docbook", type = Shortcut.class, required = false),
        @XmlElementRef(name = "superscript", namespace = "http://docbook.org/ns/docbook", type = Superscript.class, required = false),
        @XmlElementRef(name = "function", namespace = "http://docbook.org/ns/docbook", type = Function.class, required = false),
        @XmlElementRef(name = "termdef", namespace = "http://docbook.org/ns/docbook", type = Termdef.class, required = false),
        @XmlElementRef(name = "foreignphrase", namespace = "http://docbook.org/ns/docbook", type = Foreignphrase.class, required = false),
        @XmlElementRef(name = "uri", namespace = "http://docbook.org/ns/docbook", type = Uri.class, required = false),
        @XmlElementRef(name = "guimenu", namespace = "http://docbook.org/ns/docbook", type = Guimenu.class, required = false),
        @XmlElementRef(name = "optional", namespace = "http://docbook.org/ns/docbook", type = Optional.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://docbook.org/ns/docbook", type = Annotation.class, required = false),
        @XmlElementRef(name = "prompt", namespace = "http://docbook.org/ns/docbook", type = Prompt.class, required = false),
        @XmlElementRef(name = "errorname", namespace = "http://docbook.org/ns/docbook", type = Errorname.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "continuation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String continuation;
    @XmlAttribute(name = "linenumbering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String linenumbering;
    @XmlAttribute(name = "startinglinenumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String startinglinenumber;
    @XmlAttribute(name = "language")
    @XmlSchemaType(name = "anySimpleType")
    protected String language;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;
    @XmlAttribute(name = "label")
    @XmlSchemaType(name = "anySimpleType")
    protected String label;
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
    @XmlAttribute(name = "linkend")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkend;

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
     * {@link Info }
     * {@link Footnoteref }
     * {@link Firstterm }
     * {@link Editor }
     * {@link Xref }
     * {@link Returnvalue }
     * {@link Co }
     * {@link Userinput }
     * {@link Textobject }
     * {@link Inlinemediaobject }
     * {@link Package }
     * {@link Acronym }
     * {@link Type }
     * {@link Option }
     * {@link Keycombo }
     * {@link Guiicon }
     * {@link Envar }
     * {@link Remark }
     * {@link Symbol }
     * {@link Keysym }
     * {@link Guilabel }
     * {@link Modifier }
     * {@link Biblioref }
     * {@link Mousebutton }
     * {@link Footnote }
     * {@link Interfacename }
     * {@link Phrase }
     * {@link Abbrev }
     * {@link Errortype }
     * {@link Ooexception }
     * {@link Jobtitle }
     * {@link Org }
     * {@link Tag }
     * {@link Guimenuitem }
     * {@link Lineannotation }
     * {@link Classname }
     * {@link Methodname }
     * {@link Errortext }
     * {@link Menuchoice }
     * {@link Alt }
     * {@link Personname }
     * {@link Anchor }
     * {@link Olink }
     * {@link Email }
     * {@link Trademark }
     * {@link Database }
     * {@link Date }
     * {@link String }
     * {@link Accel }
     * {@link Subscript }
     * {@link Markup }
     * {@link Productname }
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
     * {@link Keycap }
     * {@link Nonterminal }
     * {@link Guibutton }
     * {@link Citetitle }
     * {@link Citebiblioid }
     * {@link Initializer }
     * {@link Person }
     * {@link Replaceable }
     * {@link Productnumber }
     * {@link Orgname }
     * {@link Property }
     * {@link Computeroutput }
     * {@link Indexterm }
     * {@link Application }
     * {@link Guisubmenu }
     * {@link Keycode }
     * {@link Inlineequation }
     * {@link Parameter }
     * {@link Citation }
     * {@link Link }
     * {@link Quote }
     * {@link Constant }
     * {@link Hardware }
     * {@link Glossterm }
     * {@link Coref }
     * {@link Code }
     * {@link Shortcut }
     * {@link Superscript }
     * {@link Function }
     * {@link Termdef }
     * {@link Foreignphrase }
     * {@link Uri }
     * {@link Guimenu }
     * {@link Optional }
     * {@link Annotation }
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
     * role�v���p�e�B�̒l���擾���܂��B
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
     * role�v���p�e�B�̒l��ݒ肵�܂��B
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
     * continuation�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinuation() {
        return continuation;
    }

    /**
     * continuation�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinuation(String value) {
        this.continuation = value;
    }

    /**
     * linenumbering�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinenumbering() {
        return linenumbering;
    }

    /**
     * linenumbering�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinenumbering(String value) {
        this.linenumbering = value;
    }

    /**
     * startinglinenumber�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartinglinenumber() {
        return startinglinenumber;
    }

    /**
     * startinglinenumber�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartinglinenumber(String value) {
        this.startinglinenumber = value;
    }

    /**
     * language�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * language�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * space�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * space�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * label�v���p�e�B�̒l���擾���܂��B
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
     * label�v���p�e�B�̒l��ݒ肵�܂��B
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
     * id�v���p�e�B�̒l���擾���܂��B
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
     * id�v���p�e�B�̒l��ݒ肵�܂��B
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
     * commonVersion�v���p�e�B�̒l���擾���܂��B
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
     * commonVersion�v���p�e�B�̒l��ݒ肵�܂��B
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
     * xmlLang�v���p�e�B�̒l���擾���܂��B
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
     * xmlLang�v���p�e�B�̒l��ݒ肵�܂��B
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
     * base�v���p�e�B�̒l���擾���܂��B
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
     * base�v���p�e�B�̒l��ݒ肵�܂��B
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
     * remap�v���p�e�B�̒l���擾���܂��B
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
     * remap�v���p�e�B�̒l��ݒ肵�܂��B
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
     * xreflabel�v���p�e�B�̒l���擾���܂��B
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
     * xreflabel�v���p�e�B�̒l��ݒ肵�܂��B
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
     * revisionflag�v���p�e�B�̒l���擾���܂��B
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
     * revisionflag�v���p�e�B�̒l��ݒ肵�܂��B
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
     * dir�v���p�e�B�̒l���擾���܂��B
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
     * dir�v���p�e�B�̒l��ݒ肵�܂��B
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
     * arch�v���p�e�B�̒l���擾���܂��B
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
     * arch�v���p�e�B�̒l��ݒ肵�܂��B
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
     * audience�v���p�e�B�̒l���擾���܂��B
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
     * audience�v���p�e�B�̒l��ݒ肵�܂��B
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
     * condition�v���p�e�B�̒l���擾���܂��B
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
     * condition�v���p�e�B�̒l��ݒ肵�܂��B
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
     * conformance�v���p�e�B�̒l���擾���܂��B
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
     * conformance�v���p�e�B�̒l��ݒ肵�܂��B
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
     * os�v���p�e�B�̒l���擾���܂��B
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
     * os�v���p�e�B�̒l��ݒ肵�܂��B
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
     * commonRevision�v���p�e�B�̒l���擾���܂��B
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
     * commonRevision�v���p�e�B�̒l��ݒ肵�܂��B
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
     * security�v���p�e�B�̒l���擾���܂��B
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
     * security�v���p�e�B�̒l��ݒ肵�܂��B
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
     * userlevel�v���p�e�B�̒l���擾���܂��B
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
     * userlevel�v���p�e�B�̒l��ݒ肵�܂��B
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
     * vendor�v���p�e�B�̒l���擾���܂��B
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
     * vendor�v���p�e�B�̒l��ݒ肵�܂��B
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
     * wordsize�v���p�e�B�̒l���擾���܂��B
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
     * wordsize�v���p�e�B�̒l��ݒ肵�܂��B
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
     * annotations�v���p�e�B�̒l���擾���܂��B
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
     * annotations�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotations(String value) {
        this.annotations = value;
    }

    /**
     * linkend�v���p�e�B�̒l���擾���܂��B
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
     * linkend�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkend(Object value) {
        this.linkend = value;
    }

}
