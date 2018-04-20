package com.moon.entity;

/**
 * Created by zxin on 2018/4/16.
 */
public class User {
    private String name;
    private String password;

    public User(String name,String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
