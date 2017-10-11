package com.sdrttnclskn.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		BufferedReader bf = 
				new BufferedReader(new InputStreamReader(PeopleStreamClass.class.getResourceAsStream("people.txt")));
		Stream<String> stream = bf.lines();
		stream.map(new Function<String, People>() {

			@Override
			public People apply(String t) {
			
			String[] s =t.split(" ");
			People p= new People(s[0], Integer.valueOf(s[1]));
				peoples.add(p);				
				return p;
			}
		}).forEach(System.out::println);
		
		IntSummaryStatistics ageSummary = peoples.stream().collect(Collectors.summarizingInt(value -> value.getAge()));
		System.out.println(ageSummary);
	}

}
