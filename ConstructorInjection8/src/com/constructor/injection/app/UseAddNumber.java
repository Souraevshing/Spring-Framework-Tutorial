package com.constructor.injection.app;

import com.constructor.injection.beans.AddNumber;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAddNumber {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/constructor/injection/resources/application-conf.xml");
        AddNumber addNumber = context.getBean("addNumber", AddNumber.class);
        addNumber.show();
    }

}
