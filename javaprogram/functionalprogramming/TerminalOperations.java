package com.javaprogram.functionalprogramming;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=List.of(1,23,45,78,99);
		maxvalue(li);
//		minvalue(li);
		oddvalues(li);
		evenvalues(li);
		squarednums();

	}
	public static void maxvalue(List<Integer> li) {
	  System.out.println(li.stream().max((n1,n2)->Integer.compare(n1, n2)));
	  //above statement prints optional 99 in case 
	  //list is empty it don't want to return null
	  //that's why optional was introduced in java
	  System.out.println(li.stream().max((n1,n2)->Integer.compare(n1, n2)).get());
	}
	
	public static void minvalue(List<Integer> li) {
		  System.out.println(li.stream().min((n1,n2)->Integer.compare(n1, n2)).get());
		}
	public static void oddvalues(List<Integer> li) {
		  System.out.println(li.stream()
				  .filter(e->e%2==1)
				  .collect(Collectors.toList())
				  );
		}
	public static void evenvalues(List<Integer> li) {
		  System.out.println(li.stream()
				  .filter(e->e%2==0)
				  .collect(Collectors.toList())
				  );
		}
	
	public static void squarednums() {
		System.out.println(IntStream.range(1, 11).map(e->e*e).boxed().collect(Collectors.toList()));
	}


}
