package GoodsServic;

import com.google.gson.Gson;
import dao.GoodsEnt;
import entity.Goods;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoodsList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GoodsEnt ent = new GoodsEnt();
        List<Goods> goods = ent.goodsList();
        Gson gson = new Gson();
        String s = gson.toJson(goods);
        resp.getWriter().print(s);
    }
}
