package com.kit.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
	
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bfwriter;
		BufferedReader bfreader;
		
		FileWriter write = new FileWriter("C:/Bilginc Academy Workspaces/Erdemir/Kit-ThirdDay/src/com/kit/txt/bilginc.txt");
		bfwriter = new BufferedWriter(write);
		
		bfwriter.write("Messi \n");
		bfwriter.write("Ronaldo \n");
		bfwriter.write("Sabri \n");
		bfwriter.write("Arda \n");
		
		bfwriter.flush();
		System.out.println("Yazdýrma iþlemi tamamlandý...");

		bfreader = new BufferedReader(new FileReader("C:/Bilginc Academy Workspaces/Erdemir/Kit-ThirdDay/src/com/kit/txt/bilginc.txt"));
		String read = bfreader.readLine();
//		try {
//			while(!read.isEmpty()){
//				System.out.println("Okunan deðer : " + read);
//				read =bfreader.readLine();
//			}
//		} catch (NullPointerException e) {
//			
//		}
		
		while(read != null){
			System.out.println("Okunan deðer : " + read);
			read =bfreader.readLine();
		}
		
		bfwriter.close();
		bfreader.close();
		
	}
	
}
