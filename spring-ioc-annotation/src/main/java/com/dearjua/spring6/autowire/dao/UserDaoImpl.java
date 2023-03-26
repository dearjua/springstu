package com.dearjua.spring6.autowire.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void say() {
        System.out.println("Dao层结束运行");
    }
}
