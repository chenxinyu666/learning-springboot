学习REST注解的使用
    @RestController是一个复合注解是@Controller 和@ResponseBody组合。
    在类的上面使用@RestController ， 表示当前类者的所有方法都加入了 @ResponseBody

    @PathVariable:获取URL中的数据
             属性：value：路径中的变量名
             位置：放在控制器方法形参前面，表示这个形参引用路径中的变量
      http://localhost:8080/myboot/student/1001
    @GetMapping:     支持的get请求方式,等同于@RequestMapping(method=RequestMethod.GET)
    @PostMapping:    支持post请求方式,等同于@RequestMapping(method=RequestMethod.POST)
    @PutMapping:     支持put请求方式,等同于@RequestMapping(method=RequestMethod.PUT)
    @DeleteMapping: 支持delete请求方式,等同于@RequestMapping(method=RequestMethod.DELETE)

在配置文件中启用支持put、delete请求

注意RESTful的请求路径+请求方式必须是唯一的