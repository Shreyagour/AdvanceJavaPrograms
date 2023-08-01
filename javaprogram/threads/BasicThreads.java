package com.javaprogram.threads;

class Task1 extends Thread{
	public void run() {
		for(int i=100;i<=199;i++) {
			System.out.println(i);
	  }
//		Thread.yield();
   }
}
class Task2 implements Runnable{

	@Override
	public void run() {
		for(int i=200;i<=299;i++) {
			System.out.println(i);
	  }
		
	}
	
}
public class BasicThreads {

	public static void main(String[] args) throws InterruptedException {
		Task1 t1=new Task1();
		t1.setPriority(10);
		t1.start();
		
		Task2 t2=new Task2();
		Thread myThread2=new Thread(t2);
		myThread2.start();
		
//		t1.sleep(10000);
		t1.join();
		myThread2.join();
		
		
		
		for(int i=300;i<=399;i++) {
			System.out.println(i);
	  }
		

	}

}
