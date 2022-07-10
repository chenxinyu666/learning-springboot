package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    //学习REST注解的使用
    //@RestController是一个复合注解是@Controller 和@ResponseBody组合。
    //在类的上面使用@RestController ， 表示当前类者的所有方法都加入了 @ResponseBody

    //查询Id=1001的学生
    /**
     * @PathVariable:获取URL中的数据
     *          属性：value：路径中的变量名
     *          位置：放在控制器方法形参前面，表示这个形参引用路径中的变量
     *   http://localhost:8080/myboot/student/1001
     */
    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable(value = "stuId") Integer studentId){
        return  "查询学生studentId="+studentId;
    }

    /*
    * 创建资源：Post请求方式
    * http://localhost:8080/myboot/student/zhangsan/20
    * */
    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name")String name,@PathVariable("age") Integer age){
        return "创建资源 student: name="+name+"###age="+age;
    }

    /*
    * 更新资源：Put请求方式
    * 当路径变量名和形参名一致时，@PathVariable的参数可以省略
    * */
    @PutMapping("/student/{id}/{age}")
    public String modifyStudent(@PathVariable Integer id,@PathVariable Integer age){
        return  "更新资源，执行put请求方式：id="+id+"###age="+age;
    }
    /*
    * 删除资源：Delete请求方式
    * */
    @DeleteMapping("/student/{id}")
    public String removeStudentById(@PathVariable Integer id){
        return "删除资源，执行delete请求方式：id="+id;
    }
}
