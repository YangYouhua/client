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
 * ��Ʊ�����ֿ۷ְ���Ʊ��ϸVO
 * 
 * <p>Java class for FPDkTszgDkfbfpmxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDkTszgDkfbfpmxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fbfdjxh" type="{http://www.chinatax.gov.cn/dataspec/}fbfdjxh"/>
 *         &lt;element name="fbgcxmmc" type="{http://www.chinatax.gov.cn/dataspec/}fbgcxmmc"/>
 *         &lt;element name="zbdjxh" type="{http://www.chinatax.gov.cn/dataspec/}zbdjxh"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="kpje" type="{http://www.chinatax.gov.cn/dataspec/}kpje"/>
 *         &lt;element name="fbrmc" type="{http://www.chinatax.gov.cn/dataspec/}fbrmc"/>
 *         &lt;element name="zbfgcxmbh" type="{http://www.chinatax.gov.cn/dataspec/}zbfgcxmbh"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="fbrnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}fbrnsrsbh"/>
 *         &lt;element name="fbfgcxmbh" type="{http://www.chinatax.gov.cn/dataspec/}fbfgcxmbh"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="kplxbz" type="{http://www.chinatax.gov.cn/dataspec/}kplxbz"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="zbgcxmmc" type="{http://www.chinatax.gov.cn/dataspec/}zbgcxmmc"/>
 *         &lt;element name="uuid" type="{http://www.chinatax.gov.cn/dataspec/}uuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDkTszgDkfbfpmxVO", propOrder = {
    "sjgsdq",
    "fbfdjxh",
    "fbgcxmmc",
    "zbdjxh",
    "fphm",
    "fpzlDm",
    "kpje",
    "fbrmc",
    "zbfgcxmbh",
    "fpDm",
    "fbrnsrsbh",
    "fbfgcxmbh",
    "lrrDm",
    "kplxbz",
    "xgrDm",
    "zbgcxmmc",
    "uuid"
})
public class FPDkTszgDkfbfpmxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fbfdjxh;
    @XmlElement(required = true, nillable = true)
    protected String fbgcxmmc;
    @XmlElement(required = true, nillable = true)
    protected String zbdjxh;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double kpje;
    @XmlElement(required = true, nillable = true)
    protected String fbrmc;
    @XmlElement(required = true, nillable = true)
    protected String zbfgcxmbh;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String fbrnsrsbh;
    @XmlElement(required = true, nillable = true)
    protected String fbfgcxmbh;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String kplxbz;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String zbgcxmmc;
    @XmlElement(required = true, nillable = true)
    protected String uuid;

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
     * Gets the value of the fbfdjxh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbfdjxh() {
        return fbfdjxh;
    }

    /**
     * Sets the value of the fbfdjxh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbfdjxh(String value) {
        this.fbfdjxh = value;
    }

    /**
     * Gets the value of the fbgcxmmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbgcxmmc() {
        return fbgcxmmc;
    }

    /**
     * Sets the value of the fbgcxmmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbgcxmmc(String value) {
        this.fbgcxmmc = value;
    }

    /**
     * Gets the value of the zbdjxh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbdjxh() {
        return zbdjxh;
    }

    /**
     * Sets the value of the zbdjxh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbdjxh(String value) {
        this.zbdjxh = value;
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
     * Gets the value of the fbrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbrmc() {
        return fbrmc;
    }

    /**
     * Sets the value of the fbrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbrmc(String value) {
        this.fbrmc = value;
    }

    /**
     * Gets the value of the zbfgcxmbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbfgcxmbh() {
        return zbfgcxmbh;
    }

    /**
     * Sets the value of the zbfgcxmbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbfgcxmbh(String value) {
        this.zbfgcxmbh = value;
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
     * Gets the value of the fbrnsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbrnsrsbh() {
        return fbrnsrsbh;
    }

    /**
     * Sets the value of the fbrnsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbrnsrsbh(String value) {
        this.fbrnsrsbh = value;
    }

    /**
     * Gets the value of the fbfgcxmbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbfgcxmbh() {
        return fbfgcxmbh;
    }

    /**
     * Sets the value of the fbfgcxmbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbfgcxmbh(String value) {
        this.fbfgcxmbh = value;
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
     * Gets the value of the kplxbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKplxbz() {
        return kplxbz;
    }

    /**
     * Sets the value of the kplxbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKplxbz(String value) {
        this.kplxbz = value;
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
     * Gets the value of the zbgcxmmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbgcxmmc() {
        return zbgcxmmc;
    }

    /**
     * Sets the value of the zbgcxmmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbgcxmmc(String value) {
        this.zbgcxmmc = value;
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

}