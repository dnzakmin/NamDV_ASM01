/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SqlConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ConnectionHelper {
    private static Connection connection = null;
    public static Connection getConnection(){
        if (connection == null){
            try {
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aptech_fpt", "root", "");
            } catch (SQLException ex) {
                System.err.println("CANNOT CONNECT DATABASE !!");
                connection = null;
                        
            }
            
            
        }
        return connection;
    }
    
}
