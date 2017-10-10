package com.sdrttnclskn.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("dosya açlmak üzere");
			InputStream in = new FileInputStream("kaydet.txt");
			System.out.println("dosya açýldý");
		} catch (FileNotFoundException | NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("filenotfount hatasý fýrlatýldý.");
			e.printStackTrace();
		}finally {
			//db conn kapatýlýr....
		}
	}
	

}
