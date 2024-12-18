/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.forensic;

import Modelclass.Forensic;
import Modelclass.ForensicDirectory;
import Modelclass.ForensicReport;
import Modelclass.ForensicReportDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.Police.PoliceViewReportJPanel;

/**
 *
 * @author yagnapatel
 */
public class ForensicJPanel extends javax.swing.JPanel {
 JPanel workArea;
 private ForensicReportDirectory forensicreportDirectory;
    /**
     * Creates new form forensicJPanel
     */
    public ForensicJPanel(JPanel workArea,ForensicReportDirectory forensicreportDirectory) {
        initComponents();
        this.workArea=workArea;
        if (forensicreportDirectory == null) {
        this.forensicreportDirectory = new ForensicReportDirectory();
    } else {
        this.forensicreportDirectory = forensicreportDirectory;
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        txtdeath = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtblood = new javax.swing.JTextField();

        jLabel2.setText("Name:");

        jLabel3.setText("Report");

        jLabel4.setText("DeathPurpose:");

        jLabel5.setText("Date:");

        jLabel6.setText("Blood Group:");

        addbtn.setText("Save");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtdate, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtdeath, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addbtn, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtblood, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdeath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtblood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addbtn)
                .addContainerGap(295, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String deathPurpose = txtdeath.getText();
        String date = txtdate.getText();
        String bloodGroup = txtblood.getText();

        // Check if any fields are empty
        if (name.isEmpty() || deathPurpose.isEmpty() || date.isEmpty() || bloodGroup.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create a new Forensic object and set its properties
        ForensicReport newForensic = new ForensicReport(name, deathPurpose, date, bloodGroup);

        // Add the Forensic object to the forensicDirectory
        forensicreportDirectory.addForensic(newForensic);

        // Clear the fields after saving
        txtname.setText("");
        txtdeath.setText("");
        txtdate.setText("");
        txtblood.setText("");

        // Display a success message
        JOptionPane.showMessageDialog(this, "Forensic report saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
    
    }//GEN-LAST:event_addbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtblood;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdeath;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
