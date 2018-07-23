package com.zhihang.test;

import com.zhihang.mapper.OrderMapper;
import com.zhihang.mapper.UserMapper;
import com.zhihang.pojo.Order;
import com.zhihang.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author：xiaoHang
 * @create：2018-07-23 14:49
 **/
public class OrderMapperrTest{

    @Test
    public void testGetOrderList(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> list = orderMapper.getOrderList();
        for (Order order : list){
            System.out.println(order);
        }
    }

    @Test
    public void testGetOrderListMap(){
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        //获取接口的代理人实现类
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> list = orderMapper.getOrderListMap();
        for (Order order : list){
            System.out.println(order);
        }
    }
}
