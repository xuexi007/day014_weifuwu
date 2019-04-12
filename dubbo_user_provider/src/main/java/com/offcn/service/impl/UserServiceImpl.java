package com.offcn.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.mapper.UserMapper;
import com.offcn.po.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
@Service
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findUserById(Integer id) throws IOException {
        return userMapper.findUserById(id);
    }

    @Override
    public Integer registerUser(User user) {
        return userMapper.registerUser(user);
    }

    @Override
    public User login(String username, String encrptPassword) {
        return userMapper.login(username, encrptPassword);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }
}
