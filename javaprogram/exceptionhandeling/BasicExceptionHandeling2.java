package com.javaprogram.exceptionhandeling;

import java.util.Scanner;

public class BasicExceptionHandeling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method2();

	}
	public static void Method2() {
		Scanner sc=new Scanner(System.in);
		try {
//			String s=null;
//			System.out.println(s.length());
			int[]arr= {2,3};
			System.out.println(arr[4]);
		}
		catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Exception Matched-NullPointer");
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Exception Matched-Array");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sc.close();
			System.out.println("Scanner closed");
		}
		
		System.out.println("Method2 executed");
	}

}
