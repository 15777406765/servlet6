package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login4")
public class Login4Servlet extends HttpServlet {



    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //把登录信息放到session中
        String account = request.getParameter("account");
        //创建session对象
        HttpSession session = request.getSession();
        //判断账号是否正确
        if ("admin".equals(account)) {
            //把账号保存进session里面去，session_account和请求转发的session_account一样
            session.setAttribute("session_account", account);
            //session的生命周期
            session.setMaxInactiveInterval(30 * 60);
            //请求转发/session
            request.getRequestDispatcher("/success4").forward(request, response);
            //账号不正确
        } else {
            System.out.println("账号错误！");
            //账号错误，强制重新登录
            response.sendRedirect("/index.jsp");
        }
    }
}
