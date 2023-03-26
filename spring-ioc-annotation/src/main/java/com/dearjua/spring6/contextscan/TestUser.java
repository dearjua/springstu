package com.dearjua.spring6.contextscan;

import com.dearjua.spring6.autowire.controller.UserController;
import com.dearjua.spring6.config.Spring6config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    private Logger logger = (Logger) LoggerFactory.getLogger(User.class);

    @Test
    public  void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController user = context.getBean("userController" ,UserController.class);
        user.out();
    }
    @Test
    public void testAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        com.dearjua.spring6.Resource.controller.UserController bean = context.getBean(com.dearjua.spring6.Resource.controller.UserController.class);
        bean.out();
    }

    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6config.class);
        com.dearjua.spring6.Resource.controller.UserController bean = context.getBean(com.dearjua.spring6.Resource.controller.UserController.class);
        bean.out();
    }
}
