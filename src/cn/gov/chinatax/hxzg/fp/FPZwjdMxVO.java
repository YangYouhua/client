//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 ���� CST 
//


package cn.gov.chinatax.hxzg.fp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ��Ʊ��α������ϸVO
 * 
 * <p>Java class for FPZwjdMxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPZwjdMxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="zwjdcljgDm" type="{http://www.chinatax.gov.cn/dataspec/}zwjdcljgDm"/>
 *         &lt;element name="kpje" type="{http://www.chinatax.gov.cn/dataspec/}kpje"/>
 *         &lt;element name="fplyfnsrmc" type="{http://www.chinatax.gov.cn/dataspec/}fplyfnsrmc"/>
 *         &lt;element name="fpjdjgDm" type="{http://www.chinatax.gov.cn/dataspec/}fpjdjgDm"/>
 *         &lt;element name="sfytk" type="{http://www.chinatax.gov.cn/dataspec/}sfytk"/>
 *         &lt;element name="fpmmskm" type="{http://www.chinatax.gov.cn/dataspec/}fpmmskm"/>
 *         &lt;element name="zwjdmxuuid" type="{http://www.chinatax.gov.cn/dataspec/}zwjdmxuuid"/>
 *         &lt;element name="fpkjfnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}fpkjfnsrsbh"/>
 *         &lt;element name="kprq" type="{http://www.chinatax.gov.cn/dataspec/}kprq"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="zwjduuid" type="{http://www.chinatax.gov.cn/dataspec/}zwjduuid"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="fpkjfnsrmc" type="{http://www.chinatax.gov.cn/dataspec/}fpkjfnsrmc"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="fplyfnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}fplyfnsrsbh"/>
 *         &lt;element name="jdrq1" type="{http://www.chinatax.gov.cn/dataspec/}jdrq1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPZwjdMxVO", propOrder = {
    "sjgsdq",
    "djxh",
    "fphm",
    "fpzlDm",
    "zwjdcljgDm",
    "kpje",
    "fplyfnsrmc",
    "fpjdjgDm",
    "sfytk",
    "fpmmskm",
    "zwjdmxuuid",
    "fpkjfnsrsbh",
    "kprq",
    "fpDm",
    "zwjduuid",
    "lrrDm",
    "fpkjfnsrmc",
    "xgrDm",
    "fplyfnsrsbh",
    "jdrq1"
})
@XmlSeeAlso({
    FPFpZwjdMxVO.class
})
public class FPZwjdMxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String zwjdcljgDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double kpje;
    @XmlElement(required = true, nillable = true)
    protected String fplyfnsrmc;
    @XmlElement(required = true, nillable = true)
    protected String fpjdjgDm;
    @XmlElement(required = true, nillable = true)
    protected String sfytk;
    @XmlElement(required = true, nillable = true)
    protected String fpmmskm;
    @XmlElement(required = true, nillable = true)
    protected String zwjdmxuuid;
    @XmlElement(required = true, nillable = true)
    protected String fpkjfnsrsbh;
    @XmlElement(required = true, nillable = true)
    protected String kprq;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String zwjduuid;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String fpkjfnsrmc;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String fplyfnsrsbh;
    @XmlElement(required = true, nillable = true)
    protected String jdrq1;

    /**
     * Gets the value of the sjgsdq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjgsdq() {
        return sjgsdq;
    }

    /**
     * Sets the value of the sjgsdq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjgsdq(String value) {
        this.sjgsdq = value;
    }

    /**
     * Gets the value of the djxh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDjxh() {
        return djxh;
    }

    /**
     * Sets the value of the djxh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDjxh(String value) {
        this.djxh = value;
    }

    /**
     * Gets the value of the fphm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFphm() {
        return fphm;
    }

    /**
     * Sets the value of the fphm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFphm(String value) {
        this.fphm = value;
    }

    /**
     * Gets the value of the fpzlDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpzlDm() {
        return fpzlDm;
    }

    /**
     * Sets the value of the fpzlDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpzlDm(String value) {
        this.fpzlDm = value;
    }

    /**
     * Gets the value of the zwjdcljgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwjdcljgDm() {
        return zwjdcljgDm;
    }

    /**
     * Sets the value of the zwjdcljgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwjdcljgDm(String value) {
        this.zwjdcljgDm = value;
    }

    /**
     * Gets the value of the kpje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKpje() {
        return kpje;
    }

    /**
     * Sets the value of the kpje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKpje(Double value) {
        this.kpje = value;
    }

    /**
     * Gets the value of the fplyfnsrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFplyfnsrmc() {
        return fplyfnsrmc;
    }

    /**
     * Sets the value of the fplyfnsrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFplyfnsrmc(String value) {
        this.fplyfnsrmc = value;
    }

    /**
     * Gets the value of the fpjdjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpjdjgDm() {
        return fpjdjgDm;
    }

    /**
     * Sets the value of the fpjdjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpjdjgDm(String value) {
        this.fpjdjgDm = value;
    }

    /**
     * Gets the value of the sfytk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfytk() {
        return sfytk;
    }

    /**
     * Sets the value of the sfytk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfytk(String value) {
        this.sfytk = value;
    }

    /**
     * Gets the value of the fpmmskm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpmmskm() {
        return fpmmskm;
    }

    /**
     * Sets the value of the fpmmskm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpmmskm(String value) {
        this.fpmmskm = value;
    }

    /**
     * Gets the value of the zwjdmxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwjdmxuuid() {
        return zwjdmxuuid;
    }

    /**
     * Sets the value of the zwjdmxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwjdmxuuid(String value) {
        this.zwjdmxuuid = value;
    }

    /**
     * Gets the value of the fpkjfnsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkjfnsrsbh() {
        return fpkjfnsrsbh;
    }

    /**
     * Sets the value of the fpkjfnsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkjfnsrsbh(String value) {
        this.fpkjfnsrsbh = value;
    }

    /**
     * Gets the value of the kprq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKprq() {
        return kprq;
    }

    /**
     * Sets the value of the kprq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKprq(String value) {
        this.kprq = value;
    }

    /**
     * Gets the value of the fpDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpDm() {
        return fpDm;
    }

    /**
     * Sets the value of the fpDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpDm(String value) {
        this.fpDm = value;
    }

    /**
     * Gets the value of the zwjduuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwjduuid() {
        return zwjduuid;
    }

    /**
     * Sets the value of the zwjduuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwjduuid(String value) {
        this.zwjduuid = value;
    }

    /**
     * Gets the value of the lrrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLrrDm() {
        return lrrDm;
    }

    /**
     * Sets the value of the lrrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLrrDm(String value) {
        this.lrrDm = value;
    }

    /**
     * Gets the value of the fpkjfnsrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkjfnsrmc() {
        return fpkjfnsrmc;
    }

    /**
     * Sets the value of the fpkjfnsrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkjfnsrmc(String value) {
        this.fpkjfnsrmc = value;
    }

    /**
     * Gets the value of the xgrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXgrDm() {
        return xgrDm;
    }

    /**
     * Sets the value of the xgrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXgrDm(String value) {
        this.xgrDm = value;
    }

    /**
     * Gets the value of the fplyfnsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFplyfnsrsbh() {
        return fplyfnsrsbh;
    }

    /**
     * Sets the value of the fplyfnsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFplyfnsrsbh(String value) {
        this.fplyfnsrsbh = value;
    }

    /**
     * Gets the value of the jdrq1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJdrq1() {
        return jdrq1;
    }

    /**
     * Sets the value of the jdrq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdrq1(String value) {
        this.jdrq1 = value;
    }

}