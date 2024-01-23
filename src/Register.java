import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.sql.*;


/**
 *
 * @author hugod & charlesp
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casePhone = new javax.swing.JTextField();
        buttonValidate = new javax.swing.JButton();
        haveAccount = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        casePassword = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JLabel();
        or = new javax.swing.JLabel();
        buttonGoogle = new javax.swing.JButton();
        casePassword1 = new javax.swing.JPasswordField();
        txtPassword1 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JLabel();
        caseEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JLabel();
        caseName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 165, 136));
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casePhoneActionPerformed(evt);
            }
        });
        getContentPane().add(casePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 211, 30));

        buttonValidate.setBackground(new java.awt.Color(108, 150, 241));
        buttonValidate.setForeground(new java.awt.Color(255, 255, 255));
        buttonValidate.setText("REGISTER");
        buttonValidate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonValidateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonValidateMouseExited(evt);
            }
        });
        buttonValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonValidateActionPerformed(evt);
            }
        });
        getContentPane().add(buttonValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 211, -1));

        haveAccount.setForeground(new java.awt.Color(255, 255, 255));
        haveAccount.setText("Dont't have an account ?");
        haveAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haveAccountMouseClicked(evt);
            }
        });
        getContentPane().add(haveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 137, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setText("Name");
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 38, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Passsword");
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        casePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(casePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 211, 30));

        txtLogin.setBackground(new java.awt.Color(38, 182, 136));
        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setText("SINGUP");
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 212, -1));

        or.setForeground(new java.awt.Color(255, 255, 255));
        or.setText("------------------------or-------------------------");
        getContentPane().add(or, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 260, -1));

        buttonGoogle.setBackground(new java.awt.Color(66, 133, 244));
        buttonGoogle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonGoogle.setForeground(new java.awt.Color(255, 255, 255));
        buttonGoogle.setText("GOOGLE");
        buttonGoogle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGoogleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonGoogleMouseExited(evt);
            }
        });
        buttonGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoogleActionPerformed(evt);
            }
        });
        getContentPane().add(buttonGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 211, -1));

        casePassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casePassword1ActionPerformed(evt);
            }
        });
        getContentPane().add(casePassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 211, 30));

        txtPassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword1.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword1.setText("Confirm Password");
        getContentPane().add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txtEmail1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail1.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail1.setText("Email");
        getContentPane().add(txtEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 38, -1));

        caseEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseEmailActionPerformed(evt);
            }
        });
        getContentPane().add(caseEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 211, 30));

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.setText("Phone number");
        getContentPane().add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        caseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseNameActionPerformed(evt);
            }
        });
        getContentPane().add(caseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 211, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Istore.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casePhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casePhoneActionPerformed

    private void buttonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidateActionPerformed
    if (checkEmptyFields())
        JOptionPane.showMessageDialog(null, "Please ENTER your information *", "Missing information", JOptionPane.ERROR_MESSAGE);
    else {
        String name = caseName.getText();
        String email = caseEmail.getText();
        String password = String.valueOf(casePassword.getPassword());
        String password1 = String.valueOf(casePassword1.getPassword());
        String phone = casePhone.getText();
        if (matchingPasswords(password, password1)) {
            JOptionPane.showMessageDialog(null, "The password doesn't match", "Missing information Password !", JOptionPane.ERROR_MESSAGE);
        } else {
            PreparedStatement ps;
            String query = "INSERT INTO users.users(name, email, password, phone) values(?,?,?,?)"; // Corrected query
            try {
                ps = ConnBDD.getConnection().prepareStatement(query);
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, password);
                ps.setString(4, phone); // Corrected index
                if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Welcome to Istore", "Validate !", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Your account was not created. ERROR", "ERROR !", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No connection to the DB", "Missing information Password !", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
        
    }//GEN-LAST:event_buttonValidateActionPerformed

    private boolean checkEmptyFields(){
        return(caseName.getText().equals("")||caseEmail.getText().equals("")||String.valueOf(casePassword.getPassword()).equals("")
                ||String.valueOf(casePassword1.getPassword()).equals("")|| casePhone.getText().equals(""));
    }
    
    private boolean matchingPasswords(String p1, String p2){
        return (p1.equals(p2));

    }
    
    private void buttonValidateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonValidateMouseEntered
        buttonValidate.setBackground(new Color(120,150,241));
    }//GEN-LAST:event_buttonValidateMouseEntered

    private void buttonValidateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonValidateMouseExited
        buttonValidate.setBackground(new Color(108,150,241));

    }//GEN-LAST:event_buttonValidateMouseExited

    private void haveAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haveAccountMouseClicked
        Login login = new Login ();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
                
    }//GEN-LAST:event_haveAccountMouseClicked

    private void casePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casePasswordActionPerformed

    private void buttonGoogleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGoogleMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGoogleMouseEntered

    private void buttonGoogleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGoogleMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGoogleMouseExited

    private void buttonGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoogleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGoogleActionPerformed

    private void casePassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casePassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casePassword1ActionPerformed

    private void caseEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseEmailActionPerformed

    private void caseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseNameActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGoogle;
    private javax.swing.JButton buttonValidate;
    private javax.swing.JTextField caseEmail;
    private javax.swing.JTextField caseName;
    private javax.swing.JPasswordField casePassword;
    private javax.swing.JPasswordField casePassword1;
    private javax.swing.JTextField casePhone;
    private javax.swing.JLabel haveAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel or;
    private javax.swing.JLabel txtEmail1;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtPassword1;
    private javax.swing.JLabel txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
