package Modelclass;

import Modelclass.HCLawyer;
import java.util.ArrayList;
import java.util.List;

/**
 * Directory for managing High Court Lawyers.
 */
public class HCLawyerDirectory {
    private List<HCLawyer> lawyerhs;

    public HCLawyerDirectory() {
        this.lawyerhs = new ArrayList<>();
        initializeDefaultAccounts();
    }

    // Add a lawyer to the directory
    public void addLawyer(HCLawyer lawyer) {
        for (HCLawyer existingLawyer : lawyerhs) {
            if (existingLawyer.getUsername().equalsIgnoreCase(lawyer.getUsername())) {
                throw new IllegalArgumentException("Username already exists. Choose another.");
            }
        }
        lawyerhs.add(lawyer);
    }

    // Authenticate login
    public HCLawyer authenticateLawyer(String username, String password, String specialization) {
        for (HCLawyer lawyer : lawyerhs) {
            if (lawyer.getUsername().equals(username) && lawyer.getPassword().equals(password)
                    && lawyer.getSpecialization().equals(specialization)) {
                return lawyer;
            }
        }
        return null;  // Return null if no match is found
    }

    // Search lawyer by username
    public HCLawyer searchLawyerByUsername(String username) {
        for (HCLawyer lawyer : lawyerhs) {
            if (lawyer.getUsername().equalsIgnoreCase(username)) {
                return lawyer;
            }
        }
        return null;
    }

    // Retrieve all lawyers
    public List<HCLawyer> getAllLawyers() {
        return lawyerhs;
    }

    // Display all lawyers as a string
    public String displayLawyers() {
        StringBuilder sb = new StringBuilder();
        for (HCLawyer lawyer : lawyerhs) {
            sb.append(lawyer.toString()).append("\n");
        }
        return sb.toString();
    }

    // Initialize default accounts
    private void initializeDefaultAccounts() {
        addLawyer(new HCLawyer("HC001", "Alice Smith", "Criminal Law", "123 Justice Rd", "555-1111", 
                               "alice@example.com", 150.0, "alice123", "pass123"));
        addLawyer(new HCLawyer("HC002", "Bob Johnson", "Civil Law", "456 Harmony Ln", "555-2222", 
                               "bob@example.com", 200.0, "bob456", "secure456"));
    }
}
