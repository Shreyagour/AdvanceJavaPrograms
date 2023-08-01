package com.javaprogram.in;

public class Reviews {
	private int id;
	private String description;
	private int rating;
	
	//creation
	public Reviews(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	public String toString() {
		return id +" "+ description +" "+rating;
	}
}
