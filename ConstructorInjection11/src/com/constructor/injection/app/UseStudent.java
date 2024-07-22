package com.constructor.injection.app;

import com.constructor.injection.beans.Student;
import com.constructor.injection.beans.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/constructor/injection/resources/application-conf.xml");
        Student student = context.getBean(Student.class);
        System.out.println("Student details");
        System.out.println("================");
        System.out.println("Student name:"+student.getName());

        Teacher teacher = student.getTeacher();
        System.out.println("Teacher's name:"+teacher.getName());
    }

}
