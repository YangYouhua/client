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
 * 已认证增值税扣税凭证清单专用发票抵扣信息VO
 * 
 * <p>Java class for FPYrzzzskspzqdZyfpdkxxxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPYrzzzskspzqdZyfpdkxxxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="dklxDm" type="{http://www.chinatax.gov.cn/dataspec/}dklxDm"/>
 *         &lt;element name="zzszyfpje" type="{http://www.chinatax.gov.cn/dataspec/}zzszyfpje"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="yrzzzskspzqduuid" type="{http://www.chinatax.gov.cn/dataspec/}yrzzzskspzqduuid"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="zzszyfpkpdwnsrmc" type="{http://www.chinatax.gov.cn/dataspec/}zzszyfpkpdwnsrmc"/>
 *         &lt;element name="zzszyfpkpdwnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}zzszyfpkpdwnsrsbh"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="zzszyfpse" type="{http://www.chinatax.gov.cn/dataspec/}zzszyfpse"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="sqdkxxuuid" type="{http://www.chinatax.gov.cn/dataspec/}sqdkxxuuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPYrzzzskspzqdZyfpdkxxxVO", propOrder = {
    "sjgsdq",
    "dklxDm",
    "zzszyfpje",
    "fphm",
    "yrzzzskspzqduuid",
    "fpDm",
    "zzszyfpkpdwnsrmc",
    "zzszyfpkpdwnsrsbh",
    "lrrDm",
    "zzszyfpse",
    "xgrDm",
    "sqdkxxuuid"
})
public class FPYrzzzskspzqdZyfpdkxxxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String dklxDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double zzszyfpje;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, nillable = true)
    protected String yrzzzskspzqduuid;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String zzszyfpkpdwnsrmc;
    @XmlElement(required = true, nillable = true)
    protected String zzszyfpkpdwnsrsbh;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double zzszyfpse;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String sqdkxxuuid;

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
     * Gets the value of the dklxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDklxDm() {
        return dklxDm;
    }

    /**
     * Sets the value of the dklxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDklxDm(String value) {
        this.dklxDm = value;
    }

    /**
     * Gets the value of the zzszyfpje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZzszyfpje() {
        return zzszyfpje;
    }

    /**
     * Sets the value of the zzszyfpje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZzszyfpje(Double value) {
        this.zzszyfpje = value;
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
     * Gets the value of the yrzzzskspzqduuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYrzzzskspzqduuid() {
        return yrzzzskspzqduuid;
    }

    /**
     * Sets the value of the yrzzzskspzqduuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYrzzzskspzqduuid(String value) {
        this.yrzzzskspzqduuid = value;
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
     * Gets the value of the zzszyfpkpdwnsrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzszyfpkpdwnsrmc() {
        return zzszyfpkpdwnsrmc;
    }

    /**
     * Sets the value of the zzszyfpkpdwnsrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzszyfpkpdwnsrmc(String value) {
        this.zzszyfpkpdwnsrmc = value;
    }

    /**
     * Gets the value of the zzszyfpkpdwnsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzszyfpkpdwnsrsbh() {
        return zzszyfpkpdwnsrsbh;
    }

    /**
     * Sets the value of the zzszyfpkpdwnsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzszyfpkpdwnsrsbh(String value) {
        this.zzszyfpkpdwnsrsbh = value;
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
     * Gets the value of the zzszyfpse property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZzszyfpse() {
        return zzszyfpse;
    }

    /**
     * Sets the value of the zzszyfpse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZzszyfpse(Double value) {
        this.zzszyfpse = value;
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
     * Gets the value of the sqdkxxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqdkxxuuid() {
        return sqdkxxuuid;
    }

    /**
     * Sets the value of the sqdkxxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqdkxxuuid(String value) {
        this.sqdkxxuuid = value;
    }

}
