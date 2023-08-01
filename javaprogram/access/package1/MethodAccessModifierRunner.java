package com.javaprogram.access.package1;

public class MethodAccessModifierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private isn't accessible outside class
		ExampleClass es=new ExampleClass();
		es.publicmethod();
//		es.privatemethod();
		es.protectedmethod();
		es.defaultmethod();

	}

}
class OtherClassSamePackageExtendsClass extends ExampleClass{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//only private isn't accessible
		ExampleClass es=new ExampleClass();
		es.publicmethod();
		//es.privatemethod();
		es.protectedmethod();
		es.defaultmethod();

	}
}

