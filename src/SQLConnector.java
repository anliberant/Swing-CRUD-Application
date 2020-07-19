import java.sql.*;
import javax.swing.*;

public class SQLConnector {
       Connection conn = null;
       public static Connection ConnectBD(){
           try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingbd?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8", "root", "root");
                //JOptionPane.showMessageDialog(null, "Connection successful");
                return conn;
           } catch (ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null, e);
                return null;
           }
       }
       
}
