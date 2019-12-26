package Controller;
import DatabaseConnection.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    static Connection conn;
    static Statement stat;
    static String sql;
    
    public static void main (String [] args) throws SQLException {
         conn = new DBConnection().setConnection();
        try{
            sql = "CREATE TABLE tbl_loginmember"
                    + "(username VARCHAR(55)NOT NULL,"
                    + "password VARCHAR(55) NOT NULL,"
                    + "PRIMARY KEY (username))";
                   
        }catch (Exception e){
            System.out.println("Error"+ e.getMessage());
        }
        stat = conn.createStatement();
        stat.execute(sql);
    }
}