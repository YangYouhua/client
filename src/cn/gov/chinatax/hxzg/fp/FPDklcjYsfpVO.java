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
 * 运输发票抵扣联采集VO
 * 
 * <p>Java class for FPDklcjYsfpVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDklcjYsfpVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="jsdkdjxse" type="{http://www.chinatax.gov.cn/dataspec/}jsdkdjxse"/>
 *         &lt;element name="yfje" type="{http://www.chinatax.gov.cn/dataspec/}yfje"/>
 *         &lt;element name="cyfzgswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}cyfzgswjgDm"/>
 *         &lt;element name="kprq" type="{http://www.chinatax.gov.cn/dataspec/}kprq"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="rzjgDm" type="{http://www.chinatax.gov.cn/dataspec/}rzjgDm"/>
 *         &lt;element name="ysfpdkuuid" type="{http://www.chinatax.gov.cn/dataspec/}ysfpdkuuid"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="spfnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}spfnsrsbh"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="cyfnsrmc" type="{http://www.chinatax.gov.cn/dataspec/}cyfnsrmc"/>
 *         &lt;element name="cyfnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}cyfnsrsbh"/>
 *         &lt;element name="yxjsdkdyfje" type="{http://www.chinatax.gov.cn/dataspec/}yxjsdkdyfje"/>
 *         &lt;element name="dkluuid" type="{http://www.chinatax.gov.cn/dataspec/}dkluuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDklcjYsfpVO", propOrder = {
    "sjgsdq",
    "fphm",
    "jsdkdjxse",
    "yfje",
    "cyfzgswjgDm",
    "kprq",
    "fpDm",
    "rzjgDm",
    "ysfpdkuuid",
    "lrrDm",
    "spfnsrsbh",
    "xgrDm",
    "cyfnsrmc",
    "cyfnsrsbh",
    "yxjsdkdyfje",
    "dkluuid"
})
public class FPDklcjYsfpVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double jsdkdjxse;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double yfje;
    @XmlElement(required = true, nillable = true)
    protected String cyfzgswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String kprq;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String rzjgDm;
    @XmlElement(required = true, nillable = true)
    protected String ysfpdkuuid;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String spfnsrsbh;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String cyfnsrmc;
    @XmlElement(required = true, nillable = true)
    protected String cyfnsrsbh;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double yxjsdkdyfje;
    @XmlElement(required = true, nillable = true)
    protected String dkluuid;

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
     * Gets the value of the jsdkdjxse property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJsdkdjxse() {
        return jsdkdjxse;
    }

    /**
     * Sets the value of the jsdkdjxse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJsdkdjxse(Double value) {
        this.jsdkdjxse = value;
    }

    /**
     * Gets the value of the yfje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYfje() {
        return yfje;
    }

    /**
     * Sets the value of the yfje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYfje(Double value) {
        this.yfje = value;
    }

    /**
     * Gets the value of the cyfzgswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCyfzgswjgDm() {
        return cyfzgswjgDm;
    }

    /**
     * Sets the value of the cyfzgswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCyfzgswjgDm(String value) {
        this.cyfzgswjgDm = value;
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
     * Gets the value of the rzjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRzjgDm() {
        return rzjgDm;
    }

    /**
     * Sets the value of the rzjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRzjgDm(String value) {
        this.rzjgDm = value;
    }

    /**
     * Gets the value of the ysfpdkuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsfpdkuuid() {
        return ysfpdkuuid;
    }

    /**
     * Sets the value of the ysfpdkuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsfpdkuuid(String value) {
        this.ysfpdkuuid = value;
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
     * Gets the value of the cyfnsrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCyfnsrmc() {
        return cyfnsrmc;
    }

    /**
     * Sets the value of the cyfnsrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCyfnsrmc(String value) {
        this.cyfnsrmc = value;
    }

    /**
     * Gets the value of the cyfnsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCyfnsrsbh() {
        return cyfnsrsbh;
    }

    /**
     * Sets the value of the cyfnsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCyfnsrsbh(String value) {
        this.cyfnsrsbh = value;
    }

    /**
     * Gets the value of the yxjsdkdyfje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getYxjsdkdyfje() {
        return yxjsdkdyfje;
    }

    /**
     * Sets the value of the yxjsdkdyfje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setYxjsdkdyfje(Double value) {
        this.yxjsdkdyfje = value;
    }

    /**
     * Gets the value of the dkluuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDkluuid() {
        return dkluuid;
    }

    /**
     * Sets the value of the dkluuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDkluuid(String value) {
        this.dkluuid = value;
    }

}
