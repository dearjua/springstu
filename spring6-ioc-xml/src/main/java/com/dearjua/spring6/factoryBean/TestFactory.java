package com.dearjua.spring6.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factory.xml");
        Object user = context.getBean("user");
        System.out.println(user);
    }
}
