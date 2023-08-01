package com.javaprogram.imports;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.sort;

//import java.util.Collections;
import static java.util.Collections.sort;

import static java.lang.System.out;

public class ImportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Shreya";//inside java.lang default package
		BigDecimal bd=null;// inside math package it's better to import 
		//specific class
		out.println("Hey");
		sort(new ArrayList<String>());
		int[] arr= {12,34,67,1,3,9};
	    sort(arr);
	    for(int e:arr) {
	    	out.println(e);
	    }
	    
	}

}
