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
 * ��α˰��ϵͳ��Ʊ�齻��VO
 * 
 * <p>Java class for FPFpyjjFwskVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPFpyjjFwskVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="fpyjjuuid" type="{http://www.chinatax.gov.cn/dataspec/}fpyjjuuid"/>
 *         &lt;element name="se" type="{http://www.chinatax.gov.cn/dataspec/}se"/>
 *         &lt;element name="fpzzhm" type="{http://www.chinatax.gov.cn/dataspec/}fpzzhm"/>
 *         &lt;element name="fptkztDm" type="{http://www.chinatax.gov.cn/dataspec/}fptkztDm"/>
 *         &lt;element name="fs" type="{http://www.chinatax.gov.cn/dataspec/}fs"/>
 *         &lt;element name="fpqshm" type="{http://www.chinatax.gov.cn/dataspec/}fpqshm"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="kprq" type="{http://www.chinatax.gov.cn/dataspec/}kprq"/>
 *         &lt;element name="je" type="{http://www.chinatax.gov.cn/dataspec/}je"/>
 *         &lt;element name="fplxDm" type="{http://www.chinatax.gov.cn/dataspec/}fplxDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="tkrqz" type="{http://www.chinatax.gov.cn/dataspec/}tkrqz"/>
 *         &lt;element name="tkrqq" type="{http://www.chinatax.gov.cn/dataspec/}tkrqq"/>
 *         &lt;element name="yxbz" type="{http://www.chinatax.gov.cn/dataspec/}yxbz"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPFpyjjFwskVO", propOrder = {
    "sjgsdq",
    "djxh",
    "fpyjjuuid",
    "se",
    "fpzzhm",
    "fptkztDm",
    "fs",
    "fpqshm",
    "fpDm",
    "kprq",
    "je",
    "fplxDm",
    "lrrDm",
    "tkrqz",
    "tkrqq",
    "yxbz",
    "xgrDm"
})
public class FPFpyjjFwskVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String fpyjjuuid;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double se;
    @XmlElement(required = true, nillable = true)
    protected String fpzzhm;
    @XmlElement(required = true, nillable = true)
    protected String fptkztDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double fs;
    @XmlElement(required = true, nillable = true)
    protected String fpqshm;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String kprq;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double je;
    @XmlElement(required = true, nillable = true)
    protected String fplxDm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String tkrqz;
    @XmlElement(required = true, nillable = true)
    protected String tkrqq;
    @XmlElement(required = true, nillable = true)
    protected String yxbz;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;

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
     * Gets the value of the fpyjjuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpyjjuuid() {
        return fpyjjuuid;
    }

    /**
     * Sets the value of the fpyjjuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpyjjuuid(String value) {
        this.fpyjjuuid = value;
    }

    /**
     * Gets the value of the se property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSe() {
        return se;
    }

    /**
     * Sets the value of the se property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSe(Double value) {
        this.se = value;
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
     * Gets the value of the fptkztDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFptkztDm() {
        return fptkztDm;
    }

    /**
     * Sets the value of the fptkztDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFptkztDm(String value) {
        this.fptkztDm = value;
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
     * Gets the value of the je property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJe() {
        return je;
    }

    /**
     * Sets the value of the je property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJe(Double value) {
        this.je = value;
    }

    /**
     * Gets the value of the fplxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFplxDm() {
        return fplxDm;
    }

    /**
     * Sets the value of the fplxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFplxDm(String value) {
        this.fplxDm = value;
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
     * Gets the value of the tkrqz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkrqz() {
        return tkrqz;
    }

    /**
     * Sets the value of the tkrqz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkrqz(String value) {
        this.tkrqz = value;
    }

    /**
     * Gets the value of the tkrqq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkrqq() {
        return tkrqq;
    }

    /**
     * Sets the value of the tkrqq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkrqq(String value) {
        this.tkrqq = value;
    }

    /**
     * Gets the value of the yxbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYxbz() {
        return yxbz;
    }

    /**
     * Sets the value of the yxbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYxbz(String value) {
        this.yxbz = value;
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

}