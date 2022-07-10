package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringBoot {

    @RequestMapping("/hello")
    @ResponseBody//将返回的字符串当做数据来用，需要加这个注解
    public String helloSpringBoot(){
        return "欢迎使用SpringBoot框架";
    }
    //声明Bean把对象注入到容器中
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setSex("男");
        student.setAge(25);
        student.setName("张三");
        return  student;
    }
}
