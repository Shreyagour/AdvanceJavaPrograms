package com.javaprogram.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new CopyOnWriteArrayList<>();
		//3 threads only are adding
		li.add("Ant");
		li.add("SAnt");
		li.add("PAnt");
		//10000 threads are reading
		for(String e:li) {
			System.out.println(e);
		}
		

	}

}
