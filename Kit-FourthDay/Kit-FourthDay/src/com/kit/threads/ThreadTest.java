package com.kit.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

	public static void main(String[] args) {
		Data data = new Data();
		data.d = 100;
		
		Producer p = new Producer(data);
		Consumer c = new Consumer(data);
		Thread t = new Thread(c);
		
		// Thread in sýrasýný garanti EDER! 
		ExecutorService executer = Executors.newFixedThreadPool(1);
		executer.execute(p);
		executer.execute(t);
		executer.shutdown();
		
		
		// Thread in sýrasýný garanti etmiyor.
//		p.setPriority(Thread.MAX_PRIORITY);
//		t.setPriority(Thread.MIN_PRIORITY);
//		
//		t.start();
//		p.start();
		
		
		
		
		
	}

}
