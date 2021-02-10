package com.jas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jas.repo.MessageRepo;

@Service
public class ServiceImpl implements MessageService {

	@Autowired
	MessageRepo repo;

	public String readServiceUsingDataSource() {
		return repo.readDataUsingDataSource();
	}

	public String readServiceUsingJdbcTemplate() {
		return repo.readDataUsingJdbcTemplate();
	}

}
