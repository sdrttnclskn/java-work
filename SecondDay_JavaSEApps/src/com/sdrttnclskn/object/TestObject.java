package com.sdrttnclskn.object;

public class TestObject {

	public static void main(String[] args) {
	
		Student student1 = new Student("ali", "hasan", 24);
		System.out.println(student1);
		
		Student student2 = new Student("ali", "hasan", 24);
		//equls metodunu kullandýðýmýzda object sorgular, ondan dolayý equls ve hash kodu kullanaarak jata kadldýrýyoruz.
		
		if (student1.equals(student2)) {
			System.out.println("bu iki öðrenci eþit");
		}else {
			
			System.out.println("bu iki öðrenci eþit deðil");
		}
		
	}

}
