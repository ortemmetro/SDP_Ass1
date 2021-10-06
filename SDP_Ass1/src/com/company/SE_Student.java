package com.company;

public class SE_Student extends Student{
    public SE_Student(){
        super(new UltimateEat(), new UltimateSleep());
    }
    @Override
    void display() {
        System.out.println("I'm a SE Student");
    }
}
