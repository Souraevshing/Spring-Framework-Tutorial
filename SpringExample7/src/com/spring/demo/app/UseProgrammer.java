package com.spring.demo.app;

import com.spring.demo.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * getBean(String,Class <T> class) is another method overloaded by ApplicationContext
 * that takes 2 arguments first one is bean name and second fully qualified class name
 * ===================================================================================
 * we can use name attribute same as id, but name should be unique for each bean
 * name attribute is more flexible than id and hence recommended.
 * we can provide multiple values to single name attribute separated by semicolon or space or comma
 * ===================================================================================
 * for passing non-primitive we use ref attribute instead of value attribute, passing id/name to ref
 */
public class UseProgrammer {

    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("/com/spring/demo/resources/application-conf.xml");
        Programmer p1=container.getBean("programmer1",Programmer.class);
        Programmer p2=container.getBean("programmer2",Programmer.class);
        System.out.println("=================");
        System.out.println("First Programmer's name:"+p1.getName());
        p1.writeCode();
        System.out.println("=================");
        System.out.println("Sec Programmer's name:"+p2.getName());
        p2.writeCode();
    }

}
