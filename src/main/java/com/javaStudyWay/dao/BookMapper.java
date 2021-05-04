package com.javaStudyWay.dao;

import com.javaStudyWay.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 吴畅
 * @date 2021/5/4 - 9:08
 */
public interface BookMapper {
    //增加书籍
    int addBook(Books books);

    //删除书籍
    int deleteBookById(@Param("bookId") int id);

    //修改书籍
    int updateBook(Books books);

    //根据id查询书籍
    Books queryBookById(@Param("bookId") int id);

    //查询书籍
    List<Books> queryAllBook();
}
