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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ��ƱƱ�ֺ˶�����������ϸVO
 * 
 * <p>Java class for FPPzhdsqspMxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPPzhdsqspMxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="dffpzgkpxe" type="{http://www.chinatax.gov.cn/dataspec/}dffpzgkpxe"/>
 *         &lt;element name="dffpzgkpxeDm" type="{http://www.chinatax.gov.cn/dataspec/}dffpzgkpxeDm"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="sqspmxuuid" type="{http://www.chinatax.gov.cn/dataspec/}sqspmxuuid"/>
 *         &lt;element name="zsbz" type="{http://www.chinatax.gov.cn/dataspec/}zsbz"/>
 *         &lt;element name="cpzgsl" type="{http://www.chinatax.gov.cn/dataspec/}cpzgsl"/>
 *         &lt;element name="wtdkbz" type="{http://www.chinatax.gov.cn/dataspec/}wtdkbz"/>
 *         &lt;element name="mczggpsl" type="{http://www.chinatax.gov.cn/dataspec/}mczggpsl"/>
 *         &lt;element name="myzggpsl" type="{http://www.chinatax.gov.cn/dataspec/}myzggpsl"/>
 *         &lt;element name="fppzhdczlxDm" type="{http://www.chinatax.gov.cn/dataspec/}fppzhdczlxDm"/>
 *         &lt;element name="fpgpfsDm" type="{http://www.chinatax.gov.cn/dataspec/}fpgpfsDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="fpkjfsDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkjfsDm"/>
 *         &lt;element name="sqspuuid" type="{http://www.chinatax.gov.cn/dataspec/}sqspuuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPPzhdsqspMxVO", propOrder = {
    "sjgsdq",
    "dffpzgkpxe",
    "dffpzgkpxeDm",
    "fpzlDm",
    "sqspmxuuid",
    "zsbz",
    "cpzgsl",
    "wtdkbz",
    "mczggpsl",
    "myzggpsl",
    "fppzhdczlxDm",
    "fpgpfsDm",
    "lrrDm",
    "xgrDm",
    "fpkjfsDm",
    "sqspuuid"
})
@XmlSeeAlso({
    FPPzhdsqspMxJcVO.class
})
public class FPPzhdsqspMxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dffpzgkpxe;
    @XmlElement(required = true, nillable = true)
    protected String dffpzgkpxeDm;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String sqspmxuuid;
    @XmlElement(required = true, nillable = true)
    protected String zsbz;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double cpzgsl;
    @XmlElement(required = true, nillable = true)
    protected String wtdkbz;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double mczggpsl;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double myzggpsl;
    @XmlElement(required = true, nillable = true)
    protected String fppzhdczlxDm;
    @XmlElement(required = true, nillable = true)
    protected String fpgpfsDm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String fpkjfsDm;
    @XmlElement(required = true, nillable = true)
    protected String sqspuuid;

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
     * Gets the value of the dffpzgkpxe property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDffpzgkpxe() {
        return dffpzgkpxe;
    }

    /**
     * Sets the value of the dffpzgkpxe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDffpzgkpxe(Double value) {
        this.dffpzgkpxe = value;
    }

    /**
     * Gets the value of the dffpzgkpxeDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDffpzgkpxeDm() {
        return dffpzgkpxeDm;
    }

    /**
     * Sets the value of the dffpzgkpxeDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDffpzgkpxeDm(String value) {
        this.dffpzgkpxeDm = value;
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
     * Gets the value of the sqspmxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqspmxuuid() {
        return sqspmxuuid;
    }

    /**
     * Sets the value of the sqspmxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqspmxuuid(String value) {
        this.sqspmxuuid = value;
    }

    /**
     * Gets the value of the zsbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsbz() {
        return zsbz;
    }

    /**
     * Sets the value of the zsbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsbz(String value) {
        this.zsbz = value;
    }

    /**
     * Gets the value of the cpzgsl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCpzgsl() {
        return cpzgsl;
    }

    /**
     * Sets the value of the cpzgsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCpzgsl(Double value) {
        this.cpzgsl = value;
    }

    /**
     * Gets the value of the wtdkbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtdkbz() {
        return wtdkbz;
    }

    /**
     * Sets the value of the wtdkbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtdkbz(String value) {
        this.wtdkbz = value;
    }

    /**
     * Gets the value of the mczggpsl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMczggpsl() {
        return mczggpsl;
    }

    /**
     * Sets the value of the mczggpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMczggpsl(Double value) {
        this.mczggpsl = value;
    }

    /**
     * Gets the value of the myzggpsl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMyzggpsl() {
        return myzggpsl;
    }

    /**
     * Sets the value of the myzggpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMyzggpsl(Double value) {
        this.myzggpsl = value;
    }

    /**
     * Gets the value of the fppzhdczlxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFppzhdczlxDm() {
        return fppzhdczlxDm;
    }

    /**
     * Sets the value of the fppzhdczlxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFppzhdczlxDm(String value) {
        this.fppzhdczlxDm = value;
    }

    /**
     * Gets the value of the fpgpfsDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpgpfsDm() {
        return fpgpfsDm;
    }

    /**
     * Sets the value of the fpgpfsDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpgpfsDm(String value) {
        this.fpgpfsDm = value;
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
     * Gets the value of the fpkjfsDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkjfsDm() {
        return fpkjfsDm;
    }

    /**
     * Sets the value of the fpkjfsDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkjfsDm(String value) {
        this.fpkjfsDm = value;
    }

    /**
     * Gets the value of the sqspuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqspuuid() {
        return sqspuuid;
    }

    /**
     * Sets the value of the sqspuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqspuuid(String value) {
        this.sqspuuid = value;
    }

}
