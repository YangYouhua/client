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
 * VO
 * 
 * <p>Java class for FPDbsqVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPDbsqVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="djxh" type="{http://www.chinatax.gov.cn/dataspec/}djxh"/>
 *         &lt;element name="dbsquuid" type="{http://www.chinatax.gov.cn/dataspec/}dbsquuid"/>
 *         &lt;element name="sjgsdq" type="{http://www.chinatax.gov.cn/dataspec/}sjgsdq"/>
 *         &lt;element name="dbcczmfs" type="{http://www.chinatax.gov.cn/dataspec/}dbcczmfs"/>
 *         &lt;element name="swdbgzjsjbh" type="{http://www.chinatax.gov.cn/dataspec/}swdbgzjsjbh"/>
 *         &lt;element name="wssyyjDm" type="{http://www.chinatax.gov.cn/dataspec/}wssyyjDm"/>
 *         &lt;element name="fpdbrzcdz" type="{http://www.chinatax.gov.cn/dataspec/}fpdbrzcdz"/>
 *         &lt;element name="fpdbrdjzclxDm" type="{http://www.chinatax.gov.cn/dataspec/}fpdbrdjzclxDm"/>
 *         &lt;element name="sqrxm" type="{http://www.chinatax.gov.cn/dataspec/}sqrxm"/>
 *         &lt;element name="lcslid" type="{http://www.chinatax.gov.cn/dataspec/}lcslid"/>
 *         &lt;element name="sqrq" type="{http://www.chinatax.gov.cn/dataspec/}sqrq"/>
 *         &lt;element name="fpdbrlxdh" type="{http://www.chinatax.gov.cn/dataspec/}fpdbrlxdh"/>
 *         &lt;element name="dbjcbz" type="{http://www.chinatax.gov.cn/dataspec/}dbjcbz"/>
 *         &lt;element name="dbjcsquuid" type="{http://www.chinatax.gov.cn/dataspec/}dbjcsquuid"/>
 *         &lt;element name="dbrdbjehj" type="{http://www.chinatax.gov.cn/dataspec/}dbrdbjehj"/>
 *         &lt;element name="slswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}slswjgDm"/>
 *         &lt;element name="dbje" type="{http://www.chinatax.gov.cn/dataspec/}dbje"/>
 *         &lt;element name="lrrDm" type="{http://www.chinatax.gov.cn/dataspec/}lrrDm"/>
 *         &lt;element name="dbccqdfs" type="{http://www.chinatax.gov.cn/dataspec/}dbccqdfs"/>
 *         &lt;element name="fpdbrmc" type="{http://www.chinatax.gov.cn/dataspec/}fpdbrmc"/>
 *         &lt;element name="fpdbrsfzjhm" type="{http://www.chinatax.gov.cn/dataspec/}fpdbrsfzjhm"/>
 *         &lt;element name="shswjgDm" type="{http://www.chinatax.gov.cn/dataspec/}shswjgDm"/>
 *         &lt;element name="shrDm" type="{http://www.chinatax.gov.cn/dataspec/}shrDm"/>
 *         &lt;element name="xgrDm" type="{http://www.chinatax.gov.cn/dataspec/}xgrDm"/>
 *         &lt;element name="slrq" type="{http://www.chinatax.gov.cn/dataspec/}slrq"/>
 *         &lt;element name="slrDm" type="{http://www.chinatax.gov.cn/dataspec/}slrDm"/>
 *         &lt;element name="fpdbrsfzjzlDm" type="{http://www.chinatax.gov.cn/dataspec/}fpdbrsfzjzlDm"/>
 *         &lt;element name="fpdblxDm" type="{http://www.chinatax.gov.cn/dataspec/}fpdblxDm"/>
 *         &lt;element name="shrq" type="{http://www.chinatax.gov.cn/dataspec/}shrq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPDbsqVO", propOrder = {
    "djxh",
    "dbsquuid",
    "sjgsdq",
    "dbcczmfs",
    "swdbgzjsjbh",
    "wssyyjDm",
    "fpdbrzcdz",
    "fpdbrdjzclxDm",
    "sqrxm",
    "lcslid",
    "sqrq",
    "fpdbrlxdh",
    "dbjcbz",
    "dbjcsquuid",
    "dbrdbjehj",
    "slswjgDm",
    "dbje",
    "lrrDm",
    "dbccqdfs",
    "fpdbrmc",
    "fpdbrsfzjhm",
    "shswjgDm",
    "shrDm",
    "xgrDm",
    "slrq",
    "slrDm",
    "fpdbrsfzjzlDm",
    "fpdblxDm",
    "shrq"
})
public class FPDbsqVO {

    @XmlElement(required = true, nillable = true)
    protected String djxh;
    @XmlElement(required = true, nillable = true)
    protected String dbsquuid;
    @XmlElement(required = true, nillable = true)
    protected String sjgsdq;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dbcczmfs;
    @XmlElement(required = true, nillable = true)
    protected String swdbgzjsjbh;
    @XmlElement(required = true, nillable = true)
    protected String wssyyjDm;
    @XmlElement(required = true, nillable = true)
    protected String fpdbrzcdz;
    @XmlElement(required = true, nillable = true)
    protected String fpdbrdjzclxDm;
    @XmlElement(required = true, nillable = true)
    protected String sqrxm;
    @XmlElement(required = true, nillable = true)
    protected String lcslid;
    @XmlElement(required = true, nillable = true)
    protected String sqrq;
    @XmlElement(required = true, nillable = true)
    protected String fpdbrlxdh;
    @XmlElement(required = true, nillable = true)
    protected String dbjcbz;
    @XmlElement(required = true, nillable = true)
    protected String dbjcsquuid;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dbrdbjehj;
    @XmlElement(required = true, nillable = true)
    protected String slswjgDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dbje;
    @XmlElement(required = true, nillable = true)
    protected String lrrDm;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dbccqdfs;
    @XmlElement(required = true, nillable = true)
    protected String fpdbrmc;
    @XmlElement(required = true, nillable = true)
    protected String fpdbrsfzjhm;
    @XmlElement(required = true, nillable = true)
    protected String shswjgDm;
    @XmlElement(required = true, nillable = true)
    protected String shrDm;
    @XmlElement(required = true, nillable = true)
    protected String xgrDm;
    @XmlElement(required = true, nillable = true)
    protected String slrq;
    @XmlElement(required = true, nillable = true)
    protected String slrDm;
    @XmlElement(required = true, nillable = true)
    protected String fpdbrsfzjzlDm;
    @XmlElement(required = true, nillable = true)
    protected String fpdblxDm;
    @XmlElement(required = true, nillable = true)
    protected String shrq;

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
     * Gets the value of the dbsquuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbsquuid() {
        return dbsquuid;
    }

    /**
     * Sets the value of the dbsquuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbsquuid(String value) {
        this.dbsquuid = value;
    }

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
     * Gets the value of the dbcczmfs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDbcczmfs() {
        return dbcczmfs;
    }

    /**
     * Sets the value of the dbcczmfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDbcczmfs(Double value) {
        this.dbcczmfs = value;
    }

    /**
     * Gets the value of the swdbgzjsjbh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwdbgzjsjbh() {
        return swdbgzjsjbh;
    }

    /**
     * Sets the value of the swdbgzjsjbh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwdbgzjsjbh(String value) {
        this.swdbgzjsjbh = value;
    }

    /**
     * Gets the value of the wssyyjDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWssyyjDm() {
        return wssyyjDm;
    }

    /**
     * Sets the value of the wssyyjDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWssyyjDm(String value) {
        this.wssyyjDm = value;
    }

    /**
     * Gets the value of the fpdbrzcdz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdbrzcdz() {
        return fpdbrzcdz;
    }

    /**
     * Sets the value of the fpdbrzcdz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdbrzcdz(String value) {
        this.fpdbrzcdz = value;
    }

    /**
     * Gets the value of the fpdbrdjzclxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdbrdjzclxDm() {
        return fpdbrdjzclxDm;
    }

    /**
     * Sets the value of the fpdbrdjzclxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdbrdjzclxDm(String value) {
        this.fpdbrdjzclxDm = value;
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
     * Gets the value of the fpdbrlxdh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdbrlxdh() {
        return fpdbrlxdh;
    }

    /**
     * Sets the value of the fpdbrlxdh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdbrlxdh(String value) {
        this.fpdbrlxdh = value;
    }

    /**
     * Gets the value of the dbjcbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbjcbz() {
        return dbjcbz;
    }

    /**
     * Sets the value of the dbjcbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbjcbz(String value) {
        this.dbjcbz = value;
    }

    /**
     * Gets the value of the dbjcsquuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbjcsquuid() {
        return dbjcsquuid;
    }

    /**
     * Sets the value of the dbjcsquuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbjcsquuid(String value) {
        this.dbjcsquuid = value;
    }

    /**
     * Gets the value of the dbrdbjehj property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDbrdbjehj() {
        return dbrdbjehj;
    }

    /**
     * Sets the value of the dbrdbjehj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDbrdbjehj(Double value) {
        this.dbrdbjehj = value;
    }

    /**
     * Gets the value of the slswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlswjgDm() {
        return slswjgDm;
    }

    /**
     * Sets the value of the slswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlswjgDm(String value) {
        this.slswjgDm = value;
    }

    /**
     * Gets the value of the dbje property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDbje() {
        return dbje;
    }

    /**
     * Sets the value of the dbje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDbje(Double value) {
        this.dbje = value;
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
     * Gets the value of the dbccqdfs property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDbccqdfs() {
        return dbccqdfs;
    }

    /**
     * Sets the value of the dbccqdfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDbccqdfs(Double value) {
        this.dbccqdfs = value;
    }

    /**
     * Gets the value of the fpdbrmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdbrmc() {
        return fpdbrmc;
    }

    /**
     * Sets the value of the fpdbrmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdbrmc(String value) {
        this.fpdbrmc = value;
    }

    /**
     * Gets the value of the fpdbrsfzjhm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdbrsfzjhm() {
        return fpdbrsfzjhm;
    }

    /**
     * Sets the value of the fpdbrsfzjhm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdbrsfzjhm(String value) {
        this.fpdbrsfzjhm = value;
    }

    /**
     * Gets the value of the shswjgDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShswjgDm() {
        return shswjgDm;
    }

    /**
     * Sets the value of the shswjgDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShswjgDm(String value) {
        this.shswjgDm = value;
    }

    /**
     * Gets the value of the shrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrDm() {
        return shrDm;
    }

    /**
     * Sets the value of the shrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrDm(String value) {
        this.shrDm = value;
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
     * Gets the value of the slrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlrq() {
        return slrq;
    }

    /**
     * Sets the value of the slrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlrq(String value) {
        this.slrq = value;
    }

    /**
     * Gets the value of the slrDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlrDm() {
        return slrDm;
    }

    /**
     * Sets the value of the slrDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlrDm(String value) {
        this.slrDm = value;
    }

    /**
     * Gets the value of the fpdbrsfzjzlDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdbrsfzjzlDm() {
        return fpdbrsfzjzlDm;
    }

    /**
     * Sets the value of the fpdbrsfzjzlDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdbrsfzjzlDm(String value) {
        this.fpdbrsfzjzlDm = value;
    }

    /**
     * Gets the value of the fpdblxDm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpdblxDm() {
        return fpdblxDm;
    }

    /**
     * Sets the value of the fpdblxDm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpdblxDm(String value) {
        this.fpdblxDm = value;
    }

    /**
     * Gets the value of the shrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrq() {
        return shrq;
    }

    /**
     * Sets the value of the shrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrq(String value) {
        this.shrq = value;
    }

}