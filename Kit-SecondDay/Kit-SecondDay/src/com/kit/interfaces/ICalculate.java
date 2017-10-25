package com.kit.interfaces;

public interface ICalculate {
	
	public static final String string ="Bilginç";
	
	public double sum(double x, double y);
	public double divide(double x, double y);
	
	public default double substract(double x, double y){
		return x-y;
	}
	
	public static double multiply(double x, double y){
		return x*y;
	}
	
	public double foo();
	
}
