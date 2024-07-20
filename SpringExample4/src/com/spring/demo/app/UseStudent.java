package com.spring.demo.app;


import com.spring.demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ApplicationContext interface will create object, setter method and then bean will be created since it uses eager
 * initialization by default, but we can change it to lazy initialization mode also
 * <br/>
 * - provides all basic features along with other advanced configuration
 * - supports orm, web-application and distributed application
 * - supports event handling
 * - supports annotation based configuration
 * */

/*
 * we are using property injection since we are using beans inside xml.
 * id argument is used to assign object reference of both the objects
 * */
public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/demo/resources/application-conf.xml");
        System.out.println("Container started");
        System.out.println();
        System.out.println("First Bean");
        System.out.println("================");
        Student s1=(Student)context.getBean("stdObj1");
        System.out.println("Name:"+s1.getName());
        System.out.println("Roll no:"+s1.getRollno());
        System.out.println();
        System.out.println("Second Bean");
        System.out.println("================");
        Student s2=(Student)context.getBean("stdObj2");
        System.out.println("Name:"+s2.getName());
        System.out.println("Roll no:"+s2.getRollno());
    }
}