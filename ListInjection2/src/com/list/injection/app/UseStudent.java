package com.list.injection.app;

import com.list.injection.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/com/list/injection/resources/application-conf.xml");
        Student student = context.getBean("student", Student.class);
        System.out.printf("Student name: %s\n", student.getName());
        System.out.printf("Student roll no: %d\n", student.getRollno());

        System.out.println("\nMarks");
        for (int marks : student.getMarks()) {
            System.out.printf("%d\n", marks);
        }

        System.out.println("\nSubjects");
        for (String subjects : student.getSubjects()) {
            System.out.printf("%s\n", subjects);
        }

    }
}
