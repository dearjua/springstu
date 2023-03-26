package com.dearjua.spring6.Resource.controller;

import com.dearjua.spring6.Resource.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Resource(name="myUserService")
    private UserService service;
    public void out(){
        System.out.println("Controller执行完毕");
        service.sayDao();
    }
}
