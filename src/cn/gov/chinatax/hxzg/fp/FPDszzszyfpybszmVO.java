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
 * ��ʧ��ֵ˰ר�÷�Ʊ�ѱ�˰֤��VO
 * 
 * <p>Java class for FPDszzszyfpybszmVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDszzszyfpybszmVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="slrDm" type="{http://www.chinatax.gov.cn/dataspec/}slrDm"/>
 *         &lt;element name="jbrDm" type="{http://www.chinatax.gov.cn/dataspec/}jbrDm"/>
 *         &lt;element name="zsbz" type="{http://www.chinatax.gov.cn/dataspec/}zsbz"/>
 *         &lt;element name="slrq" type="{http://www.chinatax.gov.cn/dataspec/}slrq"/>
 *         &lt;element name="spfdjxh" type="{http://www.chinatax.gov.cn/dataspec/}spfdjxh"/>
 *         &lt;element name="jbr" type="{http://www.chinatax.gov.cn/dataspec/}jbr"/>
 *         &lt;element name="zt" type="{http://www.chinatax.gov.cn/dataspec/}zt"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="spfnsrmc" type="{http://www.chinatax.gov.cn/dataspec/}spfnsrmc"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="uuid" type="{http://www.chinatax.gov.cn/dataspec/}uuid"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="spfnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}spfnsrsbh"/>
 *         &lt;element name="bz" type="{http://www.chinatax.gov.cn/dataspec/}bz"/>
 *         &lt;element name="slswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}slswjgDm"/>
 *         &lt;element name="sqrq" type="{http://www.chinatax.gov.cn/dataspec/}sqrq"/>
 *         &lt;element name="fzr" type="{http://www.chinatax.gov.cn/dataspec/}fzr"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDszzszyfpybszmVO", propOrder = {
    "lcslid",
    "lrrDm",
    "slrDm",
    "jbrDm",
    "zsbz",
    "slrq",
    "spfdjxh",
    "jbr",
    "zt",
    "sjgsdq",
    "spfnsrmc",
    "djxh",
    "uuid",
    "xgrDm",
    "spfnsrsbh",
    "bz",
    "slswjgDm",
    "sqrq",
    "fzr"
})
public class FPDszzszyfpybszmVO {

    @XmlElement(required = true)
    protected String lcslid;
    @XmlElement(required = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String slrDm;
    @XmlElement(required = true, nillable = true)
    protected String jbrDm;
    @XmlElement(required = true)
    protected String zsbz;
    @XmlElement(required = true, nillable = true)
    protected String slrq;
    @XmlElement(required = true, nillable = true)
    protected String spfdjxh;
    @XmlElement(required = true, nillable = true)
    protected String jbr;
    @XmlElement(required = true, nillable = true)
    protected String zt;
    @XmlElement(required = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String spfnsrmc;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String spfnsrsbh;
    @XmlElement(required = true, nillable = true)
    protected String bz;
    @XmlElement(required = true, nillable = true)
    protected String slswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String sqrq;
    @XmlElement(required = true, nillable = true)
    protected String fzr;

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
     * Gets the value of the jbrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJbrDm() {
        return jbrDm;
    }

    /**
     * Sets the value of the jbrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJbrDm(String value) {
        this.jbrDm = value;
    }

    /**
     * Gets the value of the zsbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsbz() {
        return zsbz;
    }

    /**
     * Sets the value of the zsbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsbz(String value) {
        this.zsbz = value;
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
     * Gets the value of the spfdjxh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpfdjxh() {
        return spfdjxh;
    }

    /**
     * Sets the value of the spfdjxh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpfdjxh(String value) {
        this.spfdjxh = value;
    }

    /**
     * Gets the value of the jbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJbr() {
        return jbr;
    }

    /**
     * Sets the value of the jbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJbr(String value) {
        this.jbr = value;
    }

    /**
     * Gets the value of the zt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZt() {
        return zt;
    }

    /**
     * Sets the value of the zt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZt(String value) {
        this.zt = value;
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
     * Gets the value of the spfnsrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpfnsrmc() {
        return spfnsrmc;
    }

    /**
     * Sets the value of the spfnsrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpfnsrmc(String value) {
        this.spfnsrmc = value;
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
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
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
     * Gets the value of the spfnsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpfnsrsbh() {
        return spfnsrsbh;
    }

    /**
     * Sets the value of the spfnsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpfnsrsbh(String value) {
        this.spfnsrsbh = value;
    }

    /**
     * Gets the value of the bz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBz() {
        return bz;
    }

    /**
     * Sets the value of the bz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBz(String value) {
        this.bz = value;
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
     * Gets the value of the fzr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFzr() {
        return fzr;
    }

    /**
     * Sets the value of the fzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFzr(String value) {
        this.fzr = value;
    }

}