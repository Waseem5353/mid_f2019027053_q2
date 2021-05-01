/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2database;

import java.sql.*;

/**
 *
 * @author DELL
 */
public class connectionclass {

    Connection cx;
    Statement st;
    public connectionclass() {
    
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //String url="jdbc.sqlserver://localhost:1433;databaseName=usernetbean";
            String url="jdbc:sqlserver://localhost:1433;databaseName=usernetbean";
            String name="root";
            String pasword="root";
            cx=DriverManager.getConnection(url, name, pasword);
            st=cx.createStatement();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    
    
    
}
