package com.kit.object;

public class Student implements Cloneable{

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

	
	
	public Student(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	
	
	public Student(int id, String firstname, String lastname, int age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
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
		
//		String regex = "[A-Za-z]";
//		
//		if(firstname.matches(regex)){
			this.firstname = firstname;
//		}else {
//			System.err.println("Name is not valid...");
//		}
		
		
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

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id != other.id)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
}
