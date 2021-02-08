package com.jas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jas.controller.Controller;
import com.jas.repo.Repo;
import com.jas.repo.RepoTextImpl;
import com.jas.service.Service;
import com.jas.service.ServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public Repo repoBean() {
		return new RepoTextImpl();
	}

	@Bean
	public Service serviceBean() {
		return new ServiceImpl(repoBean());
	}

	@Bean
	public Controller controllerBean() {
		return new Controller(serviceBean());
	}
}
