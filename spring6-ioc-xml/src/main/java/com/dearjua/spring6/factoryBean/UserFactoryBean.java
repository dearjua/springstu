package com.dearjua.spring6.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<user> {

    @Override
    public user getObject() throws Exception {
        return new user();
    }

    @Override
    public Class<?> getObjectType() {
        return user.class;
    }
}
