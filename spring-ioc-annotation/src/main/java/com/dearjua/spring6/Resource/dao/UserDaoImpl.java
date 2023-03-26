package com.dearjua.spring6.Resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void say() {
        System.out.println("Dao层结束运行");
    }
}
