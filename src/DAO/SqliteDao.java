
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SqliteDao {
    
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    static{
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
          ex.printStackTrace();
            System.out.println("driver registr zamani xeta oldu");
        }
    }
    
    public void open(){
    
        try {
            conn=DriverManager.getConnection("jdbc:sqlite:D:\\sqllite\\passwordmanager.db");
        } catch (SQLException ex) {
          ex.printStackTrace();
            System.out.println("connection zamani xeta oldu");
            try {
                conn.close();
            } catch (SQLException ex1) {
              ex1.printStackTrace();
            }
        }
        
    
    }
    
    public void close(){
        

        try {
            if (rs!=null) rs.close();
            if (ps!=null) ps.close();
            if (conn!=null) conn.close();
        } catch (SQLException ex) {
          ex.printStackTrace();
            System.out.println("closing zamani xeta oldu");
        }
        
        
    }
           
    
}
