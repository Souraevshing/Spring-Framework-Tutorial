package com.constructor.injection.beans;

public class AddNumber {

    private int a;
    private int b;
    private int c;

    public AddNumber(float a,float b) {
        this.a=(int)a;
        this.b=(int)b;
        c=this.a+this.b;
        System.out.println("float-float constructor called");
    }

    public AddNumber(int a, int b) {
        this.a = a;
        this.b = b;
        c=this.a+this.b;
        System.out.println("int-int constructor called");
    }

    public void show() {
        System.out.printf("a=%d\n",a);
        System.out.printf("b=%d\n",b);
        System.out.printf("Sum=%d\n",c);
    }

}
