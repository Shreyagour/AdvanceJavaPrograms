package com.javaprogram.collections;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		Set<String> s=Set.of("A","B","C");
		System.out.println(s);//doesn't care of order
		
		Set<String>s1=new HashSet<>();// no insertion or sorted order
		s1.add("765432");
		s1.add("76543");
		s1.add("7654");
		s1.add("765");
		s1.add("76");
		s1.add("111111111");
		System.out.println(s1);
		
		Set<String>s2=new LinkedHashSet<>();// no sorted order
		s2.add("765432");
		s2.add("76543");
		s2.add("7654");
		s2.add("765");
		s2.add("76");
		s2.add("111111111");
		System.out.println(s2);
		
		Set<String>s3=new TreeSet<>();// no insertion order
		s3.add("765432");
		s3.add("76543");
		s3.add("7654");
		s3.add("765");
		s3.add("76");
//		s3.add("111111111");
		System.out.println(s3);
		
		
		

	}

}
