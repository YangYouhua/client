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
 * 机动车发票存根联采集VO
 * 
 * <p>Java class for FPCglcjJdcfpVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPCglcjJdcfpVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xgrq" type="{http://www.chinatax.gov.cn/dataspec/}xgrq"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="lrrq" type="{http://www.chinatax.gov.cn/dataspec/}lrrq"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="zgswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}zgswjgDm"/>
 *         &lt;element name="bhsj" type="{http://www.chinatax.gov.cn/dataspec/}bhsj"/>
 *         &lt;element name="se" type="{http://www.chinatax.gov.cn/dataspec/}se"/>
 *         &lt;element name="slzsl" type="{http://www.chinatax.gov.cn/dataspec/}slzsl"/>
 *         &lt;element name="jshj" type="{http://www.chinatax.gov.cn/dataspec/}jshj"/>
 *         &lt;element name="clsbdh" type="{http://www.chinatax.gov.cn/dataspec/}clsbdh"/>
 *         &lt;element name="fdjhm" type="{http://www.chinatax.gov.cn/dataspec/}fdjhm"/>
 *         &lt;element name="sjdh" type="{http://www.chinatax.gov.cn/dataspec/}sjdh"/>
 *         &lt;element name="jkzmh" type="{http://www.chinatax.gov.cn/dataspec/}jkzmh"/>
 *         &lt;element name="hgzh" type="{http://www.chinatax.gov.cn/dataspec/}hgzh"/>
 *         &lt;element name="cd" type="{http://www.chinatax.gov.cn/dataspec/}cd"/>
 *         &lt;element name="cpxh" type="{http://www.chinatax.gov.cn/dataspec/}cpxh"/>
 *         &lt;element name="cllxDm" type="{http://www.chinatax.gov.cn/dataspec/}cllxDm"/>
 *         &lt;element name="ghfsfsbh" type="{http://www.chinatax.gov.cn/dataspec/}ghfsfsbh"/>
 *         &lt;element name="ghfmc" type="{http://www.chinatax.gov.cn/dataspec/}ghfmc"/>
 *         &lt;element name="kprq" type="{http://www.chinatax.gov.cn/dataspec/}kprq"/>
 *         &lt;element name="fphm" type="{http://www.chinatax.gov.cn/dataspec/}fphm"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="jdccgluuid" type="{http://www.chinatax.gov.cn/dataspec/}jdccgluuid"/>
 *         &lt;element name="fpcglcjuuid" type="{http://www.chinatax.gov.cn/dataspec/}fpcglcjuuid"/>
 *         &lt;element name="cglcjfpyjuuid" type="{http://www.chinatax.gov.cn/dataspec/}cglcjfpyjuuid"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="fpkjqkDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkjqkDm"/>
 *         &lt;element name="phcd" type="{http://www.chinatax.gov.cn/dataspec/}phcd"/>
 *         &lt;element name="cglsjcjlxDm" type="{http://www.chinatax.gov.cn/dataspec/}cglsjcjlxDm"/>
 *         &lt;element name="zfbz1" type="{http://www.chinatax.gov.cn/dataspec/}zfbz1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPCglcjJdcfpVO", propOrder = {
    "xgrq",
    "xgrDm",
    "lrrq",
    "lrrDm",
    "sjgsdq",
    "zgswjgDm",
    "bhsj",
    "se",
    "slzsl",
    "jshj",
    "clsbdh",
    "fdjhm",
    "sjdh",
    "jkzmh",
    "hgzh",
    "cd",
    "cpxh",
    "cllxDm",
    "ghfsfsbh",
    "ghfmc",
    "kprq",
    "fphm",
    "fpDm",
    "djxh",
    "jdccgluuid",
    "fpcglcjuuid",
    "cglcjfpyjuuid",
    "fpzlDm",
    "fpkjqkDm",
    "phcd",
    "cglsjcjlxDm",
    "zfbz1"
})
public class FPCglcjJdcfpVO {

    @XmlElement(required = true)
    protected String xgrq;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true)
    protected String lrrq;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String zgswjgDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double bhsj;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double se;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double slzsl;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double jshj;
    @XmlElement(required = true, nillable = true)
    protected String clsbdh;
    @XmlElement(required = true, nillable = true)
    protected String fdjhm;
    @XmlElement(required = true, nillable = true)
    protected String sjdh;
    @XmlElement(required = true, nillable = true)
    protected String jkzmh;
    @XmlElement(required = true, nillable = true)
    protected String hgzh;
    @XmlElement(required = true, nillable = true)
    protected String cd;
    @XmlElement(required = true, nillable = true)
    protected String cpxh;
    @XmlElement(required = true, nillable = true)
    protected String cllxDm;
    @XmlElement(required = true, nillable = true)
    protected String ghfsfsbh;
    @XmlElement(required = true, nillable = true)
    protected String ghfmc;
    @XmlElement(required = true, nillable = true)
    protected String kprq;
    @XmlElement(required = true, nillable = true)
    protected String fphm;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String jdccgluuid;
    @XmlElement(required = true)
    protected String fpcglcjuuid;
    @XmlElement(required = true, nillable = true)
    protected String cglcjfpyjuuid;
    @XmlElement(required = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String fpkjqkDm;
    protected int phcd;
    @XmlElement(required = true)
    protected String cglsjcjlxDm;
    @XmlElement(required = true)
    protected String zfbz1;

    /**
     * Gets the value of the xgrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXgrq() {
        return xgrq;
    }

    /**
     * Sets the value of the xgrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXgrq(String value) {
        this.xgrq = value;
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
     * Gets the value of the lrrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLrrq() {
        return lrrq;
    }

    /**
     * Sets the value of the lrrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLrrq(String value) {
        this.lrrq = value;
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
     * Gets the value of the zgswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZgswjgDm() {
        return zgswjgDm;
    }

    /**
     * Sets the value of the zgswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZgswjgDm(String value) {
        this.zgswjgDm = value;
    }

    /**
     * Gets the value of the bhsj property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBhsj() {
        return bhsj;
    }

    /**
     * Sets the value of the bhsj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBhsj(Double value) {
        this.bhsj = value;
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
     * Gets the value of the slzsl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlzsl() {
        return slzsl;
    }

    /**
     * Sets the value of the slzsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlzsl(Double value) {
        this.slzsl = value;
    }

    /**
     * Gets the value of the jshj property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJshj() {
        return jshj;
    }

    /**
     * Sets the value of the jshj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJshj(Double value) {
        this.jshj = value;
    }

    /**
     * Gets the value of the clsbdh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsbdh() {
        return clsbdh;
    }

    /**
     * Sets the value of the clsbdh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClsbdh(String value) {
        this.clsbdh = value;
    }

    /**
     * Gets the value of the fdjhm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdjhm() {
        return fdjhm;
    }

    /**
     * Sets the value of the fdjhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdjhm(String value) {
        this.fdjhm = value;
    }

    /**
     * Gets the value of the sjdh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjdh() {
        return sjdh;
    }

    /**
     * Sets the value of the sjdh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjdh(String value) {
        this.sjdh = value;
    }

    /**
     * Gets the value of the jkzmh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkzmh() {
        return jkzmh;
    }

    /**
     * Sets the value of the jkzmh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkzmh(String value) {
        this.jkzmh = value;
    }

    /**
     * Gets the value of the hgzh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHgzh() {
        return hgzh;
    }

    /**
     * Sets the value of the hgzh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHgzh(String value) {
        this.hgzh = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Gets the value of the cpxh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpxh() {
        return cpxh;
    }

    /**
     * Sets the value of the cpxh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpxh(String value) {
        this.cpxh = value;
    }

    /**
     * Gets the value of the cllxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCllxDm() {
        return cllxDm;
    }

    /**
     * Sets the value of the cllxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCllxDm(String value) {
        this.cllxDm = value;
    }

    /**
     * Gets the value of the ghfsfsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhfsfsbh() {
        return ghfsfsbh;
    }

    /**
     * Sets the value of the ghfsfsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhfsfsbh(String value) {
        this.ghfsfsbh = value;
    }

    /**
     * Gets the value of the ghfmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhfmc() {
        return ghfmc;
    }

    /**
     * Sets the value of the ghfmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhfmc(String value) {
        this.ghfmc = value;
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
     * Gets the value of the jdccgluuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJdccgluuid() {
        return jdccgluuid;
    }

    /**
     * Sets the value of the jdccgluuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdccgluuid(String value) {
        this.jdccgluuid = value;
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

}
