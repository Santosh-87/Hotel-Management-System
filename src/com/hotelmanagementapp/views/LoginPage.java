/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hotelmanagementapp.views;

import javax.swing.JOptionPane;

/**
 * This class represents the login page of the hotel management application. It
 * allows the user (admin) to log in by entering their email address and
 * password. The login credentials are validated, and if they are correct, the
 * home page is displayed. Additionally, it provides functionality for showing
 * or hiding the password input.
 *
 * @author Santosh Lama 
 * LMU ID: 23048594
 *
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form HotelApp
     */
    public LoginPage() {
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

        pnlLogin = new javax.swing.JPanel();
        pnlForm = new javax.swing.JPanel();
        lblLoginWelcomeTitle = new javax.swing.JLabel();
        txtFieldEmailAddress = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        lblSubTitleForLoginInstructions1 = new javax.swing.JLabel();
        pwdFieldForLogin = new javax.swing.JPasswordField();
        lblLoginBackground = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        lblErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBackground(new java.awt.Color(0, 31, 63));

        lblLoginWelcomeTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLoginWelcomeTitle.setForeground(new java.awt.Color(27, 35, 86));
        lblLoginWelcomeTitle.setText("Welcome back, Admin!");

        txtFieldEmailAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        btnLogin.setBackground(new java.awt.Color(27, 35, 86));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignUp.setText("SIGN UP");
        btnSignUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSignUp.setFocusable(false);

        lblSubTitleForLoginInstructions1.setForeground(new java.awt.Color(102, 102, 102));
        lblSubTitleForLoginInstructions1.setText("Please login to your account by filling in the details");

        pwdFieldForLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        lblLoginBackground.setBackground(new java.awt.Color(0, 31, 63));
        lblLoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loginBackground.png"))); // NOI18N

        btnShow.setBackground(new java.awt.Color(27, 35, 86));
        btnShow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("Show");
        btnShow.setFocusable(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        lblErrorMessage.setBackground(new java.awt.Color(255, 51, 0));
        lblErrorMessage.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubTitleForLoginInstructions1)
                    .addComponent(lblLoginWelcomeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(pwdFieldForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblLoginBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblLoginWelcomeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubTitleForLoginInstructions1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdFieldForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnShow)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblLoginBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Handles the login action when the "Login" button is clicked. Validates
     * the entered email and password. If the credentials are correct, the
     * current window is closed, and the home screen is displayed. Otherwise, an
     * error message is shown.
     *
     * @param evt the ActionEvent triggered when the "Login" button is clicked
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (txtFieldEmailAddress.getText().equals("admin@gmail.com") && pwdFieldForLogin.getText().equals("admin")) {
            JOptionPane.showMessageDialog(this, "Logged-In Successfully", "Login Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new HomePage().setVisible(true);
        } else if (txtFieldEmailAddress.getText().isEmpty() && pwdFieldForLogin.getText().isEmpty()) {
            lblErrorMessage.setText("Empty fields! Both fields are required to be filled.");
        } else {
            lblErrorMessage.setText("Incorrect username or password. Try again");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * Toggles the visibility of the password in the password field. When the
     * "Show" button is clicked, the password becomes visible. When the "Hide"
     * button is clicked, the password becomes masked.
     *
     * @param evt the ActionEvent triggered when the button is clicked
     */
    int flag = 0;
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:

        if (flag == 0) {
            pwdFieldForLogin.setEchoChar((char) 0);
            btnShow.setText("Hide");
            flag = 1;
        } else {
            pwdFieldForLogin.setEchoChar('*');
            btnShow.setText("Show");
            flag = 0;
        }
    }//GEN-LAST:event_btnShowActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JLabel lblLoginBackground;
    private javax.swing.JLabel lblLoginWelcomeTitle;
    private javax.swing.JLabel lblSubTitleForLoginInstructions1;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField pwdFieldForLogin;
    private javax.swing.JTextField txtFieldEmailAddress;
    // End of variables declaration//GEN-END:variables
}
