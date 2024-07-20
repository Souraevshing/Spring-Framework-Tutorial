package com.spring.demo.app;

import com.spring.demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * USING ApplicationContext interface (recommended)
 * Load configuration using ClassPathXmlApplicationContext giving path of application-conf.xml
 * ApplicationContext is recommended for DI
 * here, we are creating 2 instance of Student class and same configuration is done inside xml
 * */
public class UseStudent {
    public static void main(String[] args) {
        System.out.println("Creating 1st Student object");
        ApplicationContext container = new ClassPathXmlApplicationContext("/com/spring/demo/resources/application-conf.xml");
        //another getBean(<Class>) takes class as argument
        Student student1 = (Student) container.getBean("stObj1");
        System.out.println("Name: "+student1.getName());
        System.out.println("Roll no: "+student1.getRollno());
        System.out.println();
        System.out.println("Creating 2nd Student object");
        Student student2 = (Student) container.getBean("stObj2");
        System.out.println("Name: "+student2.getName());
        System.out.println("Roll no: "+student2.getRollno());
        System.out.println();
    }
}