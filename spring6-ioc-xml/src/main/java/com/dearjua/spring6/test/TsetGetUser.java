package com.dearjua.spring6.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TsetGetUser {
    @Test
    public void test1(){
        //获取xml配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean
        User u = (User) ac.getBean("user");

        //根据id 和类型获取
        User user = (User)ac.getBean("user",User.class);
        user.toString();

        System.out.printf(u.toString());
    }

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User u = (User) ac.getBean("user1");
        System.out.printf(u.toString());
    }

    @Test
    public void test3(){
        ApplicationContext aa = new ClassPathXmlApplicationContext("bean.xml");
        User u1 = (User) aa.getBean("user3");
        for (String hobby: u1.getHobbies()
             ) {
            System.out.printf(hobby+"\n");
        }
    }

    //为数组属性赋值
    @Test
    public void test4(){
        ApplicationContext aa = new ClassPathXmlApplicationContext("bean.xml");
        Clazz c1 = (Clazz) aa.getBean("clazz");
        c1.printStu();
    }

    @Test
    public void test5(){
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("bean.xml");
        Student s = (Student) ac1.getBean("student3");
        s.ShowTeacher();
        System.out.println(s.toString());;
    }
    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        DruidDataSource dataSource = ac.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
    }
}
