package com.moon.redis.controller;

import com.moon.redis.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zxin on 2018/6/8.
 */
@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping("/set")
    public void set(){
        redisTemplate.opsForValue().set("google","im google");
        logger.info("set value success");

    }

    @RequestMapping("/show")
    public String show(){
        return redisTemplate.opsForValue().get("google").toString();
    }

    @RequestMapping("/setObject")
    public void setObject(){
        User user = new User();
        user.setAge(33);
        user.setName("apple");
        user.setAddress("Ameriacan");
        redisTemplate.opsForValue().set("user",user);
        logger.info("set object success");

    }

    @RequestMapping("/showObject")
    public String showObject(){
        User user = (User) redisTemplate.opsForValue().get("user");
        return user.toString();
    }

    @RequestMapping("/setList")
    public void setList(){
        User u1 = new User("apple",30,"American");
        User u2 = new User("google",31,"Tokyo");
        User u3 = new User("MicroSoft",30,"Beijing");
        redisTemplate.opsForList().rightPush("list",u1);
        redisTemplate.opsForList().rightPush("list",u2);
        redisTemplate.opsForList().rightPush("list",u3);
        logger.info("set List success");
    }

    @RequestMapping("/showList")
    public String showList(){
        List<User> list = redisTemplate.opsForList().range("list", 0, -1);
        return list.toString();
    }

}
