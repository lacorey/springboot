package com.moon.interfaces.serivce.user;

import com.moon.interfaces.beans.UserBean;

import java.util.List;

/**
 * Created by zxin on 2018/5/3.
 */
public interface UserService {
    List<UserBean> getUsers();

    void deleteUser(Long id);

    void insertUser(UserBean user);
}
