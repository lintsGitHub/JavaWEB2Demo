package Server;

import Entity.Perfume;
import dao.Services;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddPerfume extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        String fragrar = req.getParameter("fragrance");
        String odor = req.getParameter("odor");
        String perfumer = req.getParameter("perfumer");
        double price = Double.parseDouble(req.getParameter("price"));
        Services services = new Services();
        services.addPerfume(new Perfume(id,name,brand,fragrance,odor,perfumer,price));*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
        System.out.println("+++");
        String name = req.getParameter("name");
        System.out.println(name);
        String brand = req.getParameter("brand");
        String fragrance = req.getParameter("fragrance");
        String odor = req.getParameter("odor");
        String perfumer = req.getParameter("perfumer");
        double price = Double.parseDouble(req.getParameter("price"));
        Services services = new Services();
        services.addPerfume(new Perfume(id,name,brand,fragrance,odor,perfumer,price));
        resp.sendRedirect("/show");
    }
}
