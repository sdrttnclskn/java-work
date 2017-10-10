package com.sdrttnclskn.interfaces;

public class TestInterfaces implements ICalculate,ICalculate2{


	@Override
	public double sum(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divide(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// interfaces abstract metod
		System.out.println(new TestInterfaces().divide(34,9));
		System.out.println(new TestInterfaces().sum(34, 29));
		// interface default metod
		System.out.println(new TestInterfaces().substract(45, 344));
		
		// interfaces static metod
		System.out.println(ICalculate.multy(23, 4242)); 

	}

	@Override
	public double hello() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
