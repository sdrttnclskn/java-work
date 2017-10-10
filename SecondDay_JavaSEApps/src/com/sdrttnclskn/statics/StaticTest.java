package com.sdrttnclskn.statics;

public class StaticTest {
	
	public static void goo() {
		System.out.println("goo içindeyiz");
		
	}
	
public  void foo() {
	System.out.println("foo içindeyiz");

		
	}
	
  public static void main(String[] args) {
	
	  goo();
	  StaticTest st = new StaticTest();
		st.foo();
	  
}
}
