package com.javaprogram.collections;
import java.util.*;

public class TreeMapMethods {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map=new TreeMap<>();
		map.put('U', 2);
		map.put('A', 7);
		map.put('S', 6);
		map.put('R', 8);
		map.put('J', 20);
		map.put('M', 24);
		System.out.println(map);
		System.out.println(map.higherKey('T'));
		System.out.println(map.lowerKey('A'));
		System.out.println(map.ceilingKey('S'));
		System.out.println(map.floorKey('H'));
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		System.out.println(map.subMap('T','Z'));
		System.out.println(map.subMap('A',true,'S',true));
		

	}

}
