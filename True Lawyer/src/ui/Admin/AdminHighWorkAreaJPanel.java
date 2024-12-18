/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Modelclass.Admin;

/**
 *
 * @author dell
 */
public class AdminHighWorkAreaJPanel extends javax.swing.JPanel {
    JPanel workArea;
    Admin admin;
    /**
     * Creates new form AdminSupremeWorkAreaJPanel
     */
    public AdminHighWorkAreaJPanel(JPanel workArea, Admin admin) {
        initComponents();
        this.workArea = workArea;
        this.admin = admin;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lawyerbtn = new javax.swing.JButton();
        clientbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lawyerbtn.setText("Lawyer");
        lawyerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lawyerbtnActionPerformed(evt);
            }
        });

        clientbtn.setText("Client");
        clientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("High Court Administration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientbtn)
                            .addComponent(lawyerbtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lawyerbtn)
                .addGap(45, 45, 45)
                .addComponent(clientbtn)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lawyerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lawyerbtnActionPerformed
        // TODO add your handling code here:
        HCLawyerManagementJPanel1 panel= new HCLawyerManagementJPanel1(workArea);
        workArea.add("HCLawyerManagementJPanel", panel);
        CardLayout layout =(CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_lawyerbtnActionPerformed

    private void clientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientbtnActionPerformed
        // TODO add your handling code here:
        HCViewClientJPanel panel= new HCViewClientJPanel(workArea);
        workArea.add("HCViewClientJPanel", panel);
        CardLayout layout =(CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_clientbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lawyerbtn;
    // End of variables declaration//GEN-END:variables
}
