package com.cq.springboot.controller;

import com.cq.springboot.Model.User;
import com.cq.springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: chenqiang
 * @Date: 2018/10/26 16:08
 * @Version 1.0
 */

/**
 * 测试用例
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public List<User> getUser() {
        return userService.getAllUser();
    }
}
