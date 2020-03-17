package com.toulan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/14 18:12
 * @message
 */
@ComponentScan //扫描该类下的所有包及其子包
@EnableAutoConfiguration //启用springboot的自动化配置
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class);
    }
}
