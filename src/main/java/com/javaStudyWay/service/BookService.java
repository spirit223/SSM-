package com.javaStudyWay.service;

import com.javaStudyWay.pojo.Books;

import java.util.List;

/**
 * @author 吴畅
 * @date 2021/5/4 - 9:28
 */
public interface BookService {
    //增加书籍
    int addBook(Books books);

    //删除书籍
    int deleteBookById(int id);

    //修改书籍
    int updateBook(Books books);

    //根据id查询书籍
    Books queryBookById(int id);

    //查询书籍
    List<Books> queryAllBook();
}
