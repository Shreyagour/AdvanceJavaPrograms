package com.javaprogram.interfaces;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();
		Animal[] an= {new Dog(),new Cat()};
		for(Animal ob:an) {
			ob.bark();
		}
//		a.bark();
//		Animal b=new Cat();
//		b.bark();

	}

}
