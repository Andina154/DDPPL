package patok_tanah;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi{
    private static Connection koneksi;
    private static String url = "jdbc:mysql://localhost:3306/sutorejo";
    private static String username = "root";
    private static String password = "";
    
    public static Connection GetConnection(){
        try{
            if(koneksi==null){
                new Driver();            
                koneksi = DriverManager.getConnection(url, username, password);
            }        
        }
        catch(SQLException errMsg){
            System.out.println("Terjadi kesalahan : "+errMsg.getMessage());            
        }
        return koneksi;
    }
}
