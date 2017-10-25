package com.kit.parallelstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;

public class ParallelStreamTest {

	public static int f(int n){
		
		for (int i = 1; i < 10000; i++) {
			n = (n-i)%i;
			if(n==0)
				n=10;
		}
		return n;
	}
	
	
	public static void main(String[] args) {

		Random rnd = new Random();
		List<Integer> data = new ArrayList<>();
		
		for (int i = 0; i < 1000000; i++) {
			data.add(rnd.nextInt());
		}
		System.out.println("Starting...");

		int result=0;
//		for (Integer i : data) {
//			result += f(i);
//		}
//		System.out.println(result);
		
		
//		data.stream().map(i -> f(i)).reduce((t,u) -> t+u).get();
//		result = data.stream().map(i -> f(i)).reduce(Integer::sum).get();
		result = data.parallelStream().map(t -> f(t)).reduce(Integer::sum).get();

		System.out.println(result);
	
	}

}
