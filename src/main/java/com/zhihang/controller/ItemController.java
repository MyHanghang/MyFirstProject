package com.zhihang.controller;

/*
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/16          LZH          1.0
 **********************************************
 */


import com.zhihang.dao.UserDao;
import com.zhihang.dao.impl.UserDaoImpl;
import com.zhihang.pojo.Item;
import com.zhihang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController{
    private List<Item> list;

    @RequestMapping("userList")
    public ModelAndView userList(){
        ModelAndView mav = new ModelAndView();
        UserDao userDao = new UserDaoImpl();
        List<User> list = userDao.getAllUser();
        mav.addObject("userList", list);
        mav.setViewName("userList");
        for (User user : list){
            System.out.println(user);
        }
        return mav;
    }

    @RequestMapping("itemList")
    public ModelAndView ItemList(){
        ModelAndView mav = new ModelAndView();
        list = Arrays.asList(new Item(0, "冰箱", 1999, new Date(), "冰箱很冷1"), new Item(1, "冰箱2", 2999, new Date(),
                "冰箱很冷2"), new Item(2, "冰箱3", 3999, new Date(), "冰箱很冷3"));
        mav.addObject("itemList", list);
        mav.setViewName("itemList");
        return mav;
    }

    @RequestMapping("itemEdit")
    public String ItemEdit(Model model, @RequestParam("id") Integer ids){
        Item item = list.get(ids);
        model.addAttribute("item", item);
        return "itemEdit";
    }

    @RequestMapping("updateItem")
    public String updateItem(Model model, @RequestParam("id") Integer ids){
        Item item = list.get(ids);
        model.addAttribute("item", item);
        return "itemEdit";
    }
}
