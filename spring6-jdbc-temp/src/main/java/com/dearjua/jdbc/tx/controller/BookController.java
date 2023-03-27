package com.dearjua.jdbc.tx.controller;

import com.dearjua.jdbc.tx.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void buyBook(Integer id, Integer bookId,Integer bookNum){
        bookService.BuyBook(id,bookId,bookNum);
    }
}
