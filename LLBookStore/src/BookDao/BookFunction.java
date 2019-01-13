package BookDao;

import Entity.Book;

import java.util.List;

public interface BookFunction {
    List<Book> bookList();

    boolean addBook(Book book);

    boolean delBook(Book book);

    boolean updateBook(Book book);

}
