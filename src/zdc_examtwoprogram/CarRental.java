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
public class CarRental {

    public CarRental() {
    }

    public CarRental(Car carToRent, Customer customerRenting, int numberOfDays) {
        this.carToRent = carToRent;
        this.customerRenting = customerRenting;
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Car getcarToRent() {
        return carToRent;
    }

    public void setcarToRent(Car carToRent) {
        this.carToRent = carToRent;
    }

    public Customer getcustomerRenting() {
        return customerRenting;
    }

    public void setcustomerRenting(Customer customerRenting) {
        this.customerRenting = customerRenting;
    }
    private Car carToRent;
    private Customer customerRenting;
    private int numberOfDays;
}