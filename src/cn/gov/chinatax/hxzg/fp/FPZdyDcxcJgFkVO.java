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
 * ����Ѳ���������Զ���VO
 * 
 * <p>Java class for FPZdyDcxcJgFkVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPZdyDcxcJgFkVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="lsrwbh" type="{http://www.chinatax.gov.cn/dataspec/}lsrwbh"/>
 *         &lt;element name="sssxdcuuid" type="{http://www.chinatax.gov.cn/dataspec/}sssxdcuuid"/>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="nsrsbh" type="{http://www.chinatax.gov.cn/dataspec/}nsrsbh"/>
 *         &lt;element name="nsrmc" type="{http://www.chinatax.gov.cn/dataspec/}nsrmc"/>
 *         &lt;element name="dcjlDm" type="{http://www.chinatax.gov.cn/dataspec/}dcjlDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPZdyDcxcJgFkVO", propOrder = {
    "lcslid",
    "lsrwbh",
    "sssxdcuuid",
    "djxh",
    "nsrsbh",
    "nsrmc",
    "dcjlDm"
})
public class FPZdyDcxcJgFkVO {

    @XmlElement(required = true, nillable = true)
    protected String lcslid;
    @XmlElement(required = true, nillable = true)
    protected String lsrwbh;
    @XmlElement(required = true, nillable = true)
    protected String sssxdcuuid;
    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String nsrsbh;
    @XmlElement(required = true, nillable = true)
    protected String nsrmc;
    @XmlElement(required = true, nillable = true)
    protected String dcjlDm;

    /**
     * Gets the value of the lcslid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcslid() {
        return lcslid;
    }

    /**
     * Sets the value of the lcslid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcslid(String value) {
        this.lcslid = value;
    }

    /**
     * Gets the value of the lsrwbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsrwbh() {
        return lsrwbh;
    }

    /**
     * Sets the value of the lsrwbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsrwbh(String value) {
        this.lsrwbh = value;
    }

    /**
     * Gets the value of the sssxdcuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSssxdcuuid() {
        return sssxdcuuid;
    }

    /**
     * Sets the value of the sssxdcuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSssxdcuuid(String value) {
        this.sssxdcuuid = value;
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
     * Gets the value of the nsrsbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsrsbh() {
        return nsrsbh;
    }

    /**
     * Sets the value of the nsrsbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsrsbh(String value) {
        this.nsrsbh = value;
    }

    /**
     * Gets the value of the nsrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsrmc() {
        return nsrmc;
    }

    /**
     * Sets the value of the nsrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsrmc(String value) {
        this.nsrmc = value;
    }

    /**
     * Gets the value of the dcjlDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcjlDm() {
        return dcjlDm;
    }

    /**
     * Sets the value of the dcjlDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcjlDm(String value) {
        this.dcjlDm = value;
    }

}