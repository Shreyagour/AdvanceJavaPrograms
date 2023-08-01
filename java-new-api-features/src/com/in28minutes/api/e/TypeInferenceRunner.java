package com.in28minutes.api.e;

import java.util.List;
import java.util.stream.Stream;

public class TypeInferenceRunner {

	public static void main(String[] args) {
	List<String> n1=List.of("Apple","Papaya","Grapes");
	List<String> n2=List.of("Mango","Orange","Banana");
	var n=List.of(n1,n2);
	System.out.print(n);
	var fil = List.of("Shreya","Gour").stream().filter(s->s.length()<5);
	fil.forEach(System.out::print);
	//intermediate var variable it isn't keyword

	}

}
