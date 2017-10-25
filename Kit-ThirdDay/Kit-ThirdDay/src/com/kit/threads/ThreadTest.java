package com.kit.threads;

public class ThreadTest {

	public static void main(String[] args) {
		Data data = new Data();
		data.d = 1000;
		
		Producer p = new Producer(data);
		Consumer c = new Consumer(data);
		Thread t = new Thread(c);
		
		p.start();
		t.start();
		
		
		
		
	}

}
