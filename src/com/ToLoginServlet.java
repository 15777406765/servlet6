package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index.jsp")
public class ToLoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //规定登录只能通过http://localhost:8080/login.jsp
        //获取当前请求中的所有Cookie对象
        Cookie[] cookies = request.getCookies();
        //输出所有Cookie的名字和值
        //判断cookies里面有没有值，有值遍历Cookie
        if (cookies != null) {
            for (Cookie c : cookies) {
                //获取cookie里面的key
                String key = c.getName();
//                if (Constants.COOK_NAME.equals(key)) {
                //枚举CookieEnum里面的key
                if (CookieEnum.COOKIE_NAME.getValue().equals(key)) {
                    //有cookie,则免登录，直接跳转到成功界面（不需要再跳转到登录界面）
                    request.getRequestDispatcher("success.jsp").forward(request, response);
                    return;
                }
            }
        }

        //没有cookie,则直接跳转到登录页面
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
