package com.kit.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

	public static Connection dbConnector() throws ClassNotFoundException, SQLException {		
		
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("db.properties"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String server = prop.getProperty("server");
		String database = prop.getProperty("database");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+server +"/"+ database+"?useSSL=false",username,password);
		
		return conn;
	}
	
	
	
}
