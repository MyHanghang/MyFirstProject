package com.zhihang.service;


import com.zhihang.pojo.Item;

import java.util.List;

/**
 * 商品信息业务逻辑接口
 *
 * @author Steven
 */
public interface ItemService{

    /**
     * 获取商品列表
     *
     * @return
     */
    List<Item> getItemList();

    /**
     * 跟据ID查询商品信息
     *
     * @param id
     * @return
     */
    Item getItemById(Integer id);

    /**
     * 修改商品信息
     *
     * @param item
     */
    void updateItem(Item item);
}
