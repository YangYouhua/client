//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 下午 CST 
//


package cn.gov.chinatax.hxzg.fp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 统一受理监控信息VO
 * 
 * <p>Java class for TyslJkxxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TyslJkxxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jkxmDm" type="{http://www.chinatax.gov.cn/dataspec/}jkxmDm"/>
 *         &lt;element name="jkxmmc" type="{http://www.chinatax.gov.cn/dataspec/}jkxmmc"/>
 *         &lt;element name="jkl" type="{http://www.chinatax.gov.cn/dataspec/}jkl"/>
 *         &lt;element name="jkff" type="{http://www.chinatax.gov.cn/dataspec/}jkff"/>
 *         &lt;element name="jkxmms" type="{http://www.chinatax.gov.cn/dataspec/}jkxmms"/>
 *         &lt;element name="jkxmlxDm" type="{http://www.chinatax.gov.cn/dataspec/}jkxmlxDm"/>
 *         &lt;element name="jkxmlxmc" type="{http://www.chinatax.gov.cn/dataspec/}jkxmlxmc"/>
 *         &lt;element name="lcswsxDm" type="{http://www.chinatax.gov.cn/dataspec/}lcswsxDm"/>
 *         &lt;element name="swjgDm" type="{http://www.chinatax.gov.cn/dataspec/}swjgDm"/>
 *         &lt;element name="slswsxDm" type="{http://www.chinatax.gov.cn/dataspec/}slswsxDm"/>
 *         &lt;element name="jkcfff" type="{http://www.chinatax.gov.cn/dataspec/}jkcfff"/>
 *         &lt;element name="sqlxh" type="{http://www.chinatax.gov.cn/dataspec/}sqlxh"/>
 *         &lt;element name="zxtDm" type="{http://www.chinatax.gov.cn/dataspec/}zxtDm"/>
 *         &lt;element name="ckxx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jkjgDm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jkjgmc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gyxx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="djzclxDm" type="{http://www.chinatax.gov.cn/dataspec/}djzclxDm"/>
 *         &lt;element name="nsrztDm" type="{http://www.chinatax.gov.cn/dataspec/}nsrztDm"/>
 *         &lt;element name="kzztdjlxDm" type="{http://www.chinatax.gov.cn/dataspec/}kzztdjlxDm"/>
 *         &lt;element name="fjmqybz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zsxmDm" type="{http://www.chinatax.gov.cn/dataspec/}zsxmDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TyslJkxxVO", propOrder = {
    "jkxmDm",
    "jkxmmc",
    "jkl",
    "jkff",
    "jkxmms",
    "jkxmlxDm",
    "jkxmlxmc",
    "lcswsxDm",
    "swjgDm",
    "slswsxDm",
    "jkcfff",
    "sqlxh",
    "zxtDm",
    "ckxx",
    "jkjgDm",
    "jkjgmc",
    "gyxx",
    "djxh",
    "djzclxDm",
    "nsrztDm",
    "kzztdjlxDm",
    "fjmqybz",
    "zsxmDm"
})
public class TyslJkxxVO {

    @XmlElement(required = true, nillable = true)
    protected String jkxmDm;
    @XmlElement(required = true, nillable = true)
    protected String jkxmmc;
    @XmlElement(required = true, nillable = true)
    protected String jkl;
    @XmlElement(required = true, nillable = true)
    protected String jkff;
    @XmlElement(required = true, nillable = true)
    protected String jkxmms;
    @XmlElement(required = true, nillable = true)
    protected String jkxmlxDm;
    @XmlElement(required = true, nillable = true)
    protected String jkxmlxmc;
    @XmlElement(required = true, nillable = true)
    protected String lcswsxDm;
    @XmlElement(required = true, nillable = true)
    protected String swjgDm;
    @XmlElement(required = true, nillable = true)
    protected String slswsxDm;
    @XmlElement(required = true, nillable = true)
    protected String jkcfff;
    @XmlElement(required = true, nillable = true)
    protected String sqlxh;
    @XmlElement(required = true, nillable = true)
    protected String zxtDm;
    @XmlElement(required = true, nillable = true)
    protected String ckxx;
    @XmlElement(required = true, nillable = true)
    protected String jkjgDm;
    @XmlElement(required = true, nillable = true)
    protected String jkjgmc;
    @XmlElement(required = true, nillable = true)
    protected String gyxx;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String djzclxDm;
    @XmlElement(required = true, nillable = true)
    protected String nsrztDm;
    @XmlElement(required = true, nillable = true)
    protected String kzztdjlxDm;
    @XmlElement(required = true, nillable = true)
    protected String fjmqybz;
    @XmlElement(required = true, nillable = true)
    protected String zsxmDm;

    /**
     * Gets the value of the jkxmDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkxmDm() {
        return jkxmDm;
    }

    /**
     * Sets the value of the jkxmDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkxmDm(String value) {
        this.jkxmDm = value;
    }

    /**
     * Gets the value of the jkxmmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkxmmc() {
        return jkxmmc;
    }

    /**
     * Sets the value of the jkxmmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkxmmc(String value) {
        this.jkxmmc = value;
    }

    /**
     * Gets the value of the jkl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkl() {
        return jkl;
    }

    /**
     * Sets the value of the jkl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkl(String value) {
        this.jkl = value;
    }

    /**
     * Gets the value of the jkff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkff() {
        return jkff;
    }

    /**
     * Sets the value of the jkff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkff(String value) {
        this.jkff = value;
    }

    /**
     * Gets the value of the jkxmms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkxmms() {
        return jkxmms;
    }

    /**
     * Sets the value of the jkxmms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkxmms(String value) {
        this.jkxmms = value;
    }

    /**
     * Gets the value of the jkxmlxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkxmlxDm() {
        return jkxmlxDm;
    }

    /**
     * Sets the value of the jkxmlxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkxmlxDm(String value) {
        this.jkxmlxDm = value;
    }

    /**
     * Gets the value of the jkxmlxmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkxmlxmc() {
        return jkxmlxmc;
    }

    /**
     * Sets the value of the jkxmlxmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkxmlxmc(String value) {
        this.jkxmlxmc = value;
    }

    /**
     * Gets the value of the lcswsxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcswsxDm() {
        return lcswsxDm;
    }

    /**
     * Sets the value of the lcswsxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcswsxDm(String value) {
        this.lcswsxDm = value;
    }

    /**
     * Gets the value of the swjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwjgDm() {
        return swjgDm;
    }

    /**
     * Sets the value of the swjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwjgDm(String value) {
        this.swjgDm = value;
    }

    /**
     * Gets the value of the slswsxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlswsxDm() {
        return slswsxDm;
    }

    /**
     * Sets the value of the slswsxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlswsxDm(String value) {
        this.slswsxDm = value;
    }

    /**
     * Gets the value of the jkcfff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkcfff() {
        return jkcfff;
    }

    /**
     * Sets the value of the jkcfff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkcfff(String value) {
        this.jkcfff = value;
    }

    /**
     * Gets the value of the sqlxh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlxh() {
        return sqlxh;
    }

    /**
     * Sets the value of the sqlxh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlxh(String value) {
        this.sqlxh = value;
    }

    /**
     * Gets the value of the zxtDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZxtDm() {
        return zxtDm;
    }

    /**
     * Sets the value of the zxtDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZxtDm(String value) {
        this.zxtDm = value;
    }

    /**
     * Gets the value of the ckxx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkxx() {
        return ckxx;
    }

    /**
     * Sets the value of the ckxx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkxx(String value) {
        this.ckxx = value;
    }

    /**
     * Gets the value of the jkjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkjgDm() {
        return jkjgDm;
    }

    /**
     * Sets the value of the jkjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkjgDm(String value) {
        this.jkjgDm = value;
    }

    /**
     * Gets the value of the jkjgmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkjgmc() {
        return jkjgmc;
    }

    /**
     * Sets the value of the jkjgmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkjgmc(String value) {
        this.jkjgmc = value;
    }

    /**
     * Gets the value of the gyxx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGyxx() {
        return gyxx;
    }

    /**
     * Sets the value of the gyxx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGyxx(String value) {
        this.gyxx = value;
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
     * Gets the value of the djzclxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDjzclxDm() {
        return djzclxDm;
    }

    /**
     * Sets the value of the djzclxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDjzclxDm(String value) {
        this.djzclxDm = value;
    }

    /**
     * Gets the value of the nsrztDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsrztDm() {
        return nsrztDm;
    }

    /**
     * Sets the value of the nsrztDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsrztDm(String value) {
        this.nsrztDm = value;
    }

    /**
     * Gets the value of the kzztdjlxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzztdjlxDm() {
        return kzztdjlxDm;
    }

    /**
     * Sets the value of the kzztdjlxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzztdjlxDm(String value) {
        this.kzztdjlxDm = value;
    }

    /**
     * Gets the value of the fjmqybz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjmqybz() {
        return fjmqybz;
    }

    /**
     * Sets the value of the fjmqybz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjmqybz(String value) {
        this.fjmqybz = value;
    }

    /**
     * Gets the value of the zsxmDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsxmDm() {
        return zsxmDm;
    }

    /**
     * Sets the value of the zsxmDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsxmDm(String value) {
        this.zsxmDm = value;
    }

}
