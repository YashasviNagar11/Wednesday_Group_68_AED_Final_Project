/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelclass;

import java.util.ArrayList;
import java.util.List;

/**
 * This class manages a directory of cases.
 * It provides functionality to add and retrieve cases.
 *
 * @author dell
 */
public class CaseDirectory {
    private List<Case> cases; // List to hold all case objects.

    /**
     * Constructor initializes the case list.
     */
    public CaseDirectory() {
        cases = new ArrayList<>();
        populateDummyData();
    }

    /**
     * Adds a case to the directory.
     *
     * @param newCase The case object to be added.
     */
    public void addCase(Case newCase) {
        cases.add(newCase);
    }

    /**
     * Retrieves all cases in the directory.
     *
     * @return The list of cases.
     */
    public List<Case> getAllCases() {
        return cases;
    }
     private void populateDummyData() {
        cases.add(new Case("C001", "Officer John", "2024-11-01", "Alice Brown", "123 Main St, Boston", "1234567890"));
        cases.add(new Case("C002", "Officer Smith", "2024-10-25", "Bob Johnson", "456 Elm St, Boston", "2345678901"));
        cases.add(new Case("C003", "Officer Davis", "2024-09-15", "Cathy White", "789 Maple St, Boston", "3456789012"));
        cases.add(new Case("C004", "Officer Lee", "2024-08-10", "Daniel Green", "321 Oak St, Boston", "4567890123"));
        cases.add(new Case("C005", "Officer Brown", "2024-07-20", "Emma Black", "654 Pine St, Boston", "5678901234"));
    }
}
