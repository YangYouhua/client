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
 * ��Ʊ�ⷿ��������VO
 * 
 * <p>Java class for FPKfdbsqVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPKfdbsqVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="hdslid" type="{http://www.chinatax.gov.cn/dataspec/}hdslid"/>
 *         &lt;element name="sqrxm" type="{http://www.chinatax.gov.cn/dataspec/}sqrxm"/>
 *         &lt;element name="zfrq1" type="{http://www.chinatax.gov.cn/dataspec/}zfrq1"/>
 *         &lt;element name="fpckkfDm" type="{http://www.chinatax.gov.cn/dataspec/}fpckkfDm"/>
 *         &lt;element name="ckfswryDm" type="{http://www.chinatax.gov.cn/dataspec/}ckfswryDm"/>
 *         &lt;element name="sqrq" type="{http://www.chinatax.gov.cn/dataspec/}sqrq"/>
 *         &lt;element name="fprkkfDm" type="{http://www.chinatax.gov.cn/dataspec/}fprkkfDm"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="lcuuid" type="{http://www.chinatax.gov.cn/dataspec/}lcuuid"/>
 *         &lt;element name="sqsxDm" type="{http://www.chinatax.gov.cn/dataspec/}sqsxDm"/>
 *         &lt;element name="kfdbuuid" type="{http://www.chinatax.gov.cn/dataspec/}kfdbuuid"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="sqdwDm" type="{http://www.chinatax.gov.cn/dataspec/}sqdwDm"/>
 *         &lt;element name="kfdbbz" type="{http://www.chinatax.gov.cn/dataspec/}kfdbbz"/>
 *         &lt;element name="zfrDm" type="{http://www.chinatax.gov.cn/dataspec/}zfrDm"/>
 *         &lt;element name="fpdbztDm" type="{http://www.chinatax.gov.cn/dataspec/}fpdbztDm"/>
 *         &lt;element name="sqsxsm" type="{http://www.chinatax.gov.cn/dataspec/}sqsxsm"/>
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
@XmlType(name = "FPKfdbsqVO", propOrder = {
    "sjgsdq",
    "hdslid",
    "sqrxm",
    "zfrq1",
    "fpckkfDm",
    "ckfswryDm",
    "sqrq",
    "fprkkfDm",
    "lrrDm",
    "lcuuid",
    "sqsxDm",
    "kfdbuuid",
    "xgrDm",
    "sqdwDm",
    "kfdbbz",
    "zfrDm",
    "fpdbztDm",
    "sqsxsm",
    "zfbz1"
})
public class FPKfdbsqVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String hdslid;
    @XmlElement(required = true, nillable = true)
    protected String sqrxm;
    @XmlElement(required = true, nillable = true)
    protected String zfrq1;
    @XmlElement(required = true, nillable = true)
    protected String fpckkfDm;
    @XmlElement(required = true, nillable = true)
    protected String ckfswryDm;
    @XmlElement(required = true, nillable = true)
    protected String sqrq;
    @XmlElement(required = true, nillable = true)
    protected String fprkkfDm;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String lcuuid;
    @XmlElement(required = true, nillable = true)
    protected String sqsxDm;
    @XmlElement(required = true, nillable = true)
    protected String kfdbuuid;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String sqdwDm;
    @XmlElement(required = true, nillable = true)
    protected String kfdbbz;
    @XmlElement(required = true, nillable = true)
    protected String zfrDm;
    @XmlElement(required = true, nillable = true)
    protected String fpdbztDm;
    @XmlElement(required = true, nillable = true)
    protected String sqsxsm;
    @XmlElement(required = true, nillable = true)
    protected String zfbz1;

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
     * Gets the value of the hdslid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdslid() {
        return hdslid;
    }

    /**
     * Sets the value of the hdslid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdslid(String value) {
        this.hdslid = value;
    }

    /**
     * Gets the value of the sqrxm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqrxm() {
        return sqrxm;
    }

    /**
     * Sets the value of the sqrxm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqrxm(String value) {
        this.sqrxm = value;
    }

    /**
     * Gets the value of the zfrq1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfrq1() {
        return zfrq1;
    }

    /**
     * Sets the value of the zfrq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfrq1(String value) {
        this.zfrq1 = value;
    }

    /**
     * Gets the value of the fpckkfDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpckkfDm() {
        return fpckkfDm;
    }

    /**
     * Sets the value of the fpckkfDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpckkfDm(String value) {
        this.fpckkfDm = value;
    }

    /**
     * Gets the value of the ckfswryDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkfswryDm() {
        return ckfswryDm;
    }

    /**
     * Sets the value of the ckfswryDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkfswryDm(String value) {
        this.ckfswryDm = value;
    }

    /**
     * Gets the value of the sqrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqrq() {
        return sqrq;
    }

    /**
     * Sets the value of the sqrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqrq(String value) {
        this.sqrq = value;
    }

    /**
     * Gets the value of the fprkkfDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFprkkfDm() {
        return fprkkfDm;
    }

    /**
     * Sets the value of the fprkkfDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFprkkfDm(String value) {
        this.fprkkfDm = value;
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
     * Gets the value of the lcuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcuuid() {
        return lcuuid;
    }

    /**
     * Sets the value of the lcuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcuuid(String value) {
        this.lcuuid = value;
    }

    /**
     * Gets the value of the sqsxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqsxDm() {
        return sqsxDm;
    }

    /**
     * Sets the value of the sqsxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqsxDm(String value) {
        this.sqsxDm = value;
    }

    /**
     * Gets the value of the kfdbuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKfdbuuid() {
        return kfdbuuid;
    }

    /**
     * Sets the value of the kfdbuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKfdbuuid(String value) {
        this.kfdbuuid = value;
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
     * Gets the value of the sqdwDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqdwDm() {
        return sqdwDm;
    }

    /**
     * Sets the value of the sqdwDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqdwDm(String value) {
        this.sqdwDm = value;
    }

    /**
     * Gets the value of the kfdbbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKfdbbz() {
        return kfdbbz;
    }

    /**
     * Sets the value of the kfdbbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKfdbbz(String value) {
        this.kfdbbz = value;
    }

    /**
     * Gets the value of the zfrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZfrDm() {
        return zfrDm;
    }

    /**
     * Sets the value of the zfrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZfrDm(String value) {
        this.zfrDm = value;
    }

    /**
     * Gets the value of the fpdbztDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdbztDm() {
        return fpdbztDm;
    }

    /**
     * Sets the value of the fpdbztDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdbztDm(String value) {
        this.fpdbztDm = value;
    }

    /**
     * Gets the value of the sqsxsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqsxsm() {
        return sqsxsm;
    }

    /**
     * Sets the value of the sqsxsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqsxsm(String value) {
        this.sqsxsm = value;
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