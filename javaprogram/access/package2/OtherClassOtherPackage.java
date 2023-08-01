package com.javaprogram.access.package2;

import com.javaprogram.access.package1.ExampleClass;

public class OtherClassOtherPackage extends ExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//only public is accessible outside package
		ExampleClass es=new ExampleClass();
		es.publicmethod();
		OtherClassOtherPackage os=new OtherClassOtherPackage();
//		es.privatemethod();
		os.protectedmethod();
//		os.defaultmethod();

	}

}
class OtherClassOtherPackageExtendsClass extends ExampleClass{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//only public accessible
		ExampleClass es=new ExampleClass();
		es.publicmethod();
		//es.privatemethod();
//		es.protectedmethod();
		//es.defaultmethod();
		OtherClassOtherPackageExtendsClass ops=new OtherClassOtherPackageExtendsClass();
		ops.protectedmethod();
		//The protected access modifier allows access to the 
		//protected member within subclasses, but it must be accessed 
		//using the instance of the subclass itself 
		//(in this case, OtherClassOtherPackageExtendsClass).

	}
}
