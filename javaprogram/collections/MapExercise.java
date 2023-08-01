package com.javaprogram.collections;
import java.util.*;

public class MapExercise {

	public static void main(String[] args) {
		String s="This is an awesome occassion. This has never"
				+ " happened before.";
		Map<Character,Integer>map=new HashMap<>();
		char[] chars=s.toCharArray();
		for(char ch:chars) {
			Integer i=map.get(ch);
			if(i==null) {
				map.put(ch, 1);
			}
			else {
				map.put(ch, i+1);
			}
		}
		System.out.println(map);
		
		Map<String,Integer>stringmap=new HashMap<>();
		String[] st=s.split(" ");
		for(String str:st) {
			Integer i=stringmap.get(str);
			if(i==null) {
				stringmap.put(str, 1);
			}
			else {
				stringmap.put(str, i+1);
			}
		}
		System.out.println(stringmap);
		
		
		

	}

}
