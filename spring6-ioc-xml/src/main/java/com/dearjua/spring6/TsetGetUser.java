package com.dearjua.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetGetUser {
    @Test
    public void test1(){
        //获取xml配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean
        User u = (User) ac.getBean("user");

        //根据id 和类型获取
        User user = (User)ac.getBean("user",User.class);
        user.toString();

        System.out.printf(u.toString());
    }

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User u = (User) ac.getBean("user1");
        System.out.printf(u.toString());
    }

    @Test
    public void test3(){
        ApplicationContext aa = new ClassPathXmlApplicationContext("bean.xml");
        User u1 = (User) aa.getBean("user4");
        System.out.printf(u1.toString());
    }
}
