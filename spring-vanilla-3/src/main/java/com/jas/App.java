package com.jas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jas.controller.MessageController;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageController controller = context.getBean(MessageController.class);
		controller.handleRequest();
		context.close();
	}
}
