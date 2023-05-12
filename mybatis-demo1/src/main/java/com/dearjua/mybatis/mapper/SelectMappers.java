package com.dearjua.mybatis.mapper;

import com.dearjua.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMappers {

    User GetUserById(@Param("id") Integer id);

    int getCount();

    Map<String,Object> getUserByIdToMap(@Param("id") int id);

    List<Map<String, Object>> getAllUser();

    List<User> mohu(@Param("mohu") String mohu);

    List<User> getAllUsers(@Param("tablename") String tablename);

    void InsertUser(User user);
}
