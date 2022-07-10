package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class BootController {
    @Value("${server.port}")
    private Integer port;
    @Autowired
    private Student student;
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){

        return "Hello SpringBoot 应用--"+"端口号为:"+port+"--"+student.toString();
    }
}
