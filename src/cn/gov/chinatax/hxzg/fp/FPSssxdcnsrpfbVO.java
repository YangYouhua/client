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
 * ��˰���������˰���ɷ���VO
 * 
 * <p>Java class for FPSssxdcnsrpfbVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSssxdcnsrpfbVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="dcrjh" type="{http://www.chinatax.gov.cn/dataspec/}dcrjh"/>
 *         &lt;element name="sssxdcnsruuid" type="{http://www.chinatax.gov.cn/dataspec/}sssxdcnsruuid"/>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="pfrDm" type="{http://www.chinatax.gov.cn/dataspec/}pfrDm"/>
 *         &lt;element name="lsrwbh" type="{http://www.chinatax.gov.cn/dataspec/}lsrwbh"/>
 *         &lt;element name="dcrDm" type="{http://www.chinatax.gov.cn/dataspec/}dcrDm"/>
 *         &lt;element name="dcswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}dcswjgDm"/>
 *         &lt;element name="jsrDm" type="{http://www.chinatax.gov.cn/dataspec/}jsrDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="pfswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}pfswjgDm"/>
 *         &lt;element name="jsrjh" type="{http://www.chinatax.gov.cn/dataspec/}jsrjh"/>
 *         &lt;element name="xguuid" type="{http://www.chinatax.gov.cn/dataspec/}xguuid"/>
 *         &lt;element name="jsjgDm" type="{http://www.chinatax.gov.cn/dataspec/}jsjgDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="blztDm" type="{http://www.chinatax.gov.cn/dataspec/}blztDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPSssxdcnsrpfbVO", propOrder = {
    "sjgsdq",
    "dcrjh",
    "sssxdcnsruuid",
    "lcslid",
    "pfrDm",
    "lsrwbh",
    "dcrDm",
    "dcswjgDm",
    "jsrDm",
    "lrrDm",
    "pfswjgDm",
    "jsrjh",
    "xguuid",
    "jsjgDm",
    "xgrDm",
    "blztDm"
})
@XmlSeeAlso({
    FPSssxdcnsrpfbVOEx.class
})
public class FPSssxdcnsrpfbVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String dcrjh;
    @XmlElement(required = true, nillable = true)
    protected String sssxdcnsruuid;
    @XmlElement(required = true, nillable = true)
    protected String lcslid;
    @XmlElement(required = true, nillable = true)
    protected String pfrDm;
    @XmlElement(required = true, nillable = true)
    protected String lsrwbh;
    @XmlElement(required = true, nillable = true)
    protected String dcrDm;
    @XmlElement(required = true, nillable = true)
    protected String dcswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String jsrDm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String pfswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String jsrjh;
    @XmlElement(required = true, nillable = true)
    protected String xguuid;
    @XmlElement(required = true, nillable = true)
    protected String jsjgDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String blztDm;

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
     * Gets the value of the dcrjh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcrjh() {
        return dcrjh;
    }

    /**
     * Sets the value of the dcrjh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcrjh(String value) {
        this.dcrjh = value;
    }

    /**
     * Gets the value of the sssxdcnsruuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSssxdcnsruuid() {
        return sssxdcnsruuid;
    }

    /**
     * Sets the value of the sssxdcnsruuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSssxdcnsruuid(String value) {
        this.sssxdcnsruuid = value;
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
     * Gets the value of the pfrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfrDm() {
        return pfrDm;
    }

    /**
     * Sets the value of the pfrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfrDm(String value) {
        this.pfrDm = value;
    }

    /**
     * Gets the value of the lsrwbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsrwbh() {
        return lsrwbh;
    }

    /**
     * Sets the value of the lsrwbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsrwbh(String value) {
        this.lsrwbh = value;
    }

    /**
     * Gets the value of the dcrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcrDm() {
        return dcrDm;
    }

    /**
     * Sets the value of the dcrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcrDm(String value) {
        this.dcrDm = value;
    }

    /**
     * Gets the value of the dcswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcswjgDm() {
        return dcswjgDm;
    }

    /**
     * Sets the value of the dcswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcswjgDm(String value) {
        this.dcswjgDm = value;
    }

    /**
     * Gets the value of the jsrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsrDm() {
        return jsrDm;
    }

    /**
     * Sets the value of the jsrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsrDm(String value) {
        this.jsrDm = value;
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
     * Gets the value of the pfswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfswjgDm() {
        return pfswjgDm;
    }

    /**
     * Sets the value of the pfswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfswjgDm(String value) {
        this.pfswjgDm = value;
    }

    /**
     * Gets the value of the jsrjh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsrjh() {
        return jsrjh;
    }

    /**
     * Sets the value of the jsrjh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsrjh(String value) {
        this.jsrjh = value;
    }

    /**
     * Gets the value of the xguuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXguuid() {
        return xguuid;
    }

    /**
     * Sets the value of the xguuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXguuid(String value) {
        this.xguuid = value;
    }

    /**
     * Gets the value of the jsjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsjgDm() {
        return jsjgDm;
    }

    /**
     * Sets the value of the jsjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsjgDm(String value) {
        this.jsjgDm = value;
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
     * Gets the value of the blztDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlztDm() {
        return blztDm;
    }

    /**
     * Sets the value of the blztDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlztDm(String value) {
        this.blztDm = value;
    }

}