package Server;

import Entity.Perfume;
import dao.Services;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ShowAllPerfume extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Services services = new Services();
        List<Perfume> perfumes = services.allPerfume();
        req.setAttribute("perfumes",perfumes);
        req.getRequestDispatcher("WEB-INF/JSP/PerfumeWord.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
