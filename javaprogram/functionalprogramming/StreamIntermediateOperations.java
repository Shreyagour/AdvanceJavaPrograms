package com.javaprogram.functionalprogramming;
import java.util.*;

public class StreamIntermediateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=List.of(1,23,4,56,11,32,99,87,4,1,11);
//		sortnums(li);
//		distinctnums(li);
		distinctnumssquare(li);
		

	}
	public static void sortnums(List<Integer> li) {
		li.stream().sorted()
		.forEach(element->System.out.println(element));
	}
	public static void distinctnums(List<Integer> li) {
		li.stream().distinct().sorted()
		.forEach(element->System.out.println(element));
	}
	public static void distinctnumssquare(List<Integer> li) {
		li.stream().distinct().sorted().map(e->e*e)
		.forEach(element->System.out.println(element));
	}

}
