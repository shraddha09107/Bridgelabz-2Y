package com.jdbc.jdbcStudentsDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionImpl implements IConnection {

	
	Connection con;
    @Override
    public Connection getConnection() {
    	
        try {
            
            String url = "jdbc:mysql://localhost:3306/bee";
            String user = "root";           
            String password = "shraddha_129";       

            Class.forName("com.mysql.cj.jdbc.Driver");

            
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Created");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

