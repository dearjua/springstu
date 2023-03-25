package com.dearjua.spring6.life;

public class User {
    private int age;
    private String name;

    public User() {
        System.out.println("bean对象的创建，调用无参构造方法");
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void initMethod(){
        System.out.println("初始化");
    }

    public void DestroyMethod(){
        System.out.println("销毁对象");
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setAge(int age) {
        System.out.println("给bean对象设置属性");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
