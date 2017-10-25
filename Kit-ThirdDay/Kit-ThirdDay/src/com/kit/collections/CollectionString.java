package com.kit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionString {

	public static void main(String[] args) {

		List<String> strlist1 = new ArrayList<>();
		
		strlist1.add("Messi");
		strlist1.add("Ronaldo");
		strlist1.add("Arda");
		strlist1.add("Þabri");
		strlist1.add("Zeynep");

//		strlist1.remove(2);
		boolean emptyResult = strlist1.isEmpty();
		System.out.println("Dolumu boþ mu : " + emptyResult);
		
		Collections.sort(strlist1, Collections.reverseOrder());
		
		
		strlist1.subList(0, 1);
		System.out.println("-----------------------");

		for (int i = 0; i < strlist1.size() ; i++) {
			System.out.println("Futbolcu " + (i+1) + ":" + strlist1.get(i));
		}
		
		System.out.println("-----------------------");
		
		for (String futbolcu : strlist1) {
			System.out.println("Futbolcu " + futbolcu);
		}
		
		System.out.println("-----------------------");
		
		Iterator<String> futbolcu = strlist1.iterator();
		while (futbolcu.hasNext()) {
			String futbolcu1 = futbolcu.next();
			System.out.println("Futbolcu : " + futbolcu1);
		}
		
		
		
		
	}

}
