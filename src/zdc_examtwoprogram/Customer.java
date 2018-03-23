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
    }

    public Customer(String FirstName) {
        this.FirstName = FirstName;
        this.LastName = "Cortese";
        this.PhoneNumber= "(336)259-9349";
    }

    public Customer() {
        this.FirstName = "Zachary";
        this.LastName = "Cortese";
        this.PhoneNumber= "(336)259-9349";
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
   
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
}
