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
 * ������Ʊ��Ϣ�ɼ���VO
 * 
 * <p>Java class for FPDkfpxxcjbVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDkfpxxcjbVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="skfsfsbh" type="{http://www.chinatax.gov.cn/dataspec/}skfsfsbh"/>
 *         &lt;element name="fkfsfsbh" type="{http://www.chinatax.gov.cn/dataspec/}fkfsfsbh"/>
 *         &lt;element name="fkfmc" type="{http://www.chinatax.gov.cn/dataspec/}fkfmc"/>
 *         &lt;element name="kprq" type="{http://www.chinatax.gov.cn/dataspec/}kprq"/>
 *         &lt;element name="fpzlmc" type="{http://www.chinatax.gov.cn/dataspec/}fpzlmc"/>
 *         &lt;element name="zfbj" type="{http://www.chinatax.gov.cn/dataspec/}zfbj"/>
 *         &lt;element name="je" type="{http://www.chinatax.gov.cn/dataspec/}je"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="hwlwmc" type="{http://www.chinatax.gov.cn/dataspec/}hwlwmc"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="uuid" type="{http://www.chinatax.gov.cn/dataspec/}uuid"/>
 *         &lt;element name="skfmc" type="{http://www.chinatax.gov.cn/dataspec/}skfmc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDkfpxxcjbVO", propOrder = {
    "sjgsdq",
    "fphm",
    "fpzlDm",
    "skfsfsbh",
    "fkfsfsbh",
    "fkfmc",
    "kprq",
    "fpzlmc",
    "zfbj",
    "je",
    "lrrDm",
    "hwlwmc",
    "xgrDm",
    "uuid",
    "skfmc"
})
public class FPDkfpxxcjbVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String skfsfsbh;
    @XmlElement(required = true, nillable = true)
    protected String fkfsfsbh;
    @XmlElement(required = true, nillable = true)
    protected String fkfmc;
    @XmlElement(required = true, nillable = true)
    protected String kprq;
    @XmlElement(required = true, nillable = true)
    protected String fpzlmc;
    @XmlElement(required = true, nillable = true)
    protected String zfbj;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double je;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String hwlwmc;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String uuid;
    @XmlElement(required = true, nillable = true)
    protected String skfmc;

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
     * Gets the value of the skfsfsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkfsfsbh() {
        return skfsfsbh;
    }

    /**
     * Sets the value of the skfsfsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkfsfsbh(String value) {
        this.skfsfsbh = value;
    }

    /**
     * Gets the value of the fkfsfsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkfsfsbh() {
        return fkfsfsbh;
    }

    /**
     * Sets the value of the fkfsfsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkfsfsbh(String value) {
        this.fkfsfsbh = value;
    }

    /**
     * Gets the value of the fkfmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkfmc() {
        return fkfmc;
    }

    /**
     * Sets the value of the fkfmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkfmc(String value) {
        this.fkfmc = value;
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
     * Gets the value of the fpzlmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpzlmc() {
        return fpzlmc;
    }

    /**
     * Sets the value of the fpzlmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpzlmc(String value) {
        this.fpzlmc = value;
    }

    /**
     * Gets the value of the zfbj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfbj() {
        return zfbj;
    }

    /**
     * Sets the value of the zfbj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfbj(String value) {
        this.zfbj = value;
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
     * Gets the value of the hwlwmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHwlwmc() {
        return hwlwmc;
    }

    /**
     * Sets the value of the hwlwmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHwlwmc(String value) {
        this.hwlwmc = value;
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
     * Gets the value of the skfmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkfmc() {
        return skfmc;
    }

    /**
     * Sets the value of the skfmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkfmc(String value) {
        this.skfmc = value;
    }

}