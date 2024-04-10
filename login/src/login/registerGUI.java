
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registerGUI extends javax.swing.JFrame {

    //Inisialisasi var public name, username, password di atas method
    //var ini untuk menampung data register user
    public static String name = "";
    public static String username;
    public static String password;
    
    public registerGUI() {
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
        jLabel4 = new javax.swing.JLabel();
        username_register = new javax.swing.JTextField();
        reTypePassword_register = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        nama_register = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password_register = new javax.swing.JPasswordField();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Close)
                    .addComponent(jLabel_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 440));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("Hello !");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(130, 50, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please insert your data");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 100, 130, 15);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 170, 33, 16);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText("Re-Type Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 260, 105, 16);

        username_register.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        username_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_registerActionPerformed(evt);
            }
        });
        jPanel2.add(username_register);
        username_register.setBounds(150, 195, 181, 22);

        reTypePassword_register.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(reTypePassword_register);
        reTypePassword_register.setBounds(150, 255, 181, 22);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setText("Username");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 200, 55, 16);

        nama_register.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        nama_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_registerActionPerformed(evt);
            }
        });
        jPanel2.add(nama_register);
        nama_register.setBounds(150, 163, 181, 22);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 230, 54, 16);

        password_register.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        password_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_registerActionPerformed(evt);
            }
        });
        jPanel2.add(password_register);
        password_register.setBounds(150, 227, 181, 22);

        jButton_Register.setText("Register");
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Register);
        jButton_Register.setBounds(130, 310, 93, 29);

        gagal_register.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        gagal_register.setForeground(new java.awt.Color(255, 51, 51));
        gagal_register.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(gagal_register);
        gagal_register.setBounds(40, 290, 290, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_registerActionPerformed

    private void nama_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_registerActionPerformed
   
    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:
        //memeriksa apakah password yg diketik sama dnegan re type password
        if(!password_register.getText().equals(reTypePassword_register.getText())){
            gagal_register.setText("The password doesn't match");
        }
        else{
            // Menyimpan data pengguna ke dalam variabel
            name = nama_register.getText();
            String username = username_register.getText();
            String password = password_register.getText();

            // Menyimpan data pengguna ke dalam database
            try {
                // Mendapatkan koneksi ke database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "test", "123");

                // Membuat kueri untuk menyimpan data pengguna ke dalam tabel
                String insertQuery = "INSERT INTO users (name, username, password) VALUES (?, ?, ?)";
                PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                insertStatement.setString(1, name);
                insertStatement.setString(2, username);
                insertStatement.setString(3, password);
                insertStatement.executeUpdate();

                // Menampilkan pesan bahwa registrasi berhasil
                System.out.println("Registrasi berhasil");

                // Menuju halaman Login
                loginGUI lg = new loginGUI();
                lg.setVisible(true);
                lg.pack();
                lg.setLocationRelativeTo(null);
                lg.setDefaultCloseOperation(registerGUI.EXIT_ON_CLOSE);

            } catch (SQLException ex) {
                // Menampilkan pesan kesalahan jika registrasi gagal
                System.out.println("Registrasi gagal: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        // TODO add your handling code here:
        //to close the window
        System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        // TODO add your handling code here:
        //to minimize the window
        this.setState(1);
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void password_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_registerActionPerformed

    
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
            java.util.logging.Logger.getLogger(registerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gagal_register;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nama_register;
    private javax.swing.JPasswordField password_register;
    private javax.swing.JPasswordField reTypePassword_register;
    private javax.swing.JTextField username_register;
    // End of variables declaration//GEN-END:variables
}
