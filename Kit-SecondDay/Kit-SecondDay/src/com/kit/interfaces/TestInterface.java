package com.kit.interfaces;

import javafx.scene.control.SplitPane.Divider;

public class TestInterface implements ICalculate, ICalculate2 {

	@Override
	public double sum(double x, double y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public double divide(double x, double y) {
		// TODO Auto-generated method stub
		return x/y;
	}
	
	public static void main(String[] args) {
		
		// interface abstract method
		System.out.println(new TestInterface().divide(20, 4));
		System.out.println(new TestInterface().sum(20, 10));
		
		// interface default method
		System.out.println(new TestInterface().substract(20, 5));
		
		// interface static method
		System.out.println(ICalculate.multiply(25, 25));
		
	}

	@Override
	public double foo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double substract(double x, double y) {
		// TODO Auto-generated method stub
		return ICalculate2.super.substract(x, y);
	}


	
	
}
