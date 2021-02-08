package com.jas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jas.controller.Controller;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Controller controller = context.getBean("controllerBean", Controller.class);
		controller.handleRequest();
		context.close();
	}
}
