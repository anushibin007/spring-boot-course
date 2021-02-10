package com.jas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jas.service.MessageService;

@Controller
public class MessageController {

	@Autowired
	MessageService service;

	public void handleRequest() {
		System.out.println("DEBUG: Executing using DataSource");
		System.out.println(service.readServiceUsingDataSource());
		System.out.println("DEBUG: Executing using JdbcTemplate");
		System.out.println(service.readServiceUsingJdbcTemplate());
	}
}
