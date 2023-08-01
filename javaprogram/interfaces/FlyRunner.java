package com.javaprogram.interfaces;

public class FlyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] f= {new Aeroplane(),new Bird()};
		for(Flyable ob:f) {
			ob.fly();
		}
		
//		Flyable ff=new Bird();
//		ff.fly();
		

	}

}
