package com.in28minutes.api.h;

public class RecordsRunner {
	record Person(String name,String country) {
//		static int n=0; allowed
//		int y=90; not allowed
		Person{
			if(name==null)
				throw new IllegalArgumentException("no name");
		}
		//custom implemnation of method
		public String country() {
			return "mycountry"+country;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Shreya","India");
		Person p2=new Person("Adam","Japan");
		System.out.println(p1.equals(p2));
		System.out.println(p1.country);
		System.out.println(p1.country());
		

	}

}
