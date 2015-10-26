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
 * 发票盘存报告明细VO
 * 
 * <p>Java class for FPPcbgMxVOEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPPcbgMxVOEx">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}FPPcbgMxVO">
 *       &lt;sequence>
 *         &lt;element name="fpzlmc" type="{http://www.chinatax.gov.cn/dataspec/}fpzlmc"/>
 *         &lt;element name="jldwDm" type="{http://www.chinatax.gov.cn/dataspec/}jldwDm"/>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="swjgDm" type="{http://www.chinatax.gov.cn/dataspec/}swjgDm"/>
 *         &lt;element name="fpkfgtDm" type="{http://www.chinatax.gov.cn/dataspec/}fpkfgtDm"/>
 *         &lt;element name="mbfs" type="{http://www.chinatax.gov.cn/dataspec/}mbfs"/>
 *         &lt;element name="phcd" type="{http://www.chinatax.gov.cn/dataspec/}phcd"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPPcbgMxVOEx", propOrder = {
    "fpzlmc",
    "jldwDm",
    "lcslid",
    "swjgDm",
    "fpkfgtDm",
    "mbfs",
    "phcd"
})
public class FPPcbgMxVOEx
    extends FPPcbgMxVO
{

    @XmlElement(required = true, nillable = true)
    protected String fpzlmc;
    @XmlElement(required = true, nillable = true)
    protected String jldwDm;
    @XmlElement(required = true, nillable = true)
    protected String lcslid;
    @XmlElement(required = true, nillable = true)
    protected String swjgDm;
    @XmlElement(required = true, nillable = true)
    protected String fpkfgtDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double mbfs;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer phcd;

    /**
     * Gets the value of the fpzlmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpzlmc() {
        return fpzlmc;
    }

    /**
     * Sets the value of the fpzlmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpzlmc(String value) {
        this.fpzlmc = value;
    }

    /**
     * Gets the value of the jldwDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJldwDm() {
        return jldwDm;
    }

    /**
     * Sets the value of the jldwDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJldwDm(String value) {
        this.jldwDm = value;
    }

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
     * Gets the value of the swjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwjgDm() {
        return swjgDm;
    }

    /**
     * Sets the value of the swjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwjgDm(String value) {
        this.swjgDm = value;
    }

    /**
     * Gets the value of the fpkfgtDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpkfgtDm() {
        return fpkfgtDm;
    }

    /**
     * Sets the value of the fpkfgtDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpkfgtDm(String value) {
        this.fpkfgtDm = value;
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
     * Gets the value of the phcd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhcd() {
        return phcd;
    }

    /**
     * Sets the value of the phcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhcd(Integer value) {
        this.phcd = value;
    }

}
