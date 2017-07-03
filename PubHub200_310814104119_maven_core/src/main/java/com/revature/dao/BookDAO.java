package com.revature.dao;


import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.Book;
import com.revature.util.ConnectionUtil;


public class BookDAO {
	public void save(Book book) 
	{
	    JdbcTemplate jdbcTemplate= ConnectionUtil.getJdbcTemplate();

			String sql = "insert into books(name,price) values(?,?)";
			Object[] params = { book.getName(),book.getPrice() };
			int rows = jdbcTemplate.update(sql, params);
			System.out.println("No of rows inserted: " + rows);

		}
	public void updateName(Book book)
	{
	    JdbcTemplate jdbcTemplate= ConnectionUtil.getJdbcTemplate();

			String sql = "UPDATE BOOKS SET NAME=? WHERE ID=?";
			Object[] params = { book.getName(),book.getId() };
			jdbcTemplate.update(sql, params);

		}


	public void removeById(int id)
	{
	    JdbcTemplate jdbcTemplate= ConnectionUtil.getJdbcTemplate();

			String sql = "DELETE FROM BOOKS WHERE ID=?";
			Object[] params = {id};
			jdbcTemplate.update(sql, params);
			

		}	
 
	}


