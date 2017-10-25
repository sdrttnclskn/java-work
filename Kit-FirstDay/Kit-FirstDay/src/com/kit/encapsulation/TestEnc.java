package com.kit.encapsulation;

public class TestEnc {

	public static void main(String[] args) {

		Student stu1 = new Student("Koray", "Güney", 33);
		Student stu2 = new Student();
		stu2.setAge(250);
//		System.out.println(stu2.getAge());
		
		Student stu3 = new Student("Ali", "Veli", 25);
		System.out.println("stu3 age :" + stu3.getAge());
		
		stu2.setFirstname("ab12c");
		System.out.println("First name : "+ stu2.getFirstname());
		
		FreshStudent frstu1 = new FreshStudent();
		
		stu1.foo();
		frstu1.foo();
		
		
	}

}
