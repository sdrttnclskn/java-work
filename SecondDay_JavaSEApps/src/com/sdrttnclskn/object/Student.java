package com.sdrttnclskn.object;

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

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	

}
