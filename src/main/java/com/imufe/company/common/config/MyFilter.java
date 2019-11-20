package com.imufe.company.common.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 设置跨域请求相关参数的过滤器
 * @Author LQY
 * @Date 2018/12/3
 */
@WebFilter("/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse)response;
        req.setCharacterEncoding("utf-8");
        //设置哪些域可以跨域访问，*代表所有域
        resp.setHeader("Access-Control-Allow-Origin","*");
        //设置支持那种访问方法
        resp.setHeader("Access-Control-Allow-Methods","POST,GET,OPTIONS,DELETE");
        chain.doFilter(request,response);
    }
}