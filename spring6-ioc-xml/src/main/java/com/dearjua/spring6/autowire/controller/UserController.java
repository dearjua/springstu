package com.dearjua.spring6.autowire.controller;

import com.dearjua.spring6.autowire.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("controller执行");
        userService.add();
    }

    @Test
    public void testAutoWireByXML(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-autowire.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.add();
    }
}
