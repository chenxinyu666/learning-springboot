1.编写调用service的Controller
2.@RestController注解是一个复合注解，包括@Controller和@ResponseBody
3.调用远程服务在StudentService上声明@DubboReference注解
    可以不配置interface属性，默认是引用类型的数据类型