package com.zhihang.mapper;

import com.zhihang.pojo.Order;

import java.util.List;

/**
 * 订单持久化接口
 *
 * @author：xiaoHang
 * @create：2018-07-23 14:36
 **/
public interface OrderMapper{

    /**
     * 获取订单列表信息
     *
     * @return
     */
    public List<Order> getOrderList();

    /**
     * @return
     */
    public List<Order> getOrderListMap();
}
