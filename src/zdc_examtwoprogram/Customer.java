/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdc_examtwoprogram;

/**
 *
 * @author Interact
 */
public class Customer {

    public Customer(String FirstName, String LastName, String PhoneNumber) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        setCustId();
    }

    public Customer(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber= "(336)259-9349";
        setCustId();
    }

    public Customer() {
        //nothing        
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    private void setCustId(){
        this.CustId = getFirstName()+getLastName()+getPhoneNumber();
    }
   
    private String CustId;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
}
