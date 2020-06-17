package com;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String account = request.getParameter("account");
        String selectDay = request.getParameter("selectDay");

        int maxAge = 0;
        if ("2".equals(selectDay)) {
            // 10天
            maxAge = 10 * 24 * 60 * 60;
        } else if ("3".equals(selectDay)) {
            // 30天
            maxAge = 30 * 24 * 60 * 60;
        }

//        Cookie cName = new Cookie(Constants.COOK_NAME, account);
        Cookie cName = new Cookie(CookieEnum.COOKIE_NAME.getValue(), account);
        cName.setMaxAge(maxAge);

        response.addCookie(cName);

        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
