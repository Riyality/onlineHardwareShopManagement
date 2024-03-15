package com.jut.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jut.entity.Items;

@Component
public class ItemsDao {

	@Autowired
	private JdbcTemplate template;

	public boolean add(Items i) {
		Object[] args = { i.getId(), i.getName(), i.getPrice(), i.getCategory(), i.getManufacturer(), i.getStock() };
		int result = template.update("insert into items values(?,?,?,?,?,?)", args);
		if (result == 1) {
			return true;
		}
		return false;
	}

	public List<Items> selectall(Model model) {
		try {
			return template.query("select * from items", new RowMapper<Items>() {

				@Override
				public Items mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Items(rs.getInt("id"), rs.getString("name"), rs.getInt("price"),
							rs.getString("category"), rs.getString("manufacturer"), rs.getInt("stock"));

				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public boolean updatedata(Items i) {
		try {
			Object[] args = { i.getName(), i.getPrice(), i.getCategory(), i.getManufacturer(), i.getStock(),
					i.getId() };
			int result = template.update("update items set name=?,price=?,category=?,manufacturer=?,stock=? where id=?",
					args);
			if (result == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean deletedata(int id) {

		try {
			Object[] args = { id };

			int result = template.update("delete from items where id=?", args);

			if (result == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
}
