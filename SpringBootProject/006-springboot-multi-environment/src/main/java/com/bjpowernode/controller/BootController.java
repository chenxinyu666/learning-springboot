package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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
    @Autowired
    private Environment environment;//通过Environment的实现类能够获取配置文件中所有属性值
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        System.out.println(environment.getProperty("server.servlet.context-path"));
        return "Hello SpringBoot 应用--"+"端口号为:"+port+"--"+student.toString();
    }
}
