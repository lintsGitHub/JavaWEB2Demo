package Server;

import BAO.ListBookDAO;
import Entity.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookShow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ListBookDAO listBookDAO = new ListBookDAO();
        List<Book> booksList = listBookDAO.bookList();
        req.setAttribute("bookList",booksList);
        req.getRequestDispatcher("jsp/index.jsp").forward(req,resp);
    }
}
