package org.ims.dao.entity;
// Generated Dec 27, 2016 11:33:32 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ImsGenraldefinition generated by hbm2java
 */
public class ImsGenraldefinition  implements java.io.Serializable {


     private String gdCode;
     private ImsLogindetails imsLogindetails;
     private String gdAbb;
     private String gdName;
     private Date enteredDate;
     private Set imsEmployeesForDesgnation = new HashSet(0);
     private Set imsEmployeesForIdProof = new HashSet(0);

    public ImsGenraldefinition() {
    }

	
    public ImsGenraldefinition(String gdCode, ImsLogindetails imsLogindetails, String gdName, Date enteredDate) {
        this.gdCode = gdCode;
        this.imsLogindetails = imsLogindetails;
        this.gdName = gdName;
        this.enteredDate = enteredDate;
    }
    public ImsGenraldefinition(String gdCode, ImsLogindetails imsLogindetails, String gdAbb, String gdName, Date enteredDate, Set imsEmployeesForDesgnation, Set imsEmployeesForIdProof) {
       this.gdCode = gdCode;
       this.imsLogindetails = imsLogindetails;
       this.gdAbb = gdAbb;
       this.gdName = gdName;
       this.enteredDate = enteredDate;
       this.imsEmployeesForDesgnation = imsEmployeesForDesgnation;
       this.imsEmployeesForIdProof = imsEmployeesForIdProof;
    }
   
    public String getGdCode() {
        return this.gdCode;
    }
    
    public void setGdCode(String gdCode) {
        this.gdCode = gdCode;
    }
    public ImsLogindetails getImsLogindetails() {
        return this.imsLogindetails;
    }
    
    public void setImsLogindetails(ImsLogindetails imsLogindetails) {
        this.imsLogindetails = imsLogindetails;
    }
    public String getGdAbb() {
        return this.gdAbb;
    }
    
    public void setGdAbb(String gdAbb) {
        this.gdAbb = gdAbb;
    }
    public String getGdName() {
        return this.gdName;
    }
    
    public void setGdName(String gdName) {
        this.gdName = gdName;
    }
    public Date getEnteredDate() {
        return this.enteredDate;
    }
    
    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }
    public Set getImsEmployeesForDesgnation() {
        return this.imsEmployeesForDesgnation;
    }
    
    public void setImsEmployeesForDesgnation(Set imsEmployeesForDesgnation) {
        this.imsEmployeesForDesgnation = imsEmployeesForDesgnation;
    }
    public Set getImsEmployeesForIdProof() {
        return this.imsEmployeesForIdProof;
    }
    
    public void setImsEmployeesForIdProof(Set imsEmployeesForIdProof) {
        this.imsEmployeesForIdProof = imsEmployeesForIdProof;
    }




}


