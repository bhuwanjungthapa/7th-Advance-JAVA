import java.security.PublicKey;
import java.sql.*;
public class DBConnection {
    public Connection con;
    public DBConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb","root","");
            System.out.println("Connection Success");
        }
        catch (Exception ex){
            System.out.println("Error " + ex);
        }
    }
    public static void main(String[] args){
        new DBConnection();
    }
}