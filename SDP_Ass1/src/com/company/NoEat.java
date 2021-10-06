package com.company;

public class NoEat implements EatStrategy{

    @Override
    public void eat() {
        System.out.println("I cannot eat");
    }
}
