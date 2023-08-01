package com.javaprogram.threads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ManyTasks implements Callable<String>{
	private String name;
	ManyTasks(String name){
		this.name=name;
	}

	@Override
	public String call() throws Exception {
		return " Hello "+name;
	}
	
}

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es= Executors.newFixedThreadPool(3);
		List<ManyTasks> li=List.of((new ManyTasks("Shreya")),(new ManyTasks("Adya")),(new ManyTasks("Shreshtha")));
		List<Future<String>> returnedList = es.invokeAll(li);
		
		for(Future<String> res: returnedList) {
			System.out.println(res.get());
		}
		es.shutdown();
		

	}

}
