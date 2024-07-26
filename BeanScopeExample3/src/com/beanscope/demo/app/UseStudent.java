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
        System.out.println("s1's hashcode:"+s1.hashCode());
        System.out.println("s2's hashcode:"+s2.hashCode());
        if ((s1==s2)) {
            System.out.println("s1 and s2 pointing to same obj.");
        } else {
            System.out.println("s1 and s2 are not pointing to same obj.");
        }
    }

}