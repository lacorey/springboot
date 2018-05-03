package com.moon.controller;

import com.moon.controller.service.CUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zxin on 2018/5/3.
 */
@RestController
public class UserController {
    @Autowired
    CUserService userService;

    @GetMapping("/userList")
    public List<String> getUser(){
        return userService.pringUser();
    }
}
