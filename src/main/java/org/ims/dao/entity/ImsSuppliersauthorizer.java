package org.ims.dao.entity;
// Generated Nov 17, 2016 12:01:36 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ImsSuppliersauthorizer generated by hbm2java
 */
public class ImsSuppliersauthorizer  implements java.io.Serializable {


     private String authrizerId;
     private ImsLogindetails imsLogindetails;
     private ImsSuppliermaster imsSuppliermaster;
     private String authrizerName;
     private String phoneNo;
     private String emailId;
     private byte[] authorizerPhoto;
     private String pannumber;
     private Date enteredDate;
     private String otherDetails;
     private Boolean status;

    public ImsSuppliersauthorizer() {
    }

	
    public ImsSuppliersauthorizer(String authrizerId, ImsLogindetails imsLogindetails, ImsSuppliermaster imsSuppliermaster, String authrizerName, String pannumber, Date enteredDate) {
        this.authrizerId = authrizerId;
        this.imsLogindetails = imsLogindetails;
        this.imsSuppliermaster = imsSuppliermaster;
        this.authrizerName = authrizerName;
        this.pannumber = pannumber;
        this.enteredDate = enteredDate;
    }
    public ImsSuppliersauthorizer(String authrizerId, ImsLogindetails imsLogindetails, ImsSuppliermaster imsSuppliermaster, String authrizerName, String phoneNo, String emailId, byte[] authorizerPhoto, String pannumber, Date enteredDate, String otherDetails, Boolean status) {
       this.authrizerId = authrizerId;
       this.imsLogindetails = imsLogindetails;
       this.imsSuppliermaster = imsSuppliermaster;
       this.authrizerName = authrizerName;
       this.phoneNo = phoneNo;
       this.emailId = emailId;
       this.authorizerPhoto = authorizerPhoto;
       this.pannumber = pannumber;
       this.enteredDate = enteredDate;
       this.otherDetails = otherDetails;
       this.status = status;
    }
   
    public String getAuthrizerId() {
        return this.authrizerId;
    }
    
    public void setAuthrizerId(String authrizerId) {
        this.authrizerId = authrizerId;
    }
    public ImsLogindetails getImsLogindetails() {
        return this.imsLogindetails;
    }
    
    public void setImsLogindetails(ImsLogindetails imsLogindetails) {
        this.imsLogindetails = imsLogindetails;
    }
    public ImsSuppliermaster getImsSuppliermaster() {
        return this.imsSuppliermaster;
    }
    
    public void setImsSuppliermaster(ImsSuppliermaster imsSuppliermaster) {
        this.imsSuppliermaster = imsSuppliermaster;
    }
    public String getAuthrizerName() {
        return this.authrizerName;
    }
    
    public void setAuthrizerName(String authrizerName) {
        this.authrizerName = authrizerName;
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
    public byte[] getAuthorizerPhoto() {
        return this.authorizerPhoto;
    }
    
    public void setAuthorizerPhoto(byte[] authorizerPhoto) {
        this.authorizerPhoto = authorizerPhoto;
    }
    public String getPannumber() {
        return this.pannumber;
    }
    
    public void setPannumber(String pannumber) {
        this.pannumber = pannumber;
    }
    public Date getEnteredDate() {
        return this.enteredDate;
    }
    
    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }
    public String getOtherDetails() {
        return this.otherDetails;
    }
    
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }




}


