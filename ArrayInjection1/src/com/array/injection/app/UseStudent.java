package com.array.injection.app;

import com.array.injection.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/array/injection/resources/application-conf.xml");
        Student student = context.getBean("student", Student.class);
        System.out.printf("Name: %s", student.getName());
        System.out.println();
        System.out.printf("Roll no: %d", student.getRollno());
        System.out.println("\n");
        System.out.println("Subjects");
        System.out.println("==========");
        for (String subjects : student.getSubjects()) {
            System.out.printf("%s", subjects);
            System.out.println();
        }
    }

}
