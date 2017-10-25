package com.kit.lambdas;

@FunctionalInterface
public interface Calculatable {

	double multiply(double x, double y);
//	double multiply2(double x, double y);
	
	default void foo(){
		
	}

	
	static void goo(){
		
	}
}
