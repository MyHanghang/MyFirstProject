package com.zhihang.pojo;


import java.util.Date;

/**
 * @author：xiaoHang
 * @create：2018-07-24 12:12
 **/
public class OrderUser extends Order{
    private String username; //用户姓名
    private String address; //地址

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return super.toString() + "OrderUser{" + "username='" + username + '\'' + ", address='" + address + '\'' + "} ";
    }
}
