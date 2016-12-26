package org.ims.dao.entity;
// Generated Dec 26, 2016 9:20:06 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ImsManageorders generated by hbm2java
 */
public class ImsManageorders  implements java.io.Serializable {


     private Long oderNumber;
     private ImsLogindetails imsLogindetails;
     private int orderType;
     private String orderFor;
     private String orderRaisedBy;
     private int orderStatus;
     private String additionalInfo;
     private Date orderRaisedDate;
     private String generatedOrderNo;
     private Date enteredDate;
     private Set imsManageorderdetailses = new HashSet(0);
     private Set imsInvoiceMasters = new HashSet(0);

    public ImsManageorders() {
    }

	
    public ImsManageorders(ImsLogindetails imsLogindetails, int orderType, int orderStatus, Date enteredDate) {
        this.imsLogindetails = imsLogindetails;
        this.orderType = orderType;
        this.orderStatus = orderStatus;
        this.enteredDate = enteredDate;
    }
    public ImsManageorders(ImsLogindetails imsLogindetails, int orderType, String orderFor, String orderRaisedBy, int orderStatus, String additionalInfo, Date orderRaisedDate, String generatedOrderNo, Date enteredDate, Set imsManageorderdetailses, Set imsInvoiceMasters) {
       this.imsLogindetails = imsLogindetails;
       this.orderType = orderType;
       this.orderFor = orderFor;
       this.orderRaisedBy = orderRaisedBy;
       this.orderStatus = orderStatus;
       this.additionalInfo = additionalInfo;
       this.orderRaisedDate = orderRaisedDate;
       this.generatedOrderNo = generatedOrderNo;
       this.enteredDate = enteredDate;
       this.imsManageorderdetailses = imsManageorderdetailses;
       this.imsInvoiceMasters = imsInvoiceMasters;
    }
   
    public Long getOderNumber() {
        return this.oderNumber;
    }
    
    public void setOderNumber(Long oderNumber) {
        this.oderNumber = oderNumber;
    }
    public ImsLogindetails getImsLogindetails() {
        return this.imsLogindetails;
    }
    
    public void setImsLogindetails(ImsLogindetails imsLogindetails) {
        this.imsLogindetails = imsLogindetails;
    }
    public int getOrderType() {
        return this.orderType;
    }
    
    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }
    public String getOrderFor() {
        return this.orderFor;
    }
    
    public void setOrderFor(String orderFor) {
        this.orderFor = orderFor;
    }
    public String getOrderRaisedBy() {
        return this.orderRaisedBy;
    }
    
    public void setOrderRaisedBy(String orderRaisedBy) {
        this.orderRaisedBy = orderRaisedBy;
    }
    public int getOrderStatus() {
        return this.orderStatus;
    }
    
    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }
    
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    public Date getOrderRaisedDate() {
        return this.orderRaisedDate;
    }
    
    public void setOrderRaisedDate(Date orderRaisedDate) {
        this.orderRaisedDate = orderRaisedDate;
    }
    public String getGeneratedOrderNo() {
        return this.generatedOrderNo;
    }
    
    public void setGeneratedOrderNo(String generatedOrderNo) {
        this.generatedOrderNo = generatedOrderNo;
    }
    public Date getEnteredDate() {
        return this.enteredDate;
    }
    
    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }
    public Set getImsManageorderdetailses() {
        return this.imsManageorderdetailses;
    }
    
    public void setImsManageorderdetailses(Set imsManageorderdetailses) {
        this.imsManageorderdetailses = imsManageorderdetailses;
    }
    public Set getImsInvoiceMasters() {
        return this.imsInvoiceMasters;
    }
    
    public void setImsInvoiceMasters(Set imsInvoiceMasters) {
        this.imsInvoiceMasters = imsInvoiceMasters;
    }




}


