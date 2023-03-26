package com.dearjua.spring6.autowire.controller;

import com.dearjua.spring6.autowire.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService service;
    public void out(){
        service.sayDao();
    }


}
