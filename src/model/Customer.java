/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TRACY
 */
public class Customer {
    private String customerId;
    private String fullName;
    private String phoneNumber;
    private String dateOfBirthday;
    private int points;

    // CONSTRUCTOR
    public Customer (String customerId, String fullName, 
            String phoneNumber, String dateOfBirthday, int points){
        
        this.customerId = customerId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirthday = dateOfBirthday;
        this.points = points;
 
    }
    
    // GETTER
    public String getCustomerId() {
        return customerId;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getDateOfBirthday() {
        return dateOfBirthday;
    }
    
    public int getPoints() {
        return points;
    }
    
    // SETTER
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    

}
