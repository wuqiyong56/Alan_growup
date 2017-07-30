package com.alan.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.alan.frame.dao.BookTypeDAO;
import com.alan.frame.entities.BookType;

public class TestBookTypeDAOImpl2 {
    static BookTypeDAO bookTypeDao;
    @BeforeClass
    public static void beforeClass()
    {
        bookTypeDao=new BookTypeDAOImpl();
    }
	@Test
	public void test() {
		/*try {
			new Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
//		new com.mysql.jdbc.Driver();
		System.out.println("start");
        List<BookType> booktypes=bookTypeDao.getAllBookTypes();
        for (BookType bookType : booktypes) {
            System.out.println(bookType.getTypeName());
        }
        assertNotNull(booktypes);
	}

}
