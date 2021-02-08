package com.jas.controller;

import com.jas.service.Service;

public class Controller {
	Service service;

	public Controller(Service service) {
		this.service = service;
	}

	public void handleRequest() {
		System.out.println(service.readService());
	}
}
