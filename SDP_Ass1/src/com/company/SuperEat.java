package com.company;

public class SuperEat implements EatStrategy{

    @Override
    public void eat() {
        System.out.println("I'm eating a lot");
    }
}
