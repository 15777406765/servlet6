package com;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "hello", urlPatterns = "/*")
public class SysFilter implements Filter {
    //初始化的方法：执行1次。过滤器创建的时候
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器：请求到达过滤器");
        //将请求放行，执行下一个过滤器或Web资源

        //直接放行
        filterChain.doFilter(servletRequest, servletResponse);

    }
    //销毁方法：执行1次，服务器关闭的时候
    @Override
    public void destroy() {
        System.out.println("过滤器被销毁");
    }
    }

