import java.sql.*;
public class DBCon {
    public Connection con;
    public DBCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/studentdb","root","");
            System.out.println("connection succcessful");
        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }


    }
    public static void main(String[] args)
    {
        new DBCon();
    }

}
