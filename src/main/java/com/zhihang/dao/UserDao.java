package com.zhihang.dao;

/*
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/18          LZH          1.0
 **********************************************
 */


import com.zhihang.pojo.User;

import java.util.List;

/**
 * 用户信息持久接口
 *
 * @author：xiaoHang
 * @create：2018-07-18 23:18
 **/
public interface UserDao{
    /**
     * 根据用户ID查询用户信息
     *
     * @param id
     * @return
     */
    public User getUserById(Integer id);

    /**
     * 根据用户名查找用户列表
     *
     * @param userName
     * @return
     */
    public List<User> getUserByUserName(String userName);

    public void insertUser(User user);

    public List<User> getAllUser();
}
