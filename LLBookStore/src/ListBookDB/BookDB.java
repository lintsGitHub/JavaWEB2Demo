package ListBookDB;

import Entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDB {
    private static List<Book> list = new ArrayList<>();
    static{
        Book book = new Book(1,"Java", (float) 99.9,"董小姐","Java出版社");
        Book book1 = new Book(2,"C#", (float) 34,"董小姐","Java出版社");
        Book book2 = new Book(3,"Python", (float) 255,"董小姐","Java出版社");
        Book book3 = new Book(4,"Go", (float) 676,"董小姐","Java出版社");
        Book book4 = new Book(5,"C", (float) 435,"董小姐","Java出版社");
        Book book5 = new Book(6,"C++", (float) 242,"董小姐","Java出版社");
        Book book6 = new Book(7,"易语言", (float) 324,"董小姐","Java出版社");
       list.add(book);
       list.add(book1);
       list.add(book2);
       list.add(book3);
       list.add(book4);
       list.add(book5);
       list.add(book6);
    }
    public List<Book> books (){
        return list;
    }
}
