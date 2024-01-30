import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.security.MessageDigest;




/**
 *
 * @author hugod & charlesp
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caseEmail = new javax.swing.JTextField();
        buttonValidate = new javax.swing.JButton();
        notAccount = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        casePassword = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JLabel();
        checkBoxUser = new javax.swing.JCheckBox();
        checkBoxAdmin = new javax.swing.JCheckBox();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caseEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseEmailActionPerformed(evt);
            }
        });
        getContentPane().add(caseEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 211, 30));

        buttonValidate.setBackground(new java.awt.Color(108, 150, 241));
        buttonValidate.setForeground(new java.awt.Color(255, 255, 255));
        buttonValidate.setText("Login");
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
        getContentPane().add(buttonValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 211, -1));

        notAccount.setForeground(new java.awt.Color(255, 255, 255));
        notAccount.setText("Dont't have an account ?");
        notAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notAccountMouseClicked(evt);
            }
        });
        getContentPane().add(notAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 137, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Email");
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 38, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Passsword");
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        casePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(casePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 211, 30));

        txtLogin.setBackground(new java.awt.Color(38, 182, 136));
        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setText("LOGIN");
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 212, -1));

        checkBoxUser.setText("User");
        getContentPane().add(checkBoxUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        checkBoxAdmin.setText("Admin");
        getContentPane().add(checkBoxAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Istore.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caseEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseEmailActionPerformed

    private void buttonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidateActionPerformed
        // Ajout du code de débogage
    Connection connection = ConnBDD.getConnection();
    if (connection != null) {
        System.out.println("Connection successful");
    } else {
        System.out.println("Connection failed");
        return;  // Quitte la méthode si la connexion échoue
    }

    // Le reste du code reste inchangé
    if (checkEmptyFields()) {
        JOptionPane.showMessageDialog(null, "Please ENTER your information", "Missing information", JOptionPane.ERROR_MESSAGE);
    } else {
        PreparedStatement ps;
        ResultSet rs;
        String email = caseEmail.getText();
        String password = casePassword.getText();
        String query = "SELECT * FROM users.users WHERE email=? AND password=?";
        try {
            // Hashing the entered password for comparison
            String hashedPassword = hashPassword(password);

            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, hashedPassword);

            rs = ps.executeQuery();
            if (rs.next()) {
                UserMenu menu = new UserMenu();
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No user with the provided email or password", "Incorrect", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace(); // Print the exception details for debugging
        }
    }          
    }//GEN-LAST:event_buttonValidateActionPerformed

    private String hashPassword(String password) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(password.getBytes());
        return bytesToHex(encodedHash);
    }

    private String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    private void buttonValidateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonValidateMouseEntered
        buttonValidate.setBackground(new Color(120,150,241));
    }//GEN-LAST:event_buttonValidateMouseEntered

    private void buttonValidateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonValidateMouseExited
        buttonValidate.setBackground(new Color(108,150,241));

    }//GEN-LAST:event_buttonValidateMouseExited

    private void notAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notAccountMouseClicked
        Register register = new Register ();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        this.dispose();
                
    }//GEN-LAST:event_notAccountMouseClicked

    private void casePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casePasswordActionPerformed
    
    private boolean checkEmptyFields(){
        return (caseEmail.getText().equals("")||casePassword.getText().equals(""));

    }
 

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
    private javax.swing.JLabel bg;
    private javax.swing.JButton buttonValidate;
    private javax.swing.JTextField caseEmail;
    private javax.swing.JPasswordField casePassword;
    private javax.swing.JCheckBox checkBoxAdmin;
    private javax.swing.JCheckBox checkBoxUser;
    private javax.swing.JLabel notAccount;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtPassword;
    // End of variables declaration//GEN-END:variables
}
