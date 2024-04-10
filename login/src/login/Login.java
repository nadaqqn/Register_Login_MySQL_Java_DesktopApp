
package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import koneksi.DatabaseConnection;

public class Login {

    public static void main(String[] args) {
        // TODO code application logic here
        //nama object nya rg, nama classnya registerGUI
        //nama class huruf besar awalnya, nama object kecil huruf awalnya setelah itu nama_method()
        registerGUI rg = new registerGUI();
        //menampilkan frame register
        //halaman pertama yg ditampilin register
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(registerGUI.EXIT_ON_CLOSE);
        
         try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM users";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
