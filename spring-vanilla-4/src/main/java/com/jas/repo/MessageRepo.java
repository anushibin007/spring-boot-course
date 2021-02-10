package com.jas.repo;

public interface MessageRepo {
	public String readDataUsingDataSource();

	public String readDataUsingJdbcTemplate();
}
