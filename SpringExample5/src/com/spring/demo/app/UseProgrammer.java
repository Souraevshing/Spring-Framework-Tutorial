package com.spring.demo.app;

import com.spring.demo.beans.Programmer;
import com.spring.demo.beans.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/demo/resources/application-conf.xml");
        Programmer programmer = context.getBean(Programmer.class);
        Laptop laptop = context.getBean(Laptop.class);
        System.out.println("Programmer name: "+programmer.getName());
        System.out.println("Laptop brand: "+laptop.getBrand());
    }
}