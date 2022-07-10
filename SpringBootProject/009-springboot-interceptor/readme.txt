1、创建拦截器：实现HandlerInterceptor接口
2、用@Configuration声明配置类MyAppConfig实现WebMvcConfigurer接口，调用addInterceptors(InterceptorRegistry registry)方法，
     将拦截器添加到容器中。