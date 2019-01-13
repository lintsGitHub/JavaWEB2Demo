package UserServic;

import dao.userEntitySerice;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userEntitySerice user = new userEntitySerice();
        String userName = req.getParameter("userName");
        String userTel = req.getParameter("userTel");
        String userMail = req.getParameter("userMail");
        String userPsw = req.getParameter("userPsw");
        String userStatus = req.getParameter("userStatus");
        user.addUser(new User(1,userName,userTel,userMail,userPsw,userStatus));
    }
}
