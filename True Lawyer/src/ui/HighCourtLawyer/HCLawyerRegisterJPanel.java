/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HighCourtLawyer;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Modelclass.HCLawyer;
import Modelclass.HCLawyerDirectory;

/**
 *
 * @author dell
 */
public class HCLawyerRegisterJPanel extends javax.swing.JPanel {
    private JPanel workArea;
    private HCLawyer hcLawyer;

    HCLawyerDirectory hlawyerDirectory = new HCLawyerDirectory();
   

    public HCLawyerRegisterJPanel(JPanel workArea, HCLawyerDirectory hlawyerDirectory) {
        initComponents();
       this.workArea = workArea;
    if (hlawyerDirectory == null) {
            this.hlawyerDirectory = new HCLawyerDirectory(); // Initialize if null
        } else {
            this.hlawyerDirectory = hlawyerDirectory; // Use the passed directory
        }
//   this.hlawyerDirectory = (hlawyerDirectory != null) ? hlawyerDirectory : new HCLawyerDirectory();// Ensure this is properly set
    populateLawyerDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtstateid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        registerbtn = new javax.swing.JButton();
        txtconsulfee = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        pwdfiled = new javax.swing.JPasswordField();
        lawyerRolecmb = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        jLabel5.setText("Phone Number :");

        jLabel6.setText("Address :");

        jLabel1.setText("State ID :");

        jLabel10.setText("Consultation Fee :");

        jLabel2.setText("Name :");

        registerbtn.setText("Register");
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Email :");

        jLabel3.setText("Registration Form");

        jLabel7.setText("Specialization :");

        jLabel11.setText("Username:");

        jLabel12.setText("Password:");

        lawyerRolecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lawyerRolecmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lawyerRolecmbActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(lawyerRolecmb, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(btnBack)
                            .addGap(284, 284, 284)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(358, 358, 358)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(347, 347, 347)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))))
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtstateid, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(txtconsulfee, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(txtaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(phonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(registerbtn)
                                .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(pwdfiled)
                                .addComponent(txtemail)))))
                .addGap(216, 374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtstateid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lawyerRolecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtconsulfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pwdfiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(registerbtn)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lawyerRolecmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lawyerRolecmbActionPerformed
        //        AdminRolecmb.removeAllItems();
        //        AdminRolecmb.addItem("Select");
        //        AdminRolecmb.addItem("High Court");
        //        AdminRolecmb.addItem("Supreme Court");
        if (lawyerRolecmb.getSelectedItem() == null) return;

        // Populate the `adminRole` JComboBox with valid role options dynamically
        String selectedRole = lawyerRolecmb.getSelectedItem().toString();
    }//GEN-LAST:event_lawyerRolecmbActionPerformed

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        // TODO add your handling code here:
                try {
                   
            // Gather inputs
            String stateId = txtstateid.getText().trim();
            String name = txtname.getText().trim();
            String specialization = lawyerRolecmb.getSelectedItem().toString();
            String phoneNumber = phonenumber.getText().trim();
            String email = txtemail.getText().trim();
            String address = txtaddress.getText().trim();
            String username = txtusername.getText().trim();
            String password = new String(pwdfiled.getPassword());
            double consultationFee;

            // Input validation
            if (stateId.isEmpty() || name.isEmpty() || specialization.equals("Select") || phoneNumber.isEmpty()
                    || email.isEmpty() || address.isEmpty() || username.isEmpty() || password.isEmpty()) {
                throw new IllegalArgumentException("All fields are required.");
            }

            try {
                consultationFee = Double.parseDouble(txtconsulfee.getText().trim());
                if (consultationFee < 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Consultation fee must be a valid positive number.");
            }

            // Add lawyer to directory
            HCLawyer newLawyer = new HCLawyer(stateId, name, specialization, address, phoneNumber, email, consultationFee, username, password);
            hlawyerDirectory.addLawyer(newLawyer);
            // Clear inputs
            
            // Success message
            JOptionPane.showMessageDialog(this, "Lawyer registered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
            HCLawyerLoginJPanel panel = new HCLawyerLoginJPanel(workArea,hlawyerDirectory);
        workArea.add("LawyerLoginJPanel", panel);
        CardLayout layout =(CardLayout) workArea.getLayout();
        layout.next(workArea);
            
          

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }




    }//GEN-LAST:event_registerbtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> lawyerRolecmb;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JPasswordField pwdfiled;
    private javax.swing.JButton registerbtn;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtconsulfee;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstateid;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
 private void populateLawyerDropdown() {
        lawyerRolecmb.removeAllItems();
        lawyerRolecmb.addItem("Select");
        lawyerRolecmb.addItem("Criminal Lawyer");
        lawyerRolecmb.addItem("Civil Lawyer");
        lawyerRolecmb.addItem("Family Lawyer");
        lawyerRolecmb.addItem("Corporate Lawyer");
        
    }
  private void clearFields() {
        txtstateid.setText("");
        txtname.setText("");
        lawyerRolecmb.setSelectedIndex(0);
        phonenumber.setText("");
        txtemail.setText("");
        txtaddress.setText("");
        txtconsulfee.setText("");
        txtusername.setText("");
        pwdfiled.setText("");
    }
}
