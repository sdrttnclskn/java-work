package com.kit.threads;

public class Consumer implements Runnable {

	Data data;

	public Consumer(Data data) {
		this.data = data;	
	}

	@Override
	public void run() {
		
		synchronized (data) {
			for (int i = 0; i < 10; i++) {
				data.d--;
				System.out.println("Consumer : " + data.d);
			}
		}
		
	}

}
