
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project2;
import java.sql.*;

/**
 *
 * @author senth
 */
public class ConnectionProvider2 {
    public static Connection getCon()
    {
       try
       {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbank1","root","Senth@1065");
          return con;
       }
       catch(Exception e)
       {
           System.out.println(e);
           return null;
       }   
               
                   
              
    }
    
}
