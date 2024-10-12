package com.autowire.demo.beans;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class Car {
    
    private String carName = "Amaze";

    public Car() {
        System.out.println("Car cons called");
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

}
