package com.bjpowernode.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    @Resource(name="loginInterceptor")
    HandlerInterceptor interceptor;
    @Value("${interceptor.path}")
    String path;            //指定拦截的请求uri地址
    @Value("${interceptor.excludePath}")
    String excludePath;//指定不拦截的请求uri地址
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器对象，注入到容器中
        registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);

    }
}
