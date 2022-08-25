/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;

import java.sql.*;

/**
 *
 * @author Hussein A Barham
 */
public final class Movierental {

    
    Connection getConnection() throws Exception
    {
        String  Driver="sun.jdbc.odbc.JdbcOdbcDriver";
        String URL  = "jdbc:odbc:movies";
        
        Class.forName(Driver);
        
        return  DriverManager.getConnection(URL); 
    }
    
    Movierental() throws Exception
    {
        getConnection();
        System.out.println("Successfully Connection :)");
        new mainPage();
        
        
        
        
    }
    public static void main(String[] args) throws Exception{
        
        
        Movierental movierental = new Movierental();
        Movierental c = new Movierental();
        System.out.println(c.equals(movierental));
 
        
        
    }
    
}
