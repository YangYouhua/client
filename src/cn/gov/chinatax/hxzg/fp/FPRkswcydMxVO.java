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
 * 发票入库实物查验单明细VO
 * 
 * <p>Java class for FPRkswcydMxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPRkswcydMxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="fpzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpzlDm"/>
 *         &lt;element name="fpzzhm" type="{http://www.chinatax.gov.cn/dataspec/}fpzzhm"/>
 *         &lt;element name="clrDm" type="{http://www.chinatax.gov.cn/dataspec/}clrDm"/>
 *         &lt;element name="fpdbcyshjgDm" type="{http://www.chinatax.gov.cn/dataspec/}fpdbcyshjgDm"/>
 *         &lt;element name="mbfs" type="{http://www.chinatax.gov.cn/dataspec/}mbfs"/>
 *         &lt;element name="xzzhm" type="{http://www.chinatax.gov.cn/dataspec/}xzzhm"/>
 *         &lt;element name="rkcyuuid" type="{http://www.chinatax.gov.cn/dataspec/}rkcyuuid"/>
 *         &lt;element name="rkcymxuuid" type="{http://www.chinatax.gov.cn/dataspec/}rkcymxuuid"/>
 *         &lt;element name="tzyjDm" type="{http://www.chinatax.gov.cn/dataspec/}tzyjDm"/>
 *         &lt;element name="xsje" type="{http://www.chinatax.gov.cn/dataspec/}xsje"/>
 *         &lt;element name="fpqshm" type="{http://www.chinatax.gov.cn/dataspec/}fpqshm"/>
 *         &lt;element name="fs" type="{http://www.chinatax.gov.cn/dataspec/}fs"/>
 *         &lt;element name="xqshm" type="{http://www.chinatax.gov.cn/dataspec/}xqshm"/>
 *         &lt;element name="fpDm" type="{http://www.chinatax.gov.cn/dataspec/}fpDm"/>
 *         &lt;element name="bz" type="{http://www.chinatax.gov.cn/dataspec/}bz"/>
 *         &lt;element name="clrq" type="{http://www.chinatax.gov.cn/dataspec/}clrq"/>
 *         &lt;element name="dj" type="{http://www.chinatax.gov.cn/dataspec/}dj"/>
 *         &lt;element name="mxbfs" type="{http://www.chinatax.gov.cn/dataspec/}mxbfs"/>
 *         &lt;element name="dsbdbz" type="{http://www.chinatax.gov.cn/dataspec/}dsbdbz"/>
 *         &lt;element name="cybdsjclbz" type="{http://www.chinatax.gov.cn/dataspec/}cybdsjclbz"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="bs" type="{http://www.chinatax.gov.cn/dataspec/}bs"/>
 *         &lt;element name="xs" type="{http://www.chinatax.gov.cn/dataspec/}xs"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="cybdsjbz" type="{http://www.chinatax.gov.cn/dataspec/}cybdsjbz"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPRkswcydMxVO", propOrder = {
    "sjgsdq",
    "fpzlDm",
    "fpzzhm",
    "clrDm",
    "fpdbcyshjgDm",
    "mbfs",
    "xzzhm",
    "rkcyuuid",
    "rkcymxuuid",
    "tzyjDm",
    "xsje",
    "fpqshm",
    "fs",
    "xqshm",
    "fpDm",
    "bz",
    "clrq",
    "dj",
    "mxbfs",
    "dsbdbz",
    "cybdsjclbz",
    "lrrDm",
    "bs",
    "xs",
    "xgrDm",
    "cybdsjbz"
})
public class FPRkswcydMxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, nillable = true)
    protected String fpzlDm;
    @XmlElement(required = true, nillable = true)
    protected String fpzzhm;
    @XmlElement(required = true, nillable = true)
    protected String clrDm;
    @XmlElement(required = true, nillable = true)
    protected String fpdbcyshjgDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double mbfs;
    @XmlElement(required = true, nillable = true)
    protected String xzzhm;
    @XmlElement(required = true, nillable = true)
    protected String rkcyuuid;
    @XmlElement(required = true, nillable = true)
    protected String rkcymxuuid;
    @XmlElement(required = true, nillable = true)
    protected String tzyjDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double xsje;
    @XmlElement(required = true, nillable = true)
    protected String fpqshm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double fs;
    @XmlElement(required = true, nillable = true)
    protected String xqshm;
    @XmlElement(required = true, nillable = true)
    protected String fpDm;
    @XmlElement(required = true, nillable = true)
    protected String bz;
    @XmlElement(required = true, nillable = true)
    protected String clrq;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dj;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double mxbfs;
    @XmlElement(required = true, nillable = true)
    protected String dsbdbz;
    @XmlElement(required = true, nillable = true)
    protected String cybdsjclbz;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long bs;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double xs;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String cybdsjbz;

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
     * Gets the value of the clrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrDm() {
        return clrDm;
    }

    /**
     * Sets the value of the clrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrDm(String value) {
        this.clrDm = value;
    }

    /**
     * Gets the value of the fpdbcyshjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdbcyshjgDm() {
        return fpdbcyshjgDm;
    }

    /**
     * Sets the value of the fpdbcyshjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdbcyshjgDm(String value) {
        this.fpdbcyshjgDm = value;
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
     * Gets the value of the xzzhm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXzzhm() {
        return xzzhm;
    }

    /**
     * Sets the value of the xzzhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXzzhm(String value) {
        this.xzzhm = value;
    }

    /**
     * Gets the value of the rkcyuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRkcyuuid() {
        return rkcyuuid;
    }

    /**
     * Sets the value of the rkcyuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRkcyuuid(String value) {
        this.rkcyuuid = value;
    }

    /**
     * Gets the value of the rkcymxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRkcymxuuid() {
        return rkcymxuuid;
    }

    /**
     * Sets the value of the rkcymxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRkcymxuuid(String value) {
        this.rkcymxuuid = value;
    }

    /**
     * Gets the value of the tzyjDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzyjDm() {
        return tzyjDm;
    }

    /**
     * Sets the value of the tzyjDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzyjDm(String value) {
        this.tzyjDm = value;
    }

    /**
     * Gets the value of the xsje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXsje() {
        return xsje;
    }

    /**
     * Sets the value of the xsje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXsje(Double value) {
        this.xsje = value;
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
     * Gets the value of the fs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFs() {
        return fs;
    }

    /**
     * Sets the value of the fs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFs(Double value) {
        this.fs = value;
    }

    /**
     * Gets the value of the xqshm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqshm() {
        return xqshm;
    }

    /**
     * Sets the value of the xqshm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqshm(String value) {
        this.xqshm = value;
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
     * Gets the value of the bz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBz() {
        return bz;
    }

    /**
     * Sets the value of the bz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBz(String value) {
        this.bz = value;
    }

    /**
     * Gets the value of the clrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrq() {
        return clrq;
    }

    /**
     * Sets the value of the clrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrq(String value) {
        this.clrq = value;
    }

    /**
     * Gets the value of the dj property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDj() {
        return dj;
    }

    /**
     * Sets the value of the dj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDj(Double value) {
        this.dj = value;
    }

    /**
     * Gets the value of the mxbfs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMxbfs() {
        return mxbfs;
    }

    /**
     * Sets the value of the mxbfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMxbfs(Double value) {
        this.mxbfs = value;
    }

    /**
     * Gets the value of the dsbdbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsbdbz() {
        return dsbdbz;
    }

    /**
     * Sets the value of the dsbdbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsbdbz(String value) {
        this.dsbdbz = value;
    }

    /**
     * Gets the value of the cybdsjclbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCybdsjclbz() {
        return cybdsjclbz;
    }

    /**
     * Sets the value of the cybdsjclbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCybdsjclbz(String value) {
        this.cybdsjclbz = value;
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
     * Gets the value of the bs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBs() {
        return bs;
    }

    /**
     * Sets the value of the bs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBs(Long value) {
        this.bs = value;
    }

    /**
     * Gets the value of the xs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXs() {
        return xs;
    }

    /**
     * Sets the value of the xs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXs(Double value) {
        this.xs = value;
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
     * Gets the value of the cybdsjbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCybdsjbz() {
        return cybdsjbz;
    }

    /**
     * Sets the value of the cybdsjbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCybdsjbz(String value) {
        this.cybdsjbz = value;
    }

}
