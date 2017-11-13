
package DAO;

import java.sql.ResultSet;
import java.util.List;
import model.PassManagerModel;

public interface DaoInterface {
    
    
    public boolean insertData(PassManagerModel passmanager);
    public List showData();
   
}
