package com.javaprogram.exceptionhandeling;

public class BasicExceptionHandeling {

	public static void main(String[] args) {
		Method1();
		System.out.println("Main executed");

	}
	public static void Method1() {
		Method2();
		System.out.println("Method1 executed");
	}
	public static void Method2() {
		try {
			String s=null;
			System.out.println(s.length());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Method2 executed");
	}

}
