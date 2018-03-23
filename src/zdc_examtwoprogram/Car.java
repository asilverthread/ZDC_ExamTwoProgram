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
public class Car {

    
    public Car() {
        this.LicensePlate= "EJH-1936";
        this.Color = "Silver";
        this.Make = "Hyundai";
        this.Model = "Elantra";
        this.Year = 2006;
    }
    public Car(String LicensePlate){
        this.LicensePlate = LicensePlate;
        this.Color = "Silver";
        this.Make = "Hyundai";
        this.Model = "Elantra";
        this.Year = 2006;
    }

    public Car(String LicensePlate, String Color, String Make, String Model, int Year) {
        this.LicensePlate = LicensePlate;
        this.Color = Color;
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
    }
    
    
    public String getLicensePlate() {
        return LicensePlate;
    }
    public String getColor() {
        return Color;
    }
    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }
    public int getYear() {
        return Year;    
    }
        public void setLicensePlate(String LicensePlate) {
        this.LicensePlate = LicensePlate;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public void setMake(String Make) {
        this.Make = Make;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }
    public void setYear(int Year) {
        this.Year = Year;
    }
    
    //var dec
    private String LicensePlate;
    private String Color;
    private String Make;
    private String Model;
    private int Year;
}
