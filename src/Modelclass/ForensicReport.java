/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelclass;

/**
 *
 * @author dell
 */
public class ForensicReport {
    String name;
    String deathPurpose;
    String date;
    String bloodGroup;

    public ForensicReport(String name, String deathPurpose, String date, String bloodGroup) {
        this.name = name;
        this.deathPurpose = deathPurpose;
        this.date = date;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeathPurpose() {
        return deathPurpose;
    }

    public void setDeathPurpose(String deathPurpose) {
        this.deathPurpose = deathPurpose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
}
