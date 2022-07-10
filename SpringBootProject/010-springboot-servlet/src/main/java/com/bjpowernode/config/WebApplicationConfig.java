package com.bjpowernode.config;

import com.bjpowernode.web.MyFilter;
import com.bjpowernode.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.annotation.Resource;

@Configuration
public class WebApplicationConfig {
    @Resource(name="myServlet")
    MyServlet myServlet;
    @Resource
    MyFilter myFilter;
    //定义方法，注册Servlet对象
    @Bean//将返回的对象注册到容器中
    public ServletRegistrationBean servletRegistrationBean(){
        //public ServletRegistrationBean(T servlet, String... urlMappings)
        //第一个参数是Servlet对象，第二个是Servlet对象响应的url地址
        ServletRegistrationBean bean = new ServletRegistrationBean(myServlet,"/myservlet");
        return bean;
    }
    //定义方法，注册自定义过滤器对象
    @Bean//将返回的对象注册到容器中
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(myFilter);
        bean.addUrlPatterns("/myservlet");
        return bean;
    }
    //定义方法，注册字符集过滤器对象
    @Bean//将返回的对象注册到容器中
    public FilterRegistrationBean encodingFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        //使用框架中的过滤器类
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("utf-8");
        characterEncodingFilter.setForceRequestEncoding(true);
        characterEncodingFilter.setForceResponseEncoding(true);
        bean.setFilter(characterEncodingFilter);
        bean.addUrlPatterns("/*");
        return bean;
    }
}
