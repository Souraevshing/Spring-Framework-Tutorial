package com.autowire.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String carName = "Exter";

    public Car() {
        System.out.println("Car cons called");
    }

    public String getCarName() {
        return carName;
    }

}
