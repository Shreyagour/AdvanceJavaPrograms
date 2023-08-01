package com.javaprogram.nested;
public class NestedClassesRunner {
	int i=9;
  class InnerClass{
		public void add() {
			i=i+18;
		}
	}
	static class StaticNestedClass{
		public void add() {
			//i=i+18;// can't access i;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClass st= new StaticNestedClass();
		NestedClassesRunner ns= new NestedClassesRunner();
		InnerClass ob=ns.new InnerClass();

	}

}
