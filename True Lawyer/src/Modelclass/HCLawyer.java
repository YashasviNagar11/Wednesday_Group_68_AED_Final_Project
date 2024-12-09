package Modelclass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class HCLawyer {
    private String stateId;
    private String name;
    private String specialization;
    private String phoneNumber;
    private String email;
    private String address;
    private double consultationFee;
    private String username;
    private String password;
    


public HCLawyer( String stateId,String name, String specialization,String address,String phoneNumber, String email, double consultationFee, String username, String password) {
        this.stateId=stateId;
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address=address;      
        this.consultationFee = consultationFee;
        this.username=username;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

   

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     @Override
    public String toString() {
        return "Lawyer{" +
                "State Id='" + stateId + '\'' +
                "Name='" + name + '\'' +
                ", Specialization='" + specialization + '\'' +
                ", Phone='" + phoneNumber + '\'' +
                ", Email='" + email + '\'' +
                ", Consultation Fee=" + consultationFee +
                ", Username='" + username + '\'' +
                '}';
    }
}