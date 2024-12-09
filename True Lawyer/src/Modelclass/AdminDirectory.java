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
public class AdminDirectory {

    private List<Admin> admins;

    public AdminDirectory() {
        this.admins = new ArrayList<>();
        initializeDefaultAccounts(); // Initialize with some default accounts
    }

    // Add a user account with a role
    public void addAdmin(String username, String password, String courtType) {
        admins.add(new Admin(username, password, courtType));
    }

    // Authenticate a user by username, password, and optionally role
    public Admin authenticateUser(String username, String password) {
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return admin;
            }
        }
        return null; // Return null if authentication fails
    }

    // Get users by role
    public List<Admin> getUsersByRole(String courtType) {
        List<Admin> roleAdmin = new ArrayList<>();
        for (Admin admin : admins) {
            if (admin.getCourtType().equalsIgnoreCase(courtType)) {
                roleAdmin.add(admin);
            }
        }
        return roleAdmin;
    }

    // Initialize default accounts
    private void initializeDefaultAccounts() {
        addAdmin("adminsupreme", "SP123", "Supreme Court");
        addAdmin("adminhigh", "HC123", "High Court");
        
    }

    // Get all user accounts
    public List<Admin> getAllUserAccounts() {
        return admins;
    }
}


