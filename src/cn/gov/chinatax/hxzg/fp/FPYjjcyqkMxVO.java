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
 * ��Ʊ�齻�ɲ��������ϸVO
 * 
 * <p>Java class for FPYjjcyqkMxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPYjjcyqkMxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fpkjqkDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkjqkDm"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="kpje" type="{http://www.chinatax.gov.cn/dataspec/}kpje"/>
 *         &lt;element name="se" type="{http://www.chinatax.gov.cn/dataspec/}se"/>
 *         &lt;element name="fpzzhm" type="{http://www.chinatax.gov.cn/dataspec/}fpzzhm"/>
 *         &lt;element name="fpyjjgDm" type="{http://www.chinatax.gov.cn/dataspec/}fpyjjgDm"/>
 *         &lt;element name="ywuuid" type="{http://www.chinatax.gov.cn/dataspec/}ywuuid"/>
 *         &lt;element name="fpyjjgDm" type="{http://www.chinatax.gov.cn/dataspec/}fpyjjgDm"/>
 *         &lt;element name="fpqshm" type="{http://www.chinatax.gov.cn/dataspec/}fpqshm"/>
 *         &lt;element name="fs" type="{http://www.chinatax.gov.cn/dataspec/}fs"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="fpcyuuid" type="{http://www.chinatax.gov.cn/dataspec/}fpcyuuid"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="kpqsrq" type="{http://www.chinatax.gov.cn/dataspec/}kpqsrq"/>
 *         &lt;element name="cyfpmxuuid" type="{http://www.chinatax.gov.cn/dataspec/}cyfpmxuuid"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="zfbz1" type="{http://www.chinatax.gov.cn/dataspec/}zfbz1"/>
 *         &lt;element name="kpjzrq" type="{http://www.chinatax.gov.cn/dataspec/}kpjzrq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPYjjcyqkMxVO", propOrder = {
    "content"
})
@XmlSeeAlso({
    FPYjjcyqkMxJcVO.class
})
public class FPYjjcyqkMxVO {

    @XmlElementRefs({
        @XmlElementRef(name = "fpDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "kpje", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "zfbz1", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fs", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "se", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpcyuuid", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "ywuuid", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpzzhm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "kpqsrq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "xgrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "kpjzrq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "sjgsdq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpyjjgDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "cyfpmxuuid", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "lrrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpkjqkDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpqshm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "fpzlDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "FpyjjgDm" is used by two different parts of a schema. See: 
     * line 15534 of file:/D:/jxdb/TaxMLPublicFPType.xsd
     * line 15524 of file:/D:/jxdb/TaxMLPublicFPType.xsd
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
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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