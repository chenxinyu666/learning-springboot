package com.bjpowernode.config;

import com.bjpowernode.vo.Student;
import com.bjpowernode.vo.Tiger;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/*
* @Configuration：表示当前类是作为配置文件使用的，也就是用来配置容器的
*       位置：在类的上面
*       SpringConfig这个类就相当于beans.xml文件
*
* @ImportResource：将xml文件中配置的bean也导入到了JAVAConfig中
* */
@Configuration
@ImportResource(value={"classpath:applicationContext.xml","classpath:beans.xml"})
@PropertySource("classpath:config.properties")//读取属性配置文件
@ComponentScan("com.bjpowernode.vo")     //包扫描
public class SpringConfig {
    /*
    * 创建方法，方法的返回值是对象，在方法的上面加入@Bean
    * 方法的返回值对象就注入到容器中。
    *
    * @Bean：把方法返回的对象注入到Spring容器中，作用相当于<bean>
    *               位置：方法的上面
    *               说明：@Bean如果不指定对象的名称，对象名默认是方法名
    *                         可以通过@Bean的name属性来指定对象的名称
    * */
    @Bean("student")
    public Student createStudent(){
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setSex("男");
        return s1;
    }


}
