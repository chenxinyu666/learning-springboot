1、主函数，启动内嵌服务器(默认是Tomcat)，访问Http://localhost:8080/hello
2、采用Jetty作为服务器启动
        在pom文件中排除对Tomcat的依赖，添加对Jetty的依赖
3、配置文件的三种格式（同时存在时properties生效，然后是yml，最后是yaml）
        application.properties
        application.yml
        application.yaml
4、主启动类上的复合注解@SpringBootApplication的功能
    （1）@SpringBootConfiguration：被声明的类可以作为配置文件使用，可以使用@Bean声明对象，注入到容器中
    （2）@EnableAutoConfiguration：启用自动配置， 把java对象配置好，注入到spring容器中。例如可以把MyBatis的对象创建好，放入到容器中
    （3）@ComponentScan：默认扫描 @ComponentScan所在的类所在的包和子包。
5、在resources/config目录下存在额外一个application.yml，设置项目启动端口为8082，
        启动项目，可以看到项目运行在8082端口，这说明config目录下的配置文件优先级高