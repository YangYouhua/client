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
 * 税务行政许可变动情况项目明细VO
 * 
 * <p>Java class for FPSwxzxkBdqkXmmxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSwxzxkBdqkXmmxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fpclqk" type="{http://www.chinatax.gov.cn/dataspec/}fpclqk"/>
 *         &lt;element name="swxzxkuuid" type="{http://www.chinatax.gov.cn/dataspec/}swxzxkuuid"/>
 *         &lt;element name="bdswxzxkuuid" type="{http://www.chinatax.gov.cn/dataspec/}bdswxzxkuuid"/>
 *         &lt;element name="bdswxzxkxmmxuuid" type="{http://www.chinatax.gov.cn/dataspec/}bdswxzxkxmmxuuid"/>
 *         &lt;element name="swxzxkxmDm" type="{http://www.chinatax.gov.cn/dataspec/}swxzxkxmDm"/>
 *         &lt;element name="xqgzqx" type="{http://www.chinatax.gov.cn/dataspec/}xqgzqx"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="sfgz" type="{http://www.chinatax.gov.cn/dataspec/}sfgz"/>
 *         &lt;element name="yy" type="{http://www.chinatax.gov.cn/dataspec/}yy"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPSwxzxkBdqkXmmxVO", propOrder = {
    "sjgsdq",
    "fpclqk",
    "swxzxkuuid",
    "bdswxzxkuuid",
    "bdswxzxkxmmxuuid",
    "swxzxkxmDm",
    "xqgzqx",
    "lrrDm",
    "sfgz",
    "yy",
    "xgrDm"
})
public class FPSwxzxkBdqkXmmxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fpclqk;
    @XmlElement(required = true, nillable = true)
    protected String swxzxkuuid;
    @XmlElement(required = true, nillable = true)
    protected String bdswxzxkuuid;
    @XmlElement(required = true, nillable = true)
    protected String bdswxzxkxmmxuuid;
    @XmlElement(required = true, nillable = true)
    protected String swxzxkxmDm;
    @XmlElement(required = true, nillable = true)
    protected String xqgzqx;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String sfgz;
    @XmlElement(required = true, nillable = true)
    protected String yy;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;

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
     * Gets the value of the fpclqk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpclqk() {
        return fpclqk;
    }

    /**
     * Sets the value of the fpclqk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpclqk(String value) {
        this.fpclqk = value;
    }

    /**
     * Gets the value of the swxzxkuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwxzxkuuid() {
        return swxzxkuuid;
    }

    /**
     * Sets the value of the swxzxkuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwxzxkuuid(String value) {
        this.swxzxkuuid = value;
    }

    /**
     * Gets the value of the bdswxzxkuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdswxzxkuuid() {
        return bdswxzxkuuid;
    }

    /**
     * Sets the value of the bdswxzxkuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdswxzxkuuid(String value) {
        this.bdswxzxkuuid = value;
    }

    /**
     * Gets the value of the bdswxzxkxmmxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdswxzxkxmmxuuid() {
        return bdswxzxkxmmxuuid;
    }

    /**
     * Sets the value of the bdswxzxkxmmxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdswxzxkxmmxuuid(String value) {
        this.bdswxzxkxmmxuuid = value;
    }

    /**
     * Gets the value of the swxzxkxmDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwxzxkxmDm() {
        return swxzxkxmDm;
    }

    /**
     * Sets the value of the swxzxkxmDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwxzxkxmDm(String value) {
        this.swxzxkxmDm = value;
    }

    /**
     * Gets the value of the xqgzqx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqgzqx() {
        return xqgzqx;
    }

    /**
     * Sets the value of the xqgzqx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqgzqx(String value) {
        this.xqgzqx = value;
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
     * Gets the value of the sfgz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfgz() {
        return sfgz;
    }

    /**
     * Sets the value of the sfgz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfgz(String value) {
        this.sfgz = value;
    }

    /**
     * Gets the value of the yy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYy() {
        return yy;
    }

    /**
     * Sets the value of the yy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYy(String value) {
        this.yy = value;
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

}
