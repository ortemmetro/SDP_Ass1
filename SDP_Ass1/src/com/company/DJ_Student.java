package com.company;

public class DJ_Student extends Student{

    public DJ_Student(){
        super(new MiddleEat(), new MiddleSleep());
    }
    @Override
    void display() {
        System.out.println("I'm a DJ Student");
    }
}
