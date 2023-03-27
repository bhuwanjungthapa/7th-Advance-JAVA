import java.sql.*;
public class Transaction {


    public static void main(String[] args) throws Exception
    {
        DBCon dbc = new DBCon();

        dbc.con.setAutoCommit(false);
        Statement stmt = dbc.con.createStatement();
        stmt.executeUpdate("insert into login values(5,'Bhuwan','nishant123')");
        stmt.executeUpdate("insert into login values(6,'Hari','ram123')");
        stmt.executeUpdate("insert into login values(7,'Sita','sita123')");
        dbc.con.commit();
        dbc.con.close();
    }
}
