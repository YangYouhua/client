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
 * 印制有本单位名称发票备案明细表VO
 * 
 * <p>Java class for FPYzybdwmcfpbaMxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPYzybdwmcfpbaMxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="lcDm" type="{http://www.chinatax.gov.cn/dataspec/}lcDm"/>
 *         &lt;element name="ggDm" type="{http://www.chinatax.gov.cn/dataspec/}ggDm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="mxuuid" type="{http://www.chinatax.gov.cn/dataspec/}mxuuid"/>
 *         &lt;element name="fpyzmc" type="{http://www.chinatax.gov.cn/dataspec/}fpyzmc"/>
 *         &lt;element name="ysswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}ysswjgDm"/>
 *         &lt;element name="pjzdfsDm" type="{http://www.chinatax.gov.cn/dataspec/}pjzdfsDm"/>
 *         &lt;element name="zzDm" type="{http://www.chinatax.gov.cn/dataspec/}zzDm"/>
 *         &lt;element name="yzybdwmcfpbauuid" type="{http://www.chinatax.gov.cn/dataspec/}yzybdwmcfpbauuid"/>
 *         &lt;element name="gmfplqfsDm" type="{http://www.chinatax.gov.cn/dataspec/}gmfplqfsDm"/>
 *         &lt;element name="mbfs" type="{http://www.chinatax.gov.cn/dataspec/}mbfs"/>
 *         &lt;element name="bfs" type="{http://www.chinatax.gov.cn/dataspec/}bfs"/>
 *         &lt;element name="bz" type="{http://www.chinatax.gov.cn/dataspec/}bz"/>
 *         &lt;element name="fpme" type="{http://www.chinatax.gov.cn/dataspec/}fpme"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="wzbDm" type="{http://www.chinatax.gov.cn/dataspec/}wzbDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="jebDm" type="{http://www.chinatax.gov.cn/dataspec/}jebDm"/>
 *         &lt;element name="fpdmmc" type="{http://www.chinatax.gov.cn/dataspec/}fpdmmc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPYzybdwmcfpbaMxVO", propOrder = {
    "sjgsdq",
    "lcDm",
    "ggDm",
    "fpzlDm",
    "mxuuid",
    "fpyzmc",
    "ysswjgDm",
    "pjzdfsDm",
    "zzDm",
    "yzybdwmcfpbauuid",
    "gmfplqfsDm",
    "mbfs",
    "bfs",
    "bz",
    "fpme",
    "fpDm",
    "lrrDm",
    "wzbDm",
    "xgrDm",
    "jebDm",
    "fpdmmc"
})
public class FPYzybdwmcfpbaMxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String lcDm;
    @XmlElement(required = true, nillable = true)
    protected String ggDm;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String mxuuid;
    @XmlElement(required = true, nillable = true)
    protected String fpyzmc;
    @XmlElement(required = true, nillable = true)
    protected String ysswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String pjzdfsDm;
    @XmlElement(required = true, nillable = true)
    protected String zzDm;
    @XmlElement(required = true, nillable = true)
    protected String yzybdwmcfpbauuid;
    @XmlElement(required = true, nillable = true)
    protected String gmfplqfsDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double mbfs;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long bfs;
    @XmlElement(required = true, nillable = true)
    protected String bz;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double fpme;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String wzbDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String jebDm;
    @XmlElement(required = true, nillable = true)
    protected String fpdmmc;

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
     * Gets the value of the lcDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcDm() {
        return lcDm;
    }

    /**
     * Sets the value of the lcDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcDm(String value) {
        this.lcDm = value;
    }

    /**
     * Gets the value of the ggDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGgDm() {
        return ggDm;
    }

    /**
     * Sets the value of the ggDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGgDm(String value) {
        this.ggDm = value;
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
     * Gets the value of the mxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMxuuid() {
        return mxuuid;
    }

    /**
     * Sets the value of the mxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMxuuid(String value) {
        this.mxuuid = value;
    }

    /**
     * Gets the value of the fpyzmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpyzmc() {
        return fpyzmc;
    }

    /**
     * Sets the value of the fpyzmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpyzmc(String value) {
        this.fpyzmc = value;
    }

    /**
     * Gets the value of the ysswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsswjgDm() {
        return ysswjgDm;
    }

    /**
     * Sets the value of the ysswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsswjgDm(String value) {
        this.ysswjgDm = value;
    }

    /**
     * Gets the value of the pjzdfsDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjzdfsDm() {
        return pjzdfsDm;
    }

    /**
     * Sets the value of the pjzdfsDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjzdfsDm(String value) {
        this.pjzdfsDm = value;
    }

    /**
     * Gets the value of the zzDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzDm() {
        return zzDm;
    }

    /**
     * Sets the value of the zzDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzDm(String value) {
        this.zzDm = value;
    }

    /**
     * Gets the value of the yzybdwmcfpbauuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzybdwmcfpbauuid() {
        return yzybdwmcfpbauuid;
    }

    /**
     * Sets the value of the yzybdwmcfpbauuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzybdwmcfpbauuid(String value) {
        this.yzybdwmcfpbauuid = value;
    }

    /**
     * Gets the value of the gmfplqfsDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmfplqfsDm() {
        return gmfplqfsDm;
    }

    /**
     * Sets the value of the gmfplqfsDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmfplqfsDm(String value) {
        this.gmfplqfsDm = value;
    }

    /**
     * Gets the value of the mbfs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMbfs() {
        return mbfs;
    }

    /**
     * Sets the value of the mbfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMbfs(Double value) {
        this.mbfs = value;
    }

    /**
     * Gets the value of the bfs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBfs() {
        return bfs;
    }

    /**
     * Sets the value of the bfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBfs(Long value) {
        this.bfs = value;
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
     * Gets the value of the fpme property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFpme() {
        return fpme;
    }

    /**
     * Sets the value of the fpme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFpme(Double value) {
        this.fpme = value;
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
     * Gets the value of the wzbDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWzbDm() {
        return wzbDm;
    }

    /**
     * Sets the value of the wzbDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWzbDm(String value) {
        this.wzbDm = value;
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
     * Gets the value of the jebDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJebDm() {
        return jebDm;
    }

    /**
     * Sets the value of the jebDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJebDm(String value) {
        this.jebDm = value;
    }

    /**
     * Gets the value of the fpdmmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdmmc() {
        return fpdmmc;
    }

    /**
     * Sets the value of the fpdmmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdmmc(String value) {
        this.fpdmmc = value;
    }

}
