package com.autowire.demo.app;

import com.autowire.demo.beans.Person;
import com.autowire.demo.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsePerson {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = applicationContext.getBean(Person.class);
        person.display();
    }

}
