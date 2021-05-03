package com.wangkai.controller;

import com.wangkai.constant.Global;
import com.wangkai.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 未登录拦截页面
 */

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute(Global.USER_SESSION);
        if (user == null) {
            System.out.println("尚未登录，调到登录页面");
            response.sendRedirect("login");
            return false;
        } else if(!user.getCode().equals("2000")){
            System.out.println("尚未登录，调到登录页面");
            response.sendRedirect("login");
            return false;
        }
        System.out.println("登录了，通过");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("afterCompletion");
    }

}