package com.jut.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class LoginDao {
	@Autowired
	private JdbcTemplate template;
	

	public boolean login(String username, String password) {
		Object[] args = { username, password };
		int count = template.queryForObject("select count(*) from login where username = ? and password = ?",
				Integer.class, args);
		if (count == 1) {

			return true;
		} else {
			return false;
		}

	}
}
