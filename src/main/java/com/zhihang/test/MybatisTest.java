package com.zhihang.test;

/*
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/17          LZH          1.0
 **********************************************
 */


import com.zhihang.pojo.User;
import com.zhihang.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest{

    @Test
    public void testGetUserById() throws IOException{
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = ssfb.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("user.getUserById", 10);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testGetUserByUserName(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //        List<User> list = sqlSession.selectList("user
        // .getUserByUserName",
        //         "%张%");
        List<User> list = sqlSession.selectList("user.getUserByUserName", "%罗%");
        for (User user : list){
            System.out.println(user);
        }
        sqlSession.close();

    }

    @Test
    public void testInserUser(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("罗智航55");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("四川乐山");
        int i = sqlSession.insert("insertUser", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(user);
        System.out.println(i);
    }

    @Test
    public void testInserUserUUID(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("我叫航航航啊2");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("四川乐山");
        int i = sqlSession.insert("user.insertUserUUID", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(user);
        System.out.println(i);
    }

    @Test
    public void testupdateUser(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(37);
        user.setUsername("航航航啊啊");
        sqlSession.insert("user.updateUser", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void testdeleteUser(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(40);
        sqlSession.insert("user.deleteUser", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(user);
    }
}
