package com.kit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Example2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it525db?useSSL=false", "root", "1234");
		
//		String query = "INSERT INTO category VALUES (6,'Software2');";
//		String query = "UPDATE category SET name=? WHERE id=?;";
		String query = "DELETE FROM category WHERE id=?";
		
		PreparedStatement psmt = conn.prepareStatement(query);
//		psmt.setString(1, "Other");
		psmt.setInt(1, 6);
	
		int result = psmt.executeUpdate();
		System.out.println(result);
		
		if(result>0){
			System.out.println("Category deleted...");
		}

		conn.close();
		
	}

}
