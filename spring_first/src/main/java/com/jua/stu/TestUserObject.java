package com.jua.stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;
public class TestUserObject {
    @Test
    public void test(){
        //加载spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
        User u = (User) context.getBean("user");
        u.add();
    }
}
