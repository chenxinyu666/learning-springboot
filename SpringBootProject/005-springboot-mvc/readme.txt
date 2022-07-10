1、主函数，启动内嵌Tomcat，访问Http://localhost:8080/hello
2、学习掌握主启动类上的复合注解@SpringBootApplication的功能
    （1）@SpringBootConfiguration：被声明的类可以作为配置文件使用，可以使用@Bean声明对象，注入到容器中
    （2）@EnableAutoConfiguration：启用自动配置， 把java对象配置好，注入到spring容器中。例如可以把mybatis的对象创建好，放入到容器中
    （3）@ComponentScan：默认扫描 @ComponentScan所在的类所在的包和子包。
3、在application.properties文件里进行配置