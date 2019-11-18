package com.imufe.company.config;

import com.imufe.company.component.MyLocaleResolver;
import com.imufe.company.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MySpringMvcConfigurer {
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return   new WebMvcConfigurer(){
            //添加视图控制
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("gov/login");
                registry.addViewController("/index.html").setViewName("gov/login");
                registry.addViewController("/main.html").setViewName("gov/map");
                registry.addViewController("/into.html").setViewName("gov/reg/assess");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor())
                        //指定要拦截的请求/**表示拦截所有请求
                        .addPathPatterns("/**")
                        //排除不需要拦截的请求路径
                        .excludePathPatterns("/","/index.html","/login")
                        //springboot2+之后需要将静态资源文件的访问路径也排除
                        .excludePathPatterns("/css/*","/img/*","/js/*");
            }
        };
    }
// 区域解析器
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}

