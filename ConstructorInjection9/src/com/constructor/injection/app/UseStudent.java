package com.constructor.injection.app;

import com.constructor.injection.beans.Address;
import com.constructor.injection.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/constructor/injection/resources/application-conf.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println("Student details");
        System.out.println("================");
        System.out.println("Name:"+student.getName());
        System.out.println("Roll no:"+student.getRoll());
        Address address=student.getAddress();
        System.out.println("Address details");
        System.out.println("================");
        System.out.println("house no:"+address.getHouseNo());
        System.out.println("locality:"+address.getLocality());
        System.out.println("city:"+address.getCity());
    }

}
