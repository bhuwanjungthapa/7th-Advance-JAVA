import java.sql.*;
public class FetchRecords {


    public static void main(String[] args) throws Exception
    {
        DBCon dbc = new DBCon();

        dbc.con.setAutoCommit(false);
        Statement stmt = dbc.con.createStatement();
        stmt.addBatch("insert into login values(3,'Nishant','nishant123')");
        stmt.addBatch("insert into login values(4,'Ram','ram123')");
        stmt.executeBatch();//executing the batch
        dbc.con.commit();
        dbc.con.close();
    }
}
