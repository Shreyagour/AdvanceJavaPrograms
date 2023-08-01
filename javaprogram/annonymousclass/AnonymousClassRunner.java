package com.javaprogram.annonymousclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class lengthComparator implements Comparator<String>{
//
//	@Override
//	public int compare(String o1, String o2) {
//		return Integer.compare(o1.length(), o2.length());
//	}
//	
//}

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String>li=new ArrayList<>(List.of("Apple","Bat","Housing","Photosynthesis"));
//		Collections.sort(li,new lengthComparator());
		//Instead of this use annonymous class
//		Collections.sort(li,new Comparator<String>(){
//			public int compare(String o1, String o2) {
//				return Integer.compare(o1.length(), o2.length());
//			}
//		});
		//or extract in a varibale
		Comparator<String> lengthComparator = new Comparator<String>(){
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		Collections.sort(li,lengthComparator);
		
		System.out.println(li);

	}

}
