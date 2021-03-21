package com.wangkai.test;

import com.wangkai.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void run(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
        UserService accountService = (UserService) applicationContext.getBean("userService");
    }
}
