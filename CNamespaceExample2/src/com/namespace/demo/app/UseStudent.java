package com.namespace.demo.app;

import com.namespace.demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/namespace/demo/resources/application-conf.xml");
        Student student = context.getBean("student", Student.class);
        System.out.printf("Name: %s\n", student.getName());
        System.out.printf("Gender: %s\n", student.getGender());
        System.out.printf("Roll no: %d\n", student.getRollno());
    }

}
