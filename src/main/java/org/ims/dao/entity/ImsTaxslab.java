package org.ims.dao.entity;
// Generated 25 Jan, 2016 10:53:23 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * ImsTaxslab generated by hbm2java
 */
public class ImsTaxslab  implements java.io.Serializable {


     private Integer serialNumber;
     private Double vat1;
     private Double vat2;
     private Double excessPercentage;
     private Double educationCessPercentage;
     private Double secondaryEducationCessPercentage;
     private Double cstpercentage;
     private Integer status;
     private Date vaildTillDate;
     private Long enteredBy;
     private Date enteredDate;

    public ImsTaxslab() {
    }

    public ImsTaxslab(Double vat1, Double vat2, Double excessPercentage, Double educationCessPercentage, Double secondaryEducationCessPercentage, Double cstpercentage, Integer status, Date vaildTillDate, Long enteredBy, Date enteredDate) {
       this.vat1 = vat1;
       this.vat2 = vat2;
       this.excessPercentage = excessPercentage;
       this.educationCessPercentage = educationCessPercentage;
       this.secondaryEducationCessPercentage = secondaryEducationCessPercentage;
       this.cstpercentage = cstpercentage;
       this.status = status;
       this.vaildTillDate = vaildTillDate;
       this.enteredBy = enteredBy;
       this.enteredDate = enteredDate;
    }
   
    public Integer getSerialNumber() {
        return this.serialNumber;
    }
    
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Double getVat1() {
        return this.vat1;
    }
    
    public void setVat1(Double vat1) {
        this.vat1 = vat1;
    }
    public Double getVat2() {
        return this.vat2;
    }
    
    public void setVat2(Double vat2) {
        this.vat2 = vat2;
    }
    public Double getExcessPercentage() {
        return this.excessPercentage;
    }
    
    public void setExcessPercentage(Double excessPercentage) {
        this.excessPercentage = excessPercentage;
    }
    public Double getEducationCessPercentage() {
        return this.educationCessPercentage;
    }
    
    public void setEducationCessPercentage(Double educationCessPercentage) {
        this.educationCessPercentage = educationCessPercentage;
    }
    public Double getSecondaryEducationCessPercentage() {
        return this.secondaryEducationCessPercentage;
    }
    
    public void setSecondaryEducationCessPercentage(Double secondaryEducationCessPercentage) {
        this.secondaryEducationCessPercentage = secondaryEducationCessPercentage;
    }
    public Double getCstpercentage() {
        return this.cstpercentage;
    }
    
    public void setCstpercentage(Double cstpercentage) {
        this.cstpercentage = cstpercentage;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getVaildTillDate() {
        return this.vaildTillDate;
    }
    
    public void setVaildTillDate(Date vaildTillDate) {
        this.vaildTillDate = vaildTillDate;
    }
    public Long getEnteredBy() {
        return this.enteredBy;
    }
    
    public void setEnteredBy(Long enteredBy) {
        this.enteredBy = enteredBy;
    }
    public Date getEnteredDate() {
        return this.enteredDate;
    }
    
    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }




}

