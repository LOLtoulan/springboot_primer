package com.toulan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/14 9:33
 * @message @EnableAutoConfiguration 启用自动配置
 */
@RestController
@RequestMapping("hello")
public class HelloController {


    @GetMapping("show")
    public String test(){
        return "hello world 1 !";
    }
}
