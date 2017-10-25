package com.kit.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String lastname;
	
	@ManyToOne
	private Department emp_dept;
	
	@ManyToMany(mappedBy="employees")
	private List<Project> emp_proj = new ArrayList<>();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String lastname, Department emp_dept) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.emp_dept = emp_dept;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getId() {
		return id;
	}

	public Department getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(Department emp_dept) {
		this.emp_dept = emp_dept;
	}

	public List<Project> getEmp_proj() {
		return emp_proj;
	}

	public void setEmp_proj(List<Project> emp_proj) {
		this.emp_proj = emp_proj;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + "]";
	}
	
	
	
	
	
	
}
