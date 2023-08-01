package com.javaprogram.collections;
import java.util.*;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words= List.of("A","B","C","F");
		ArrayList<String> a=new ArrayList<String>(words);
		a.add("G");
		a.add(3,"D");
//		System.out.println(a);
//		System.out.println(a.contains("Y"));
		a.remove("A");
//		System.out.println(a);
		a.set(0, "S");
		System.out.println(a);
		
		LinkedList<String> b=new LinkedList<String>(words);
		b.add("kyy");
		b.add(3,"Stt");
		System.out.println(b);
		
		Vector <String> c=new Vector<String>(words);
		c.add("yyyyyy");
		c.add(3,"mmmmmmmm");
		System.out.println(c);
		
		List<String> li=new ArrayList<>();
		li.addAll(a);
		li.addAll(b);
		li.addAll(c);
		System.out.println(li);
		
		Iterator liIterator=li.iterator();
		while(liIterator.hasNext()) {
			System.out.print(liIterator.next()+"#");
		}
		
		
		
		
		

	}

}
