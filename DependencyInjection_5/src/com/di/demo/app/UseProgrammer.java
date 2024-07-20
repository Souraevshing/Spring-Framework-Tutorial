package com.di.demo.app;

import com.di.demo.beans.Laptop;
import com.di.demo.beans.Programmer;

import java.lang.reflect.Field;

public class UseProgrammer {
    public static void main(String[] args) throws Exception {
        System.out.println("inside UseProgrammer");
        Class c = Class.forName("com.di.demo.beans.Programmer");
        Object object = c.newInstance();
        Programmer programmer1 = (Programmer) object;

        Field field = c.getDeclaredField("comp");
        field.setAccessible(true);
        field.set(programmer1, new Laptop());
    }
}