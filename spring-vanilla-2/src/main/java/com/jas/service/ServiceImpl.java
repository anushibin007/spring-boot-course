package com.jas.service;

import com.jas.repo.Repo;

public class ServiceImpl implements Service {

	Repo repo;

	public ServiceImpl(Repo repo) {
		this.repo = repo;
	}

	public String readService() {
		return repo.readData();
	}

}
