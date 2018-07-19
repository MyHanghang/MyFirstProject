package com.zhihang.utils;

/*
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/18          LZH          1.0
 **********************************************
 */


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * SqlSessionFactoryUtils工具类
 */
public class SqlSessionFactoryUtils{

    private static SqlSessionFactory sqlSessionFactory;

    static{
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        try{
            InputStream inputStream = Resources.getResourceAsStream
                    ("mybatis-config.xml");
            sqlSessionFactory = ssfb.build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 获取sqlSessionFactory
     *
     * @return
     */
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
