package com.moon.service;

import com.moon.entity.User;
import com.moon.service.user.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxin on 2018/4/16.
 */
public class UserServiceImpl implements UserService{
    @Override
    public List<User> findUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("apple","pwd_apple"));
        list.add(new User("google","pwd_google"));
        list.add(new User("microsoft","pwd_microsoft"));
        return null;
    }
}
