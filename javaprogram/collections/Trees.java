package com.javaprogram.collections;
import java.util.*;

public class Trees {

	public static void main(String[] args) {
		Map<String,Integer> map=Map.of("A",3,"B",67,"C",56);
		System.out.println(map.get("A"));
		System.out.println(map.get("G"));
		System.out.println(map.size());
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue(6));
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		HashMap<String,Integer> hashmap=new HashMap<>(map);
		hashmap.put("S", 7);
		hashmap.put("Y", 61);
		hashmap.put("W", 90);
		hashmap.put("Q", 107);
		System.out.println(hashmap);
		
		LinkedHashMap<String,Integer> linkedhashmap=new LinkedHashMap<>(map);
		linkedhashmap.put("S", 7);
		linkedhashmap.put("Y", 61);
		linkedhashmap.put("W", 90);
		linkedhashmap.put("Q", 107);
		System.out.println(linkedhashmap);
		
		TreeMap<String,Integer> treemap=new TreeMap<>(map);
		treemap.put("S", 7);
	    treemap.put("Y", 61);
		treemap.put("W", 90);
		treemap.put("Q", 107);
		System.out.println(treemap);
		
		
		

	}

}
