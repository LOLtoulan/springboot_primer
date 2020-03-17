package com.toulan.service.impl;

import com.toulan.mapper.UserMapper;
import com.toulan.pojo.User;
import com.toulan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author loltoulan
 * @version 1.0.0
 * @time 2020/3/17 10:03
 * @message
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(long id) {

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int deleteUserById(long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public User queryUserByUserName(String userName) {
        return userMapper.selectOneByExample(userName);
    }


}
