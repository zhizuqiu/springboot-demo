package com.zhizuqiu.demo.mapper;

import com.zhizuqiu.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User sel(int id);

    int add(User user);

    List<User> list();
}