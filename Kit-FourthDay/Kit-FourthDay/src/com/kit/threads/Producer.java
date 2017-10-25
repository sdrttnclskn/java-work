package com.kit.threads;

public class Producer extends Thread {
	Data data;

	public Producer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		synchronized (data) {
			
			for (int i = 0; i < 10; i++) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				data.d++;
				System.out.println("Producer : " + data.d);
			}

		}
		
	}

}
