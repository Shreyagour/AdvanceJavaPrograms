package com.javaprogram.collections;
import java.util.*;

class lengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
	
}

public class QueueMethods {

	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<>(new lengthComparator());
		q.addAll(List.of("A","BBB","CC","ZZZ","DDDD","WW"));
		q.offer("EEEEE");
		q.offer("A");
		//automatically sorts
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		
	}

}
