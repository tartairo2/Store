import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.security.MessageDigest;


/**
 *
 * @author hugod & charlesp
 */
public class RegisterAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public RegisterAdmin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonValidate = new javax.swing.JButton();
        labelCancel = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtLogin = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JLabel();
        caseEmail = new javax.swing.JTextField();
        caseName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 165, 136));
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(buttonValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 211, 20));

        labelCancel.setForeground(new java.awt.Color(255, 255, 255));
        labelCancel.setText("Cancel");
        labelCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCancelMouseClicked(evt);
            }
        });
        getContentPane().add(labelCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 137, 10));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setText("Name");
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 38, -1));

        txtLogin.setBackground(new java.awt.Color(38, 182, 136));
        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setText("Register Admin");
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -10, 270, 210));

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

    private void buttonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidateActionPerformed
        if (checkEmptyFields())
            JOptionPane.showMessageDialog(null, "ENTER your information *", "Missing information", JOptionPane.ERROR_MESSAGE);
        else {
            String name = caseName.getText();
            String email = caseEmail.getText();
            String password = String.valueOf(casePassword.getPassword());
            String password1 = String.valueOf(casePassword1.getPassword());
            if (!matchingPasswords(password, password1)) { // Correction ici (ajout de "!")
                JOptionPane.showMessageDialog(null, "Password not mach", "ERROR password", JOptionPane.ERROR_MESSAGE);
            } else {
                PreparedStatement ps;
                String query = "INSERT INTO users(name, email, password) VALUES (?, ?, ?)";
                try {
                    // Hashing the password using SHA-256
                    String hashedPassword = hashPassword(password);

                    ps = ConnBDD.getConnection().prepareStatement(query);
                    ps.setString(1, name);
                    ps.setString(2, email);
                    ps.setString(3, hashedPassword);
                    if (ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "Welcome to Istore", "Validation!", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Could not create account. ERROR", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "No database connection", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

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
    
    
    
    
    
    
    
    
    
    
    
    
    private boolean checkEmptyFields(){
        return(caseName.getText().equals("")||caseEmail.getText().equals("")||String.valueOf(casePassword.getPassword()).equals("")
                ||String.valueOf(casePassword1.getPassword()).equals(""));
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

    private void caseEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseEmailActionPerformed

    private void caseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseNameActionPerformed

    private void labelCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCancelMouseClicked
        Login login = new Login ();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_labelCancelMouseClicked


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
    private javax.swing.JButton buttonValidate;
    private javax.swing.JTextField caseEmail;
    private javax.swing.JTextField caseName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCancel;
    private javax.swing.JLabel txtEmail1;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtName;
    // End of variables declaration//GEN-END:variables
}
