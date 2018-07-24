package com.zhihang.test;

import com.zhihang.mapper.UserMapper;
import com.zhihang.pojo.Order;
import com.zhihang.pojo.QueryVo;
import com.zhihang.pojo.User;
import com.zhihang.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author：xiaoHang
 * @create：2018-07-18 23:53
 **/
public class UserMapperTest{
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(39);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testGetUserByUserName(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getUserByUserName("罗");
        for (User user : list)
            System.out.println(user);
    }

    @Test
    public void testGetUserByQueryVo(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        QueryVo vo = new QueryVo();
        User user2 = new User();
        user2.setUsername("罗");
        vo.setUser(user2);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getUserByQueryVo(vo);
        for (User user : list)
            System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张敬轩");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("广东广州");
        userMapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void testGetUserCount(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer userCount = userMapper.getUserCount();
        sqlSession.close();
        System.out.println("用户总数为：" + userCount);
    }

    @Test
    public void testGetUserByPojo(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setSex("1");
        user.setUsername("航");
        List<User> list = userMapper.getUserByPojo(user);
        for (User user2 : list)
            System.out.println(user2);
    }

    @Test
    public void testGetUserByIds(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        vo.setIds(Arrays.asList(1, 10, 16, 25, 39));
        List<User> list = userMapper.getUserByIds(vo);
        for (User user2 : list){
            System.out.println(user2);
        }
        sqlSession.close();
    }

    @Test
    public void testGetUserOrderMap(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getUserOrderMap();
        for (User user2 : list){
            System.out.println(user2);
            for (Order order : user2.getOrders()){
                System.out.println("此用户的订单为：" + order);
            }
        }
    }
}
