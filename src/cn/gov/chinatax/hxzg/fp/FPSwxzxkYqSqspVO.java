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
 * ˰����������������������VO
 * 
 * <p>Java class for FPSwxzxkYqSqspVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSwxzxkYqSqspVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="sqdbh" type="{http://www.chinatax.gov.cn/dataspec/}sqdbh"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="qrycts" type="{http://www.chinatax.gov.cn/dataspec/}qrycts"/>
 *         &lt;element name="sqjdrq" type="{http://www.chinatax.gov.cn/dataspec/}sqjdrq"/>
 *         &lt;element name="hdslid" type="{http://www.chinatax.gov.cn/dataspec/}hdslid"/>
 *         &lt;element name="qrjdrq" type="{http://www.chinatax.gov.cn/dataspec/}qrjdrq"/>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="swxzxkyquuid" type="{http://www.chinatax.gov.cn/dataspec/}swxzxkyquuid"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="sqycts" type="{http://www.chinatax.gov.cn/dataspec/}sqycts"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="swjgDm" type="{http://www.chinatax.gov.cn/dataspec/}swjgDm"/>
 *         &lt;element name="yqyy" type="{http://www.chinatax.gov.cn/dataspec/}yqyy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPSwxzxkYqSqspVO", propOrder = {
    "djxh",
    "sqdbh",
    "sjgsdq",
    "qrycts",
    "sqjdrq",
    "hdslid",
    "qrjdrq",
    "lcslid",
    "swxzxkyquuid",
    "lrrDm",
    "sqycts",
    "xgrDm",
    "swjgDm",
    "yqyy"
})
public class FPSwxzxkYqSqspVO {

    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String sqdbh;
    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double qrycts;
    @XmlElement(required = true, nillable = true)
    protected String sqjdrq;
    @XmlElement(required = true, nillable = true)
    protected String hdslid;
    @XmlElement(required = true, nillable = true)
    protected String qrjdrq;
    @XmlElement(required = true, nillable = true)
    protected String lcslid;
    @XmlElement(required = true, nillable = true)
    protected String swxzxkyquuid;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long sqycts;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String swjgDm;
    @XmlElement(required = true, nillable = true)
    protected String yqyy;

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
     * Gets the value of the sqdbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqdbh() {
        return sqdbh;
    }

    /**
     * Sets the value of the sqdbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqdbh(String value) {
        this.sqdbh = value;
    }

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
     * Gets the value of the qrycts property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQrycts() {
        return qrycts;
    }

    /**
     * Sets the value of the qrycts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQrycts(Double value) {
        this.qrycts = value;
    }

    /**
     * Gets the value of the sqjdrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqjdrq() {
        return sqjdrq;
    }

    /**
     * Sets the value of the sqjdrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqjdrq(String value) {
        this.sqjdrq = value;
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
     * Gets the value of the qrjdrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrjdrq() {
        return qrjdrq;
    }

    /**
     * Sets the value of the qrjdrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrjdrq(String value) {
        this.qrjdrq = value;
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
     * Gets the value of the swxzxkyquuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwxzxkyquuid() {
        return swxzxkyquuid;
    }

    /**
     * Sets the value of the swxzxkyquuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwxzxkyquuid(String value) {
        this.swxzxkyquuid = value;
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
     * Gets the value of the sqycts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSqycts() {
        return sqycts;
    }

    /**
     * Sets the value of the sqycts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSqycts(Long value) {
        this.sqycts = value;
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
     * Gets the value of the yqyy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYqyy() {
        return yqyy;
    }

    /**
     * Sets the value of the yqyy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYqyy(String value) {
        this.yqyy = value;
    }

}