测试SpringBoot框架集成MyBatis
1. mybatis起步依赖 ： 完成mybatis对象自动配置， 对象放在容器中
2. 在pom.xml指定把src/main/java目录中的xml文件包含到classpath中
3. 创建实体类Student
4. 创建Dao接口 StudentDao , 定义一个查询学生的方法
5. 创建Dao接口对应的Mapper文件， xml文件， 写sql语句
6. 创建Service层对象， 创建StudentService接口和他的实现类。 去调用Dao的方法。完成数据库的操作
7. 创建Controller对象，访问Service。
8. 写application.properties文件，配置数据库的连接信息。