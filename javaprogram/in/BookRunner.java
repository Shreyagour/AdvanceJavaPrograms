package com.javaprogram.in;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book(123,"OOPS JAVA","Shreya");
		book.addReview(new Reviews(10,"Great Book",5));
		book.addReview(new Reviews(101,"Best",5));
		System.out.print(book);

	}

}
