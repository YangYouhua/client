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
 * ��ƱƱ�ֺ˶�����������Ʊ��VO
 * 
 * <p>Java class for FPPzhdsqspGprVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPPzhdsqspGprVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="gpruuid" type="{http://www.chinatax.gov.cn/dataspec/}gpruuid"/>
 *         &lt;element name="lxdh" type="{http://www.chinatax.gov.cn/dataspec/}lxdh"/>
 *         &lt;element name="fppzhdczlxDm" type="{http://www.chinatax.gov.cn/dataspec/}fppzhdczlxDm"/>
 *         &lt;element name="gprxm" type="{http://www.chinatax.gov.cn/dataspec/}gprxm"/>
 *         &lt;element name="sqspuuid" type="{http://www.chinatax.gov.cn/dataspec/}sqspuuid"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="sfzjzlDm" type="{http://www.chinatax.gov.cn/dataspec/}sfzjzlDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="sfzjhm" type="{http://www.chinatax.gov.cn/dataspec/}sfzjhm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPPzhdsqspGprVO", propOrder = {
    "sjgsdq",
    "gpruuid",
    "lxdh",
    "fppzhdczlxDm",
    "gprxm",
    "sqspuuid",
    "lrrDm",
    "sfzjzlDm",
    "xgrDm",
    "sfzjhm"
})
public class FPPzhdsqspGprVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String gpruuid;
    @XmlElement(required = true, nillable = true)
    protected String lxdh;
    @XmlElement(required = true, nillable = true)
    protected String fppzhdczlxDm;
    @XmlElement(required = true, nillable = true)
    protected String gprxm;
    @XmlElement(required = true, nillable = true)
    protected String sqspuuid;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String sfzjzlDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String sfzjhm;

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
     * Gets the value of the gpruuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpruuid() {
        return gpruuid;
    }

    /**
     * Sets the value of the gpruuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpruuid(String value) {
        this.gpruuid = value;
    }

    /**
     * Gets the value of the lxdh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLxdh() {
        return lxdh;
    }

    /**
     * Sets the value of the lxdh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLxdh(String value) {
        this.lxdh = value;
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
     * Gets the value of the gprxm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprxm() {
        return gprxm;
    }

    /**
     * Sets the value of the gprxm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprxm(String value) {
        this.gprxm = value;
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
     * Gets the value of the sfzjzlDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzjzlDm() {
        return sfzjzlDm;
    }

    /**
     * Sets the value of the sfzjzlDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzjzlDm(String value) {
        this.sfzjzlDm = value;
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
     * Gets the value of the sfzjhm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzjhm() {
        return sfzjhm;
    }

    /**
     * Sets the value of the sfzjhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzjhm(String value) {
        this.sfzjhm = value;
    }

}