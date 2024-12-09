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
public class PoliceuserDirectory {
        private List<Policeuser> policeusers;

    public PoliceuserDirectory() {
        this. policeusers = new ArrayList<>();
        initializeDefaultAccounts(); // Initialize with some default accounts
    }

    // Add a user account with a role
    public void addPoliceuser(String username, String password) {
         policeusers.add(new Policeuser(username, password));
    }

    // Authenticate a user by username, password, and optionally role
    public Policeuser authenticateUser(String username, String password) {
        for (Policeuser  policeuser :  policeusers) {
            if ( policeuser.getUsername().equals(username) && policeuser.getPassword().equals(password)) {
                return policeuser;
            }
        }
        return null; // Return null if authentication fails
    }

    // Get users by role
    

    // Initialize default accounts
    private void initializeDefaultAccounts() {
        addPoliceuser("Officer01", "123");
        
        
    }

    // Get all user accounts
    public List<Policeuser> getAllUserAccounts() {
        return  policeusers;
    }
}
