package com.dearjua.spring6.aop.example;

public class ProxyTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculate calculate = (Calculate) proxyFactory.getProxy();
        calculate.add(1,4);
        calculate.mul(2,4);
    }
}
