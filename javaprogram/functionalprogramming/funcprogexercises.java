package com.javaprogram.functionalprogramming;
import java.util.*;

public class funcprogexercises {

	public static void main(String[] args) {
		List<Integer> li=List.of(1,2,3,4,5,6);
		evenNums(li);
		sumNums(li);
		sumNumsOdd(li);

	}
	public static void evenNums(List<Integer> li) {
		li.stream().filter(element->element%2==0)
		.forEach(element->System.out.println("Even Number- "+element));
	}
	public static void sumNums(List<Integer> li) {
		int sum=li.stream().reduce(0,(number1,number2)->number1+number2);
		System.out.println(sum);
		// 0 specifies starting position
		//number1 and number2 takes pair of numbers to reduce
	}
	public static void sumNumsOdd(List<Integer> li) {
		int sum=li.stream()
		.filter(element->element%2==1)
		.reduce(0,(number1,number2)->number1+number2);
		System.out.println(sum);
	}

}
