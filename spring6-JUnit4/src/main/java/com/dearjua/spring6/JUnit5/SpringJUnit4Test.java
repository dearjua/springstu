package com.dearjua.spring6.JUnit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringJUnit4Test {

    @Autowired
    private User user;

    @Test
    public void test(){
        user.run();
    }
}
