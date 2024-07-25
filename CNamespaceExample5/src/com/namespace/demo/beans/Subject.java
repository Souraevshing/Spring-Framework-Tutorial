package com.namespace.demo.beans;

public class Subject {

    private int phy;
    private int chem;
    private int math;

    public Subject(int phy, int chem, int math) {
        this.phy = phy;
        this.chem = chem;
        this.math = math;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "phy=" + phy +
                ", chem=" + chem +
                ", math=" + math +
                '}';
    }
}
