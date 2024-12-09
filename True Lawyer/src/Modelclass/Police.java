/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelclass;

/**
 *
 * @author dell
 */
public class Police {
    private String caseId;
    private String officerName;
    private String date;
    private String complainerName;
    private String complainerAddress;
    private String phonenumber;

    public Police(String caseId, String officerName, String date, String complainerName, String complainerAddress, String phonenumber) {
        this.caseId = caseId;
        this.officerName = officerName;
        this.date = date;
        this.complainerName = complainerName;
        this.complainerAddress = complainerAddress;
        this.phonenumber = phonenumber;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComplainerName() {
        return complainerName;
    }

    public void setComplainerName(String complainerName) {
        this.complainerName = complainerName;
    }

    public String getComplainerAddress() {
        return complainerAddress;
    }

    public void setComplainerAddress(String complainerAddress) {
        this.complainerAddress = complainerAddress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
}
