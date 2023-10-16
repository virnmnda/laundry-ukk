/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk_laundry.rpl2;
    
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC-23
 */
public class koneksi {
    private String url = "jdbc:mysql://localhost:3306/laundry_ukk";
    private String username = "root";
    private String password ="";
    private Connection conn;
    
    public void connect(){
        try {
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("Koneski berhasil!");
    } catch (Exception e) {
          JOptionPane.showMessageDialog( null, e.getMessage());  
    }
}
    public Connection getCon(){
        Connection con = null;
        try{
            //Lakukan inisialisasi dan pengambilan koneksi ke database di sini
            con = DriverManager.getConnection("jdbc:mysql://localhost/laundry_ukk", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
}
