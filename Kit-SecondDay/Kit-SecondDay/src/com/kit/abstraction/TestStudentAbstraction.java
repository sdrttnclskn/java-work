package com.kit.abstraction;

public class TestStudentAbstraction extends Student {

	public static void main(String[] args) {
		
		new TestStudentAbstraction().calcGPA();
		
		
		
	}

	@Override
	public void calcGPA() {
		System.out.println("calcGPA() metodu içerisindyim...");
	}
	
}
