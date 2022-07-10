1、通过SpringApplication.run(Application.class, args)的返回值获取容器。
     ConfigurableApplicationContext : 接口，是ApplicationContext的子接口

2、CommandLineRunner接口中的run()方法在ApplicationContext容器对象创建后，紧随着执行
