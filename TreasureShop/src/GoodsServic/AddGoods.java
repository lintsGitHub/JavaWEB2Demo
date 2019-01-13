package GoodsServic;

import dao.GoodsEnt;
import entity.Goods;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddGoods extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String path = req.getParameter("path");
        double price = Double.parseDouble(req.getParameter("price"));
        String type = req.getParameter("type");
        GoodsEnt ent = new GoodsEnt();
        ent.addGoods(new Goods(id,path,name,price,type));

    }
}
