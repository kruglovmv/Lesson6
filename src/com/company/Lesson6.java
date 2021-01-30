package com.company;

public class Lesson6 {

    public static void main(String[] args) {
    Cat cat = new Cat("Барсик");
    Dog dog = new Dog("Бобик");
    Dog dog2 = new Dog("Шарик");
    cat.run(1);
    cat.swimming(250);
    dog.run(253);
    dog.swimming(321);
        System.out.println(Animals.counter);
        System.out.println(Cat.counterCat);
        System.out.println(Dog.counterDog);
    }
}
