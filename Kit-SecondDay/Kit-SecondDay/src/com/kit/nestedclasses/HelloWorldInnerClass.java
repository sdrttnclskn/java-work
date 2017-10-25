package com.kit.nestedclasses;

public class HelloWorldInnerClass {
	
	// Member inner class
	public abstract class HelloWorld{
		public abstract void greetSomeone(String someone);
	}
	
	
	public void sayHello(){
	
		// Local Class
		class EnglishGreeting extends HelloWorld {

			@Override
			public void greetSomeone(String someone) {
				System.out.println("Hello " + someone);
			}
		}
		
		// Polymorphism
		HelloWorld englishGreeting = new EnglishGreeting();
		
		// Anonymous inner class
		HelloWorld turkishGreeting = new HelloWorld() {
			
			@Override
			public void greetSomeone(String someone) {
				System.out.println("Merhaba " + someone);
			}
		};	
		
		englishGreeting.greetSomeone("Mehmet");
		turkishGreeting.greetSomeone("Burcu");
		
	}
	
	public static void main(String[] args) {
		HelloWorldInnerClass hello = new HelloWorldInnerClass();
		hello.sayHello();
	}
	

	
	
	
	
}
