package com.kit.exceptions;

public class Calculator {

	public double divide(double d1, double d2) throws DivideByZeroOfKitException{
		
		if(d2==0){
			throw new DivideByZeroOfKitException();
		}
		
		System.out.println("Bölüm sonuç : " + d1/d2);
		
		return d1/d2;
		
	}
	
	
}
