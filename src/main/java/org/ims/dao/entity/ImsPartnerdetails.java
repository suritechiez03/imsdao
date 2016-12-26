package org.ims.dao.entity;
// Generated Dec 26, 2016 9:20:06 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ImsPartnerdetails generated by hbm2java
 */
public class ImsPartnerdetails  implements java.io.Serializable {


     private String parnterId;
     private ImsLogindetails imsLogindetails;
     private String partnerName;
     private String partnerAddress;
     private String dealerOrsupplierNo;
     private String phoneNo;
     private String emailId;
     private String pannumber;
     private Boolean status;
     private Date enteredDate;
     private byte[] partnerPhoto;

    public ImsPartnerdetails() {
    }

	
    public ImsPartnerdetails(String parnterId, ImsLogindetails imsLogindetails, String dealerOrsupplierNo, Date enteredDate) {
        this.parnterId = parnterId;
        this.imsLogindetails = imsLogindetails;
        this.dealerOrsupplierNo = dealerOrsupplierNo;
        this.enteredDate = enteredDate;
    }
    public ImsPartnerdetails(String parnterId, ImsLogindetails imsLogindetails, String partnerName, String partnerAddress, String dealerOrsupplierNo, String phoneNo, String emailId, String pannumber, Boolean status, Date enteredDate, byte[] partnerPhoto) {
       this.parnterId = parnterId;
       this.imsLogindetails = imsLogindetails;
       this.partnerName = partnerName;
       this.partnerAddress = partnerAddress;
       this.dealerOrsupplierNo = dealerOrsupplierNo;
       this.phoneNo = phoneNo;
       this.emailId = emailId;
       this.pannumber = pannumber;
       this.status = status;
       this.enteredDate = enteredDate;
       this.partnerPhoto = partnerPhoto;
    }
   
    public String getParnterId() {
        return this.parnterId;
    }
    
    public void setParnterId(String parnterId) {
        this.parnterId = parnterId;
    }
    public ImsLogindetails getImsLogindetails() {
        return this.imsLogindetails;
    }
    
    public void setImsLogindetails(ImsLogindetails imsLogindetails) {
        this.imsLogindetails = imsLogindetails;
    }
    public String getPartnerName() {
        return this.partnerName;
    }
    
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
    public String getPartnerAddress() {
        return this.partnerAddress;
    }
    
    public void setPartnerAddress(String partnerAddress) {
        this.partnerAddress = partnerAddress;
    }
    public String getDealerOrsupplierNo() {
        return this.dealerOrsupplierNo;
    }
    
    public void setDealerOrsupplierNo(String dealerOrsupplierNo) {
        this.dealerOrsupplierNo = dealerOrsupplierNo;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }
    
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getEmailId() {
        return this.emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPannumber() {
        return this.pannumber;
    }
    
    public void setPannumber(String pannumber) {
        this.pannumber = pannumber;
    }
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Date getEnteredDate() {
        return this.enteredDate;
    }
    
    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }
    public byte[] getPartnerPhoto() {
        return this.partnerPhoto;
    }
    
    public void setPartnerPhoto(byte[] partnerPhoto) {
        this.partnerPhoto = partnerPhoto;
    }




}


