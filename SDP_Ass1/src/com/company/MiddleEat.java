package com.company;

public class MiddleEat implements EatStrategy{

    @Override
    public void eat() {
        System.out.println("I'm eating but not a lot");
    }
}
