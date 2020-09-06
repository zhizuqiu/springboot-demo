package com.zhizuqiu.demo.service;

import com.zhizuqiu.demo.entity.User;
import com.zhizuqiu.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements UserMapper {

    @Autowired
    UserMapper userMapper;

    @Override
    public User sel(int id) {
        return userMapper.sel(id);
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public int del(int id) {
        return userMapper.del(id);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }
}