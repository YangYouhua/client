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
 * ������������Ʊ��Ŀ��ϢVO
 * 
 * <p>Java class for FPDkBdcfpXmmxVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDkBdcfpXmmxVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="mj" type="{http://www.chinatax.gov.cn/dataspec/}mj"/>
 *         &lt;element name="kxxzDm" type="{http://www.chinatax.gov.cn/dataspec/}kxxzDm"/>
 *         &lt;element name="bdcxmmc" type="{http://www.chinatax.gov.cn/dataspec/}bdcxmmc"/>
 *         &lt;element name="mjlxDm" type="{http://www.chinatax.gov.cn/dataspec/}mjlxDm"/>
 *         &lt;element name="bz" type="{http://www.chinatax.gov.cn/dataspec/}bz"/>
 *         &lt;element name="bdcxmbh" type="{http://www.chinatax.gov.cn/dataspec/}bdcxmbh"/>
 *         &lt;element name="bdcxmuuid" type="{http://www.chinatax.gov.cn/dataspec/}bdcxmuuid"/>
 *         &lt;element name="xsdbdclph" type="{http://www.chinatax.gov.cn/dataspec/}xsdbdclph"/>
 *         &lt;element name="je" type="{http://www.chinatax.gov.cn/dataspec/}je"/>
 *         &lt;element name="dj" type="{http://www.chinatax.gov.cn/dataspec/}dj"/>
 *         &lt;element name="fybh" type="{http://www.chinatax.gov.cn/dataspec/}fybh"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="bdcfpuuid" type="{http://www.chinatax.gov.cn/dataspec/}bdcfpuuid"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="kjfpmxuuid" type="{http://www.chinatax.gov.cn/dataspec/}kjfpmxuuid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDkBdcfpXmmxVO", propOrder = {
    "sjgsdq",
    "mj",
    "kxxzDm",
    "bdcxmmc",
    "mjlxDm",
    "bz",
    "bdcxmbh",
    "bdcxmuuid",
    "xsdbdclph",
    "je",
    "dj",
    "fybh",
    "lrrDm",
    "bdcfpuuid",
    "xgrDm",
    "kjfpmxuuid"
})
public class FPDkBdcfpXmmxVO {

    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double mj;
    @XmlElement(required = true, nillable = true)
    protected String kxxzDm;
    @XmlElement(required = true, nillable = true)
    protected String bdcxmmc;
    @XmlElement(required = true, nillable = true)
    protected String mjlxDm;
    @XmlElement(required = true, nillable = true)
    protected String bz;
    @XmlElement(required = true, nillable = true)
    protected String bdcxmbh;
    @XmlElement(required = true, nillable = true)
    protected String bdcxmuuid;
    @XmlElement(required = true, nillable = true)
    protected String xsdbdclph;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double je;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dj;
    @XmlElement(required = true, nillable = true)
    protected String fybh;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, nillable = true)
    protected String bdcfpuuid;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String kjfpmxuuid;

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
     * Gets the value of the mj property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMj() {
        return mj;
    }

    /**
     * Sets the value of the mj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMj(Double value) {
        this.mj = value;
    }

    /**
     * Gets the value of the kxxzDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKxxzDm() {
        return kxxzDm;
    }

    /**
     * Sets the value of the kxxzDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKxxzDm(String value) {
        this.kxxzDm = value;
    }

    /**
     * Gets the value of the bdcxmmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdcxmmc() {
        return bdcxmmc;
    }

    /**
     * Sets the value of the bdcxmmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdcxmmc(String value) {
        this.bdcxmmc = value;
    }

    /**
     * Gets the value of the mjlxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMjlxDm() {
        return mjlxDm;
    }

    /**
     * Sets the value of the mjlxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMjlxDm(String value) {
        this.mjlxDm = value;
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
     * Gets the value of the bdcxmbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdcxmbh() {
        return bdcxmbh;
    }

    /**
     * Sets the value of the bdcxmbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdcxmbh(String value) {
        this.bdcxmbh = value;
    }

    /**
     * Gets the value of the bdcxmuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdcxmuuid() {
        return bdcxmuuid;
    }

    /**
     * Sets the value of the bdcxmuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdcxmuuid(String value) {
        this.bdcxmuuid = value;
    }

    /**
     * Gets the value of the xsdbdclph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsdbdclph() {
        return xsdbdclph;
    }

    /**
     * Sets the value of the xsdbdclph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsdbdclph(String value) {
        this.xsdbdclph = value;
    }

    /**
     * Gets the value of the je property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJe() {
        return je;
    }

    /**
     * Sets the value of the je property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJe(Double value) {
        this.je = value;
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
     * Gets the value of the fybh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFybh() {
        return fybh;
    }

    /**
     * Sets the value of the fybh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFybh(String value) {
        this.fybh = value;
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
     * Gets the value of the bdcfpuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdcfpuuid() {
        return bdcfpuuid;
    }

    /**
     * Sets the value of the bdcfpuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdcfpuuid(String value) {
        this.bdcfpuuid = value;
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
     * Gets the value of the kjfpmxuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKjfpmxuuid() {
        return kjfpmxuuid;
    }

    /**
     * Sets the value of the kjfpmxuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKjfpmxuuid(String value) {
        this.kjfpmxuuid = value;
    }

}