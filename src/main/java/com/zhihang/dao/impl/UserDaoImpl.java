package com.zhihang.dao.impl;

import com.zhihang.mapper.UserMapper;
import com.zhihang.pojo.QueryVo;
import com.zhihang.pojo.User;
import com.zhihang.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 用户信息持久化实现
 *
 * @author：xiaoHang
 * @create：2018-07-18 23:18
 **/
public class UserDaoImpl implements UserMapper{
    @Override
    public User getUserById(Integer id){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        User user = sqlSession.selectOne("user.getUserById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> getUserByUserName(String userName){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        List<User> list = sqlSession.selectList("user.getUserByUserName", userName);
        sqlSession.close();
        return list;
    }

    @Override
    public void insertUser(User user){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession(true);
        sqlSession.insert("user.insertUser", user);
        sqlSession.close();
    }

    @Override
    public List<User> getAllUser(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        List<User> list = sqlSession.selectList("user.getAllUser");
        sqlSession.close();
        return list;
    }

    @Override
    public List<User> getUserByQueryVo(QueryVo vo){
        return null;
    }

    @Override
    public Integer getUserCount(){
        return null;
    }

    @Override
    public List<User> getUserByPojo(User user){
        return null;
    }

    @Override
    public List<User> getUserByIds(QueryVo vo){
        return null;
    }

    @Override
    public List<User> getUserOrderMap(){
        return null;
    }
}
