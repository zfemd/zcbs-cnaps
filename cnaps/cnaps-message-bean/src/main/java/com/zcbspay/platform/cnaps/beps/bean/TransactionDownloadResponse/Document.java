//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 10:08:35 AM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.TransactionDownloadResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxDwnldRspn" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.725.001.01}TransactionDownloadResponsion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "txDwnldRspn"
})
public class Document {

    @XmlElement(name = "TxDwnldRspn", required = true)
    protected TransactionDownloadResponsion txDwnldRspn;

    /**
     * Gets the value of the txDwnldRspn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDownloadResponsion }
     *     
     */
    public TransactionDownloadResponsion getTxDwnldRspn() {
        return txDwnldRspn;
    }

    /**
     * Sets the value of the txDwnldRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDownloadResponsion }
     *     
     */
    public void setTxDwnldRspn(TransactionDownloadResponsion value) {
        this.txDwnldRspn = value;
    }

}