package com.bjpowernode.service.impl;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;

/*
* 使用dubbo的注解暴露服务
* */
@DubboService(version = "1.0.0",interfaceClass = StudentService.class)
public class StudentServiceImpl1 implements StudentService {
    @Override
    public Student queryStudentById(Integer id) {
        Student student = new Student();
        if(1001==id){
            student.setId(1001);
            student.setName("张三");
            student.setAge(13);
        }else if(1002 == id){
            student.setId(1002);
            student.setName("李四");
            student.setAge(14);
        }
        return student;
    }
}
