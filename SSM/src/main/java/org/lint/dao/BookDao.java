package org.lint.dao;

import org.lint.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    List<Book> bookList();
    int addBook(Book book);
    Book selectBookByName(String name);
    int update(Book book);
}
