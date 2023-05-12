package com.dearjua.mybatis.mapper;

import com.dearjua.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();
}
