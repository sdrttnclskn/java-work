package com.kit.interfaces;

public interface ICalculate2 {
	
	
	public double foo();
	
	public default double substract(double x, double y){
		return x-y;
	}
	
	
}
