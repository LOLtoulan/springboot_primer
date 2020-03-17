package com.toulan.service;

import com.toulan.pojo.User;

import java.util.List;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/17 10:02
 * @message
 */
public interface UserService {

    User queryUserById(long id);

    int deleteUserById(long id);

    List<User> findAll();

    User queryUserByUserName(String userName);
}
