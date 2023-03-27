package com.dearjua.jdbc.tx;

import com.dearjua.jdbc.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestBuyBook {

    @Autowired
    private BookController bookController;
    @Test
    public void test(){
        bookController.buyBook(2,1,2);
    }
}
