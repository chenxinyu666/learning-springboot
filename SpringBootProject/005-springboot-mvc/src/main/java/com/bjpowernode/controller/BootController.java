package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {

    @RequestMapping("/helloSpringBoot")
    @ResponseBody
    public String doSome(){
        return "Hello SpringBoot 应用";
    }
}
