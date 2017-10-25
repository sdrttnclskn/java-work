package com.kit.enumeration;

public enum Student {

	UNDERGRADUATE(2500),
	MASTER(3000),
	PHD(4000);
	
	
	private double grant;

	private Student(double grant) {
		this.grant = grant;
	}
	
	public double getGrant() {
		return grant;
	}

	

	
	
	
	
}
