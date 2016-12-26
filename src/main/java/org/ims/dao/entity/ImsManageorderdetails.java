package org.ims.dao.entity;
// Generated Dec 26, 2016 9:20:06 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * ImsManageorderdetails generated by hbm2java
 */
public class ImsManageorderdetails  implements java.io.Serializable {


     private Integer id;
     private ImsLogindetails imsLogindetails;
     private ImsManageorders imsManageorders;
     private ImsProductdetails imsProductdetails;
     private Long orderQuantity;
     private Long dispatchedQuantity;
     private BigDecimal unitPrice;
     private Double discount;
     private String particulars;
     private Double vat;
     private BigDecimal totalPrice;
     private Double marginPrecnt;
     private BigDecimal marginAmt;
     private BigDecimal dealerPrice;
     private Date enteredDate;
     private Date lasModifiedDate;
     private Long modifedBy;

    public ImsManageorderdetails() {
    }

	
    public ImsManageorderdetails(ImsLogindetails imsLogindetails, Date enteredDate) {
        this.imsLogindetails = imsLogindetails;
        this.enteredDate = enteredDate;
    }
    public ImsManageorderdetails(ImsLogindetails imsLogindetails, ImsManageorders imsManageorders, ImsProductdetails imsProductdetails, Long orderQuantity, Long dispatchedQuantity, BigDecimal unitPrice, Double discount, String particulars, Double vat, BigDecimal totalPrice, Double marginPrecnt, BigDecimal marginAmt, BigDecimal dealerPrice, Date enteredDate, Date lasModifiedDate, Long modifedBy) {
       this.imsLogindetails = imsLogindetails;
       this.imsManageorders = imsManageorders;
       this.imsProductdetails = imsProductdetails;
       this.orderQuantity = orderQuantity;
       this.dispatchedQuantity = dispatchedQuantity;
       this.unitPrice = unitPrice;
       this.discount = discount;
       this.particulars = particulars;
       this.vat = vat;
       this.totalPrice = totalPrice;
       this.marginPrecnt = marginPrecnt;
       this.marginAmt = marginAmt;
       this.dealerPrice = dealerPrice;
       this.enteredDate = enteredDate;
       this.lasModifiedDate = lasModifiedDate;
       this.modifedBy = modifedBy;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public ImsLogindetails getImsLogindetails() {
        return this.imsLogindetails;
    }
    
    public void setImsLogindetails(ImsLogindetails imsLogindetails) {
        this.imsLogindetails = imsLogindetails;
    }
    public ImsManageorders getImsManageorders() {
        return this.imsManageorders;
    }
    
    public void setImsManageorders(ImsManageorders imsManageorders) {
        this.imsManageorders = imsManageorders;
    }
    public ImsProductdetails getImsProductdetails() {
        return this.imsProductdetails;
    }
    
    public void setImsProductdetails(ImsProductdetails imsProductdetails) {
        this.imsProductdetails = imsProductdetails;
    }
    public Long getOrderQuantity() {
        return this.orderQuantity;
    }
    
    public void setOrderQuantity(Long orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
    public Long getDispatchedQuantity() {
        return this.dispatchedQuantity;
    }
    
    public void setDispatchedQuantity(Long dispatchedQuantity) {
        this.dispatchedQuantity = dispatchedQuantity;
    }
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public String getParticulars() {
        return this.particulars;
    }
    
    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }
    public Double getVat() {
        return this.vat;
    }
    
    public void setVat(Double vat) {
        this.vat = vat;
    }
    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Double getMarginPrecnt() {
        return this.marginPrecnt;
    }
    
    public void setMarginPrecnt(Double marginPrecnt) {
        this.marginPrecnt = marginPrecnt;
    }
    public BigDecimal getMarginAmt() {
        return this.marginAmt;
    }
    
    public void setMarginAmt(BigDecimal marginAmt) {
        this.marginAmt = marginAmt;
    }
    public BigDecimal getDealerPrice() {
        return this.dealerPrice;
    }
    
    public void setDealerPrice(BigDecimal dealerPrice) {
        this.dealerPrice = dealerPrice;
    }
    public Date getEnteredDate() {
        return this.enteredDate;
    }
    
    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }
    public Date getLasModifiedDate() {
        return this.lasModifiedDate;
    }
    
    public void setLasModifiedDate(Date lasModifiedDate) {
        this.lasModifiedDate = lasModifiedDate;
    }
    public Long getModifedBy() {
        return this.modifedBy;
    }
    
    public void setModifedBy(Long modifedBy) {
        this.modifedBy = modifedBy;
    }




}


