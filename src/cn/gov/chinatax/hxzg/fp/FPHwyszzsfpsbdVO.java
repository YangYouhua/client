//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 03:50:11 下午 CST 
//


package cn.gov.chinatax.hxzg.fp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 货物运输业增值税专用发票申报单
 * 
 * <p>Java class for FPHwyszzsfpsbdVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPHwyszzsfpsbdVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chinatax.gov.cn/dataspec/}FPFpdksbdVO">
 *       &lt;sequence>
 *         &lt;element name="FPDkHwyszzsfpVO" type="{http://www.chinatax.gov.cn/dataspec/}FPDkHwysyzzsfpVO"/>
 *         &lt;element name="fpdkHwyszzsfpysxxVO" type="{http://www.chinatax.gov.cn/dataspec/}FPDkHwyszzsfpYsxxVO"/>
 *         &lt;element name="fpdkHwyszzsfpclmxGrid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="fpdkHwyszzsfpclmxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}FPDkHwyszzsfpClmxVO"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fpdkHwyszzsfpxmmxGrid">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="fpdkHwyszzsfpxmmxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}FPDkHwyszzsfpXmmxVO"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPHwyszzsfpsbdVO", propOrder = {
    "fpDkHwyszzsfpVO",
    "fpdkHwyszzsfpysxxVO",
    "fpdkHwyszzsfpclmxGrid",
    "fpdkHwyszzsfpxmmxGrid"
})
public class FPHwyszzsfpsbdVO
    extends FPFpdksbdVO
{

    @XmlElement(name = "FPDkHwyszzsfpVO", required = true)
    protected FPDkHwysyzzsfpVO fpDkHwyszzsfpVO;
    @XmlElement(required = true)
    protected FPDkHwyszzsfpYsxxVO fpdkHwyszzsfpysxxVO;
    @XmlElement(required = true)
    protected FPHwyszzsfpsbdVO.FpdkHwyszzsfpclmxGrid fpdkHwyszzsfpclmxGrid;
    @XmlElement(required = true)
    protected FPHwyszzsfpsbdVO.FpdkHwyszzsfpxmmxGrid fpdkHwyszzsfpxmmxGrid;

    /**
     * Gets the value of the fpDkHwyszzsfpVO property.
     * 
     * @return
     *     possible object is
     *     {@link FPDkHwysyzzsfpVO }
     *     
     */
    public FPDkHwysyzzsfpVO getFPDkHwyszzsfpVO() {
        return fpDkHwyszzsfpVO;
    }

    /**
     * Sets the value of the fpDkHwyszzsfpVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPDkHwysyzzsfpVO }
     *     
     */
    public void setFPDkHwyszzsfpVO(FPDkHwysyzzsfpVO value) {
        this.fpDkHwyszzsfpVO = value;
    }

    /**
     * Gets the value of the fpdkHwyszzsfpysxxVO property.
     * 
     * @return
     *     possible object is
     *     {@link FPDkHwyszzsfpYsxxVO }
     *     
     */
    public FPDkHwyszzsfpYsxxVO getFpdkHwyszzsfpysxxVO() {
        return fpdkHwyszzsfpysxxVO;
    }

    /**
     * Sets the value of the fpdkHwyszzsfpysxxVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPDkHwyszzsfpYsxxVO }
     *     
     */
    public void setFpdkHwyszzsfpysxxVO(FPDkHwyszzsfpYsxxVO value) {
        this.fpdkHwyszzsfpysxxVO = value;
    }

    /**
     * Gets the value of the fpdkHwyszzsfpclmxGrid property.
     * 
     * @return
     *     possible object is
     *     {@link FPHwyszzsfpsbdVO.FpdkHwyszzsfpclmxGrid }
     *     
     */
    public FPHwyszzsfpsbdVO.FpdkHwyszzsfpclmxGrid getFpdkHwyszzsfpclmxGrid() {
        return fpdkHwyszzsfpclmxGrid;
    }

    /**
     * Sets the value of the fpdkHwyszzsfpclmxGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPHwyszzsfpsbdVO.FpdkHwyszzsfpclmxGrid }
     *     
     */
    public void setFpdkHwyszzsfpclmxGrid(FPHwyszzsfpsbdVO.FpdkHwyszzsfpclmxGrid value) {
        this.fpdkHwyszzsfpclmxGrid = value;
    }

    /**
     * Gets the value of the fpdkHwyszzsfpxmmxGrid property.
     * 
     * @return
     *     possible object is
     *     {@link FPHwyszzsfpsbdVO.FpdkHwyszzsfpxmmxGrid }
     *     
     */
    public FPHwyszzsfpsbdVO.FpdkHwyszzsfpxmmxGrid getFpdkHwyszzsfpxmmxGrid() {
        return fpdkHwyszzsfpxmmxGrid;
    }

    /**
     * Sets the value of the fpdkHwyszzsfpxmmxGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPHwyszzsfpsbdVO.FpdkHwyszzsfpxmmxGrid }
     *     
     */
    public void setFpdkHwyszzsfpxmmxGrid(FPHwyszzsfpsbdVO.FpdkHwyszzsfpxmmxGrid value) {
        this.fpdkHwyszzsfpxmmxGrid = value;
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
     *         &lt;element name="fpdkHwyszzsfpclmxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}FPDkHwyszzsfpClmxVO"/>
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
        "fpdkHwyszzsfpclmxGridlb"
    })
    public static class FpdkHwyszzsfpclmxGrid {

        @XmlElement(required = true)
        protected List<FPDkHwyszzsfpClmxVO> fpdkHwyszzsfpclmxGridlb;

        /**
         * Gets the value of the fpdkHwyszzsfpclmxGridlb property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fpdkHwyszzsfpclmxGridlb property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFpdkHwyszzsfpclmxGridlb().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FPDkHwyszzsfpClmxVO }
         * 
         * 
         */
        public List<FPDkHwyszzsfpClmxVO> getFpdkHwyszzsfpclmxGridlb() {
            if (fpdkHwyszzsfpclmxGridlb == null) {
                fpdkHwyszzsfpclmxGridlb = new ArrayList<FPDkHwyszzsfpClmxVO>();
            }
            return this.fpdkHwyszzsfpclmxGridlb;
        }

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
     *         &lt;element name="fpdkHwyszzsfpxmmxGridlb" type="{http://www.chinatax.gov.cn/dataspec/}FPDkHwyszzsfpXmmxVO"/>
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
        "fpdkHwyszzsfpxmmxGridlb"
    })
    public static class FpdkHwyszzsfpxmmxGrid {

        @XmlElement(required = true)
        protected List<FPDkHwyszzsfpXmmxVO> fpdkHwyszzsfpxmmxGridlb;

        /**
         * Gets the value of the fpdkHwyszzsfpxmmxGridlb property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fpdkHwyszzsfpxmmxGridlb property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFpdkHwyszzsfpxmmxGridlb().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FPDkHwyszzsfpXmmxVO }
         * 
         * 
         */
        public List<FPDkHwyszzsfpXmmxVO> getFpdkHwyszzsfpxmmxGridlb() {
            if (fpdkHwyszzsfpxmmxGridlb == null) {
                fpdkHwyszzsfpxmmxGridlb = new ArrayList<FPDkHwyszzsfpXmmxVO>();
            }
            return this.fpdkHwyszzsfpxmmxGridlb;
        }

    }

}
