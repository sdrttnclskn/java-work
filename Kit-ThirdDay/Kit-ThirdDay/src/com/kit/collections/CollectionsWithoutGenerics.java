package com.kit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsWithoutGenerics {

	public static void main(String[] args) {

//		List list = new ArrayList();
//		
//		list.add(123);
//		list.add(456);
//		list.add(789);
//		list.add("Bilginç");
//		
//		Iterator elements = list.iterator();
//		while (elements.hasNext()) {
//			int object = (int)elements.next();
//			System.out.println("Numbers : "+ object);
//		}
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(255);
		numbers.add(852);
		numbers.add(413);

		Iterator<Integer> iter =  numbers.iterator();
		while (iter.hasNext()) {
			Integer integer = (Integer) iter.next();
			System.out.println("Numbers : " + integer);
		}
		
		
		
		
	}

}
