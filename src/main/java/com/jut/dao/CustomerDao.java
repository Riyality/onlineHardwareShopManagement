package com.jut.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.jut.entity.Customer;

@Component
public class CustomerDao {
	@Autowired
	private JdbcTemplate template;

	public void add(Customer c) {
		Object[] args = { c.getId(), c.getName(), c.getMobileNo() };
		int result = template.update("insert into customers values(?,?,?)", args);
		System.out.println(result + " record inserted");

	}

	public List<Customer> CustomerList(Model model) {

		try {
			return template.query("select * from customers", new RowMapper<Customer>() {

				@Override
				public Customer mapRow(ResultSet rs, int row) throws SQLException {

					return new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("mobileNo"));
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public boolean update(Customer c){
		try {
			Object[] args={c.getName(),c.getMobileNo(),c.getId()};
			int result=template.update("update customers set name=?,mobileNo=? where id=?",args);
			if(result==1){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
		
	}
	public void delete(int id) {

		Object[] args = { id };
		int result = template.update("delete from customers where id=?", args);
		System.out.println(result);
	}

}
