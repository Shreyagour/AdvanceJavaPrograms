package com.javaprogram.functionalprogramming;
import java.util.*;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
//		List<String> list=List.of("Aret","Bob","Cat","Dog");
//		genericwithFp(list);
//		List<Integer> list1=List.of(1,2,3,4,5);
//		genericwithFp(list1);
		
		
		List<String> list2=List.of("Aret","Bob","Cat","Dog");
//		withFp(list2);
		FilteringwithFp(list2);
		
		

	}
	public static <T> void genericwithFp(List<T> li) {
		li.stream().forEach(element->System.out.println(element));
	}
	public static void withFp(List<String> li) {
		li.stream().forEach(element->System.out.println(element));
	}
	public static void FilteringwithFp(List<String> li) {
		li.stream()
		.filter(element->element.endsWith("at"))
		.forEach(element->System.out.println(element));
	}
	
	

}
