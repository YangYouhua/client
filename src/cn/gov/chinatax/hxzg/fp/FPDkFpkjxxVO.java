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
 * 发票开具信息VO
 * 
 * <p>Java class for FPDkFpkjxxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDkFpkjxxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="zfsqrq" type="{http://www.chinatax.gov.cn/dataspec/}zfsqrq"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="kprDm" type="{http://www.chinatax.gov.cn/dataspec/}kprDm"/>
 *         &lt;element name="fpkfDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkfDm"/>
 *         &lt;element name="kpje" type="{http://www.chinatax.gov.cn/dataspec/}kpje"/>
 *         &lt;element name="zfrq1" type="{http://www.chinatax.gov.cn/dataspec/}zfrq1"/>
 *         &lt;element name="bz" type="{http://www.chinatax.gov.cn/dataspec/}bz"/>
 *         &lt;element name="lzfpdm" type="{http://www.chinatax.gov.cn/dataspec/}lzfpdm"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="kjswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}kjswjgDm"/>
 *         &lt;element name="dksquuid" type="{http://www.chinatax.gov.cn/dataspec/}dksquuid"/>
 *         &lt;element name="zfsqr" type="{http://www.chinatax.gov.cn/dataspec/}zfsqr"/>
 *         &lt;element name="lzfphm" type="{http://www.chinatax.gov.cn/dataspec/}lzfphm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="zfyy" type="{http://www.chinatax.gov.cn/dataspec/}zfyy"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="zfrDm" type="{http://www.chinatax.gov.cn/dataspec/}zfrDm"/>
 *         &lt;element name="kjrq" type="{http://www.chinatax.gov.cn/dataspec/}kjrq"/>
 *         &lt;element name="fpkjxxuuid" type="{http://www.chinatax.gov.cn/dataspec/}fpkjxxuuid"/>
 *         &lt;element name="zfbz1" type="{http://www.chinatax.gov.cn/dataspec/}zfbz1"/>
 *         &lt;element name="tsnsrdjxh" type="{http://www.chinatax.gov.cn/dataspec/}tsnsrdjxh"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDkFpkjxxVO", propOrder = {
    "sjgsdq",
    "zfsqrq",
    "fphm",
    "fpzlDm",
    "djxh",
    "kprDm",
    "fpkfDm",
    "kpje",
    "zfrq1",
    "bz",
    "lzfpdm",
    "fpDm",
    "kjswjgDm",
    "dksquuid",
    "zfsqr",
    "lzfphm",
    "lrrDm",
    "zfyy",
    "xgrDm",
    "zfrDm",
    "kjrq",
    "fpkjxxuuid",
    "zfbz1",
    "tsnsrdjxh"
})
public class FPDkFpkjxxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String zfsqrq;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String kprDm;
    @XmlElement(required = true, nillable = true)
    protected String fpkfDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double kpje;
    @XmlElement(required = true, nillable = true)
    protected String zfrq1;
    @XmlElement(required = true, nillable = true)
    protected String bz;
    @XmlElement(required = true, nillable = true)
    protected String lzfpdm;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String kjswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String dksquuid;
    @XmlElement(required = true, nillable = true)
    protected String zfsqr;
    @XmlElement(required = true, nillable = true)
    protected String lzfphm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String zfyy;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String zfrDm;
    @XmlElement(required = true, nillable = true)
    protected String kjrq;
    @XmlElement(required = true, nillable = true)
    protected String fpkjxxuuid;
    @XmlElement(required = true, nillable = true)
    protected String zfbz1;
    @XmlElement(required = true, nillable = true)
    protected String tsnsrdjxh;

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
     * Gets the value of the zfsqrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfsqrq() {
        return zfsqrq;
    }

    /**
     * Sets the value of the zfsqrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfsqrq(String value) {
        this.zfsqrq = value;
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
     * Gets the value of the kprDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKprDm() {
        return kprDm;
    }

    /**
     * Sets the value of the kprDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKprDm(String value) {
        this.kprDm = value;
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
     * Gets the value of the zfrq1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfrq1() {
        return zfrq1;
    }

    /**
     * Sets the value of the zfrq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfrq1(String value) {
        this.zfrq1 = value;
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
     * Gets the value of the lzfpdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLzfpdm() {
        return lzfpdm;
    }

    /**
     * Sets the value of the lzfpdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLzfpdm(String value) {
        this.lzfpdm = value;
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
     * Gets the value of the kjswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKjswjgDm() {
        return kjswjgDm;
    }

    /**
     * Sets the value of the kjswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKjswjgDm(String value) {
        this.kjswjgDm = value;
    }

    /**
     * Gets the value of the dksquuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDksquuid() {
        return dksquuid;
    }

    /**
     * Sets the value of the dksquuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDksquuid(String value) {
        this.dksquuid = value;
    }

    /**
     * Gets the value of the zfsqr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfsqr() {
        return zfsqr;
    }

    /**
     * Sets the value of the zfsqr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfsqr(String value) {
        this.zfsqr = value;
    }

    /**
     * Gets the value of the lzfphm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLzfphm() {
        return lzfphm;
    }

    /**
     * Sets the value of the lzfphm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLzfphm(String value) {
        this.lzfphm = value;
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
     * Gets the value of the zfyy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfyy() {
        return zfyy;
    }

    /**
     * Sets the value of the zfyy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfyy(String value) {
        this.zfyy = value;
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
     * Gets the value of the zfrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfrDm() {
        return zfrDm;
    }

    /**
     * Sets the value of the zfrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfrDm(String value) {
        this.zfrDm = value;
    }

    /**
     * Gets the value of the kjrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKjrq() {
        return kjrq;
    }

    /**
     * Sets the value of the kjrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKjrq(String value) {
        this.kjrq = value;
    }

    /**
     * Gets the value of the fpkjxxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkjxxuuid() {
        return fpkjxxuuid;
    }

    /**
     * Sets the value of the fpkjxxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkjxxuuid(String value) {
        this.fpkjxxuuid = value;
    }

    /**
     * Gets the value of the zfbz1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfbz1() {
        return zfbz1;
    }

    /**
     * Sets the value of the zfbz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfbz1(String value) {
        this.zfbz1 = value;
    }

    /**
     * Gets the value of the tsnsrdjxh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsnsrdjxh() {
        return tsnsrdjxh;
    }

    /**
     * Sets the value of the tsnsrdjxh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsnsrdjxh(String value) {
        this.tsnsrdjxh = value;
    }

}
