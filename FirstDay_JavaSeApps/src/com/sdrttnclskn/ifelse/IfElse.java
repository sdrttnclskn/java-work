package com.sdrttnclskn.ifelse;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String ad= JOptionPane.showInputDialog("Lütfen adýnýz giriniz:");
		
		if (ad.isEmpty()) {
		
			JOptionPane.showMessageDialog(null, "Ad Boþ geçiilmez.");
		} else {
        
			String parola= JOptionPane.showInputDialog("Lütfen parolanýzý  giriniz:");
            if (parola.isEmpty()) {
    			JOptionPane.showMessageDialog(null, "parola Boþ geçiilmez.");

			} else {
 
				JOptionPane.showMessageDialog(null,"Hoþgeldinz " +ad);
			}
		}
		
	}

}
