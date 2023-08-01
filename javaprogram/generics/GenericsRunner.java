package com.javaprogram.generics;
import java.util.*;

public class GenericsRunner {
	public static<X> X doublevalue(X value) {
		return value;
	}
	static <X extends List> void duplicateNumbers(X list) {
		list.addAll(list);
	}
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum=0.0;
		for(Number number:numbers) {
			sum+=number.doubleValue();
		}
		return sum;
	}
	static void addValues(List<? super Number> nums) {
		nums.add(1);
		nums.add(1.7);
		nums.add(9l);
	}

	public static void main(String[] args) {
		List li=new ArrayList<Number>();
		addValues(li);
		System.out.println(li);
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1,5.1)));
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));
		MyCustomList<String> list=new MyCustomList<>();
		list.addElement("A");
		list.addElement("F");
		System.out.println(list.get(0));
		System.out.println(list);
		
		MyCustomList<Integer> list1=new MyCustomList<>();
		list1.addElement(Integer.valueOf(12));
		list1.addElement(Integer.valueOf(34));
		System.out.println(list1.get(0));
		System.out.println(list1);
		
		String s="SHREYA";
		System.out.println(doublevalue(s));
		System.out.println(doublevalue(Integer.valueOf(10)));
		ArrayList<String> l=new ArrayList<>(List.of("DEN","BEN","TEN"));
		System.out.println(doublevalue(l));
		
		ArrayList<String> l1=new ArrayList<>(List.of("DEN","BEN","TEN"));
		duplicateNumbers(l1);
		System.out.println(l1);

	}

}
