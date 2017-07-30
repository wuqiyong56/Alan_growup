package com.alan.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alan.frame.entities.BookType;

public class TestMybatis {
	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("MyBatisCfg.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session =  factory.openSession();
		BookType jav = session.selectOne("com.alan.frame.dao.BookTypeDAO",2);
	}
}
