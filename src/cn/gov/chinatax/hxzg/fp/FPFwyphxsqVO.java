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
import javax.xml.bind.annotation.XmlType;


/**
 * ��Ʊ��α��Ʒ��������VO
 * 
 * <p>Java class for FPFwyphxsqVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPFwyphxsqVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="jxrDm1" type="{http://www.chinatax.gov.cn/dataspec/}jxrDm1"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="hdslid" type="{http://www.chinatax.gov.cn/dataspec/}hdslid"/>
 *         &lt;element name="hxrq" type="{http://www.chinatax.gov.cn/dataspec/}hxrq"/>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="sqrq" type="{http://www.chinatax.gov.cn/dataspec/}sqrq"/>
 *         &lt;element name="sqr" type="{http://www.chinatax.gov.cn/dataspec/}sqr"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="hxrxm" type="{http://www.chinatax.gov.cn/dataspec/}hxrxm"/>
 *         &lt;element name="slswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}slswjgDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="hxdd" type="{http://www.chinatax.gov.cn/dataspec/}hxdd"/>
 *         &lt;element name="fwhxuuid" type="{http://www.chinatax.gov.cn/dataspec/}fwhxuuid"/>
 *         &lt;element name="slrq" type="{http://www.chinatax.gov.cn/dataspec/}slrq"/>
 *         &lt;element name="slrDm" type="{http://www.chinatax.gov.cn/dataspec/}slrDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPFwyphxsqVO", propOrder = {
    "sjgsdq",
    "jxrDm1",
    "djxh",
    "hdslid",
    "hxrq",
    "lcslid",
    "sqrq",
    "sqr",
    "lrrDm",
    "hxrxm",
    "slswjgDm",
    "xgrDm",
    "hxdd",
    "fwhxuuid",
    "slrq",
    "slrDm"
})
public class FPFwyphxsqVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String jxrDm1;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String hdslid;
    @XmlElement(required = true, nillable = true)
    protected String hxrq;
    @XmlElement(required = true, nillable = true)
    protected String lcslid;
    @XmlElement(required = true, nillable = true)
    protected String sqrq;
    @XmlElement(required = true, nillable = true)
    protected String sqr;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String hxrxm;
    @XmlElement(required = true, nillable = true)
    protected String slswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String hxdd;
    @XmlElement(required = true, nillable = true)
    protected String fwhxuuid;
    @XmlElement(required = true, nillable = true)
    protected String slrq;
    @XmlElement(required = true, nillable = true)
    protected String slrDm;

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
     * Gets the value of the jxrDm1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJxrDm1() {
        return jxrDm1;
    }

    /**
     * Sets the value of the jxrDm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJxrDm1(String value) {
        this.jxrDm1 = value;
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
     * Gets the value of the hdslid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdslid() {
        return hdslid;
    }

    /**
     * Sets the value of the hdslid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdslid(String value) {
        this.hdslid = value;
    }

    /**
     * Gets the value of the hxrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHxrq() {
        return hxrq;
    }

    /**
     * Sets the value of the hxrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHxrq(String value) {
        this.hxrq = value;
    }

    /**
     * Gets the value of the lcslid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcslid() {
        return lcslid;
    }

    /**
     * Sets the value of the lcslid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcslid(String value) {
        this.lcslid = value;
    }

    /**
     * Gets the value of the sqrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqrq() {
        return sqrq;
    }

    /**
     * Sets the value of the sqrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqrq(String value) {
        this.sqrq = value;
    }

    /**
     * Gets the value of the sqr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqr() {
        return sqr;
    }

    /**
     * Sets the value of the sqr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqr(String value) {
        this.sqr = value;
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
     * Gets the value of the hxrxm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHxrxm() {
        return hxrxm;
    }

    /**
     * Sets the value of the hxrxm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHxrxm(String value) {
        this.hxrxm = value;
    }

    /**
     * Gets the value of the slswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlswjgDm() {
        return slswjgDm;
    }

    /**
     * Sets the value of the slswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlswjgDm(String value) {
        this.slswjgDm = value;
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
     * Gets the value of the hxdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHxdd() {
        return hxdd;
    }

    /**
     * Sets the value of the hxdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHxdd(String value) {
        this.hxdd = value;
    }

    /**
     * Gets the value of the fwhxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwhxuuid() {
        return fwhxuuid;
    }

    /**
     * Sets the value of the fwhxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwhxuuid(String value) {
        this.fwhxuuid = value;
    }

    /**
     * Gets the value of the slrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlrq() {
        return slrq;
    }

    /**
     * Sets the value of the slrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlrq(String value) {
        this.slrq = value;
    }

    /**
     * Gets the value of the slrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlrDm() {
        return slrDm;
    }

    /**
     * Sets the value of the slrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlrDm(String value) {
        this.slrDm = value;
    }

}
