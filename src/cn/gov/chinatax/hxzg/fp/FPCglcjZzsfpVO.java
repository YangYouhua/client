//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 ���� CST 
//


package cn.gov.chinatax.hxzg.fp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * ��ֵ˰��Ʊ������ɼ�VO
 * 
 * <p>Java class for FPCglcjZzsfpVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPCglcjZzsfpVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="fpkjqkDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkjqkDm"/>
 *         &lt;element name="ghfnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}ghfnsrsbh"/>
 *         &lt;element name="sehj" type="{http://www.chinatax.gov.cn/dataspec/}sehj"/>
 *         &lt;element name="hzfptzdbh" type="{http://www.chinatax.gov.cn/dataspec/}hzfptzdbh"/>
 *         &lt;element name="xhfdjxh" type="{http://www.chinatax.gov.cn/dataspec/}xhfdjxh"/>
 *         &lt;element name="xhfnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}xhfnsrsbh"/>
 *         &lt;element name="kprq" type="{http://www.chinatax.gov.cn/dataspec/}kprq"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="hzfptzdbh" type="{http://www.chinatax.gov.cn/dataspec/}hzfptzdbh"/>
 *         &lt;element name="jehj" type="{http://www.chinatax.gov.cn/dataspec/}jehj"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="ghfdjxh" type="{http://www.chinatax.gov.cn/dataspec/}ghfdjxh"/>
 *         &lt;element name="zzscgluuid" type="{http://www.chinatax.gov.cn/dataspec/}zzscgluuid"/>
 *         &lt;element name="cglcjfpyjuuid" type="{http://www.chinatax.gov.cn/dataspec/}cglcjfpyjuuid"/>
 *         &lt;element name="fwskfplxDm" type="{http://www.chinatax.gov.cn/dataspec/}fwskfplxDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPCglcjZzsfpVO", propOrder = {
    "content"
})
public class FPCglcjZzsfpVO {

    @XmlElementRefs({
        @XmlElementRef(name = "fpDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "hzfptzdbh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "kprq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "sehj", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "ghfdjxh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "cglcjfpyjuuid", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "sjgsdq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "xhfnsrsbh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "ghfnsrsbh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "lrrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "zzscgluuid", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fphm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "jehj", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "xhfdjxh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpkjqkDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fwskfplxDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "xgrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "djxh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Hzfptzdbh" is used by two different parts of a schema. See: 
     * line 5056 of file:/D:/jxdb/TaxMLPublicFPType.xsd
     * line 5026 of file:/D:/jxdb/TaxMLPublicFPType.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

}