package com.company;

class Animals {
    String name;
    int limitDistinationRun;
    int limitDistinationSwim;
    static int counter;

    Animals(String name) {
        this.name = name;
        counter++;
    }

    void run(int distination) {
        if(distination<=limitDistinationRun) System.out.println(name+ " пробежал " + distination +" метров");
        else System.out.println(name+ " - загнали до смерти");
    }

     void swimming(int distination) {
        if(distination<=limitDistinationSwim) System.out.println(name+ " проплыл " + distination +" метров");
        else System.out.println(name+ " утонул");
    }
}
