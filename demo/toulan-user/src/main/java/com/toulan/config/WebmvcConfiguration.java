package com.toulan.config;

import com.toulan.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/16 14:16
 * @message 配置我们的拦截器
 */

//声明该类是一个配置类
@Configuration
public class WebmvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(myInterceptor);

    }
}
