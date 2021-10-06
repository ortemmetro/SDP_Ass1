package com.company;

public class CS_Student extends Student{
    public CS_Student(){
        super(new NoEat(), new NoSleep());
    }
    @Override
    void display() {
        System.out.println("I'm a CS Student");
    }
}
