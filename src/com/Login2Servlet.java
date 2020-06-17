package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/login2")
public class Login2Servlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //获取前端的值
//        String account = request.getParameter("account");
//        String password = request.getParameter("password");
//
//        //		创建cookie对象
//        Cookie c1=new Cookie("cName",account);
//        Cookie c2=new Cookie("cPassword",password);

////		将Cookie保存到响应中
//        response.addCookie(c1);
//        response.addCookie(c2);
//
//        //请求转发到成功页面
//        request.getRequestDispatcher("success.jsp").forward(request, response);

        //获取前端的值
//        String account = request.getParameter("account");
//        String password = request.getParameter("password");
//
//        //		创建cookie对象
//        Cookie c1=new Cookie("cName",account);
//        Cookie c2=new Cookie("cPassword",password);
//
//
////		设置cookie的生命时间，24小时内有效
//        c1.setMaxAge(24*3600);
//        c2.setMaxAge(24*3600);
////		将Cookie保存到响应中
//        response.addCookie(c1);
//        response.addCookie(c2);
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//        //编码
//        String username = URLEncoder.encode("李想", "utf-8");
//        String country = URLEncoder.encode("中国", "utf-8");
//        //创建cookie
//        Cookie cookie1 = new Cookie("username", username);
//        Cookie cookie2 = new Cookie("country", country);
//        //添加响应的cookie
//        response.addCookie(cookie1);
//        response.addCookie(cookie2);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie cookie:cookies){
                String name = URLDecoder.decode(cookie.getName(), "utf-8");
                String value = URLDecoder.decode(cookie.getValue(), "utf-8");
                out.println(name+":");
                out.println(value+"<br/>");
            }
        }
        else{
            out.println("<h4>没有 cookies</h4>");
        }
        out.close();
    }

    }


