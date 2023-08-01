package com.javaprogram.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	private int number;

	Task(int number){
		this.number=number;
	}
	
	public void run() {
		for(int n=number*100;n<=number*100+99;n++) {
			System.out.println(n);
		}
	}	
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ExecutorService es=Executors.newSingleThreadExecutor();
//		es.execute(new Task1());
		//only after task1 has finished execution task2 will start
//		es.execute(new Thread(new Task2()));
//		System.out.println("Task 3 started");
//		for(int i=300;i<=399;i++) {
//			System.out.println(i);
//	  }
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(new Task(1));
		es.execute(new Task(2));
		es.execute(new Task(3));
		es.execute(new Task(4));
		es.execute(new Task(5));
		es.execute(new Task(6));
		
		es.shutdown();
		

	}

}
