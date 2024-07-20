package com.di.demo.app;

import com.di.demo.beans.Programmer;
import com.di.demo.beans.Laptop;
import com.di.demo.beans.Desktop;

public class UseProgrammer {
    public static void main(String[] args) {
        Laptop obj=new Laptop("Dell");
        Desktop obj2=new Desktop("HP");

        Programmer p1=new Programmer(obj);
        p1.setComp(obj2);
        p1.writeCode();
    }
}