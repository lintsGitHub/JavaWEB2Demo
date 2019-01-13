package UserServic;



import dao.userEntitySerice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* HttpSession session = req.getSession();
        String userName = String.valueOf(session.getAttribute("userName"));
        if(userName==null || "".equals(userName)){
            doPost(req,resp);
        }  */
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String psw = req.getParameter("password");
        userEntitySerice user = new userEntitySerice();
        PrintWriter writer = resp.getWriter();
        if (user.checkUser(action,psw)){
            req.getSession().setAttribute("userName",action);
            user.updataType(action,"online");
            writer.print("登录成功");
        }else writer.print("登录失败");
        
    }
}
