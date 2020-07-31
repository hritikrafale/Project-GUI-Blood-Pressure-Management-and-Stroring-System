
package healthapp;
import java.sql.*;


public class javaconnect
{
    Connection conn=null;
    
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthMemo","healthuser", "healthuser");
            return conn;
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
     return null;   
    }
    
}
