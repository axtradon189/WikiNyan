package Controller;
import DatabaseConnection.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
     static Connection conn;
    static Statement stat;
    static String sql;
    
    public static void main(String[]args) throws SQLException {
       conn = new DBConnection().setConnection();
       try {
            sql = "DROP TABLE tbl_loginmember";
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        
        stat = conn.createStatement();
        stat.execute(sql);
    }
}
