package org.ims.dao.entity;
// Generated 25 Jan, 2016 10:53:23 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * ImsSalesproductdetailsId generated by hbm2java
 */
public class ImsSalesproductdetailsId  implements java.io.Serializable {


     private BigDecimal transactionId;
     private String invoiceNo;

    public ImsSalesproductdetailsId() {
    }

    public ImsSalesproductdetailsId(BigDecimal transactionId, String invoiceNo) {
       this.transactionId = transactionId;
       this.invoiceNo = invoiceNo;
    }
   
    public BigDecimal getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(BigDecimal transactionId) {
        this.transactionId = transactionId;
    }
    public String getInvoiceNo() {
        return this.invoiceNo;
    }
    
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }




}


