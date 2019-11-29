package com.imufe.company.common.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 设置跨域请求相关参数的过滤器
 * @Author Cy
 * @Date 2019/11/24
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
        resp.setHeader("Access-Control-Max-Age", "36000");
        resp.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,Authorization,authorization");
        resp.setHeader("Access-Control-Allow-Credentials","true");

        chain.doFilter(request,response);
    }
}