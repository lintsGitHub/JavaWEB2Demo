package BAO;

import DAO.BookDB;
import Entity.Book;

import java.util.ArrayList;
import java.util.List;

public class ListBookDAO implements BookDB {
    private static List<Book> list  = new ArrayList<>();

    public static List<Book> getList() {
        return list;
    }

    public static void setList(List<Book> list) {
        ListBookDAO.list = list ;
    }

    static{
        Book book1 = new Book(1,"hello",34,"好","hell");
        Book book2 = new Book(2,"Java",23,"js","搜索");
        Book book3 = new Book(3,"C#",12,"红利","h刚刚");
        Book book4 = new Book(4,"GO",43,"金坷垃","h发送到");
        Book book5 = new Book(5,"Python",35,"安抚","个ell");
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
    }

    @Override
    public List<Book> bookList() {
        return getList();
    }

    @Override
    public Book addBook(Book book) {
        list.add(book);
        return book;
    }

    @Override
    public boolean delBook(int id) {
        for (Book book : list) {
            if (book.getId()==id){
                list.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Book updateBook( Book book) {

        for (Book book1 : list) {
            if(book1.getId()==book.getId()){
                book1.setName(book.getName());
                book1.setPrice(book.getPrice());
                book1.setAuthor(book.getAuthor());
                book1.setPress(book.getPress());
            }
        }
        return book;
    }
}
