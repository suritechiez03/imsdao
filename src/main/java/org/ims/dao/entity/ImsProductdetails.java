package org.ims.dao.entity;
// Generated Dec 27, 2016 11:33:32 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ImsProductdetails generated by hbm2java
 */
public class ImsProductdetails  implements java.io.Serializable {


     private String productCode;
     private ImsLogindetails imsLogindetails;
     private ImsProductcategory imsProductcategory;
     private String productName;
     private String specificationAndThickNess;
     private String units;
     private String size;
     private Long moq;
     private String color;
     private Date enteredDate;
     private String HsnSacNo;
     private Set imsManageorderdetailses = new HashSet(0);
     private Set imsSalesproductdetailses = new HashSet(0);
     private Set imsStockdetailses = new HashSet(0);
     private Set imsOrderdetailses = new HashSet(0);
     private Set imsPurchaseproductdetailses = new HashSet(0);

    public ImsProductdetails() {
    }

	
    public ImsProductdetails(String productCode) {
        this.productCode = productCode;
    }
    public ImsProductdetails(String productCode, ImsLogindetails imsLogindetails, ImsProductcategory imsProductcategory, String productName, String specificationAndThickNess, String units, String size, Long moq, String color, Date enteredDate,String HsnSacnNo, Set imsManageorderdetailses, Set imsSalesproductdetailses, Set imsStockdetailses, Set imsOrderdetailses, Set imsPurchaseproductdetailses) {
       this.productCode = productCode;
       this.imsLogindetails = imsLogindetails;
       this.imsProductcategory = imsProductcategory;
       this.productName = productName;
       this.specificationAndThickNess = specificationAndThickNess;
       this.units = units;
       this.size = size;
       this.moq = moq;
       this.color = color;
       this.enteredDate = enteredDate;
       this.HsnSacNo=HsnSacnNo;
       this.imsManageorderdetailses = imsManageorderdetailses;
       this.imsSalesproductdetailses = imsSalesproductdetailses;
       this.imsStockdetailses = imsStockdetailses;
       this.imsOrderdetailses = imsOrderdetailses;
       this.imsPurchaseproductdetailses = imsPurchaseproductdetailses;
    }
   
    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public ImsLogindetails getImsLogindetails() {
        return this.imsLogindetails;
    }
    
    public void setImsLogindetails(ImsLogindetails imsLogindetails) {
        this.imsLogindetails = imsLogindetails;
    }
    public ImsProductcategory getImsProductcategory() {
        return this.imsProductcategory;
    }
    
    public void setImsProductcategory(ImsProductcategory imsProductcategory) {
        this.imsProductcategory = imsProductcategory;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getSpecificationAndThickNess() {
        return this.specificationAndThickNess;
    }
    
    public void setSpecificationAndThickNess(String specificationAndThickNess) {
        this.specificationAndThickNess = specificationAndThickNess;
    }
    public String getUnits() {
        return this.units;
    }
    
    public void setUnits(String units) {
        this.units = units;
    }
    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    public Long getMoq() {
        return this.moq;
    }
    
    public void setMoq(Long moq) {
        this.moq = moq;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public Date getEnteredDate() {
        return this.enteredDate;
    }
    
    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }
    
    public String getHsnSacNo() {
        return HsnSacNo;
    }

    public void setHsnSacNo(String HsnSacNo) {
        this.HsnSacNo = HsnSacNo;
    }
    public Set getImsManageorderdetailses() {
        return this.imsManageorderdetailses;
    }
    
    public void setImsManageorderdetailses(Set imsManageorderdetailses) {
        this.imsManageorderdetailses = imsManageorderdetailses;
    }
    public Set getImsSalesproductdetailses() {
        return this.imsSalesproductdetailses;
    }
    
    public void setImsSalesproductdetailses(Set imsSalesproductdetailses) {
        this.imsSalesproductdetailses = imsSalesproductdetailses;
    }
    public Set getImsStockdetailses() {
        return this.imsStockdetailses;
    }
    
    public void setImsStockdetailses(Set imsStockdetailses) {
        this.imsStockdetailses = imsStockdetailses;
    }
    public Set getImsOrderdetailses() {
        return this.imsOrderdetailses;
    }
    
    public void setImsOrderdetailses(Set imsOrderdetailses) {
        this.imsOrderdetailses = imsOrderdetailses;
    }
    public Set getImsPurchaseproductdetailses() {
        return this.imsPurchaseproductdetailses;
    }
    
    public void setImsPurchaseproductdetailses(Set imsPurchaseproductdetailses) {
        this.imsPurchaseproductdetailses = imsPurchaseproductdetailses;
    }




}


