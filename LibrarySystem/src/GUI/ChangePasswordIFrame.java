/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.Person;
import Model.User;
import Shared.SharedData;
import Utility.GUIUtility;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rom
 */
public class ChangePasswordIFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChangePasswordIFrame
     */
    public ChangePasswordIFrame() {
        initComponents();
        
        getUsername();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changePasswordPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmPasswordTextField = new javax.swing.JTextField();
        newPasswordTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        changePasswordButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Change Password");

        changePasswordPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        changePasswordPanel.setName(""); // NOI18N
        changePasswordPanel.setPreferredSize(new java.awt.Dimension(520, 540));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Confirm Password");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("New Password");

        jPanel3.setPreferredSize(new java.awt.Dimension(268, 40));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        changePasswordButton.setText("Change Password");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        jPanel3.add(changePasswordButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel3.add(cancelButton);

        usernameLabel.setText("jLabel3");

        javax.swing.GroupLayout changePasswordPanelLayout = new javax.swing.GroupLayout(changePasswordPanel);
        changePasswordPanel.setLayout(changePasswordPanelLayout);
        changePasswordPanelLayout.setHorizontalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePasswordPanelLayout.createSequentialGroup()
                        .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(85, 85, 85)
                        .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addGroup(changePasswordPanelLayout.createSequentialGroup()
                                .addComponent(usernameLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(changePasswordPanelLayout.createSequentialGroup()
                        .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordTextField)
                            .addComponent(newPasswordTextField))))
                .addGap(20, 20, 20))
        );
        changePasswordPanelLayout.setVerticalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(newPasswordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(changePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(changePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        try {
            if (checkUserPassword() && isPasswordMatched()) {
               //Get user information
                String username = usernameLabel.getText();
                String password = passwordTextField.getText();
                String newPassword = newPasswordTextField.getText();

                //Get components data 
                User user = new User();
                
                //Update book data
                user.UpdatePassword(username,password, newPassword);

                //Display message
                JOptionPane.showMessageDialog(this, "Password updated successfully");

                //Clean the values of the components
                GUIUtility.cleanComponents(changePasswordPanel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        GUIUtility.cleanComponents(changePasswordPanel);
    }//GEN-LAST:event_cancelButtonActionPerformed

    
    /**
     * Check if the new password matches
     *
     * @return
     */
    private boolean isPasswordMatched() {
        if (!newPasswordTextField.getText().equals(confirmPasswordTextField.getText()) || 
             newPasswordTextField.getText().equals("") && 
             confirmPasswordTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Password does not match");

            return false;
        }

        return true;
    }

    /**
     * Verify if the password is correct
     * @return statement
     */
    private boolean checkUserPassword() {
        try {
            //Get components data 
            User user = new User();

            //Get the user data
            String username = usernameLabel.getText();
            String password = passwordTextField.getText();
            
            //Update book data
            ArrayList<Person> p = user.CheckPassword(username,password);
            
            if(p.isEmpty()){
                JOptionPane.showMessageDialog(this, "Password is not correct");
                return false;
            }
            else {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Password is not correct");
            
            return false;
        }
    }
    
    /**
     * Get the username of the member
     */
    private void getUsername(){
        usernameLabel.setText(SharedData.username);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JTextField confirmPasswordTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField newPasswordTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
