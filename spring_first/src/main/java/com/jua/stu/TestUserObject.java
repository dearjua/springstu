package com.jua.stu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;
public class TestUserObject {
    //创建log4j对象
    private Logger logger = LoggerFactory.getLogger(TestUserObject.class);
    @Test
    public void test(){
        //加载spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
        User u = (User) context.getBean("user");
        u.add();
        logger.info("###执行成功");
    }
}
