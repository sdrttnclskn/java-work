package com.kit.enumeration;

public class Student1 {

	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private Student studentType;
	private double salary;
	
	
	public Student1(String firstname, String lastname, Student studentType) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.studentType = studentType;
	}


	public void calcGrant(){
		salary += studentType.getGrant();
	}
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
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

	

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Student getStudentType() {
		return studentType;
	}


	public void setStudentType(Student studentType) {
		this.studentType = studentType;
	}


	@Override
	public String toString() {
		return "Student1 [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", studentType=" + studentType + "]";
	}
	
	
	
	
	
}
