package com.alan.frame.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alan.frame.dao.BookTypeDAO;
import com.alan.frame.entities.BookType;
import com.alan.frame.service.IBookTypeService;

@Service("bookTypeService")
public class BookTypeServiceImpl  implements  IBookTypeService{

    @Resource    
    private BookTypeDAO bookTypeDAO; 

	@Override
	public List<BookType> getAllBookType() {
		return bookTypeDAO.getAllBookTypes();
	}

}
