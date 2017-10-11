package com.sdrttnclskn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionString {
	public static void main(String[] args) {
		
		List<String> strlist = new ArrayList<>();
		strlist.add("ali");
		strlist.add("hasan");
		strlist.add("hüseyin");
		strlist.add("ömer");
		
		for (int i = 0; i < strlist.size(); i++) {
			
			System.out.println(strlist.get(i));
			
		}
		System.out.println("**************************");
		
		for (String favoriler : strlist) {
			
			System.out.println(favoriler);
		}
		
		System.out.println("**************************");

		Iterator<String> favoriler = strlist.iterator();
		while (favoriler.hasNext()) {
			String favoriler2 =  favoriler.next();
			System.out.println(favoriler2);
			
		}
	}

}
