package com.javaprogram.functionalprogramming;

import java.util.List;

public class MethodReferences {
	public static void print(Integer num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
	List.of("ant","mentor","pants").stream().map(n->n.length())
	.forEach(element->System.out.println(element));
	
	List.of("ant","mentor","pants").stream().map(String::length)
	.forEach(System.out::println);
	
	//using method references
	List.of("ant","mentor","pants").stream().map(String::length)
	.forEach(MethodReferences::print);
	
	System.out.println(List.of(12,23,45,22,36).stream().filter(e->e%2==0)
			.max((n1,n2)->Integer.compare(n1, n2)).get());
	
	//using method references for custom logic in function
	System.out.println(List.of(12,23,45,22,36).stream()
			.filter(MethodReferences::isEven)
			.max(Integer::compare).get());
	}
	public static boolean isEven(int n) {
		return n%2==0;
	}

}
