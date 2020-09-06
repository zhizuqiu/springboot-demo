package com.zhizuqiu.demo.controller;

import com.zhizuqiu.demo.entity.User;
import com.zhizuqiu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    // http://localhost:8080/testBoot/getUser/1
    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id) {
        return userService.sel(id).toString();
    }

    // http://localhost:8080/testBoot/getUser2?id=2
    @RequestMapping("getUser2")
    public User getUser2(@RequestParam(value = "id", defaultValue = "1") Integer id) {
        return userService.sel(id);
    }

    @RequestMapping("getAllUser")
    public List<User> getAllUser() {
        return userService.list();
    }


    // http://localhost:8080/testBoot/addUser

    /**
     * {
     * "userName": "1",
     * "passWord": "2",
     * "realName": "3"
     * }
     */
    @PostMapping("addUser")
    public int addUser(@RequestBody User user) {
        return userService.add(user);
    }

    @DeleteMapping("deleteUser")
    public int del(@RequestParam(value = "id") int id) {
        return userService.del(id);
    }

    @PostMapping("updateUser")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }

}