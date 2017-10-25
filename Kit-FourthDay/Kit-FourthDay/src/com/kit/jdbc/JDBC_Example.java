package com.kit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		/*
		 * Prepare driver class
		 */
		Class.forName("com.mysql.jdbc.Driver");
		
		/*
		 * Open Connection
		 */
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it525db?useSSL=false", "root", "1234");
		
		/*
		 * Write query
		 */
//		String query = "SELECT * FROM product WHERE id=2;";
		String query = "SELECT * FROM product WHERE id=? AND name=?;";

		
		/*
		 * Create statement
		 */
//		Statement stmt = conn.createStatement();
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setInt(1, 3);
		psmt.setString(2, "Iphone");
		
		/*
		 * Get results
		 */
//		ResultSet rs = stmt.executeQuery(query);
		ResultSet rs = psmt.executeQuery();

		
		while(rs.next()){
			System.out.println(rs.getString("description"));
		}
		
		/*
		 * close connection
		 */
		conn.close();
		
	}

}
