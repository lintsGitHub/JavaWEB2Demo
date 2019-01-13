package Server;

import BookDao.BookFeaturs;
import Entity.Book;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class BookListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookFeaturs bookFeaturs = new BookFeaturs();
        List<Book> books = bookFeaturs.bookList();
//        request.setAttribute("books",books);
//        request.getRequestDispatcher("index.jsp").forward(request,response);
        Gson gson = new Gson();
        String s = gson.toJson(books);
        PrintWriter writer = response.getWriter();
        writer.write(s);
        response.sendRedirect("index.jsp");
        writer.close();
    }
}
