测试SpringBoot使用JSP
1、 加入一个处理jsp的依赖。 负责编译jsp文件
2、创建存放jsp的目录，一般叫做webapp（注意要在project structure里设置Web resource directories）
3、在pom.xml指定jsp文件编译后的存放目录
4、创建Controller， 访问jsp
5、在application.properties文件中配置视图解析器
        spring.mvc.view.prefix=/
        spring.mvc.view.suffix=.jsp

-----------------------------------------------------------------
测试SpringBoot打包war
1、在pom文件中设置打包后的文件名以及打包类型为war
2、如果使用了MyBatis，在pom文件中添加MyBatis的放在src/main/java目录下的xml文件
3、把src/main/resources下的所有文件都包含到classes目录中
4、主启动类需要继承SpringBootServletInitializer，重写configure方法
     才可以使用外部Tomcat
     SpringBootServletInitializer是原有的web.xml的替代，使用了嵌入式的Servlet，
     默认不支持JSP
5、点击项目的clean后再package，将生成的myboot.war文件放在虚拟机的tomcat的
    webapp目录下，启动虚拟机的tomcat，
    此时访问会报500错误，可能是虚拟机安装的tomcat和项目依赖的tomcat不一致引起的，
    将webapp/myboot/WEB-INF/lib目录下的所有带tomcat的jar文件删除，
    重启虚拟机的tomcat，即可访问

-----------------------------------------------------------------
测试SpringBoot打包jar
1、在pom文件中设置打包后的文件名以及打包类型为jar
2、如果使用了MyBatis，在pom文件中添加MyBatis的放在src/main/java目录下的xml文件：
            <!--使用MyBatis，而且Mapper文件放在src/main/java目录-->
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
3、在pom文件中设置把src/main/resources下的所有文件都包含到classes目录中
4、打包jar，有jsp文件时，必须指定maven-plugin插件的版本是1.4.2.RELEASE
5、