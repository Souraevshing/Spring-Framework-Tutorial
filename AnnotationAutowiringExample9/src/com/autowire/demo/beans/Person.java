package com.autowire.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private Car car;

    @Autowired(required = false)
    public Person(@Value("Sourav") String name, Car car) {
        this.name = name;
        this.car = car;
    }

    @Autowired(required = false)
    public Person(Car car, @Value("Sourav Kumar")String name) {
        this.name = name;
        this.car = car;
    }

    @Autowired(required = false)
    public Person(Car car) {
        this.car = car;
    }

    @Autowired(required = false)
    public Person(@Value("CODEY")String name) {
        this.name = name;
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        if (car==null) {
            System.out.println("No Car");
        } else {
            System.out.printf("Car: %s\n", car.getCarName());
        }
    }

}
