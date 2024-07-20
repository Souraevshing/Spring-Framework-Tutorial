package com.di.demo.beans;

/**@implSpec
 * dependency injection using inheritance(Is-A) relationship
 * @apiNote
 * here, Programmer extending Laptop class and running start() method
 * @since
 * problem with this DI is that both classes are tightly coupled
 * and also, technically Laptop is not a Programmer.
 * */
public class Programmer extends Laptop {
    public void startLaptop() {
        String start = super.start();
        System.out.println(start);
    }
}
