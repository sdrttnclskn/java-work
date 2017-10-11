package com.sdrttnclskn.collections;

import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
	
		// uniqe olmasýný en önemli özleiði
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("three");

		for (String string : set) {
			System.out.println(string);
		}
	
		
	}

}
