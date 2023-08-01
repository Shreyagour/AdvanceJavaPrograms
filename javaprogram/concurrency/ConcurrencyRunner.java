package com.javaprogram.concurrency;
public class ConcurrencyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Counter c= new Counter();
//		c.increment();
//		c.increment();
//		c.increment();
//		c.increment();
//		System.out.println(c.getI());
		BiCounter bc=new BiCounter();
		bc.incrementI();	
		bc.incrementI();	
		bc.incrementJ();	
		System.out.println(bc.getI());
		System.out.println(bc.getJ());
		

	}

}
