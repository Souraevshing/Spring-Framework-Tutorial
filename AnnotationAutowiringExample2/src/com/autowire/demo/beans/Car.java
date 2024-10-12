package com.autowire.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car() {
        System.out.println("Car cons called");
    }

    private String carName = "Amaze";

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

}
