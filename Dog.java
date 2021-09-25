package com.company;

public class Dog extends Animal{


    public Dog(String name, boolean isOutside, boolean isAlive, double weight,Human owner) {
        super(name, isOutside, isAlive, weight,owner);
        this.setName(name);
        this.isOutside=isOutside;
        this.isAlive=true;
        this.weight=weight;
    }

    public void throwBall(){
        System.out.println("He runs out for it.");
    }
    public void secureArea(){
        isOutside=true;
    }
}
