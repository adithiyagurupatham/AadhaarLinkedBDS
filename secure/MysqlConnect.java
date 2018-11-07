package secure;
import java.sql.*;
import javax.swing.*;

public class MysqlConnect
{
    Connection conn=null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); // Defines the driver
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/technosoft","root","*****"); // Defines the database and password
            return conn;
        }
        catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e); // Dispalys the error
        return null;
    }
    }
    
}
