package com.company;

public class Cat extends Animals{
 static int counterCat;
    public Cat(String name) {
        super(name);
        limitDistinationRun= 200;
        limitDistinationSwim = 0;
        counterCat++;
    }

}
