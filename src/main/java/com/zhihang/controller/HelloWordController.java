package com.zhihang.controller;

/*
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/16          LZH          1.0
 **********************************************
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWordController{

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "hello springmvc!");
        mav.setViewName("Hello");
        return mav;
    }
}
