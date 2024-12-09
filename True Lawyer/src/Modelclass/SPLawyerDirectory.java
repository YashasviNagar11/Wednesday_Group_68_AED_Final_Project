/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelclass;

import Modelclass.SPLawyer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class SPLawyerDirectory {
    private List<SPLawyer> lawyerSP;

    public SPLawyerDirectory() {
        this.lawyerSP = new ArrayList<>();
        initializeDefaultAccounts();
    }

    // Add a lawyer to the directory
    public void addLawyer(SPLawyer lawyers) {
        for (SPLawyer existingLawyer : lawyerSP) {
            if (existingLawyer.getUsername().equalsIgnoreCase(lawyers.getUsername())) {
                throw new IllegalArgumentException("Username already exists. Choose another.");
            }
        }
        lawyerSP.add(lawyers);
    }

    // Authenticate login
    public SPLawyer authenticateLawyer(String username, String password, String specialization) {
        for (SPLawyer lawyers : lawyerSP) {
            if (lawyers.getUsername().equals(username) && lawyers.getPassword().equals(password)
                    && lawyers.getSpecialization().equals(specialization)) {
                return lawyers;
            }
        }
        return null;  // Return null if no match is found
    }

    // Search lawyer by username
    public SPLawyer searchLawyerByUsername(String username) {
        for (SPLawyer lawyers : lawyerSP) {
            if (lawyers.getUsername().equalsIgnoreCase(username)) {
                return lawyers;
            }
        }
        return null;
    }

    // Retrieve all lawyers
    public List<SPLawyer> getAllLawyers() {
        return lawyerSP;
    }

    // Display all lawyers as a string
    public String displayLawyers() {
        StringBuilder sb = new StringBuilder();
        for (SPLawyer lawyer : lawyerSP) {
            sb.append(lawyer.toString()).append("\n");
        }
        return sb.toString();
    }

    // Initialize default accounts
    private void initializeDefaultAccounts() {
        addLawyer(new SPLawyer("SP001", "Alice Smith", "Criminal Law", "123 Justice Rd", "555-1111", 
                               "alice@example.com", 150.0, "alice123", "pass123"));
        addLawyer(new SPLawyer("SP002", "Bob Johnson", "Civil Law", "456 Harmony Ln", "555-2222", 
                               "bob@example.com", 200.0, "bob456", "secure456"));
    }
}
