package com.autowire.demo.config;

import com.autowire.demo.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.autowire.demo.beans")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig cons called");
    }

    @Bean
    public Car car1() {
        return new Car("Maruti Suzuki Dzire");
    }

    @Bean
    public Car car2() {
        return new Car("Honda Amaze");
    }

}
