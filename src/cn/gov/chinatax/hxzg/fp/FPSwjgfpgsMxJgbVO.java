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
 * 税务机关发票挂失明细结果表VO
 * 
 * <p>Java class for FPSwjgfpgsMxJgbVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSwjgfpgsMxJgbVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="fpzzhm" type="{http://www.chinatax.gov.cn/dataspec/}fpzzhm"/>
 *         &lt;element name="fpgsmxuuid" type="{http://www.chinatax.gov.cn/dataspec/}fpgsmxuuid"/>
 *         &lt;element name="fpgslxDm" type="{http://www.chinatax.gov.cn/dataspec/}fpgslxDm"/>
 *         &lt;element name="bfs" type="{http://www.chinatax.gov.cn/dataspec/}bfs"/>
 *         &lt;element name="fpqshm" type="{http://www.chinatax.gov.cn/dataspec/}fpqshm"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="fpgsuuid" type="{http://www.chinatax.gov.cn/dataspec/}fpgsuuid"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="dsbdrq" type="{http://www.chinatax.gov.cn/dataspec/}dsbdrq"/>
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
@XmlType(name = "FPSwjgfpgsMxJgbVO", propOrder = {
    "sjgsdq",
    "fpzlDm",
    "fpzzhm",
    "fpgsmxuuid",
    "fpgslxDm",
    "bfs",
    "fpqshm",
    "fpDm",
    "fpgsuuid",
    "lrrDm",
    "dsbdrq",
    "xgrDm"
})
public class FPSwjgfpgsMxJgbVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String fpzzhm;
    @XmlElement(required = true, nillable = true)
    protected String fpgsmxuuid;
    @XmlElement(required = true, nillable = true)
    protected String fpgslxDm;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long bfs;
    @XmlElement(required = true, nillable = true)
    protected String fpqshm;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String fpgsuuid;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String dsbdrq;
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
     * Gets the value of the fpzzhm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpzzhm() {
        return fpzzhm;
    }

    /**
     * Sets the value of the fpzzhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpzzhm(String value) {
        this.fpzzhm = value;
    }

    /**
     * Gets the value of the fpgsmxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpgsmxuuid() {
        return fpgsmxuuid;
    }

    /**
     * Sets the value of the fpgsmxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpgsmxuuid(String value) {
        this.fpgsmxuuid = value;
    }

    /**
     * Gets the value of the fpgslxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpgslxDm() {
        return fpgslxDm;
    }

    /**
     * Sets the value of the fpgslxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpgslxDm(String value) {
        this.fpgslxDm = value;
    }

    /**
     * Gets the value of the bfs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBfs() {
        return bfs;
    }

    /**
     * Sets the value of the bfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBfs(Long value) {
        this.bfs = value;
    }

    /**
     * Gets the value of the fpqshm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpqshm() {
        return fpqshm;
    }

    /**
     * Sets the value of the fpqshm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpqshm(String value) {
        this.fpqshm = value;
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
     * Gets the value of the fpgsuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpgsuuid() {
        return fpgsuuid;
    }

    /**
     * Sets the value of the fpgsuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpgsuuid(String value) {
        this.fpgsuuid = value;
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
     * Gets the value of the dsbdrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsbdrq() {
        return dsbdrq;
    }

    /**
     * Sets the value of the dsbdrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsbdrq(String value) {
        this.dsbdrq = value;
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
