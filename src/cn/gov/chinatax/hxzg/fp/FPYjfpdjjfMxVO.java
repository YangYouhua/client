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
 * �н���Ʊ�ҽ�������ϸVO
 * 
 * <p>Java class for FPYjfpdjjfMxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPYjfpdjjfMxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="kpje" type="{http://www.chinatax.gov.cn/dataspec/}kpje"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="sjzfje" type="{http://www.chinatax.gov.cn/dataspec/}sjzfje"/>
 *         &lt;element name="zjje" type="{http://www.chinatax.gov.cn/dataspec/}zjje"/>
 *         &lt;element name="djgfmxuuid" type="{http://www.chinatax.gov.cn/dataspec/}djgfmxuuid"/>
 *         &lt;element name="dkgrsds" type="{http://www.chinatax.gov.cn/dataspec/}dkgrsds"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="yzpzxh" type="{http://www.chinatax.gov.cn/dataspec/}yzpzxh"/>
 *         &lt;element name="djgfuuid" type="{http://www.chinatax.gov.cn/dataspec/}djgfuuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPYjfpdjjfMxVO", propOrder = {
    "sjgsdq",
    "fphm",
    "fpzlDm",
    "kpje",
    "fpDm",
    "sjzfje",
    "zjje",
    "djgfmxuuid",
    "dkgrsds",
    "lrrDm",
    "xgrDm",
    "yzpzxh",
    "djgfuuid"
})
public class FPYjfpdjjfMxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double kpje;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double sjzfje;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double zjje;
    @XmlElement(required = true, nillable = true)
    protected String djgfmxuuid;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dkgrsds;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String yzpzxh;
    @XmlElement(required = true, nillable = true)
    protected String djgfuuid;

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
     * Gets the value of the sjzfje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSjzfje() {
        return sjzfje;
    }

    /**
     * Sets the value of the sjzfje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSjzfje(Double value) {
        this.sjzfje = value;
    }

    /**
     * Gets the value of the zjje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZjje() {
        return zjje;
    }

    /**
     * Sets the value of the zjje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZjje(Double value) {
        this.zjje = value;
    }

    /**
     * Gets the value of the djgfmxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDjgfmxuuid() {
        return djgfmxuuid;
    }

    /**
     * Sets the value of the djgfmxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDjgfmxuuid(String value) {
        this.djgfmxuuid = value;
    }

    /**
     * Gets the value of the dkgrsds property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDkgrsds() {
        return dkgrsds;
    }

    /**
     * Sets the value of the dkgrsds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDkgrsds(Double value) {
        this.dkgrsds = value;
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
     * Gets the value of the yzpzxh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzpzxh() {
        return yzpzxh;
    }

    /**
     * Sets the value of the yzpzxh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzpzxh(String value) {
        this.yzpzxh = value;
    }

    /**
     * Gets the value of the djgfuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDjgfuuid() {
        return djgfuuid;
    }

    /**
     * Sets the value of the djgfuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDjgfuuid(String value) {
        this.djgfuuid = value;
    }

}