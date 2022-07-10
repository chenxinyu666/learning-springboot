package com.bjpowernode.controller;

import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student/query")
    @ResponseBody
    public String queryStudentById(Integer id){
        return studentService.queryStudentById(id).toString();
    }
}
