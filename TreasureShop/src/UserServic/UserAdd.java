package UserServic;

import dao.userEntitySerice;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserAdd extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String userTel = req.getParameter("userTel");
        String userMail = req.getParameter("userMail");
        String userPsw = req.getParameter("userPsw");
        String userStatus = req.getParameter("userStatus");
        userEntitySerice user = new userEntitySerice();
        HttpSession session = req.getSession();
        session.setAttribute("userName",userName);
        user.addUser(new User(0,userName,userTel,userMail,userPsw,userStatus));
    }
}
