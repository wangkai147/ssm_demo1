package com.wangkai.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求的URL
//        String url = request.getRequestURI();
//
//        // URL:除了登录请求和转发页面请求，其它的请求URL都进行拦截控制
//        if (url.contains("/login.jsp")) {
//            return true;
//        }
        System.out.println("MyInterceptor1执行了。。。前");
        return true;

//        // 获取Session
//        HttpSession session = request.getSession();
//        //获取session中的用户登录数据
//        User user = (User) session.getAttribute("User");
//
//        // 判断Session中是否有用户登录数据，如果有，则返回true,继续向下执行
//        if (user != null) {
//            return true;
//        }
//        // 不符合条件的给出提示信息，并转发到登录页面
//        String redirecturl = request.getContextPath() + "/login.jsp";
//        response.sendRedirect(redirecturl);
//        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("MyInterceptor1执行了。。。后");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("最后");
    }
}
