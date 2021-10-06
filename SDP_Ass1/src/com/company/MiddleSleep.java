package com.company;

public class MiddleSleep implements SleepStrategy{

    @Override
    public void sleep() {
        System.out.println("I'm sleeping but not a lot");
    }
}
