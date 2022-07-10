package com.bjpowernode.web;

import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//创建Servlet类
@Component("myServlet")
public class MyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //把get请求交给post处理
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //使用HttpServletResponse输出数据应答结果
        resp.setContentType("text/html");//此时没有设置字符集为UTF-8，在浏览器页面上显示乱码。
        PrintWriter out = resp.getWriter();
        out.println("执行的是Servlet");
        out.flush();
        out.close();
    }
}
