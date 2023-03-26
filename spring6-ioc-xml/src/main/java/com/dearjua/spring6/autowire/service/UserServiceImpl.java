package com.dearjua.spring6.autowire.service;

import com.dearjua.spring6.autowire.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("Service执行");
        userDao.add();
    }
}
