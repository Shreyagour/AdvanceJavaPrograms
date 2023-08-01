package com.javaprogram.concurrency;
//import java.util.*;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map <Character,LongAdder> mp=new Hashtable<>();
		ConcurrentMap <Character,LongAdder> mp=new ConcurrentHashMap<>();
		String st="ABCD ABCD ABCD";
		for(Character c:st.toCharArray()) {
//			LongAdder l= mp.get(c);
//			if(l==null) {
//				l=new LongAdder();
//			}
//			l.increment();
//			mp.put(c, l);
			mp.computeIfAbsent(c, ch->new LongAdder()).increment();
			
		}
		System.out.println(mp);

	}

}





