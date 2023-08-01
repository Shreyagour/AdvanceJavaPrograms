package com.javaprogram.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTask implements Callable<String>{
	private String name;
	MyTask(String name){
		this.name=name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		return " Hello "+name;
	}
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(1);
		Future<String> myString = es.submit(new MyTask("Shreya"));
		String s= myString.get();
		System.out.println("CallableTask Executed");
		System.out.println(s);
		System.out.println("Main Completed");
		es.shutdown();
		
		
		
		
		

	}

}
