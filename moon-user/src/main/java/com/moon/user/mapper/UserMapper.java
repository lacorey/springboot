package com.moon.user.mapper;

import com.moon.interfaces.beans.UserBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zxin on 2018/5/4.
 */
@Mapper
public interface UserMapper {
    @Select(value = "select * from user")
    List<UserBean> getUsers();

    @Update("update user set username=#{username},address=#{address} where id=#{id}")
    void update(UserBean user);

    @Delete("delete from user where id=#{id}")
    void del(Long id);

    @Insert("insert into user(username,address) values (#{username},#{address})")
    void save(UserBean user);
}
