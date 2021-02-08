package com.jas;

public class Student {
	Book book;

	public Student(Book book) {
		System.out.println("Student Constructor: " + this);
		this.book = book;
	}
}
