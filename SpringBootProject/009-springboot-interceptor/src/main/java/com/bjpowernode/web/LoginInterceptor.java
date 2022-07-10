package com.bjpowernode.web;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
@Component("loginInterceptor")
public class LoginInterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler 被拦截的控制器对象
     * @return boolean
     *                     true:请求能被Controller处理
     *                     false:请求被阻止
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行了拦截器的preHandle方法");
        return true;
    }
}
