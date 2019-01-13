package Dao;

import Entity.Book;

import java.util.List;

public interface BookFunction {
    List<Book> getBookList();
    boolean addBook(Book book);
    boolean delBook(int id);
    Book updateBook(Book book);
}
