package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/success4")
public class Success4Servlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建对象
        HttpSession session = request.getSession();
        //如果之前保存的session对象里面有值的话
        //session里面不等于空
        if (session != null) {
            //用object类型保存的获取session的值  也就是之前保存的值
            Object obj = session.getAttribute("session_account");
            //obj里面不等于空
            if (obj != null) {
                //重定向成功页面
                response.sendRedirect("/success.jsp");
                return;
            }
        }

        //非法登录，强制跳转到登录页面
        response.sendRedirect("/index.jsp");

//        response.sendRedirect("/success.jsp");
    }
}
