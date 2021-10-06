package com.company;

public class NoSleep implements SleepStrategy{

    @Override
    public void sleep() {
        System.out.println("I cannot sleep");
    }
}
