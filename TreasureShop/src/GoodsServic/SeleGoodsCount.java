package GoodsServic;

import dao.GoodsEnt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SeleGoodsCount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GoodsEnt ent = new GoodsEnt();
        int count = ent.goodsCount(String.valueOf(req.getSession().getAttribute("userName")));
        resp.getWriter().print(count);
    }
}
