package Dao;

import Entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Test implements BookFunction {
    static List<Book> list = new ArrayList<>();
    static {
        Book book1 = new Book("1",12,"1");
        Book book2 = new Book("2",12,"2");
        Book book3 = new Book("3",12,"3");
        Book book4 = new Book("4",12,"4");
        Book book5 = new Book("5",12,"5");
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
    }
    @Override
    public List<Book> getBookList() {
        return list;
    }

    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public boolean delBook(int id) {
        return false;
    }

    @Override
    public Book updateBook(Book book) {
        /*Book bo = list.get(book.getId());
        System.out.println(book.getId());
        bo.setName(book.getName());
        bo.setAthor(book.getAthor());
        bo.setPrice(book.getPrice());
        return bo;*/
        return null;
    }
}
