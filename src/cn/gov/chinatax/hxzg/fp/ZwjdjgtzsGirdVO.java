//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 ���� CST 
//


package cn.gov.chinatax.hxzg.fp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ��α��������б�
 * 
 * <p>Java class for ZwjdjgtzsGirdVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZwjdjgtzsGirdVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fpzwjdmxjgList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="fpzwjdmxjgListlb" type="{http://www.chinatax.gov.cn/dataspec/}FpzwjdmxjgVO"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZwjdjgtzsGirdVO", propOrder = {
    "fpzwjdmxjgList"
})
public class ZwjdjgtzsGirdVO {

    @XmlElement(required = true)
    protected ZwjdjgtzsGirdVO.FpzwjdmxjgList fpzwjdmxjgList;

    /**
     * Gets the value of the fpzwjdmxjgList property.
     * 
     * @return
     *     possible object is
     *     {@link ZwjdjgtzsGirdVO.FpzwjdmxjgList }
     *     
     */
    public ZwjdjgtzsGirdVO.FpzwjdmxjgList getFpzwjdmxjgList() {
        return fpzwjdmxjgList;
    }

    /**
     * Sets the value of the fpzwjdmxjgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwjdjgtzsGirdVO.FpzwjdmxjgList }
     *     
     */
    public void setFpzwjdmxjgList(ZwjdjgtzsGirdVO.FpzwjdmxjgList value) {
        this.fpzwjdmxjgList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="fpzwjdmxjgListlb" type="{http://www.chinatax.gov.cn/dataspec/}FpzwjdmxjgVO"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fpzwjdmxjgListlb"
    })
    public static class FpzwjdmxjgList {

        @XmlElement(required = true)
        protected List<FpzwjdmxjgVO> fpzwjdmxjgListlb;

        /**
         * Gets the value of the fpzwjdmxjgListlb property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fpzwjdmxjgListlb property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFpzwjdmxjgListlb().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FpzwjdmxjgVO }
         * 
         * 
         */
        public List<FpzwjdmxjgVO> getFpzwjdmxjgListlb() {
            if (fpzwjdmxjgListlb == null) {
                fpzwjdmxjgListlb = new ArrayList<FpzwjdmxjgVO>();
            }
            return this.fpzwjdmxjgListlb;
        }

    }

}