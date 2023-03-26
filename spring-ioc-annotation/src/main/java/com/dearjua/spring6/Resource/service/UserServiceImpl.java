package com.dearjua.spring6.Resource.service;

import com.dearjua.spring6.Resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public void sayDao() {
        System.out.println("Service层执行完毕");
        userDao.say();
    }
}
