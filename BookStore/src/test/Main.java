package test;

import Dao.Test;
import Entity.Book;

import java.util.List;

public class Main {
     static void shows(List<Book> list){
        for (Book book : list){
            System.out.println(book.getName());
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        List<Book> list = test.getBookList();
        shows(list);
        Book book = list.get(2);
        //System.out.println(book.getName());
        book.setName("HELLO");
        test.updateBook(book);
        List<Book> list2 = test.getBookList();
        System.out.println("=============");
        shows(list2);
    }
}
