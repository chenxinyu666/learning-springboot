1、MyBatis逆向工程的使用
    pom文件中添加org.mybatis.generator插件，并定义配置文件的位置
    在配置文件中设置参数
    运行插件
    注意到生成的接口没有被@Mapper声明，需要声明或者在主启动类上扫描
2、注解式事务管理
    在Service类上用@Transaction声明
    主启动类上声明@EnableTransactionManagement启用事务管理器