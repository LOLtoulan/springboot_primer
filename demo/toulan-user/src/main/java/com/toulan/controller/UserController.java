package com.toulan.controller;

import com.toulan.pojo.User;
import com.toulan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/16 8:52
 * @message
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("show")
    @ResponseBody
    public String test(){
        return "hello world 1 !";
    }

   /* @GetMapping("find")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }*/

    @GetMapping("find")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("find/{id}")
    @ResponseBody
    public User queryById(@PathVariable("id")Long id){
      return   userService.queryUserById(id);
    }

}
