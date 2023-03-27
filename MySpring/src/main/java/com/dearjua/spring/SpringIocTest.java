package com.dearjua.spring;


import com.dearjua.spring.core.AnnotationApplicationContext;
import com.dearjua.spring.core.ApplicationContext;
import com.dearjua.spring.Service.UserService;
import org.junit.Test;

public class SpringIocTest {

    @Test
    public void testIoc() {
        ApplicationContext applicationContext = new AnnotationApplicationContext("com.dearjua.spring.Service");
        UserService userService = (UserService)applicationContext.getBean(UserService.class);
        userService.out();
        System.out.println("run success");
    }
}