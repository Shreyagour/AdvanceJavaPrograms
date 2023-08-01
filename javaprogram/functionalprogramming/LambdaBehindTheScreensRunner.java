package com.javaprogram.functionalprogramming;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t%2==0;
	}
	
}

class OtherforEach implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}
class OtherMap implements Function<Integer,Integer>{

	@Override
	public Integer apply(Integer t) {
		return t*t;
	}
	
}

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {
		//  Stream<T> filter(Predicate<? super T> predicate);
		List.of(23,46,78,99).stream()
		.filter(n->n%2==0).forEach(e->System.out.println(e));
		//predicate interface has a default method without 
		//implementation boolean test
		
		List.of(23,46,78,99).stream()
		.filter(new EvenNumberPredicate()).forEach(e->System.out.println(e));
		
		
		// void forEach(Consumer<? super T> action);
		// Consumer has a method accept imeplement that
		
		List.of(23,46,78,99).stream()
		.filter(new EvenNumberPredicate()).forEach(new OtherforEach());
		
		List.of(23,46,78,99).stream()
		.filter(new EvenNumberPredicate()).map(n->n*n).forEach(new OtherforEach());
		
		List.of(23,46,78,99).stream()
		.filter(new EvenNumberPredicate()).map(new OtherMap()).forEach(new OtherforEach());
		//  <R> Stream<R> map(Function<? super T, ? extends R> mapper);
	}

}
