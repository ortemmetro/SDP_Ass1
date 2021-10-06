package com.company;

public class SuperSleep implements SleepStrategy{

    @Override
    public void sleep() {
        System.out.println("I'm sleeping well");
    }
}
