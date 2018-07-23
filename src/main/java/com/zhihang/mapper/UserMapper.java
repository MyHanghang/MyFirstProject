package com.zhihang.mapper;

/*
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/18          LZH          1.0
 **********************************************
 */


import com.zhihang.pojo.QueryVo;
import com.zhihang.pojo.User;
import org.w3c.dom.ls.LSException;

import java.util.List;

/**
 * 用户信息持久接口
 *
 * @author：xiaoHang
 * @create：2018-07-18 23:18
 **/
public interface UserMapper{
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

    /**
     * 添加用户信息
     *
     * @param user
     */
    public void insertUser(User user);

    /**
     * 获取所有用户信息
     *
     * @return
     */
    public List<User> getAllUser();

    /**
     * 传递包装pojo
     *
     * @return
     */
    public List<User> getUserByQueryVo(QueryVo vo);

    /**
     * 获取用户总数
     *
     * @return
     */
    public Integer getUserCount();

    public List<User> getUserByPojo(User user);
}
