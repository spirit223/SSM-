package com.javaStudyWay.service;

import com.javaStudyWay.dao.BookMapper;
import com.javaStudyWay.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 吴畅
 * @date 2021/5/4 - 9:29
 */
public class BookServiceImpl implements BookService {

    //service调dao:组合dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
