1、@MapperScan注解
    在主类上声明，传入参数为Dao接口所在的包名，这样可以避免在每个Dao接口上都得@Mapper声明
2、xml文件和Dao接口分开
    将xml文件放到resource目录下
    在application.properties文件中配置mybatis.mapper-locations=classpath:mapper/*.xml
3、application.properties文件中配置Mybatis日志