package org.ims.dao.entity;
// Generated 25 Jan, 2016 10:53:23 PM by Hibernate Tools 3.6.0



/**
 * ImsPurchaseproductdetailsId generated by hbm2java
 */
public class ImsPurchaseproductdetailsId  implements java.io.Serializable {


     private int serialNumber;
     private String pinvoiceId;

    public ImsPurchaseproductdetailsId() {
    }

    public ImsPurchaseproductdetailsId(int serialNumber, String pinvoiceId) {
       this.serialNumber = serialNumber;
       this.pinvoiceId = pinvoiceId;
    }
   
    public int getSerialNumber() {
        return this.serialNumber;
    }
    
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getPinvoiceId() {
        return this.pinvoiceId;
    }
    
    public void setPinvoiceId(String pinvoiceId) {
        this.pinvoiceId = pinvoiceId;
    }




}

