/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prclient;
import java.io.*;
import java. util.*;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author bolan
 */
public class prSignup extends javax.swing.JFrame {
    prDatabaseC con = new prDatabaseC();
    /**
     * Creates new form prSignup
     */
    public prSignup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        signupLabel = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        preferredLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        confirmLabel = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        lastnameField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        preferredField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmField = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POWER RANGERS FITNESS, LLC.");
        setPreferredSize(new java.awt.Dimension(850, 750));

        signupLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        signupLabel.setForeground(new java.awt.Color(0, 0, 204));
        signupLabel.setText("CREATE ACCOUNT");

        firstnameLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        firstnameLabel.setText("First Name");

        lastnameLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lastnameLabel.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Email");

        preferredLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        preferredLabel.setText("Preferred Username");

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        passwordLabel.setText("Password");

        confirmLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        confirmLabel.setText("Confirm Password");

        signupButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        signupButton.setText("SIGN UP");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        lastnameField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        ageLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ageLabel.setText("Age");

        genderLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        genderLabel.setText("Gender");

        firstnameField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        firstnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameFieldActionPerformed(evt);
            }
        });

        ageField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        genderField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        emailField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        preferredField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        passwordField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        confirmField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(signupLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preferredLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastnameField)
                            .addComponent(firstnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                            .addComponent(ageField)
                            .addComponent(genderField)
                            .addComponent(emailField)
                            .addComponent(preferredField)
                            .addComponent(passwordField)
                            .addComponent(confirmField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(signupButton)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(signupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genderField)
                    .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preferredLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preferredField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(signupButton)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameFieldActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        String input = emailField.getText();
        if (firstnameField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter First Name.");
        }
            else if(lastnameField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Last Name.");
            } else if(emailField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Email.");
            }
            else if (!Pattern.matches("[a-zA-Z_0-9]*@[a-zA-Z]*....", input)){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Email.");
        
            } else if(preferredField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter a Preferred Username.");
        } else if(passwordField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter a Password of your choice.");
        } else if(confirmField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Re-enter a Password that matches the above.");
        } else if(!confirmField.getText().equals(passwordField.getText())){
            JOptionPane.showMessageDialog(null, "Passwords don't match, Please Enter Passwords that match.");
        } else if(SearchDB(preferredField.getText())){
            JOptionPane.showMessageDialog(null, "Username already exists");
        } else{
            String theSql = "INSERT INTO prusers(firstname, lastname, age, gender, email, username, password ) VALUES('" + firstnameField.getText() + "', '" + lastnameField.getText() + "', '" + ageField.getText() + "', '" + genderField.getText() + "', '" + emailField.getText() + "', '" + preferredField.getText() + "', '" + passwordField.getText() + "')";
            if(con.data(theSql)){
                JOptionPane.showMessageDialog(null, "Horray! You have Signed Up!");
                new prLogin().setVisible(true);
                this.dispose();
            }
        }

    }//GEN-LAST:event_signupButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private boolean SearchDB(String user){
        boolean isUserExist = false;
        String theSql = "SELECT * FROM prusers WHERE username = '" + user + "'";
        try{
            ResultSet resEA = con.getDB(theSql);
            while(resEA.next()){
                isUserExist=true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return isUserExist;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField preferredField;
    private javax.swing.JLabel preferredLabel;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel signupLabel;
    // End of variables declaration//GEN-END:variables
}
