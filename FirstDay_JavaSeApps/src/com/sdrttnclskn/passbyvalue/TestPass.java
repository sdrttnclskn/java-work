package com.sdrttnclskn.passbyvalue;

import com.sdrttnclskn.classReview.Student;

public class TestPass {

	public static void main(String[] args) {

		int x = 5;
		int y = x;
		System.out.println("value of x: " +x);
		System.out.println("value of y: " +y);
		
		y=10;

		System.out.println("**********************");
		System.out.println("value of x: " +x);
		System.out.println("value of y: " +y);
		
		Student st2 = new Student();
		Student st3 = st2;
        st2.age=26;
 
		
		System.out.println("**********************");
		System.out.println("st2 age: " +st2);
		System.out.println("st3 age: " +st3);
		
	}

}
