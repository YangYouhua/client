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
 * ��Ʊ�ƻ�������ͨ��Ʊ��ϸVO
 * 
 * <p>Java class for FPFpjhbzPtfpmxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPFpjhbzPtfpmxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="jhlgsl" type="{http://www.chinatax.gov.cn/dataspec/}jhlgsl"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="fpjhlxDm" type="{http://www.chinatax.gov.cn/dataspec/}fpjhlxDm"/>
 *         &lt;element name="jhbzmxuuid" type="{http://www.chinatax.gov.cn/dataspec/}jhbzmxuuid"/>
 *         &lt;element name="zsbz" type="{http://www.chinatax.gov.cn/dataspec/}zsbz"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="sjhzsl" type="{http://www.chinatax.gov.cn/dataspec/}sjhzsl"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="jhbzuuid" type="{http://www.chinatax.gov.cn/dataspec/}jhbzuuid"/>
 *         &lt;element name="sntqxssl" type="{http://www.chinatax.gov.cn/dataspec/}sntqxssl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPFpjhbzPtfpmxVO", propOrder = {
    "sjgsdq",
    "jhlgsl",
    "fpzlDm",
    "fpjhlxDm",
    "jhbzmxuuid",
    "zsbz",
    "lrrDm",
    "sjhzsl",
    "xgrDm",
    "jhbzuuid",
    "sntqxssl"
})
public class FPFpjhbzPtfpmxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double jhlgsl;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String fpjhlxDm;
    @XmlElement(required = true, nillable = true)
    protected String jhbzmxuuid;
    @XmlElement(required = true, nillable = true)
    protected String zsbz;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double sjhzsl;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String jhbzuuid;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long sntqxssl;

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
     * Gets the value of the jhlgsl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJhlgsl() {
        return jhlgsl;
    }

    /**
     * Sets the value of the jhlgsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJhlgsl(Double value) {
        this.jhlgsl = value;
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
     * Gets the value of the fpjhlxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpjhlxDm() {
        return fpjhlxDm;
    }

    /**
     * Sets the value of the fpjhlxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpjhlxDm(String value) {
        this.fpjhlxDm = value;
    }

    /**
     * Gets the value of the jhbzmxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJhbzmxuuid() {
        return jhbzmxuuid;
    }

    /**
     * Sets the value of the jhbzmxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJhbzmxuuid(String value) {
        this.jhbzmxuuid = value;
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
     * Gets the value of the sjhzsl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSjhzsl() {
        return sjhzsl;
    }

    /**
     * Sets the value of the sjhzsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSjhzsl(Double value) {
        this.sjhzsl = value;
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
     * Gets the value of the jhbzuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJhbzuuid() {
        return jhbzuuid;
    }

    /**
     * Sets the value of the jhbzuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJhbzuuid(String value) {
        this.jhbzuuid = value;
    }

    /**
     * Gets the value of the sntqxssl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSntqxssl() {
        return sntqxssl;
    }

    /**
     * Sets the value of the sntqxssl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSntqxssl(Long value) {
        this.sntqxssl = value;
    }

}