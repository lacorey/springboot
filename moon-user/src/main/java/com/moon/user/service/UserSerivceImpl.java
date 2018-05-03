package com.moon.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.moon.interfaces.serivce.user.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxin on 2018/5/3.
 */
@Service(version = "1.0.0")
public class UserSerivceImpl implements UserService{
    @Override
    public List<String> getUsers() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("google");
        list.add("microsoft");
        return list;
    }
}
