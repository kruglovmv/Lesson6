package com.company;

public class Dog extends Animals{
    static int counterDog;
    public Dog(String name) {
        super(name);
        limitDistinationRun = 500;
        limitDistinationSwim = 10;
        counterDog++;
    }

}
