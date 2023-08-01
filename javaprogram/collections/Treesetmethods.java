package com.javaprogram.collections;
import java.util.*;

public class Treesetmethods {

	public static void main(String[] args) {
	TreeSet<Integer> numbers=new TreeSet<>(Set.of(12,98,67,43,70));
	System.out.println(numbers.lower(67));
	System.out.println(numbers.higher(67));
	System.out.println(numbers.floor(43));
	System.out.println(numbers.ceiling(80));
	System.out.println(numbers.subSet(60, 98));
	System.out.println(numbers.subSet(60, true, 98, true));

	}

}
