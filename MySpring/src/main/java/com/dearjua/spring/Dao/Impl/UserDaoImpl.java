package com.dearjua.spring.Dao.Impl;

import com.dearjua.spring.Dao.UserDao;
import com.dearjua.spring.core.Annotation.Bean;

@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}