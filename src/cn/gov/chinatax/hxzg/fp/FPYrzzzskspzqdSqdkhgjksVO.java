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
 * ����֤��ֵ˰��˰ƾ֤�嵥����ֿۺ��ؽɿ���VO
 * 
 * <p>Java class for FPYrzzzskspzqdSqdkhgjksVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPYrzzzskspzqdSqdkhgjksVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="sqdkhgjksuuid" type="{http://www.chinatax.gov.cn/dataspec/}sqdkhgjksuuid"/>
 *         &lt;element name="hgjksuuid" type="{http://www.chinatax.gov.cn/dataspec/}hgjksuuid"/>
 *         &lt;element name="sqdkhgjkzzszyjkshm" type="{http://www.chinatax.gov.cn/dataspec/}sqdkhgjkzzszyjkshm"/>
 *         &lt;element name="sqdkhgjkzzszyjkskaDm" type="{http://www.chinatax.gov.cn/dataspec/}sqdkhgjkzzszyjkskaDm"/>
 *         &lt;element name="sqdkhgjkzzszyjkswsjg" type="{http://www.chinatax.gov.cn/dataspec/}sqdkhgjkzzszyjkswsjg"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="sqdkhgjkzzszyjksskje" type="{http://www.chinatax.gov.cn/dataspec/}sqdkhgjkzzszyjksskje"/>
 *         &lt;element name="sqdkhgjkzzszyjkstkdwnsrmc" type="{http://www.chinatax.gov.cn/dataspec/}sqdkhgjkzzszyjkstkdwnsrmc"/>
 *         &lt;element name="sqdkhgjkzzszyjkstkdwnsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}sqdkhgjkzzszyjkstkdwnsrsbh"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPYrzzzskspzqdSqdkhgjksVO", propOrder = {
    "sjgsdq",
    "sqdkhgjksuuid",
    "hgjksuuid",
    "sqdkhgjkzzszyjkshm",
    "sqdkhgjkzzszyjkskaDm",
    "sqdkhgjkzzszyjkswsjg",
    "lrrDm",
    "xgrDm",
    "sqdkhgjkzzszyjksskje",
    "sqdkhgjkzzszyjkstkdwnsrmc",
    "sqdkhgjkzzszyjkstkdwnsrsbh"
})
public class FPYrzzzskspzqdSqdkhgjksVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String sqdkhgjksuuid;
    @XmlElement(required = true, nillable = true)
    protected String hgjksuuid;
    @XmlElement(required = true, nillable = true)
    protected String sqdkhgjkzzszyjkshm;
    @XmlElement(required = true, nillable = true)
    protected String sqdkhgjkzzszyjkskaDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double sqdkhgjkzzszyjkswsjg;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double sqdkhgjkzzszyjksskje;
    @XmlElement(required = true, nillable = true)
    protected String sqdkhgjkzzszyjkstkdwnsrmc;
    @XmlElement(required = true, nillable = true)
    protected String sqdkhgjkzzszyjkstkdwnsrsbh;

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
     * Gets the value of the sqdkhgjksuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqdkhgjksuuid() {
        return sqdkhgjksuuid;
    }

    /**
     * Sets the value of the sqdkhgjksuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqdkhgjksuuid(String value) {
        this.sqdkhgjksuuid = value;
    }

    /**
     * Gets the value of the hgjksuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHgjksuuid() {
        return hgjksuuid;
    }

    /**
     * Sets the value of the hgjksuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHgjksuuid(String value) {
        this.hgjksuuid = value;
    }

    /**
     * Gets the value of the sqdkhgjkzzszyjkshm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqdkhgjkzzszyjkshm() {
        return sqdkhgjkzzszyjkshm;
    }

    /**
     * Sets the value of the sqdkhgjkzzszyjkshm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqdkhgjkzzszyjkshm(String value) {
        this.sqdkhgjkzzszyjkshm = value;
    }

    /**
     * Gets the value of the sqdkhgjkzzszyjkskaDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqdkhgjkzzszyjkskaDm() {
        return sqdkhgjkzzszyjkskaDm;
    }

    /**
     * Sets the value of the sqdkhgjkzzszyjkskaDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqdkhgjkzzszyjkskaDm(String value) {
        this.sqdkhgjkzzszyjkskaDm = value;
    }

    /**
     * Gets the value of the sqdkhgjkzzszyjkswsjg property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSqdkhgjkzzszyjkswsjg() {
        return sqdkhgjkzzszyjkswsjg;
    }

    /**
     * Sets the value of the sqdkhgjkzzszyjkswsjg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSqdkhgjkzzszyjkswsjg(Double value) {
        this.sqdkhgjkzzszyjkswsjg = value;
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
     * Gets the value of the sqdkhgjkzzszyjksskje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSqdkhgjkzzszyjksskje() {
        return sqdkhgjkzzszyjksskje;
    }

    /**
     * Sets the value of the sqdkhgjkzzszyjksskje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSqdkhgjkzzszyjksskje(Double value) {
        this.sqdkhgjkzzszyjksskje = value;
    }

    /**
     * Gets the value of the sqdkhgjkzzszyjkstkdwnsrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqdkhgjkzzszyjkstkdwnsrmc() {
        return sqdkhgjkzzszyjkstkdwnsrmc;
    }

    /**
     * Sets the value of the sqdkhgjkzzszyjkstkdwnsrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqdkhgjkzzszyjkstkdwnsrmc(String value) {
        this.sqdkhgjkzzszyjkstkdwnsrmc = value;
    }

    /**
     * Gets the value of the sqdkhgjkzzszyjkstkdwnsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqdkhgjkzzszyjkstkdwnsrsbh() {
        return sqdkhgjkzzszyjkstkdwnsrsbh;
    }

    /**
     * Sets the value of the sqdkhgjkzzszyjkstkdwnsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqdkhgjkzzszyjkstkdwnsrsbh(String value) {
        this.sqdkhgjkzzszyjkstkdwnsrsbh = value;
    }

}