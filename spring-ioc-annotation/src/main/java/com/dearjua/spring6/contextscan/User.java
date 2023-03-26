package com.dearjua.spring6.contextscan;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    public void add(){
        System.out.printf("add...");
    }
    public static void main(String[] args) {
        User user = new User();
        user.add();
    }

}