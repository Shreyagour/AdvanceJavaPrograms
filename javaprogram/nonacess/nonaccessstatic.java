package com.javaprogram.nonacess;
class Customer{
	private String name;
	private static  int count;
	public Customer(String name){
		this.name=name;
		count++;
	}

	static public int numberofcounts() {
		return count;
	}
	
}

public class nonaccessstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("Jaya");
//		System.out.println(c1.numberofcounts());
		System.out.println(Customer.numberofcounts());
		Customer c2=new Customer("Shreya");
//		System.out.println(c1.numberofcounts());
//		System.out.println(c2.numberofcounts());
		System.out.println(Customer.numberofcounts());

	}

}
