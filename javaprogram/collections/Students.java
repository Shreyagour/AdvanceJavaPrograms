package com.javaprogram.collections;

public class Students implements Comparable<Students> {
	private int id;
	private String name;
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id+" "+name;
	}
@Override
public int compareTo(Students that) {
	return Integer.compare(that.id, this.id); //decreasing order
}

}
