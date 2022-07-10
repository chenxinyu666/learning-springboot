package com.bjpowernode.controller;

import com.bjpowernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {
    @DubboReference(version = "2.0.0")
    private StudentService studentService;
    @GetMapping("/query/{id}")
    public String queryStudentById(@PathVariable("id") Integer id){
        return studentService.queryStudentById(id).toString();
    }


}
