package org.ims.dao.entity;
// Generated 25 Jan, 2016 10:53:23 PM by Hibernate Tools 3.6.0



/**
 * ImsOrderdetailsId generated by hbm2java
 */
public class ImsOrderdetailsId  implements java.io.Serializable {


     private int orderNo;
     private String productCode;

    public ImsOrderdetailsId() {
    }

    public ImsOrderdetailsId(int orderNo, String productCode) {
       this.orderNo = orderNo;
       this.productCode = productCode;
    }
   
    public int getOrderNo() {
        return this.orderNo;
    }
    
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }




}

