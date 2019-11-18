package com.imufe.company.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title:DruidConfig
 * @Description:com.mengxuegu.springboot.Config
 * @Authpr:wht
 * @Version:1.0
 * 绑定Druid相关信息
 **/
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
    /**
     * 配置一个druid的监控
     * 1.配置一个druid的后台，管理servlet
     * 2.配置要给druid的filter
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //设置初始化参数值
        Map<String,String> initParam = new HashMap<>();
        initParam.put(StatViewServlet.PARAM_NAME_JMX_USERNAME,"root");
        initParam.put(StatViewServlet.PARAM_NAME_JMX_PASSWORD,"123456");
        //如果不写默认所有ip可进行访问
        initParam.put(StatViewServlet.PARAM_NAME_ALLOW,"");
        initParam.put(StatViewServlet.PARAM_NAME_DENY,"192.168.2.1");
        bean.setInitParameters(initParam);
        return bean;
    }
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());
        Map<String,String> InitParams=new HashMap<>();
        InitParams.put(WebStatFilter.PARAM_NAME_EXCLUSIONS,"*.js,*.css,/druid*/");
        bean.setInitParameters(InitParams);
        //设置拦截请求
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}

