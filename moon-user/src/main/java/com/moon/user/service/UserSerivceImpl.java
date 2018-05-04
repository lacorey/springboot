package com.moon.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.moon.interfaces.beans.UserBean;
import com.moon.interfaces.serivce.user.UserService;
import com.moon.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxin on 2018/5/3.
 */
@Service(version = "1.0.0")
public class UserSerivceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserBean> getUsers() {
        List<UserBean> list = userMapper.getUsers();
        return list;
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.del(id);
    }

    @Override
    public void insertUser(UserBean user) {
        userMapper.save(user);
    }


}
