package BookDao;

import Entity.Book;
import ListBookDB.BookDB;


import java.util.List;

public class BookFeaturs implements BookFunction {
    BookDB bookDB = new BookDB();
    List<Book> list = bookDB.books();

    @Override
    public List<Book> bookList() {
        return list;
    }

    @Override
    public boolean addBook(Book book) {
        list.add(book);
        return true;
    }

    @Override
    public boolean delBook(Book book) {
        if (list.contains(book)) {
            if (list.remove(book)) {
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean updateBook(Book book) {
        if (list.contains(book)) {
            for (Book book1 : list)
                if (book.getId() == book1.getId()) {
                    book1.setName(book.getName());
                    book1.setPrice(book.getPrice());
                    book1.setAuthor(book.getAuthor());
                    book1.setPress(book.getPress());
                    return true;
                }
            return true;
        }
        return false;
    }
}
