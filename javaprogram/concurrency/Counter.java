package com.javaprogram.concurrency;


public class Counter {
  int x=0;
 synchronized public void increment() {
	  x++;
  }
public int getI() {
	return x;
}

	

}
