package com.spring.demo.app;

import com.spring.demo.beans.Laptop;
import com.spring.demo.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/demo/resources/application-conf.xml");
        Programmer programmer = context.getBean(Programmer.class);
        Laptop laptop = context.getBean(Laptop.class);
        System.out.printf("Programmer's name: %s",programmer.getName());
        System.out.printf("Laptop's brand: %s",laptop.getBrand());

        //return true since single laptop object is shared by both Programmer and Laptop
        //System.out.println(laptop.hashCode()==programmer.getLaptop().hashCode());
    }
}