package com.in28minutes.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	public static boolean isEven(Integer num) {
		return num%2==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>li=List.of(23,45,12,34,67,89,32);
		Predicate<Integer> evenpredicate = n->n%2==0;
//		li.stream().filter(evenpredicate).forEach(System.out::println);
//		li.stream().filter(evenpredicate.negate()).forEach(System.out::println);
		//using method reference
		li.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);

	}

}
