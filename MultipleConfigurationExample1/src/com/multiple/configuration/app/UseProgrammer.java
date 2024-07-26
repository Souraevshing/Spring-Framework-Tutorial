package com.multiple.configuration.app;

import com.multiple.configuration.beans.Laptop;
import com.multiple.configuration.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/com/multiple/configuration/resources/application-conf1.xml","/com/multiple/configuration/resources/application-conf2.xml");
        Programmer programmer = context.getBean("programmer",Programmer.class);
        Laptop laptop = context.getBean("laptop", Laptop.class);
        System.out.println("=================");
        System.out.println("Programmer's name:"+programmer.getName());
        System.out.println("Laptop's brand:"+laptop.getBrand());
    }

}