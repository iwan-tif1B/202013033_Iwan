import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.*;

public class coneksi {
    private static Connection MYSQLConfig;
    public static Connection configDB()throws SQLException{
        try{
          String url = "jdbc:mysql://localhost:3306/baru";
          String user = "root";
          String password = "";  
    
               DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                MYSQLConfig =DriverManager.getConnection(url, user, password);
                
            }catch(SQLException t){
                System.out.println("Koneksi Error!");
            }return MYSQLConfig;
        }}