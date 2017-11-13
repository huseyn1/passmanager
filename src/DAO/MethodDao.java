
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PassManagerModel;

public class MethodDao extends SqliteDao implements DaoInterface{

    boolean is=false;
    
    @Override
    public boolean insertData(PassManagerModel passmanager) {
        
        try {
            open();
            
            String insertQuery="insert into passmanager "
                    + "(desc,user,password) "
                    + "values (?,?,?)";
            ps=conn.prepareStatement(insertQuery);
            ps.setString(1, passmanager.getDesc());
            ps.setString(2, passmanager.getName());
            ps.setString(3, passmanager.getPassword());
            int responseNum=ps.executeUpdate();
            is=responseNum>=1;
        
            
        } catch (SQLException ex) {

            ex.printStackTrace();
            System.out.println("insert zamani xeta oldu");
            return false;
          
        }
        finally{
        close();
        }
        
        return is;
     
    }

    @Override
    public List<PassManagerModel> showData() {
         
        
        List<PassManagerModel> list=new ArrayList<>();
        try {
            open();
            
            String query="select desc,user,password from passmanager";
            ps=conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
             
            PassManagerModel passManagerModel=new PassManagerModel(rs.getString("desc"), rs.getString("user"), rs.getString("password"));
            
            list.add(passManagerModel);
        
            }
            
        } catch (SQLException ex) {
           ex.printStackTrace();
            System.out.println("Resultsetde xeta oldu");
        }
        finally{
        
        close();
        }
        return list;
   
     }



    
}
