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
 * 树结构查询数据自定义VO
 * 
 * <p>Java class for FPZdyTreeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPZdyTreeVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.chinatax.gov.cn/dataspec/}code"/>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPZdyTreeVO", propOrder = {
    "code",
    "caption",
    "pcode",
    "key1",
    "key2",
    "key3",
    "key4",
    "key5"
})
public class FPZdyTreeVO {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String caption;
    @XmlElement(required = true, nillable = true)
    protected String pcode;
    @XmlElement(required = true, nillable = true)
    protected String key1;
    @XmlElement(required = true, nillable = true)
    protected String key2;
    @XmlElement(required = true, nillable = true)
    protected String key3;
    @XmlElement(required = true, nillable = true)
    protected String key4;
    @XmlElement(required = true, nillable = true)
    protected String key5;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the pcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcode() {
        return pcode;
    }

    /**
     * Sets the value of the pcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcode(String value) {
        this.pcode = value;
    }

    /**
     * Gets the value of the key1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey1() {
        return key1;
    }

    /**
     * Sets the value of the key1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey1(String value) {
        this.key1 = value;
    }

    /**
     * Gets the value of the key2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey2() {
        return key2;
    }

    /**
     * Sets the value of the key2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey2(String value) {
        this.key2 = value;
    }

    /**
     * Gets the value of the key3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey3() {
        return key3;
    }

    /**
     * Sets the value of the key3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey3(String value) {
        this.key3 = value;
    }

    /**
     * Gets the value of the key4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey4() {
        return key4;
    }

    /**
     * Sets the value of the key4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey4(String value) {
        this.key4 = value;
    }

    /**
     * Gets the value of the key5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey5() {
        return key5;
    }

    /**
     * Sets the value of the key5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey5(String value) {
        this.key5 = value;
    }

}
