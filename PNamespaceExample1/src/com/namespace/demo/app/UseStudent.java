package com.namespace.demo.app;

import com.namespace.demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/namespace/demo/resources/application-conf.xml");
        System.out.println("Container started");
        Student student1=(Student)context.getBean("student1");
        Student student2=(Student)context.getBean("student2");
        System.out.println("First student details");
        System.out.println("=======================");
        System.out.println("Name:"+student1.getName());
        System.out.println("Roll no:"+student1.getRollno());
        System.out.println("Gender:"+student1.getGender());
        System.out.println();
        System.out.println("Sec student details");
        System.out.println("=======================");
        System.out.println("Name:"+student2.getName());
        System.out.println("Roll no:"+student2.getRollno());
        System.out.println("Gender:"+student2.getGender());
    }

}
