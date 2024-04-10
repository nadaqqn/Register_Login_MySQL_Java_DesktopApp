
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginGUI extends javax.swing.JFrame {

    public loginGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username_login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordField_login = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jButton_Register = new javax.swing.JButton();
        gagal_register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 40));

        jLabel_Close.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel_Close.setText("X");
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLabel_Minimize.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel_Minimize.setText("-");
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Close)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 440));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("WELCOME");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(103, 49, 155, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel2.setText("Please insert your Username and Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(72, 105, 216, 14);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("Username");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(65, 170, 55, 16);

        username_login.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        username_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_loginActionPerformed(evt);
            }
        });
        jPanel2.add(username_login);
        username_login.setBounds(126, 167, 181, 22);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(65, 212, 54, 16);

        passwordField_login.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(passwordField_login);
        passwordField_login.setBounds(126, 209, 181, 22);

        jButton_Login.setText("Login");
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseClicked(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Login);
        jButton_Login.setBounds(157, 269, 71, 29);

        jButton_Register.setText("Register");
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Register);
        jButton_Register.setBounds(149, 325, 89, 29);

        gagal_register.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        gagal_register.setForeground(new java.awt.Color(255, 51, 51));
        gagal_register.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(gagal_register);
        gagal_register.setBounds(40, 240, 290, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_loginActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // Memeriksa apakah login berhasil dengan membandingkan username dan password yang dimasukkan dengan yang tersimpan di database
        try {
            // Mendapatkan koneksi ke database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "test", "123");

            // Membuat kueri untuk memeriksa kecocokan username dan password
            String selectQuery = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            selectStatement.setString(1, username_login.getText());
            selectStatement.setString(2, String.valueOf(passwordField_login.getPassword()));
            ResultSet result = selectStatement.executeQuery();

            // Jika data pengguna ditemukan, login berhasil
            if (result.next()) {
                // Menuju halaman homeGUI
                homeGUI hm = new homeGUI();
                hm.setVisible(true);
                hm.pack();
                hm.setLocationRelativeTo(null);
                hm.setDefaultCloseOperation(loginGUI.EXIT_ON_CLOSE);
            } else {
                // Jika data pengguna tidak ditemukan, menampilkan pesan kesalahan
                gagal_register.setText("Username atau password salah");
            }

            conn.close();

        } catch (SQLException ex) {
            // Menampilkan pesan kesalahan jika terjadi kesalahan saat koneksi atau eksekusi kueri
            System.out.println("Koneksi database gagal: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(1);
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:
        // Menuju halaman Register
        registerGUI rg = new registerGUI();
        //menampilkan frame register
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(registerGUI.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jButton_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LoginMouseClicked

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
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gagal_register;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordField_login;
    private javax.swing.JTextField username_login;
    // End of variables declaration//GEN-END:variables
}
