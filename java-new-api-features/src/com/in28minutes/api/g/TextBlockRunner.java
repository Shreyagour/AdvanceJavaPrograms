package com.in28minutes.api.g;

public class TextBlockRunner {

	public static void main(String[] args) {
		String s1="""
				"Line1"
				  Line2
				     "Line3"
				Line4
				""";
		System.out.println(s1);
//		String s2=""" Line1//not allowed
//				  Line2
//				     "Line3"
//				Line4""";//allowed
		String s2="""
				String1:%s
				String2:%s
				
				""".formatted("SomeValue","OtherValue");
		System.out.print(s2);
		
		
		
	}

}
