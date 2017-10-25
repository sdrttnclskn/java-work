package com.kit.object;

public class TestObject {

	public static void main(String[] args) throws CloneNotSupportedException {
		
//		student1.setFirstname("Mustafa");
		//System.out.println(student1);
//		
//		Student student1 = new Student(1, "Koray", "Güney", 12);
//		Student student2 = new Student(1, "Koray", "Güney", 13);
//		
//		Student freshStudent1 = new FreshStudent();
//		
//		((FreshStudent)freshStudent1).getClassName();
//		
//		if(student1.equals(student2)){
//			System.out.println("Bu iki öðrenci EÞÝT");
//		}else {
//			System.out.println("Bu iki öðrenci EÞÝT DEÐÝL !");
//		}
		
		Student student1 = new Student("Koray", "Güney");
		Student student2 = (Student) student1.clone();
		student2.setFirstname("Ali");
		
		System.out.println(student1.getFirstname());
		System.out.println(student2.getFirstname());
	}
	
}
