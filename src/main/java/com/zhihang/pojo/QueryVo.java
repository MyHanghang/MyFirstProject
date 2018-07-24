package com.zhihang.pojo;

import java.util.List;

/**
 * @author：xiaoHang
 * @create：2018-07-23 13:44
 **/
public class QueryVo{
    private User user;
    private List<Integer> ids;

    public List<Integer> getIds(){
        return ids;
    }

    public void setIds(List<Integer> ids){
        this.ids = ids;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }
}
