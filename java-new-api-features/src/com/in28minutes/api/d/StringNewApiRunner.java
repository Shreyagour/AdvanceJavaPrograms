package com.in28minutes.api.d;
class NewClass{
	String str=null;
}

public class StringNewApiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st=" LIVE LIFE HAPPILY ";
		System.out.println(st.isBlank());
		System.out.println(st.strip().replace(" ", "@"));
		System.out.println(st.stripLeading().replace(" ", "@"));
		System.out.println(st.stripTrailing().replace(" ", "@"));
		"My\nName\nShreya\n".lines().forEach(System.out::println);
		
		NewClass n= new NewClass();
		String str=null;
		System.out.println(n.str.isBlank());// helps to know which string
	//is null
		

	}

}
