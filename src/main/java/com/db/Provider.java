package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Provider {
	public static Connection getOracleConnection(){
        Connection con;
        con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetest", "root", "indupriya@2001");
                System.out.println("Connection Successful, Yippe!!!");
            } catch (SQLException ex) {
                System.err.println("ERROR -> SQLException");
                Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR -> ClassNotFoundException");
            Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
