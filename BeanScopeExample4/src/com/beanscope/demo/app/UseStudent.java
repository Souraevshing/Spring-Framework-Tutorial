package com.beanscope.demo.app;

import com.beanscope.demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/beanscope/demo/resources/application-conf.xml");
        System.out.println("Container started");
        Student s1 = (Student)context.getBean("student");
        Student s2 = (Student)context.getBean("student");
        System.out.println("s1 values");
        System.out.println("===========");
        System.out.println("name:"+s1.getName());
        System.out.println("roll no:"+s1.getRollno());

        System.out.println("\ns2 values");
        System.out.println("===========");
        System.out.println("name:"+s2.getName());
        System.out.println("roll no:"+s2.getRollno());
        s1.setRollno(102);
        s2.setName("Nitin");
        System.out.println("After Changing");
        System.out.println("s1 values");
        System.out.println("===========");
        System.out.println("name:"+s1.getName());
        System.out.println("roll no:"+s1.getRollno());

        System.out.println("\ns2 values");
        System.out.println("===========");
        System.out.println("name:"+s2.getName());
        System.out.println("roll no:"+s2.getRollno());
    }

}