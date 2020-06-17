package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@WebServlet("/login3")
public class Login3Servlet extends HttpServlet {

    private static final String SESSION_KEY = "hello";

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //把登录信息放到session中
        String account = request.getParameter("account");
        //获取session
        HttpSession session = request.getSession();

//        //默认是30分钟  设置失效时间
//        session.setMaxInactiveInterval(10);

        //
        session.setAttribute(SESSION_KEY, account);
        //
        request.getRequestDispatcher("/success").forward(request, response);


//        //获取session
//        HttpSession session1=request.getSession();
//        //获取 sessionde ，
//        String sid=session1.getId();
//        System.out.println("sid"+sid);
//        //创建时间
//        long creationTime=session1.getCreationTime();
//        System.out.println("session的创建时间" +creationTime);
//
//        //最后访问时间
//        long lastAccessed=session1.getLastAccessedTime();
//        System.out.println("session的最后访问时间"+lastAccessed);
//    }
    }
}
