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
 * 不动产发票存根联采集VO
 * 
 * <p>Java class for FPCglcjBdcfpVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPCglcjBdcfpVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="mj" type="{http://www.chinatax.gov.cn/dataspec/}mj"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="fpkjqkDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkjqkDm"/>
 *         &lt;element name="fkfsfsbh" type="{http://www.chinatax.gov.cn/dataspec/}fkfsfsbh"/>
 *         &lt;element name="mjlxDm" type="{http://www.chinatax.gov.cn/dataspec/}mjlxDm"/>
 *         &lt;element name="fkfmc" type="{http://www.chinatax.gov.cn/dataspec/}fkfmc"/>
 *         &lt;element name="kprq" type="{http://www.chinatax.gov.cn/dataspec/}kprq"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="bdcxmbh" type="{http://www.chinatax.gov.cn/dataspec/}bdcxmbh"/>
 *         &lt;element name="bdccgluuid" type="{http://www.chinatax.gov.cn/dataspec/}bdccgluuid"/>
 *         &lt;element name="je" type="{http://www.chinatax.gov.cn/dataspec/}je"/>
 *         &lt;element name="dj" type="{http://www.chinatax.gov.cn/dataspec/}dj"/>
 *         &lt;element name="bdclph" type="{http://www.chinatax.gov.cn/dataspec/}bdclph"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="bdcxmmc" type="{http://www.chinatax.gov.cn/dataspec/}bdcxmmc"/>
 *         &lt;element name="cglcjfpyjuuid" type="{http://www.chinatax.gov.cn/dataspec/}cglcjfpyjuuid"/>
 *         &lt;element name="phcd" type="{http://www.chinatax.gov.cn/dataspec/}phcd"/>
 *         &lt;element name="cglsjcjlxDm" type="{http://www.chinatax.gov.cn/dataspec/}cglsjcjlxDm"/>
 *         &lt;element name="kxxzDm" type="{http://www.chinatax.gov.cn/dataspec/}kxxzDm"/>
 *         &lt;element name="fpcglcjuuid" type="{http://www.chinatax.gov.cn/dataspec/}fpcglcjuuid"/>
 *         &lt;element name="zfbz1" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPCglcjBdcfpVO", propOrder = {
    "sjgsdq",
    "fphm",
    "mj",
    "djxh",
    "fpkjqkDm",
    "fkfsfsbh",
    "mjlxDm",
    "fkfmc",
    "kprq",
    "fpDm",
    "fpzlDm",
    "bdcxmbh",
    "bdccgluuid",
    "je",
    "dj",
    "bdclph",
    "lrrDm",
    "xgrDm",
    "bdcxmmc",
    "cglcjfpyjuuid",
    "phcd",
    "cglsjcjlxDm",
    "kxxzDm",
    "fpcglcjuuid",
    "zfbz1"
})
public class FPCglcjBdcfpVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double mj;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String fpkjqkDm;
    @XmlElement(required = true, nillable = true)
    protected String fkfsfsbh;
    @XmlElement(required = true, nillable = true)
    protected String mjlxDm;
    @XmlElement(required = true, nillable = true)
    protected String fkfmc;
    @XmlElement(required = true, nillable = true)
    protected String kprq;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String bdcxmbh;
    @XmlElement(required = true, nillable = true)
    protected String bdccgluuid;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double je;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dj;
    @XmlElement(required = true, nillable = true)
    protected String bdclph;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String bdcxmmc;
    @XmlElement(required = true, nillable = true)
    protected String cglcjfpyjuuid;
    protected int phcd;
    @XmlElement(required = true)
    protected String cglsjcjlxDm;
    @XmlElement(required = true)
    protected String kxxzDm;
    @XmlElement(required = true)
    protected String fpcglcjuuid;
    @XmlElement(required = true)
    protected Object zfbz1;

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
     * Gets the value of the mj property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMj() {
        return mj;
    }

    /**
     * Sets the value of the mj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMj(Double value) {
        this.mj = value;
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
     * Gets the value of the fpkjqkDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkjqkDm() {
        return fpkjqkDm;
    }

    /**
     * Sets the value of the fpkjqkDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkjqkDm(String value) {
        this.fpkjqkDm = value;
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
     * Gets the value of the mjlxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMjlxDm() {
        return mjlxDm;
    }

    /**
     * Sets the value of the mjlxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMjlxDm(String value) {
        this.mjlxDm = value;
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
     * Gets the value of the bdcxmbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdcxmbh() {
        return bdcxmbh;
    }

    /**
     * Sets the value of the bdcxmbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdcxmbh(String value) {
        this.bdcxmbh = value;
    }

    /**
     * Gets the value of the bdccgluuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdccgluuid() {
        return bdccgluuid;
    }

    /**
     * Sets the value of the bdccgluuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdccgluuid(String value) {
        this.bdccgluuid = value;
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
     * Gets the value of the dj property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDj() {
        return dj;
    }

    /**
     * Sets the value of the dj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDj(Double value) {
        this.dj = value;
    }

    /**
     * Gets the value of the bdclph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdclph() {
        return bdclph;
    }

    /**
     * Sets the value of the bdclph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdclph(String value) {
        this.bdclph = value;
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
     * Gets the value of the bdcxmmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdcxmmc() {
        return bdcxmmc;
    }

    /**
     * Sets the value of the bdcxmmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdcxmmc(String value) {
        this.bdcxmmc = value;
    }

    /**
     * Gets the value of the cglcjfpyjuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCglcjfpyjuuid() {
        return cglcjfpyjuuid;
    }

    /**
     * Sets the value of the cglcjfpyjuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCglcjfpyjuuid(String value) {
        this.cglcjfpyjuuid = value;
    }

    /**
     * Gets the value of the phcd property.
     * 
     */
    public int getPhcd() {
        return phcd;
    }

    /**
     * Sets the value of the phcd property.
     * 
     */
    public void setPhcd(int value) {
        this.phcd = value;
    }

    /**
     * Gets the value of the cglsjcjlxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCglsjcjlxDm() {
        return cglsjcjlxDm;
    }

    /**
     * Sets the value of the cglsjcjlxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCglsjcjlxDm(String value) {
        this.cglsjcjlxDm = value;
    }

    /**
     * Gets the value of the kxxzDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKxxzDm() {
        return kxxzDm;
    }

    /**
     * Sets the value of the kxxzDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKxxzDm(String value) {
        this.kxxzDm = value;
    }

    /**
     * Gets the value of the fpcglcjuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpcglcjuuid() {
        return fpcglcjuuid;
    }

    /**
     * Sets the value of the fpcglcjuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpcglcjuuid(String value) {
        this.fpcglcjuuid = value;
    }

    /**
     * Gets the value of the zfbz1 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getZfbz1() {
        return zfbz1;
    }

    /**
     * Sets the value of the zfbz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setZfbz1(Object value) {
        this.zfbz1 = value;
    }

}
