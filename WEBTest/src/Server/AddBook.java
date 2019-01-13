package Server;

import BAO.ListBookDAO;
import Entity.Book;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String author = req.getParameter("author");
        String press = req.getParameter("press");
        ListBookDAO listBookDAO = new ListBookDAO();
        listBookDAO.addBook(new Book(Integer.parseInt(id),name,Float.parseFloat(price),author,press));
        resp.sendRedirect("index");
    }
}
