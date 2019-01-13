package GoodsServic;

import dao.ShopEnt;
import dao.userEntitySerice;
import entity.Shop;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddToShop extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String  userName = String.valueOf(req.getSession().getAttribute("userName"));
        PrintWriter writer = resp.getWriter();
        if (!"null".equals(userName)) {
            String id = req.getParameter("id");
            userEntitySerice user = new userEntitySerice();
            String s = user.checkID(userName);
            ShopEnt ent = new ShopEnt();
            ent.addShop(new Shop(s,id,1,"buy"));
            writer.print(0);
        }else writer.print(1);


    }
}
