package com.kit.enumeration;

public class TestEnum {

	public static void main(String[] args) {
		
		Student1 student1 = new Student1("Koray", "Güney", Student.MASTER);
		
		student1.setSalary(1000);
		student1.calcGrant();
		System.out.println("Maaþý : " + student1.getSalary());
		
		student1.getFirstname();
		student1.getStudentType();
		
	}



}
