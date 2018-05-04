package com.moon.controller;

import com.moon.controller.service.CUserService;
import com.moon.interfaces.beans.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zxin on 2018/5/3.
 */
@RestController
public class UserController {
    @Autowired
    CUserService userService;

    @GetMapping("/userList")
    public List<UserBean> getUser(){
        return userService.pringUser();
    }

    @GetMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        System.out.println("id:"+id);
        userService.deleteUser(id);
    }

    @PostMapping("/insert")
    public void insertUser(@ModelAttribute UserBean user){
        System.out.println(user.getUsername());
        System.out.println(user.getAddress());
        userService.insertUser(user);
    }


}
