package com.dearjua.mybatis.mapper;

import com.dearjua.mybatis.pojo.User;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface ParameterMapper {
    int  InsertUser(User user);
    List<User>  getAllUser();

    User GetUserByUsername(String username);

    User CheckLogin(String username, String password);

    User CheckLoginByMap(Map<String, Object> map);
}
