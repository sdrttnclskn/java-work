package com.kit.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String dept_name;
	
	@OneToMany(mappedBy="emp_dept")
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	

	public Department(String dept_name) {
		super();
		this.dept_name = dept_name;
	}



	public String getDept_name() {
		return dept_name;
	}


	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}


	public int getId() {
		return id;
	}

	

	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}



	@Override
	public String toString() {
		return "Department [id=" + id + ", dept_name=" + dept_name + "]";
	}
	
	
	
	
}
