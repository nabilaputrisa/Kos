package dataKos;
import java.sql.*;

public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/DataKos";
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, username, password);
        } catch (Exception e){
            System.err.println("koneksi gagal" + e.getMessage());
        }
        return mysqlconfig;
    }
    
}
