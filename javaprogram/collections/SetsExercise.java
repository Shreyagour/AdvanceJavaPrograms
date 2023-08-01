package com.javaprogram.collections;
import java.util.*;

public class SetsExercise {

	public static void main(String[] args) {
	List<Character> c=List.of('A','Z','A','B','Z','F');
	System.out.println(c);
	//unique and sorted
	Set<Character> s1=new TreeSet<>(c);
	System.out.println(s1);
	Set<Character> s2=new LinkedHashSet<>(c);
	System.out.println(s2);

	}

}
