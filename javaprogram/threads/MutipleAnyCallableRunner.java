package com.javaprogram.threads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FastestTasks implements Callable<String>{
	private String name;
	FastestTasks(String name){
		this.name=name;
	}

	@Override
	public String call() throws Exception {
		return " Hello "+name;
	}
	
}

public class MutipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es= Executors.newFixedThreadPool(3);
		List<FastestTasks> li=List.of((new FastestTasks("Shreya")),(new FastestTasks("Adya")),(new FastestTasks("Shreshtha")));
		String returnedString = es.invokeAny(li);
		System.out.println(returnedString);
		es.shutdown();

	}

}
