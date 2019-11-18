package com.imufe.company.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    //调用目标方法前被拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        final Object loginUser = request.getSession().getAttribute("loginUser");
        if(loginUser != null){
            //已经登陆过
            return true;
        }
        //没有登录过
        request.setAttribute("msg","没有权限请先登录");
        request.getRequestDispatcher("/index.html").forward(request,response);
        return false;
    }
}

