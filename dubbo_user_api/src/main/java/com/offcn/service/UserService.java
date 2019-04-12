package com.offcn.service;

import com.offcn.po.User;

import java.io.IOException;

public interface UserService {

    User findUserById(Integer id) throws IOException;

    Integer registerUser(User user);

    User login(String username,String encrptPassword);

    User getUserByUsername(String username);
}
