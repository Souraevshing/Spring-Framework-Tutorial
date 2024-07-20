package com.spring.demo.app;

import com.spring.demo.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * USING BeanFactory interface
 * Load configuration using ClassPathResource giving path of application-conf.xml
 * using XmlBeanFactory (deprecated) class passing Resource reference
 * typecasting the bean received by getBean() into <Student> type
 * */
public class UseStudent {

    public static void main(String[] args) {
        Resource res=new ClassPathResource("/com/spring/demo/resources/application-conf.xml");
        BeanFactory container=new XmlBeanFactory(res);
        // getBean(<string>) takes id as argument im xml configuration
        // Student s = (Student) container.getBean("stObj");
        //another getBean(<Class>) takes class as argument
        Student s = container.getBean(Student.class);
        System.out.println("Name: "+s.getName());
        System.out.println("Roll no: "+s.getRollno());
    }

}
