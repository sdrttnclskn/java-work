package com.kit.ifelse;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String ad = JOptionPane.showInputDialog("Lütfen Adýnýzý giriniz:");
		
		if (ad.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ad boþ geçilemez!");
		} else {
			
			String parola = JOptionPane.showInputDialog("Lütfen Parolanýzý giriniz:");

			if (parola.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Parola boþ geçilemez!");
			} else {
				JOptionPane.showMessageDialog(null, "Hoþgeldiniz " + ad);
			}
			
		}

	}
}
