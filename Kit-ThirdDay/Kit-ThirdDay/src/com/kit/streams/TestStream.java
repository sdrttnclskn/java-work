package com.kit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("Messi","Ronaldo","Arda","Sarbi");
		
		Stream<String> st = ls.stream();
		
//		st.forEach(a -> System.out.println(a));
//		st.forEach(System.out::println);
		
//		Predicate<String> pred = new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				boolean result = t.length() >5;
//				return result;
//			}
//		};
//		
		/*
		 *  Ctrl + 1 : convert to lambda exp.
		 */
//		Predicate<String> pred = t -> t.length() >5;

		ls.stream().filter(t -> t.length() >3).limit(2).forEach(System.out::println);
		
		
	}

}
