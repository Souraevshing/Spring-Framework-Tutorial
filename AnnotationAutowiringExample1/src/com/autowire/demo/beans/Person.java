package com.autowire.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Sourav";

    @Autowired
    @Qualifier("car2")
    private Car car;

    public void display() {
        System.out.printf("Name: %s\n", name);
        if (car==null) {
            System.out.println("No car\n");
        } else {
            System.out.printf("Person car: %s\n", car.getCarName());
        }
    }

}
