package com.sdrttnclskn.encapsulation;

public class TestEnc {

	public static void main(String[] args) {

		Student st1 = new Student("Sedat", "Çalýþkan", 26);
		Student st2 = new Student();
		st2.setAge(24); 
		
		System.out.println(st2.getAge());
		st2.setFirstName("aadfe121213dvdfvfdv");
		System.out.println("stu2 names:"+ st2.getFirstName());
		
		FreshStudent frst1 = new FreshStudent();
		
	
		
	}

}
