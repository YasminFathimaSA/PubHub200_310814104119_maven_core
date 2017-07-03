package com.revature.test;

import com.revature.dao.BookDAO;
import com.revature.model.Book;

public class TestBook {
	public static void main(String args[]) throws Exception {
		Book book = new Book();
		book.setId(1);
		book.setName("java1");
		book.setPrice(230);
		BookDAO dao = new BookDAO();
		dao.save(book);
		dao.updateName(book);
		dao.removeById(book.getId());

	}

}
