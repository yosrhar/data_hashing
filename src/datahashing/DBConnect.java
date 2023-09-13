/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datahashing;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author yosrh
 */
import javax.swing.JOptionPane;
public class DBConnect {
    
    public static Connection connect()
    {
    
    Connection con =null;
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datahash?", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    
    }
    
    
    
}
