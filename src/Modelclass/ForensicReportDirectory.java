/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package Modelclass;

import java.util.ArrayList;
import java.util.List;

/**
 * A directory that manages a list of forensic reports.
 */
public class ForensicReportDirectory {

    // List to store forensic reports
    private List<ForensicReport> forensicReports;

    /**
     * Constructor initializes the forensic reports list.
     */
    public ForensicReportDirectory() {
        forensicReports = new ArrayList<>();
         populateDummyData();
    }

    /**
     * Adds a forensic report to the list.
     *
     * @param forensicReport The forensic report to add.
     */
    public void addForensic(ForensicReport forensicReport) {
        forensicReports.add(forensicReport);
    }

    /**
     * Retrieves all forensic reports in the directory.
     *
     * @return The list of forensic reports.
     */
    public List<ForensicReport> getAllForensicReports() {
        return forensicReports;
    }
    private void populateDummyData() {
        forensicReports.add(new ForensicReport("John Doe", "Accidental Death", "2024-01-15", "O+"));
        forensicReports.add(new ForensicReport("Jane Smith", "Homicide", "2023-12-10", "A-"));
        forensicReports.add(new ForensicReport("Emily Johnson", "Natural Causes", "2024-02-20", "B+"));
        forensicReports.add(new ForensicReport("Michael Brown", "Undetermined", "2024-03-05", "AB+"));
        forensicReports.add(new ForensicReport("David Wilson", "Suicide", "2024-04-12", "O-"));
    }
}

