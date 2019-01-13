package Server;

import Entity.Perfume;
import dao.Services;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdatePerfume extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        String fragrar = req.getParameter("fragrar");
        String odor = req.getParameter("odor");
        String perfumer = req.getParameter("perfumer");
        double price = Double.parseDouble(req.getParameter("price"));
        Services services = new Services();
        services.updatePerfume(new Perfume(id,name,brand,fragrar,odor,perfumer,price));
        resp.sendRedirect("/show");
    }
}
