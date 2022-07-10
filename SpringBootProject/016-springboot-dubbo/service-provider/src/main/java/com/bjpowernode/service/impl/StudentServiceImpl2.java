package com.bjpowernode.service.impl;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;

/*
* 使用@DubboService注解暴露服务
* */
@DubboService(version = "2.0.0",interfaceClass = StudentService.class)
public class StudentServiceImpl2 implements StudentService {
    @Override
    public Student queryStudentById(Integer id) {
        Student student = new Student();
        if(1001==id){
            student.setId(1001);
            student.setName("张三");
            student.setAge(23);
        }else if(1002 == id){
            student.setId(1002);
            student.setName("李四");
            student.setAge(24);
        }
        return student;
    }
}
