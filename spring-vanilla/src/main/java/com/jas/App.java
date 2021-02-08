package com.jas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("beans.xml");
//			Book b1 = context.getBean(Book.class);
			Student s1 = context.getBean(Student.class);
			System.out.println("s1 = " + s1);
			System.out.println("s1.book = " + s1.book);
		} finally {
			context.close();
		}
	}
}
