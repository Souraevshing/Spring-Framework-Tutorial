package com.beanscope.demo.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/beanscope/demo/resources/application-conf.xml");
        System.out.println("container started");
    }

}