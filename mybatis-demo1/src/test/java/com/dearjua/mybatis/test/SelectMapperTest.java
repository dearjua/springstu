package com.dearjua.mybatis.test;

import com.dearjua.mybatis.mapper.SelectMappers;
import com.dearjua.mybatis.pojo.User;
import com.dearjua.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {

    @Test
    public void GetUserByIdTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMappers mapper = sqlSession.getMapper(SelectMappers.class);
        User user = mapper.GetUserById(1);
        System.out.println("user = " + user);
    }

    @Test
    public void GetCountTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMappers mapper = sqlSession.getMapper(SelectMappers.class);
        int count = mapper.getCount();
        System.out.println("count = " + count);
    }

    @Test
    public void GetUserByIdToMapTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMappers mapper = sqlSession.getMapper(SelectMappers.class);
        Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(1);
        System.out.println(userByIdToMap);
    }

    @Test
    public void GetAllUserTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMappers mapper = sqlSession.getMapper(SelectMappers.class);
        List<Map<String, Object>> allUser = mapper.getAllUser();
        allUser.forEach(s->{
            System.out.println(s);
        });
    }

    @Test
    public void mohuTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMappers mapper = sqlSession.getMapper(SelectMappers.class);
        List<User> user = mapper.mohu("ad");
        user.forEach(s->{
            System.out.println(s);
        });
    }

    @Test
    public void getAllUsersTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMappers mapper = sqlSession.getMapper(SelectMappers.class);
        List<User> tUser = mapper.getAllUsers("t_user");
        tUser.forEach(s->{
            System.out.println(s);
        });
    }

    @Test
    public void InsertUserTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMappers mapper = sqlSession.getMapper(SelectMappers.class);
        mapper.InsertUser(new User(null,"看看","123",23,"男"));
    }
}
