package com.javaprogram.access.package1;

public class ExampleClass {
	public void publicmethod(){}
	private void privatemethod(){}
	protected void protectedmethod(){}
	 void defaultmethod(){}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Everything is accessible in same class
		ExampleClass es=new ExampleClass();
		es.publicmethod();
		es.privatemethod();
		es.protectedmethod();
		es.defaultmethod();

	}

}
