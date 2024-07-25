package com.nullinjection.demo.app;

import com.nullinjection.demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/nullinjection/demo/resources/application-conf.xml");
        Student s1 = context.getBean("stObj1",Student.class);
        Student s2 = context.getBean("stObj2", Student.class);
        System.out.println("first student details");
        s1.display();
        System.out.println("===================");
        System.out.println("sec student details");
        s2.display();
    }

}