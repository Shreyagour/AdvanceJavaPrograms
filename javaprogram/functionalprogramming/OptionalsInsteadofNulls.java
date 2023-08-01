package com.javaprogram.functionalprogramming;
import java.util.*;

public class OptionalsInsteadofNulls {

	public static void main(String[] args) {
		List<Integer> li=List.of(45,21,11,8,90);
		usingoptional(li);
		

	}
	
	public static void usingoptional(List<Integer> li) {
		System.out.println(li.stream().filter(e->e%2==0)
				.max((n1,n2)->Integer.compare(n1, n2)));
		
		System.out.println(li.stream().filter(e->e%2==0)
				.max((n1,n2)->Integer.compare(n1, n2)).get());
		
		System.out.println(List.of(23).stream().filter(e->e%2==0)
				.max((n1,n2)->Integer.compare(n1, n2)).orElse(0));
	}

}
