package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>li=new ArrayList<>();
		li.add("Shreya");
		li.add("Jaya");
		li.add("France");
		li.add("India");
		List<String>copyli=List.copyOf(li);
		docopyli(copyli);
		Map<String,Integer> map=new TreeMap<>();
		map.put("India", 1);
		map.put("France", 2);
		map.put("Uk", 3);
		map.put("Greece", 4);
		Map<String,Integer> mapcopy=Map.copyOf(map);
		docopymap(mapcopy);
		
		
	}

	private static void docopymap(Map<String, Integer> mapcopy) {
		// TODO Auto-generated method stub
//		mapcopy.put("Spain", 8); not allowed
		System.out.println(mapcopy);
		
	}

	private static void docopyli(List<String> li) {
		// TODO Auto-generated method stub
//		li.add("Uk"); not allowed
		System.out.print(li);
		
		
	}

}
