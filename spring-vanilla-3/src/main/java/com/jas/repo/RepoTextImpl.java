package com.jas.repo;

import org.springframework.stereotype.Repository;

@Repository
public class RepoTextImpl implements MessageRepo {

	public String readData() {
		return "Data = Hello World";
	}

}
