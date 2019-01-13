package org.lint.service;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 从前端接收信息进行处理，返回对应信息
 *
 * @author feiyan
 *
 */
public class aServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        /*
        * 设置字符编码，可以使用filter过滤器来写一个自己的codingfilter
        * */
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

//        定义一个writer流对象 ，使用这个对象的print方法来将信息返回到HTML页面，来进行页面信息的渲染
        PrintWriter writer = response.getWriter();
//        获取名字
        String name = request.getParameter("name");
//        获取人物类型
        String type = request.getParameter("type");
//        进行逻辑判断，将对应的信息返回给客户
        if (name == null || "".equals(name.trim()))
            writer.print("抱歉，名字不可以为空");
        else if (type.equals( "请选择") )
            writer.print("Hi " + name);
        else
            writer.print("Hi " + name + "," + type);
//        关闭writer流
        writer.close();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
