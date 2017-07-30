package com.alan.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.alan.frame.dao.BookTypeDAO;
import com.alan.frame.entities.BookType;

public class TestBookTypeDAOImpl {

	static BookTypeDAO bookTypeDao;

	@BeforeClass
	public static void beforeClass() {
		bookTypeDao = new BookTypeDAOImpl();
	}

	@Test
	public void testGetAllBookTypes() {

		List<BookType> booktypes = bookTypeDao.getAllBookTypes();
		for (BookType bookType : booktypes) {
			System.out.println(bookType);
		}
		// assertNotNull(booktypes);
	}

}