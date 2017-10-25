package com.kit.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {

		
		LocalTime time = LocalTime.now();
		System.out.println("Sistem zamaný : " + time);
		
		LocalTime time2 = time.truncatedTo(ChronoUnit.MINUTES);
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		System.out.println(time2);
		
	}

}
