package com.bjpowernode.web;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

@Component("myFilter")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行了MyFilter的doFilter方法");
        chain.doFilter(request,response);
    }
}
