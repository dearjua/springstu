package com.dearjua.spring6.autowire.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao执行");
    }
}
