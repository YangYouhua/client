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
 * 发票纳税人结存历史VO
 * 
 * <p>Java class for FPNsrfpjcLsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPNsrfpjcLsVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="fpzzhm" type="{http://www.chinatax.gov.cn/dataspec/}fpzzhm"/>
 *         &lt;element name="fpqshm" type="{http://www.chinatax.gov.cn/dataspec/}fpqshm"/>
 *         &lt;element name="fs" type="{http://www.chinatax.gov.cn/dataspec/}fs"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="fpztDm" type="{http://www.chinatax.gov.cn/dataspec/}fpztDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="swjgDm" type="{http://www.chinatax.gov.cn/dataspec/}swjgDm"/>
 *         &lt;element name="nsrjcuuid" type="{http://www.chinatax.gov.cn/dataspec/}nsrjcuuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPNsrfpjcLsVO", propOrder = {
    "sjgsdq",
    "fpzlDm",
    "djxh",
    "fpzzhm",
    "fpqshm",
    "fs",
    "fpDm",
    "lrrDm",
    "fpztDm",
    "xgrDm",
    "swjgDm",
    "nsrjcuuid"
})
public class FPNsrfpjcLsVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String fpzzhm;
    @XmlElement(required = true, nillable = true)
    protected String fpqshm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double fs;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String fpztDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String swjgDm;
    @XmlElement(required = true, nillable = true)
    protected String nsrjcuuid;

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
     * Gets the value of the fpzzhm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpzzhm() {
        return fpzzhm;
    }

    /**
     * Sets the value of the fpzzhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpzzhm(String value) {
        this.fpzzhm = value;
    }

    /**
     * Gets the value of the fpqshm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpqshm() {
        return fpqshm;
    }

    /**
     * Sets the value of the fpqshm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpqshm(String value) {
        this.fpqshm = value;
    }

    /**
     * Gets the value of the fs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFs() {
        return fs;
    }

    /**
     * Sets the value of the fs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFs(Double value) {
        this.fs = value;
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
     * Gets the value of the fpztDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpztDm() {
        return fpztDm;
    }

    /**
     * Sets the value of the fpztDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpztDm(String value) {
        this.fpztDm = value;
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
     * Gets the value of the nsrjcuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsrjcuuid() {
        return nsrjcuuid;
    }

    /**
     * Sets the value of the nsrjcuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsrjcuuid(String value) {
        this.nsrjcuuid = value;
    }

}
