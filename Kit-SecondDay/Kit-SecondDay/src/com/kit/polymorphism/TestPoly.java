package com.kit.polymorphism;

public class TestPoly {

	public static void main(String[] args) {

		Student stu1 = new Student();
		Student stu2 = new FreshStudent();
		MasterStudent mstu1 = new MasterStudent();
		FreshStudent frstu1 = new FreshStudent();
		stu1.foo();
		stu2.foo();
		
		((FreshStudent)stu2).getClassName();
		
		goo(frstu1, 3);
		goo(mstu1, 3);
		
		
		
	}

	public static void  goo(Student s, double gpa){
		
		if(s instanceof MasterStudent){
			gpa = gpa*0.2;
			
		}else if (s instanceof FreshStudent){
			gpa = gpa*0.4;
		}
		
	}
	
}
