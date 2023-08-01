package com.javaprogram.functionalprogramming;
import java.util.*;
import java.util.stream.IntStream;

public class IntermediateOps {

	public static void main(String[] args) {
//		numssquare();
		List<String> li=List.of("APPLE","BALL","CAT");
//		lowercasewords(li);
		lengthwords(li);
	

	}
	public static void numssquare() {
		IntStream.range(1, 11).map(e->e*e)
		.forEach(element->System.out.println(element));
	}
	public static void lowercasewords(List<String> li) {
		li.stream().map(e->e.toLowerCase())
		.forEach(element->System.out.println(element));
	}
	public static void lengthwords(List<String> li) {
		li.stream().map(e->e.length())
		.forEach(element->System.out.println(element));
	}

}
