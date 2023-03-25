package com.dearjua.spring6.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  c = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = c.getBean("user", User.class);
        System.out.println("创建对象可以使用");
        c.close();
    }
}
