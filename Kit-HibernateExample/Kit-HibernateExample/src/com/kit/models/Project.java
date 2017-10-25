package com.kit.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String proj_name;
	private double budget;
	
	@ManyToMany
	private List<Employee> employees = new ArrayList<>();
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String proj_name, double budget) {
		super();
		this.proj_name = proj_name;
		this.budget = budget;
	}




	public String getProj_name() {
		return proj_name;
	}

	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
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
		return "Project [id=" + id + ", proj_name=" + proj_name + ", budget=" + budget + "]";
	}
	
	
	
	
	
}
