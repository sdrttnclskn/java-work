package com.kit.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {

	public static void main(String[] args) {
		
		double result1 = calculate(new Calculatable() {
			
			@Override
			public double multiply(double x, double y) {
				
				return x*y;
			}
		}, 10, 5);
		
		// Lambda Exp.
		double result2 = calculate((x,y) -> x*y, 10, 5);
		
		System.out.println("Result 1 : " + result1);
		System.out.println("Result 2 : " + result2);
		
		String[] dizi = {"Messi","Ronaldo","Arda","Sarbi"};
		List<String> dizi2 = new ArrayList<>(Arrays.asList(dizi));
		
		for (String string : dizi2) {
			System.out.println(string);
		}
		System.out.println("------------");
		dizi2.forEach(System.out::println);

	}
	
	public static double calculate(Calculatable calc, double a, double b){
	
	 	return calc.multiply(a, b);
	}
	
	
	
}
