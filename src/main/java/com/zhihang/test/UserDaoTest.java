package com.zhihang.test;

import com.zhihang.dao.UserDao;
import com.zhihang.dao.impl.UserDaoImpl;
import com.zhihang.pojo.User;
import org.apache.ibatis.session.SqlSession;
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
        UserDao userDao = new UserDaoImpl();
        User user = userDao.getUserById(37);
        System.out.println(user);
    }

    @Test
    public void testGetUserByUserName(){
        UserDao userDao = new UserDaoImpl();
        List<User> list = userDao.getUserByUserName("罗");
        for (User user : list)
            System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        UserDao userDao = new UserDaoImpl();
        User user = new User();
        user.setUsername("小航");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("四川乐山的");
        userDao.insertUser(user);
        System.out.println(user);
    }
}
