package com.dearjua.spring.Service.Impl;

import com.dearjua.spring.Service.UserService;
import com.dearjua.spring.core.Annotation.Bean;

@Bean
public class UserServiceImpl implements UserService {

//    private UserDao userDao;

    @Override
    public void out() {
        //userDao.print();
        System.out.println("Service层执行结束");
    }
}