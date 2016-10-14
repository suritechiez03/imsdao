package org.ims.dao.entity;
// Generated 25 Jan, 2016 10:53:23 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * ImsStockdetails generated by hbm2java
 */
public class ImsStockdetails  implements java.io.Serializable {


     private String productCode;
     private ImsProductdetails imsProductdetails;
     private ImsLogindetails imsLogindetails;
     private Long purchasedQty;
     private Long dispatchedQty;
     private Long availableQty;
     private BigDecimal basicRate;
     private BigDecimal excesseDutyPercentage;
     private BigDecimal excessDutyRate;
     private BigDecimal transPortationPercentage;
     private BigDecimal transportationRate;
     private BigDecimal cstpercentage;
     private BigDecimal cstrate;
     private BigDecimal basicDistributorPrice;
     private BigDecimal ourMarginPercentage;
     private BigDecimal ourMerginAmount;
     private BigDecimal dealerPrice;
     private Date enteredDate;

    public ImsStockdetails() {
    }

	
    public ImsStockdetails(ImsProductdetails imsProductdetails) {
        this.imsProductdetails = imsProductdetails;
    }
    public ImsStockdetails(ImsProductdetails imsProductdetails, ImsLogindetails imsLogindetails, Long purchasedQty, Long dispatchedQty, Long availableQty, BigDecimal basicRate, BigDecimal excesseDutyPercentage, BigDecimal excessDutyRate, BigDecimal transPortationPercentage, BigDecimal transportationRate, BigDecimal cstpercentage, BigDecimal cstrate, BigDecimal basicDistributorPrice, BigDecimal ourMarginPercentage, BigDecimal ourMerginAmount, BigDecimal dealerPrice, Date enteredDate) {
       this.imsProductdetails = imsProductdetails;
       this.imsLogindetails = imsLogindetails;
       this.purchasedQty = purchasedQty;
       this.dispatchedQty = dispatchedQty;
       this.availableQty = availableQty;
       this.basicRate = basicRate;
       this.excesseDutyPercentage = excesseDutyPercentage;
       this.excessDutyRate = excessDutyRate;
       this.transPortationPercentage = transPortationPercentage;
       this.transportationRate = transportationRate;
       this.cstpercentage = cstpercentage;
       this.cstrate = cstrate;
       this.basicDistributorPrice = basicDistributorPrice;
       this.ourMarginPercentage = ourMarginPercentage;
       this.ourMerginAmount = ourMerginAmount;
       this.dealerPrice = dealerPrice;
       this.enteredDate = enteredDate;
    }
   
    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public ImsProductdetails getImsProductdetails() {
        return this.imsProductdetails;
    }
    
    public void setImsProductdetails(ImsProductdetails imsProductdetails) {
        this.imsProductdetails = imsProductdetails;
    }
    public ImsLogindetails getImsLogindetails() {
        return this.imsLogindetails;
    }
    
    public void setImsLogindetails(ImsLogindetails imsLogindetails) {
        this.imsLogindetails = imsLogindetails;
    }
    public Long getPurchasedQty() {
        return this.purchasedQty;
    }
    
    public void setPurchasedQty(Long purchasedQty) {
        this.purchasedQty = purchasedQty;
    }
    public Long getDispatchedQty() {
        return this.dispatchedQty;
    }
    
    public void setDispatchedQty(Long dispatchedQty) {
        this.dispatchedQty = dispatchedQty;
    }
    public Long getAvailableQty() {
        return this.availableQty;
    }
    
    public void setAvailableQty(Long availableQty) {
        this.availableQty = availableQty;
    }
    public BigDecimal getBasicRate() {
        return this.basicRate;
    }
    
    public void setBasicRate(BigDecimal basicRate) {
        this.basicRate = basicRate;
    }
    public BigDecimal getExcesseDutyPercentage() {
        return this.excesseDutyPercentage;
    }
    
    public void setExcesseDutyPercentage(BigDecimal excesseDutyPercentage) {
        this.excesseDutyPercentage = excesseDutyPercentage;
    }
    public BigDecimal getExcessDutyRate() {
        return this.excessDutyRate;
    }
    
    public void setExcessDutyRate(BigDecimal excessDutyRate) {
        this.excessDutyRate = excessDutyRate;
    }
    public BigDecimal getTransPortationPercentage() {
        return this.transPortationPercentage;
    }
    
    public void setTransPortationPercentage(BigDecimal transPortationPercentage) {
        this.transPortationPercentage = transPortationPercentage;
    }
    public BigDecimal getTransportationRate() {
        return this.transportationRate;
    }
    
    public void setTransportationRate(BigDecimal transportationRate) {
        this.transportationRate = transportationRate;
    }
    public BigDecimal getCstpercentage() {
        return this.cstpercentage;
    }
    
    public void setCstpercentage(BigDecimal cstpercentage) {
        this.cstpercentage = cstpercentage;
    }
    public BigDecimal getCstrate() {
        return this.cstrate;
    }
    
    public void setCstrate(BigDecimal cstrate) {
        this.cstrate = cstrate;
    }
    public BigDecimal getBasicDistributorPrice() {
        return this.basicDistributorPrice;
    }
    
    public void setBasicDistributorPrice(BigDecimal basicDistributorPrice) {
        this.basicDistributorPrice = basicDistributorPrice;
    }
    public BigDecimal getOurMarginPercentage() {
        return this.ourMarginPercentage;
    }
    
    public void setOurMarginPercentage(BigDecimal ourMarginPercentage) {
        this.ourMarginPercentage = ourMarginPercentage;
    }
    public BigDecimal getOurMerginAmount() {
        return this.ourMerginAmount;
    }
    
    public void setOurMerginAmount(BigDecimal ourMerginAmount) {
        this.ourMerginAmount = ourMerginAmount;
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




}


