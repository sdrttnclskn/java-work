package com.kit.controller;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.kit.services.KayitService;

public class KayitController {

	public boolean kayitKontrol(String kullaniciAdi, char[] password1, char[] password2) throws ClassNotFoundException, SQLException {
		
		String passw1 = String.valueOf(password1);
		String passw2 = String.valueOf(password2);

		
		if(kullaniciAdi.isEmpty() || password1.length==0 || password2.length==0){
			JFrame jframe = new JFrame();
			JOptionPane.showMessageDialog(jframe, "Boþ alan býrakamazsýnýz !");
			return false;
		}else if(passw1.equals(passw2)){
			
			boolean result = new KayitService().yeniKayitYap(kullaniciAdi,password1);
			return result;
		} else {
			return false;
		}
		
		
		
	}

	
	
	
	
}
