package com.kit.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import com.kit.utilities.ConnectionManager;

public class KayitService {

	public boolean yeniKayitYap(String kullaniciAdi, char[] password1) throws ClassNotFoundException, SQLException {

		Connection conn = ConnectionManager.dbConnector();
		Random rnd = new Random();
		String query = "INSERT INTO users(id,username,password) VALUES ("+Math.abs(rnd.nextInt())+",?,?); ";
		PreparedStatement psmt = conn.prepareStatement(query);
		
		psmt.setString(1, kullaniciAdi);
		psmt.setString(2, String.valueOf(password1));
		
		int result = psmt.executeUpdate();
		
		if(result > 0){
			return true;
		}
		
		conn.close();
		return false;
		
		
	}



}
