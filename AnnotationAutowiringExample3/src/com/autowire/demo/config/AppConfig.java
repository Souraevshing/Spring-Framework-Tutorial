package com.autowire.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.autowire.demo.beans")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig cons called");
    }

}
