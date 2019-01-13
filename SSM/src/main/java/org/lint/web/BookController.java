package org.lint.web;



import org.lint.dao.BookDao;
import org.lint.dao.logDao;
import org.lint.entity.Book;
import org.lint.entity.BookLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookDao bookDAO;

    @Autowired
    private logDao log;

    @RequestMapping("/books")
    public String list(Model model) {
        List<Book> books = bookDAO.bookList();
        model.addAttribute("books", books);
        return "book_list";
    }

    @RequestMapping("/add")
    public String addPage(){
        return "addBook";
    }

    @RequestMapping("/toadd")
    public String  addBook(Model model, String name , float price) {
        Book books = new Book(name, price);
        Book book = bookDAO.selectBookByName(name);
        if (book == null){
            bookDAO.addBook(books);
            log.insertlog(new BookLog("添加书籍"));
        }else {
            bookDAO.update(books);
            log.insertlog(new BookLog("更新书籍"));
        }
        return this.list(model);
    }

}
