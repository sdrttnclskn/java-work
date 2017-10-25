package com.kit.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kit.models.User;
import com.kit.utilities.ConnectionManager;

public class LoginService {

//	public boolean girisKontrol(String kullaniciAdi, String parola) throws ClassNotFoundException, SQLException {
	public boolean girisKontrol(User user) throws ClassNotFoundException, SQLException {

		
		Connection conn = ConnectionManager.dbConnector();
		
		PreparedStatement psmt = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
//		psmt.setString(1, kullaniciAdi);
//		psmt.setString(2, parola);
		
		psmt.setString(1, user.getUsername());
		psmt.setString(2, user.getPassword());
		
		ResultSet rs =psmt.executeQuery();
		while(rs.next()){
			return true;
		}
		conn.close();
		return false;
		
	}

}
