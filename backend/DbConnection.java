
package in.sp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection
{
    static Connection con;
    public static Connection getConnection()
    {
    try
    {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_network","root","s#bokade");
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
    return con;
    
    }
    
    
}
