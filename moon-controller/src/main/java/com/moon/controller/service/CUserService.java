package com.moon.controller.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.moon.interfaces.beans.UserBean;
import com.moon.interfaces.serivce.user.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zxin on 2018/5/3.
 */
@Component
public class CUserService {
    @Reference(version="1.0.0")
    UserService userService;

    public List<UserBean> pringUser(){
        List<UserBean> list = userService.getUsers();
        System.out.println("list:"+list);
        System.out.println(list.size());
        return list;
    }

    public void deleteUser(Long id){
        userService.deleteUser(id);
    }

    public void insertUser(UserBean user){
        userService.insertUser(user);
    }
}
