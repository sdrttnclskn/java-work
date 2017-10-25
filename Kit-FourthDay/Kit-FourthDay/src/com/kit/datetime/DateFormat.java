package com.kit.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {

	
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Before format : " + date);
		
//		DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss a");
		DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss a");
		String formattedDate2 = date.format(formattedDate);
		System.out.println("After format : " + formattedDate2);
	}
}
