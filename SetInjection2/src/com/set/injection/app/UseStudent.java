package com.set.injection.app;

import com.set.injection.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/com/set/injection/resources/application-conf.xml");
        Student student = context.getBean("student", Student.class);
        System.out.printf("Student name: %s\n", student.getName());
        System.out.printf("Student roll no: %d", student.getRollno());
        System.out.println("\n");

        System.out.println("\nEmail:");
        for (String email : student.getEmails()) {
            System.out.printf("%s\n", email);
        }

    }

}
