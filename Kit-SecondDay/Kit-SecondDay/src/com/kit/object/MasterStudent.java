package com.kit.object;

public class MasterStudent extends Student {

	private String className;
	
	public MasterStudent() {
		// TODO Auto-generated constructor stub
	}

	public MasterStudent(String firstname, String lastname, int age, String className) {
		super(firstname, lastname, age);
		this.className = className;
	}



	public String getClassName() {
		System.out.println("Class name metodu...");
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
