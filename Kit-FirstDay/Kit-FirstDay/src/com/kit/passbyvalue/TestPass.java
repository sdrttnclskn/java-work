package com.kit.passbyvalue;


public class TestPass {

	public static void main(String[] args) {

		int x = 5;
		int y = x;
		
		System.out.println("value of x : "+x);
		System.out.println("value of y : "+y);
		
		y= 10;
		System.out.println(".................");
		System.out.println("value of x after change: "+x);
		System.out.println("value of y after change: "+y);
		
		Student stu1 = new Student();
		Student stu2 = stu1;
		stu1.age = 23;
		
		System.out.println(".................");
		System.out.println("age of stu1: "+ stu1.age); // 23
		System.out.println("age of stu2: "+ stu2.age); // 23
		
		stu2.age = 35;
		
		System.out.println(".................");
		System.out.println("age of stu1 after change: "+ stu1.age); // 35,23;
		System.out.println("age of stu2 after change: "+ stu2.age); // 35
	}

}
