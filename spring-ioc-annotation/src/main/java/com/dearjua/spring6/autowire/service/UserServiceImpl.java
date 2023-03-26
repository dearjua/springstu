package com.dearjua.spring6.autowire.service;

import com.dearjua.spring6.autowire.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public void sayDao() {
        userDao.say();
    }
}
