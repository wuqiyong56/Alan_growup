package com.alan.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.alan.frame.dao.BookTypeDAO;
import com.alan.frame.entities.BookType;
import com.alan.frame.utils.MyBatisUtil;

/**
 * ʵ��ͼ���������ݷ���
 *
 */
public class BookTypeDAOImpl implements BookTypeDAO {

    public List<BookType> getAllBookTypes() {
        //��ûỰ����
        SqlSession session=MyBatisUtil.getSession();
        try {
            //ͨ��MyBatisʵ�ֽӿ�BookTypeDAO������ʵ��
            BookTypeDAO bookTypeDAO=session.getMapper(BookTypeDAO.class);
            return bookTypeDAO.getAllBookTypes();
        } finally {
            session.close();
        }
    }

}