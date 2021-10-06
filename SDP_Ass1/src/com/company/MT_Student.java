package com.company;

public class MT_Student extends Student{
    public MT_Student(){
        super(new SuperEat(), new SuperSleep());
    }
    @Override
    void display() {
        System.out.println("I'm a MT Student");
    }
}
