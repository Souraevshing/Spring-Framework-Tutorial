package com.constructor.injection.app;

import com.constructor.injection.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/constructor/injection/resources/application-conf.xml");
        Employee employee = context.getBean("employee", Employee.class);
        employee.show();
    }

}
