package com.company;

public abstract class Student {


    private EatStrategy eatStrategy;
    private SleepStrategy sleepStrategy;

    public Student(EatStrategy eatStrategy, SleepStrategy sleepStrategy){
        this.eatStrategy = eatStrategy;
        this.sleepStrategy = sleepStrategy;
    }

    public void performSleep(){
        this.sleepStrategy.sleep();
    }

    public void performEat(){
        this.eatStrategy.eat();
    }

    abstract void display();

    public EatStrategy getEatStrategy() {
        return eatStrategy;
    }

    public void setEatStrategy(EatStrategy eatStrategy) {
        this.eatStrategy = eatStrategy;
    }

    public SleepStrategy getSleepStrategy() {
        return sleepStrategy;
    }

    public void setSleepStrategy(SleepStrategy sleepStrategy) {
        this.sleepStrategy = sleepStrategy;
    }
}
