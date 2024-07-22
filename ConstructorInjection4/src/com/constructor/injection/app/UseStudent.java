package com.constructor.injection.app;

import com.constructor.injection.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/constructor/injection/resources/application-conf.xml");
        Student student = context.getBean("student", Student.class);
        System.out.printf("Student name: %s\n", student.getName());
        System.out.printf("Student roll: %d\n", student.getRoll());
    }

}
