1、多环境配置文件的使用，需要在主配置文件中设置启用哪个配置文件。注意配置文件的命名规范。
2、使用@Value注解读取配置文件中的值
3、@ConfigurationProperties可以将配置文件中的数据映射到JAVA对象中
4、Environment的实现类对象能够获取配置文件中所有属性值
5、打包生成的jar文件可以通过 java -jar <文件名> --属性1=值1 --属性2=值2的方式覆盖配置属性启动
6、通过命令java -jar myboot.jar来启动项目
  如果和jar文件同路径下有application配置文件，项目会在启动时采用文件目录下的application配置
  如果和jar文件同路径下有config/application配置文件，项目会在启动时采用config/application配置
7、综上所述
       配置文件优先级：
              (1)  file:config/application.yml
              (2)  file:application.yml
            （3）classpath:config/application.yml
              (4)  classpath:application.yml
       (1)级与(2)级可以用作项目打包后设置通用属性
       (3)级与(4)级可以用作项目开发时设置的属性
