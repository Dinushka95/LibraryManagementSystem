
package st;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Connect 
{
    static Connection con =null;
    
   public static Connection connect()
   {
   
   String DB_location="jdbc:mysql://localhost:3306/libarysystemdb";
   String username="root";
   String password=null;
   
   try
    {  
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection(DB_location,username,password);
    }
   catch(Exception e)
    {
        System.out.println(e);
    }
   
   return con;
   } 
   
   
   public static void close()
   {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

   }
    
}
