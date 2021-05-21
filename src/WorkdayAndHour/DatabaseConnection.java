/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkdayAndHour;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author nisal
 */
public class DatabaseConnection {
    
     Connection conn;
    
    public static Connection ConnectDB(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); 
           java.sql.Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/timetablemanagement","root","");
                return con1;
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return null;
    }
    
}
