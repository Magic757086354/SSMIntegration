package com.zsp.study.test;

import com.zsp.study.domain.Account;
import com.zsp.study.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daryl on 2020/6/8 15:31
 */
public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService as= (AccountService)ac.getBean("accountService");
        //调用方法
        as.findAll();
    }
}
