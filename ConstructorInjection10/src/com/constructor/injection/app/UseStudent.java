package com.constructor.injection.app;

import com.constructor.injection.beans.Address;
import com.constructor.injection.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {

    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("/com/constructor/injection/resources/application-conf.xml");
        Student s=container.getBean(Student.class);
        System.out.println("Student details");
        System.out.println("================");
        System.out.println("Name:"+s.getName());
        System.out.println("Roll no:"+s.getRoll());
        Address address=s.getAddress();
        System.out.println("Address details");
        System.out.println("================");
        System.out.println("houseno:"+address.getHouseNo());
        System.out.println("locality:"+address.getLocality());
        System.out.println("city:"+address.getCity());
        System.out.println("length of loc:"+address.getLength());
    }

}