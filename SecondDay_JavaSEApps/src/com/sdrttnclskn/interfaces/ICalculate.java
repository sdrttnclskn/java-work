package com.sdrttnclskn.interfaces;

public interface ICalculate {
	
	public double sum(double x, double y);
	
	public double divide(double x, double y);
	
	default public double  substract(double x, double y) {
		return x-y;
	}

	 public static double  multy(double x, double y) {
		return x*y;
	}


}
