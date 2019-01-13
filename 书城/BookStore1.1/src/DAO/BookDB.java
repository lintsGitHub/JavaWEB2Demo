package DAO;

import Entity.Book;

import java.util.List;

public interface BookDB {
    //添加获取所有书的接口方法
    List<Book> bookList() ;
    //添加一本书的方法
    Book addBook(Book book);
    //删除一本书的方法
    boolean delBook(int id);
//    修改一本书的方法，
    Book updateBook(Book book);


}
