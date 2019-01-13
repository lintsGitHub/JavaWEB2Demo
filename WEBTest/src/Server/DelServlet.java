package Server;

import BAO.ListBookDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DelServlet extends HttpServlet {
    ListBookDAO listBookDAO = new ListBookDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] ids = request.getParameterValues("id");
        for (String id : ids) {
            listBookDAO.delBook(Integer.parseInt(id));
        }
        response.sendRedirect("index");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        listBookDAO.delBook(Integer.parseInt(id));
        request.getRequestDispatcher("index").forward(request, response);
    }
}
