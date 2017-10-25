package com.kit.exceptions;

public class CalculatorProgram {

	public static void main(String[] args) {

		try {
			new CalculatorProgram().testDivide();
			
	
		} catch (DivideByZeroOfKitException e) {
			System.out.println("Ýkinci sayý 0 ...");
		}
		
		
	}

	public void testDivide() throws DivideByZeroOfKitException{
		Calculator calc = new Calculator();
		calc.divide(4, 2);
	}
}
