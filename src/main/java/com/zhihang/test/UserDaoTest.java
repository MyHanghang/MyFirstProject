package com.zhihang.test;

import com.zhihang.dao.impl.UserDaoImpl;
import com.zhihang.mapper.UserMapper;
import com.zhihang.pojo.User;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

/**
 * @author：xiaoHang
 * @create：2018-07-18 23:53
 **/
public class UserDaoTest{
    @Test
    public void testGetUserById(){
        UserMapper userMapper = new UserDaoImpl();
        User user = userMapper.getUserById(37);
        System.out.println(user);
    }

    @Test
    public void testGetUserByUserName(){
        UserMapper userMapper = new UserDaoImpl();
        List<User> list = userMapper.getUserByUserName("罗");
        for (User user : list)
            System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        UserMapper userMapper = new UserDaoImpl();
        User user = new User();
        user.setUsername("小航");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("四川乐山的");
        userMapper.insertUser(user);
        System.out.println(user);
    }
}
