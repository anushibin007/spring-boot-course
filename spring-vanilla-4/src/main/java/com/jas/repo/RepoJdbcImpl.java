package com.jas.repo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RepoJdbcImpl implements MessageRepo {

	@Autowired
	DataSource ds;

	@Autowired
	JdbcTemplate template;

	public String readDataUsingDataSource() {
		try {
			PreparedStatement prepareStatement = ds.getConnection().prepareStatement("SELECT @@VERSION");
			ResultSet resultSet = prepareStatement.executeQuery();
			resultSet.next();
			return resultSet.getString(1);
		} catch (SQLException se) {
			se.printStackTrace();
			return "Exception: " + se.getMessage();
		}
	}

	public String readDataUsingJdbcTemplate() {
		List<String> queryForList = template.queryForList("SELECT @@VERSION", String.class);
		return queryForList.get(0);
	}

}
