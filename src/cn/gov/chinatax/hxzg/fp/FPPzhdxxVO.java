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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * VO
 * 
 * <p>Java class for FPPzhdxxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPPzhdxxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dffpzgkpxeDm" type="{http://www.chinatax.gov.cn/dataspec/}dffpzgkpxeDm"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="dffpzgkpxe" type="{http://www.chinatax.gov.cn/dataspec/}dffpzgkpxe"/>
 *         &lt;element name="dffpzgkpxeDm" type="{http://www.chinatax.gov.cn/dataspec/}dffpzgkpxeDm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="swjgDm" type="{http://www.chinatax.gov.cn/dataspec/}swjgDm"/>
 *         &lt;element name="myzggpsl" type="{http://www.chinatax.gov.cn/dataspec/}myzggpsl"/>
 *         &lt;element name="yxqq" type="{http://www.chinatax.gov.cn/dataspec/}yxqq"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="yxqz" type="{http://www.chinatax.gov.cn/dataspec/}yxqz"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="hdqcuuid" type="{http://www.chinatax.gov.cn/dataspec/}hdqcuuid"/>
 *         &lt;element name="cpzgsl" type="{http://www.chinatax.gov.cn/dataspec/}cpzgsl"/>
 *         &lt;element name="fpgpfsDm" type="{http://www.chinatax.gov.cn/dataspec/}fpgpfsDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="yxqq" type="{http://www.chinatax.gov.cn/dataspec/}yxqq"/>
 *         &lt;element name="fpkjfsDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkjfsDm"/>
 *         &lt;element name="cpzgsl" type="{http://www.chinatax.gov.cn/dataspec/}cpzgsl"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="wtdkbz" type="{http://www.chinatax.gov.cn/dataspec/}wtdkbz"/>
 *         &lt;element name="mczggpsl" type="{http://www.chinatax.gov.cn/dataspec/}mczggpsl"/>
 *         &lt;element name="myzggpsl" type="{http://www.chinatax.gov.cn/dataspec/}myzggpsl"/>
 *         &lt;element name="yxbz" type="{http://www.chinatax.gov.cn/dataspec/}yxbz"/>
 *         &lt;element name="fpgpfsDm" type="{http://www.chinatax.gov.cn/dataspec/}fpgpfsDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="hdqcuuid" type="{http://www.chinatax.gov.cn/dataspec/}hdqcuuid"/>
 *         &lt;element name="dffpzgkpxe" type="{http://www.chinatax.gov.cn/dataspec/}dffpzgkpxe"/>
 *         &lt;element name="mczggpsl" type="{http://www.chinatax.gov.cn/dataspec/}mczggpsl"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="swjgDm" type="{http://www.chinatax.gov.cn/dataspec/}swjgDm"/>
 *         &lt;element name="yxbz" type="{http://www.chinatax.gov.cn/dataspec/}yxbz"/>
 *         &lt;element name="yxqz" type="{http://www.chinatax.gov.cn/dataspec/}yxqz"/>
 *         &lt;element name="fpkjfsDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkjfsDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPPzhdxxVO", propOrder = {
    "content"
})
@XmlSeeAlso({
    FPPzhdxxJcVO.class
})
public class FPPzhdxxVO {

    @XmlElementRefs({
        @XmlElementRef(name = "dffpzgkpxe", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "swjgDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "lrrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "wtdkbz", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpgpfsDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "cpzgsl", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "hdqcuuid", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpkjfsDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "djxh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "yxqq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "myzggpsl", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "yxbz", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "yxqz", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpzlDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "mczggpsl", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "dffpzgkpxeDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "xgrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "sjgsdq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "DffpzgkpxeDm" is used by two different parts of a schema. See: 
     * line 10620 of file:/D:/jxdb/TaxMLPublicFPType.xsd
     * line 10605 of file:/D:/jxdb/TaxMLPublicFPType.xsd
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
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
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
