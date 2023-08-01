package com.javaprogram.generics;
import java.util.*;

public class MyCustomList<T> {

	ArrayList<T> li=new ArrayList<>();
	
	public void addElement(T e) {
		li.add(e);
	}
	
	public void removeElement(T e) {
		li.remove(e);
	}
	
	public String toString() {
		return li.toString();
	}
	
	public T get(int pos) {
		return li.get(pos);
	}
}
