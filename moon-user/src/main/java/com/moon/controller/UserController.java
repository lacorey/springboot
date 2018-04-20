package com.moon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zxin on 2018/4/17.
 */
@Controller
public class UserController {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello world";
    }
}
