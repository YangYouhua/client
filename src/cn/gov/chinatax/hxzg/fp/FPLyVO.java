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
 * ��Ʊ����VO
 * 
 * <p>Java class for FPLyVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPLyVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="fplyuuid" type="{http://www.chinatax.gov.cn/dataspec/}fplyuuid"/>
 *         &lt;element name="fpkfDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkfDm"/>
 *         &lt;element name="sfzjlxDm" type="{http://www.chinatax.gov.cn/dataspec/}sfzjlxDm"/>
 *         &lt;element name="gprxm" type="{http://www.chinatax.gov.cn/dataspec/}gprxm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="slswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}slswjgDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="slrq" type="{http://www.chinatax.gov.cn/dataspec/}slrq"/>
 *         &lt;element name="slrDm" type="{http://www.chinatax.gov.cn/dataspec/}slrDm"/>
 *         &lt;element name="sfzjhm" type="{http://www.chinatax.gov.cn/dataspec/}sfzjhm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPLyVO", propOrder = {
    "sjgsdq",
    "djxh",
    "fplyuuid",
    "fpkfDm",
    "sfzjlxDm",
    "gprxm",
    "lrrDm",
    "slswjgDm",
    "xgrDm",
    "slrq",
    "slrDm",
    "sfzjhm"
})
public class FPLyVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String fplyuuid;
    @XmlElement(required = true, nillable = true)
    protected String fpkfDm;
    @XmlElement(required = true, nillable = true)
    protected String sfzjlxDm;
    @XmlElement(required = true, nillable = true)
    protected String gprxm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String slswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String slrq;
    @XmlElement(required = true, nillable = true)
    protected String slrDm;
    @XmlElement(required = true, nillable = true)
    protected String sfzjhm;

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
     * Gets the value of the fplyuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFplyuuid() {
        return fplyuuid;
    }

    /**
     * Sets the value of the fplyuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFplyuuid(String value) {
        this.fplyuuid = value;
    }

    /**
     * Gets the value of the fpkfDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkfDm() {
        return fpkfDm;
    }

    /**
     * Sets the value of the fpkfDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkfDm(String value) {
        this.fpkfDm = value;
    }

    /**
     * Gets the value of the sfzjlxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzjlxDm() {
        return sfzjlxDm;
    }

    /**
     * Sets the value of the sfzjlxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzjlxDm(String value) {
        this.sfzjlxDm = value;
    }

    /**
     * Gets the value of the gprxm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprxm() {
        return gprxm;
    }

    /**
     * Sets the value of the gprxm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprxm(String value) {
        this.gprxm = value;
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

    /**
     * Gets the value of the sfzjhm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzjhm() {
        return sfzjhm;
    }

    /**
     * Sets the value of the sfzjhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzjhm(String value) {
        this.sfzjhm = value;
    }

}