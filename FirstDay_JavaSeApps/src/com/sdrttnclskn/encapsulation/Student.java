package com.sdrttnclskn.encapsulation;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, int age) {
		setFirstName(firstName);
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		char[] names = firstName.toCharArray();
		
		//1.yontem
		for (int i = 0; i < names.length; i++) {
			
			if (Character.isDigit(names[i])) {
		}
	}
		//2.yontem
		String regex = "[A-Za-z]";
		if (firstName.matches(regex)) {
			this.firstName = firstName;
		} else {
 
			System.err.println("invald name");
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <=100) {
			this.age = age;
		} else {
			System.err.println("gecersiz deðer");
		}
	}

	public int getId() {
		return id;
	}
	
	

}
