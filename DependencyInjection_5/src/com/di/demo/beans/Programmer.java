package com.di.demo.beans;

public class Programmer {
    private Computer comp;

    public Programmer(Computer comp) {
        this.comp = comp;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void writeCode() {
        System.out.println(comp.start());
    }

}
