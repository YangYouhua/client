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
 * ������Ʊ����VO
 * 
 * <p>Java class for FPDkSqVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDkSqVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zgswskfjDm" type="{http://www.chinatax.gov.cn/dataspec/}zgswskfjDm"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="kjbz" type="{http://www.chinatax.gov.cn/dataspec/}kjbz"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="hyDm" type="{http://www.chinatax.gov.cn/dataspec/}hyDm"/>
 *         &lt;element name="jdxzDm" type="{http://www.chinatax.gov.cn/dataspec/}jdxzDm"/>
 *         &lt;element name="pzxh" type="{http://www.chinatax.gov.cn/dataspec/}pzxh"/>
 *         &lt;element name="kpje" type="{http://www.chinatax.gov.cn/dataspec/}kpje"/>
 *         &lt;element name="jmyy" type="{http://www.chinatax.gov.cn/dataspec/}jmyy"/>
 *         &lt;element name="kplxDm" type="{http://www.chinatax.gov.cn/dataspec/}kplxDm"/>
 *         &lt;element name="zfrq1" type="{http://www.chinatax.gov.cn/dataspec/}zfrq1"/>
 *         &lt;element name="sqrxm" type="{http://www.chinatax.gov.cn/dataspec/}sqrxm"/>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="sqdhm" type="{http://www.chinatax.gov.cn/dataspec/}sqdhm"/>
 *         &lt;element name="sqrq" type="{http://www.chinatax.gov.cn/dataspec/}sqrq"/>
 *         &lt;element name="dksquuid" type="{http://www.chinatax.gov.cn/dataspec/}dksquuid"/>
 *         &lt;element name="dkfplbDm" type="{http://www.chinatax.gov.cn/dataspec/}dkfplbDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="slswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}slswjgDm"/>
 *         &lt;element name="xzqhszDm" type="{http://www.chinatax.gov.cn/dataspec/}xzqhszDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="zfrDm" type="{http://www.chinatax.gov.cn/dataspec/}zfrDm"/>
 *         &lt;element name="jmsbz" type="{http://www.chinatax.gov.cn/dataspec/}jmsbz"/>
 *         &lt;element name="ybsfe" type="{http://www.chinatax.gov.cn/dataspec/}ybsfe"/>
 *         &lt;element name="dksqje" type="{http://www.chinatax.gov.cn/dataspec/}dksqje"/>
 *         &lt;element name="sqdhm" type="{http://www.chinatax.gov.cn/dataspec/}sqdhm"/>
 *         &lt;element name="zrrbz" type="{http://www.chinatax.gov.cn/dataspec/}zrrbz"/>
 *         &lt;element name="zfbz1" type="{http://www.chinatax.gov.cn/dataspec/}zfbz1"/>
 *         &lt;element name="slrq" type="{http://www.chinatax.gov.cn/dataspec/}slrq"/>
 *         &lt;element name="slrDm" type="{http://www.chinatax.gov.cn/dataspec/}slrDm"/>
 *         &lt;element name="jmslxDm" type="{http://www.chinatax.gov.cn/dataspec/}jmslxDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDkSqVO", propOrder = {
    "content"
})
public class FPDkSqVO {

    @XmlElementRefs({
        @XmlElementRef(name = "slrq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "slswjgDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "dksqje", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "jmslxDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "zgswskfjDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "sqrq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "sqrxm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "pzxh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "kjbz", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "zrrbz", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "xgrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "zfrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "lrrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "zfrq1", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "kpje", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "kplxDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "dksquuid", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "dkfplbDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "slrDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "jmsbz", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "sqdhm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "lcslid", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "djxh", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "xzqhszDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "sjgsdq", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "ybsfe", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "zfbz1", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "hyDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "jdxzDm", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class),
        @XmlElementRef(name = "jmyy", namespace = "http://www.chinatax.gov.cn/dataspec/", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Sqdhm" is used by two different parts of a schema. See: 
     * line 3743 of file:/D:/jxdb/TaxMLPublicFPType.xsd
     * line 3683 of file:/D:/jxdb/TaxMLPublicFPType.xsd
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
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
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