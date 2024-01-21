import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


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
        or = new javax.swing.JLabel();
        buttonGoogle = new javax.swing.JButton();
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
        getContentPane().add(buttonValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 211, -1));

        notAccount.setForeground(new java.awt.Color(255, 255, 255));
        notAccount.setText("Dont't anny account ?");
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

        or.setForeground(new java.awt.Color(255, 255, 255));
        or.setText("------------------------or-------------------------");
        getContentPane().add(or, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 260, -1));

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
        getContentPane().add(buttonGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 211, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Istore.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caseEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseEmailActionPerformed

    private void buttonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonValidateActionPerformed

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

    private void buttonGoogleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGoogleMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGoogleMouseEntered

    private void buttonGoogleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGoogleMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGoogleMouseExited

    private void buttonGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGoogleActionPerformed
        
    }//GEN-LAST:event_buttonGoogleActionPerformed
    
 

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
    private javax.swing.JButton buttonGoogle;
    private javax.swing.JButton buttonValidate;
    private javax.swing.JTextField caseEmail;
    private javax.swing.JPasswordField casePassword;
    private javax.swing.JLabel notAccount;
    private javax.swing.JLabel or;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtPassword;
    // End of variables declaration//GEN-END:variables
}
