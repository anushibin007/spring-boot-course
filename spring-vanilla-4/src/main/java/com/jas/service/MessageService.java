package com.jas.service;

public interface MessageService {
	public String readServiceUsingDataSource();

	public String readServiceUsingJdbcTemplate();
}
