package org.ims.dao.entity;
// Generated Dec 27, 2016 11:33:32 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * ImsPurchaseproductdetails generated by hbm2java
 */
public class ImsPurchaseproductdetails  implements java.io.Serializable {


     private ImsPurchaseproductdetailsId id;
     private ImsLogindetails imsLogindetails;
     private ImsProductdetails imsProductdetails;
     private ImsPurchasemaster imsPurchasemaster;
     private Long quantity;
     private BigDecimal basicRate;
     private BigDecimal discount;
     private BigDecimal vat;
     private BigDecimal amount;
     private String remarks;
     private Date enteredDate;

    public ImsPurchaseproductdetails() {
    }

	
    public ImsPurchaseproductdetails(ImsPurchaseproductdetailsId id, ImsLogindetails imsLogindetails, ImsPurchasemaster imsPurchasemaster, Date enteredDate) {
        this.id = id;
        this.imsLogindetails = imsLogindetails;
        this.imsPurchasemaster = imsPurchasemaster;
        this.enteredDate = enteredDate;
    }
    public ImsPurchaseproductdetails(ImsPurchaseproductdetailsId id, ImsLogindetails imsLogindetails, ImsProductdetails imsProductdetails, ImsPurchasemaster imsPurchasemaster, Long quantity, BigDecimal basicRate, BigDecimal discount, BigDecimal vat, BigDecimal amount, String remarks, Date enteredDate) {
       this.id = id;
       this.imsLogindetails = imsLogindetails;
       this.imsProductdetails = imsProductdetails;
       this.imsPurchasemaster = imsPurchasemaster;
       this.quantity = quantity;
       this.basicRate = basicRate;
       this.discount = discount;
       this.vat = vat;
       this.amount = amount;
       this.remarks = remarks;
       this.enteredDate = enteredDate;
    }
   
    public ImsPurchaseproductdetailsId getId() {
        return this.id;
    }
    
    public void setId(ImsPurchaseproductdetailsId id) {
        this.id = id;
    }
    public ImsLogindetails getImsLogindetails() {
        return this.imsLogindetails;
    }
    
    public void setImsLogindetails(ImsLogindetails imsLogindetails) {
        this.imsLogindetails = imsLogindetails;
    }
    public ImsProductdetails getImsProductdetails() {
        return this.imsProductdetails;
    }
    
    public void setImsProductdetails(ImsProductdetails imsProductdetails) {
        this.imsProductdetails = imsProductdetails;
    }
    public ImsPurchasemaster getImsPurchasemaster() {
        return this.imsPurchasemaster;
    }
    
    public void setImsPurchasemaster(ImsPurchasemaster imsPurchasemaster) {
        this.imsPurchasemaster = imsPurchasemaster;
    }
    public Long getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    public BigDecimal getBasicRate() {
        return this.basicRate;
    }
    
    public void setBasicRate(BigDecimal basicRate) {
        this.basicRate = basicRate;
    }
    public BigDecimal getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
    public BigDecimal getVat() {
        return this.vat;
    }
    
    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public Date getEnteredDate() {
        return this.enteredDate;
    }
    
    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }




}


