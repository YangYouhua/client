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
 * �н���Ʊ�ҽ�����VO
 * 
 * <p>Java class for FPYjfpdjjfVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPYjfpdjjfVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="zfrDm1" type="{http://www.chinatax.gov.cn/dataspec/}zfrDm1"/>
 *         &lt;element name="zfrq" type="{http://www.chinatax.gov.cn/dataspec/}zfrq"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="zfswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}zfswjgDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="djgfuuid" type="{http://www.chinatax.gov.cn/dataspec/}djgfuuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPYjfpdjjfVO", propOrder = {
    "sjgsdq",
    "lcslid",
    "zfrDm1",
    "zfrq",
    "lrrDm",
    "zfswjgDm",
    "xgrDm",
    "djgfuuid"
})
public class FPYjfpdjjfVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String lcslid;
    @XmlElement(required = true, nillable = true)
    protected String zfrDm1;
    @XmlElement(required = true, nillable = true)
    protected String zfrq;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String zfswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String djgfuuid;

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
     * Gets the value of the zfrDm1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfrDm1() {
        return zfrDm1;
    }

    /**
     * Sets the value of the zfrDm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfrDm1(String value) {
        this.zfrDm1 = value;
    }

    /**
     * Gets the value of the zfrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfrq() {
        return zfrq;
    }

    /**
     * Sets the value of the zfrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfrq(String value) {
        this.zfrq = value;
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
     * Gets the value of the zfswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfswjgDm() {
        return zfswjgDm;
    }

    /**
     * Sets the value of the zfswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfswjgDm(String value) {
        this.zfswjgDm = value;
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
     * Gets the value of the djgfuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDjgfuuid() {
        return djgfuuid;
    }

    /**
     * Sets the value of the djgfuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDjgfuuid(String value) {
        this.djgfuuid = value;
    }

}
