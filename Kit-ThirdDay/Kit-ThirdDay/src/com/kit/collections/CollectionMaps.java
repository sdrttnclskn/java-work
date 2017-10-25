package com.kit.collections;

import java.util.Map;
import java.util.TreeMap;

public class CollectionMaps {

	public static void main(String[] args) {
		
		Map<String, String> partList = new TreeMap<>();
		
		partList.put("s001", "Washing Machine");
		partList.put("s002", "Game Console");
		partList.put("s003", "Television");
		
		for (String part : partList.keySet()) {
			System.out.println("Part : " + part + " *** " + partList.get(part));
			
		}
		
		
		
	}
	
	
}
