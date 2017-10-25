package com.kit.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.acl.Permission;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleStreamClass {

	public static void main(String[] args) {

		List<People> peoples = new ArrayList<>();
//		People p = null;
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(PeopleStreamClass.class.getResourceAsStream("people.txt")));
		
		Stream<String> stream = bf.lines();
//		stream.map(new Function<String, People>() {
//
//			@Override
//			public People apply(String t) {
//				
//				String[] s =  t.split(" ");
//				People p = new People(s[0], Integer.valueOf(s[1]));
//				peoples.add(p);
//				
//				return p;
//			}
//		}).forEach(System.out::println);
		
		stream.map( t -> {
				
				String[] s =  t.split(" ");
//				if(s.length == 2){
					People p = new People(s[0],((s.length != 2) ? 0 : Integer.valueOf(s[1])));
					peoples.add(p);
					return p;
//				}else {
////					People p = new People(s[0], 0);
////					peoples.add(p);
//				}
		}).forEach(System.out::println);
		
		
		IntSummaryStatistics ageSummary = peoples.stream().collect(Collectors.summarizingInt(p -> p.getAge()));
		System.out.println(ageSummary);
		
		
		
	}

}
