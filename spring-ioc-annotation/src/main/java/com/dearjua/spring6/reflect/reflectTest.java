package com.dearjua.spring6.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class reflectTest {

    @Test
    public void test() throws Exception {
        //反射获取对象的几种方法

        //类名.class
        Class carClass = Car.class;

        //对象.getClass()
        Class aClass = new Car().getClass();

        //3 Class.forName("全路径")
        Class aClass1 = Class.forName("com.dearjua.spring6.reflect.Car");

        //实例化
        Car car = (Car)aClass1.getConstructor().newInstance();
        System.out.println(car);
    }

    @Test
    public void test1() throws Exception {
        Class clazz = Car.class;
        //获取所有构造
        // getConstructors()获取所有public的构造方法
        // Constructor[] constructors = clazz.getConstructors();
        // getDeclaredConstructors()获取所有的构造方法public  private
        Constructor[] constructor = clazz.getDeclaredConstructors();
        for (Constructor c1 :
                constructor) {
            System.out.println("方法名："+c1.getName()+"参数个数"+c1.getParameterCount());
        }

        //指定有参数构造构造对象
        Constructor constructor1 = clazz.getDeclaredConstructor(int.class, String.class, String.class);
        constructor1.setAccessible(true);
        Car car = (Car) constructor1.newInstance(18, "劳斯莱斯", "red");
        System.out.println(car.toString());
    }
}
