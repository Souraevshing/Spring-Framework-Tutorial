package com.spring.demo.app;

import com.spring.demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * USING ApplicationContext interface (recommended)
 * Load configuration using ClassPathXmlApplicationContext giving path of application-conf.xml
 * ApplicationContext is recommended for DI
 * */
public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("/com/spring/demo/resources/application-conf.xml");
        //another getBean(<Class>) takes class as argument
        Student s = container.getBean(Student.class);
        System.out.println("Name: "+s.getName());
        System.out.println("Roll no: "+s.getRollno());
    }

}
