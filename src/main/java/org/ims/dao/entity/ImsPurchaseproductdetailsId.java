package org.ims.dao.entity;
// Generated Dec 27, 2016 11:33:32 PM by Hibernate Tools 4.3.1



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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ImsPurchaseproductdetailsId) ) return false;
		 ImsPurchaseproductdetailsId castOther = ( ImsPurchaseproductdetailsId ) other; 
         
		 return (this.getSerialNumber()==castOther.getSerialNumber())
 && ( (this.getPinvoiceId()==castOther.getPinvoiceId()) || ( this.getPinvoiceId()!=null && castOther.getPinvoiceId()!=null && this.getPinvoiceId().equals(castOther.getPinvoiceId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSerialNumber();
         result = 37 * result + ( getPinvoiceId() == null ? 0 : this.getPinvoiceId().hashCode() );
         return result;
   }   


}


