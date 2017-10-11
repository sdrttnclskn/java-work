package com.sdrttnclskn.threads;

public class ThreadTest {

	public static void main(String[] args) {

		Data data = new Data();
		data.d = 100;
		Producer p = new Producer(data);
		Consumer c = new Consumer(data);
		Thread t = new Thread(c);
		
		p.start();
		t.start();
	}

}
