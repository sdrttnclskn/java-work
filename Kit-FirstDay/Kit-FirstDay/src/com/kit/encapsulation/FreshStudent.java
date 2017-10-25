package com.kit.encapsulation;

public class FreshStudent extends Student {

	private String className;
	
	public FreshStudent() {
		// TODO Auto-generated constructor stub
	}

	public FreshStudent(String firstname, String lastname, int age, String className) {
		super(firstname, lastname, age);
		this.className = className;
	}



	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void foo() {
		System.out.println("FreshStudent sýnýfý içerisindeyiz...");
	}
	
}
