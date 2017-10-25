package com.kit.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate now1 = LocalDate.now();
		LocalDate now2 = LocalDate.of(1968, Month.MAY, 23);
		
		System.out.println("Sistem tarihi :" + now1);
		System.out.println("Belirttiðimiz tarih :" + now2);
		
		System.out.println(now1.isAfter(now2));
		System.out.println(now2.isLeapYear());
		System.out.println(now2.getDayOfWeek());
		
		LocalDate future = now1.plusDays(345).plusWeeks(25).plusYears(49);
		System.out.println(future);
		
		System.out.println(Period.between(now1, now2));
		System.out.println(now1.until(now2));

	}

}
