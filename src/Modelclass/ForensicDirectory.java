/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelclass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class ForensicDirectory {

    private List<Forensic> forensics;

    public ForensicDirectory() {
        this. forensics = new ArrayList<>();
        initializeDefaultAccounts(); // Initialize with some default accounts
    }

    // Add a user account with a role
    public void addForensic(String username, String password) {
         forensics.add(new Forensic(username, password));
    }

    // Authenticate a user by username, password, and optionally role
    public Forensic authenticateUser(String username, String password) {
        for (Forensic  forensic :  forensics) {
            if ( forensic.getUsername().equals(username) && forensic.getPassword().equals(password)) {
                return forensic;
            }
        }
        return null; // Return null if authentication fails
    }

    // Get users by role
    

    // Initialize default accounts
    private void initializeDefaultAccounts() {
        addForensic("forensic01", "for123");
        
        
    }

    // Get all user accounts
    public List<Forensic> getAllUserAccounts() {
        return  forensics;
    }
}


