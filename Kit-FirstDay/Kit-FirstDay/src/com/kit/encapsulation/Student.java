package com.kit.encapsulation;

public class Student extends Object {

	private int id;
	private String firstname;
	private String lastname;
	private int age;

	
	public Student() {

	}

	public Student(String firstname, String lastname, int age) {
		super();
		setFirstname(firstname);
		this.lastname = lastname;
		setAge(age);
	}

	public Student(String firstname, String lastname) {
		setFirstname(firstname);
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		
//		char[] nameArray = firstname.toCharArray();
//		
//		boolean flag = true;
//		
//		for (int i = 0; i < nameArray.length; i++) {
//			if(Character.isDigit(nameArray[i])){
//				flag = false;
//				break;
//			}
//		}
//		
//		if(flag){
//			this.firstname = firstname;
//		}else {
//			System.err.println("Name is not valid...");
//		}
		
		String regex = "[A-Za-z]";
		
		if(firstname.matches(regex)){
			this.firstname = firstname;
		}else {
			System.err.println("Name is not valid...");
		}
		
		
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age <= 100){
			this.age = age;
		}else {
			System.err.println("Invalid age enterance...");
		}
	}

	public int getId() {
		return id;
	}
	
	
	public void foo(){
		System.out.println("Student sýnýfý içerisindeyiz...");
	}
	
	
	
	
	
	
	
	
}
