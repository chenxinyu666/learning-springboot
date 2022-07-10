package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("准备创建容器对象");
        //获取容器对象
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        //从容器中获取对象
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.sayHello("张三");
        System.out.println("容器对象创建之后");
    }

    @Override
    public void run(String... args) throws Exception {
        //在容器对象创建好后，紧随着执行这里的run()方法
        //可以做自定义的操作，比如读取文件、数据库等。
        System.out.println("在容器对象创建好后，执行的方法");
    }
}
